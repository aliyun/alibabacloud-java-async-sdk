// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateResponseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResponseRuleResponseBody</p>
 */
public class UpdateResponseRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseRuleId")
    private String responseRuleId;

    private UpdateResponseRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.responseRuleId = builder.responseRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResponseRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseRuleId
     */
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

    public static final class Builder {
        private String requestId; 
        private String responseRuleId; 

        private Builder() {
        } 

        private Builder(UpdateResponseRuleResponseBody model) {
            this.requestId = model.requestId;
            this.responseRuleId = model.responseRuleId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResponseRuleId.
         */
        public Builder responseRuleId(String responseRuleId) {
            this.responseRuleId = responseRuleId;
            return this;
        }

        public UpdateResponseRuleResponseBody build() {
            return new UpdateResponseRuleResponseBody(this);
        } 

    } 

}
