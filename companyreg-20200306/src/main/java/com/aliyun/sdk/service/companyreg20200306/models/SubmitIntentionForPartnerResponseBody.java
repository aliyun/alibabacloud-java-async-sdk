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
 * {@link SubmitIntentionForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitIntentionForPartnerResponseBody</p>
 */
public class SubmitIntentionForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("IntentionBizId")
    private String intentionBizId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SubmitIntentionForPartnerResponseBody(Builder builder) {
        this.errorMsg = builder.errorMsg;
        this.intentionBizId = builder.intentionBizId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIntentionForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return intentionBizId
     */
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorMsg; 
        private String intentionBizId; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SubmitIntentionForPartnerResponseBody model) {
            this.errorMsg = model.errorMsg;
            this.intentionBizId = model.intentionBizId;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * IntentionBizId.
         */
        public Builder intentionBizId(String intentionBizId) {
            this.intentionBizId = intentionBizId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6A603AA0-73BA-52B3-AC7D-0F846ECF7A9D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SubmitIntentionForPartnerResponseBody build() {
            return new SubmitIntentionForPartnerResponseBody(this);
        } 

    } 

}
