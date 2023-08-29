// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMaliciousNoteRequest} extends {@link RequestModel}
 *
 * <p>CreateMaliciousNoteRequest</p>
 */
public class CreateMaliciousNoteRequest extends Request {
    @Query
    @NameInMap("EventId")
    @Validation(required = true)
    private Long eventId;

    @Query
    @NameInMap("Note")
    @Validation(required = true)
    private String note;

    private CreateMaliciousNoteRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.note = builder.note;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMaliciousNoteRequest create() {
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

    public static final class Builder extends Request.Builder<CreateMaliciousNoteRequest, Builder> {
        private Long eventId; 
        private String note; 

        private Builder() {
            super();
        } 

        private Builder(CreateMaliciousNoteRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.note = request.note;
        } 

        /**
         * EventId.
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        @Override
        public CreateMaliciousNoteRequest build() {
            return new CreateMaliciousNoteRequest(this);
        } 

    } 

}
