package uk.gov.hmcts.reform.sptribs.trigger.triggers;

import uk.gov.hmcts.reform.ccd.client.model.CaseEventDetail;
import uk.gov.hmcts.reform.ccd.client.model.Event;

import java.util.List;

public interface Trigger {

    String query();

    boolean isValid(List<CaseEventDetail> events);

    Event event();

}
