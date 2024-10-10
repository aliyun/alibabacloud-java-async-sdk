// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMaliciousNoteRequest} extends {@link RequestModel}
 *
 * <p>CreateMaliciousNoteRequest</p>
 */
public class CreateMaliciousNoteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the alert event to which you want to add remarks.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> operation to obtain the ID of the alert event from the NoteId parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80****</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The remarks that you want to add.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
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
