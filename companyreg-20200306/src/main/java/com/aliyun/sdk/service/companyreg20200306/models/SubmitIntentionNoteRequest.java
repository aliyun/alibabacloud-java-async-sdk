// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIntentionNoteRequest} extends {@link RequestModel}
 *
 * <p>SubmitIntentionNoteRequest</p>
 */
public class SubmitIntentionNoteRequest extends Request {
    @Query
    @NameInMap("IntentionBizId")
    @Validation(required = true)
    private String intentionBizId;

    @Query
    @NameInMap("Note")
    @Validation(required = true)
    private String note;

    private SubmitIntentionNoteRequest(Builder builder) {
        super(builder);
        this.intentionBizId = builder.intentionBizId;
        this.note = builder.note;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIntentionNoteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intentionBizId
     */
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    public static final class Builder extends Request.Builder<SubmitIntentionNoteRequest, Builder> {
        private String intentionBizId; 
        private String note; 

        private Builder() {
            super();
        } 

        private Builder(SubmitIntentionNoteRequest request) {
            super(request);
            this.intentionBizId = request.intentionBizId;
            this.note = request.note;
        } 

        /**
         * IntentionBizId.
         */
        public Builder intentionBizId(String intentionBizId) {
            this.putQueryParameter("IntentionBizId", intentionBizId);
            this.intentionBizId = intentionBizId;
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
        public SubmitIntentionNoteRequest build() {
            return new SubmitIntentionNoteRequest(this);
        } 

    } 

}
