// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseIntentionForPartnerRequest} extends {@link RequestModel}
 *
 * <p>CloseIntentionForPartnerRequest</p>
 */
public class CloseIntentionForPartnerRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("IntentionBizId")
    @Validation(required = true)
    private String intentionBizId;

    @Query
    @NameInMap("Note")
    @Validation(required = true)
    private String note;

    private CloseIntentionForPartnerRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.intentionBizId = builder.intentionBizId;
        this.note = builder.note;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseIntentionForPartnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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

    public static final class Builder extends Request.Builder<CloseIntentionForPartnerRequest, Builder> {
        private String bizType; 
        private String intentionBizId; 
        private String note; 

        private Builder() {
            super();
        } 

        private Builder(CloseIntentionForPartnerRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.intentionBizId = request.intentionBizId;
            this.note = request.note;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
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
        public CloseIntentionForPartnerRequest build() {
            return new CloseIntentionForPartnerRequest(this);
        } 

    } 

}
