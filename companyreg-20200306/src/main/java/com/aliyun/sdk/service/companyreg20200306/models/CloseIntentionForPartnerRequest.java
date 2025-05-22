// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloseIntentionForPartnerRequest} extends {@link RequestModel}
 *
 * <p>CloseIntentionForPartnerRequest</p>
 */
public class CloseIntentionForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentionBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intentionBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.beian_assist</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>I20211105230733000001</p>
         */
        public Builder intentionBizId(String intentionBizId) {
            this.putQueryParameter("IntentionBizId", intentionBizId);
            this.intentionBizId = intentionBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
