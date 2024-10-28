// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSuccessTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>SetSuccessTaskInstancesResponseBody</p>
 */
public class SetSuccessTaskInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessInfo")
    private java.util.Map < String, SuccessInfoValue > successInfo;

    private SetSuccessTaskInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.successInfo = builder.successInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSuccessTaskInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successInfo
     */
    public java.util.Map < String, SuccessInfoValue > getSuccessInfo() {
        return this.successInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, SuccessInfoValue > successInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessInfo.
         */
        public Builder successInfo(java.util.Map < String, SuccessInfoValue > successInfo) {
            this.successInfo = successInfo;
            return this;
        }

        public SetSuccessTaskInstancesResponseBody build() {
            return new SetSuccessTaskInstancesResponseBody(this);
        } 

    } 

}
