// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSuspEventNoteRequest} extends {@link RequestModel}
 *
 * <p>CreateSuspEventNoteRequest</p>
 */
public class CreateSuspEventNoteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    @com.aliyun.core.annotation.Validation(required = true)
    private String note;

    private CreateSuspEventNoteRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.note = builder.note;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSuspEventNoteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    public static final class Builder extends Request.Builder<CreateSuspEventNoteRequest, Builder> {
        private Long eventId; 
        private String note; 

        private Builder() {
            super();
        } 

        private Builder(CreateSuspEventNoteRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.note = request.note;
        } 

        /**
         * The ID of the alert event to which you want to add remarks. You can call the [DescribeSuspEvents](~~251497~~) operation to query the IDs of alert events.
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The remarks that you want to add.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        @Override
        public CreateSuspEventNoteRequest build() {
            return new CreateSuspEventNoteRequest(this);
        } 

    } 

}
