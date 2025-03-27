// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link StopTaskInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>StopTaskInstancesResponseBody</p>
 */
public class StopTaskInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessInfo")
    private java.util.Map<String, SuccessInfoValue> successInfo;

    private StopTaskInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.successInfo = builder.successInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTaskInstancesResponseBody create() {
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
     * @return successInfo
     */
    public java.util.Map<String, SuccessInfoValue> getSuccessInfo() {
        return this.successInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, SuccessInfoValue> successInfo; 

        private Builder() {
        } 

        private Builder(StopTaskInstancesResponseBody model) {
            this.requestId = model.requestId;
            this.successInfo = model.successInfo;
        } 

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the batch operation, which is in the MAP structure. The instance ID serves as a key, and the result serves as a value.</p>
         */
        public Builder successInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
            this.successInfo = successInfo;
            return this;
        }

        public StopTaskInstancesResponseBody build() {
            return new StopTaskInstancesResponseBody(this);
        } 

    } 

}
