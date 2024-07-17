// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLifecycleRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetLifecycleRuleResponseBody</p>
 */
public class GetLifecycleRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private LifecycleRule data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetLifecycleRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLifecycleRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public LifecycleRule getData() {
        return this.data;
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
        private LifecycleRule data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(LifecycleRule data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLifecycleRuleResponseBody build() {
            return new GetLifecycleRuleResponseBody(this);
        } 

    } 

}
