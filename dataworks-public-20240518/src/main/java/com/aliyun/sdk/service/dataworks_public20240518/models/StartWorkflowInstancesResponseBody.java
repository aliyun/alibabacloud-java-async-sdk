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
 * {@link StartWorkflowInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>StartWorkflowInstancesResponseBody</p>
 */
public class StartWorkflowInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessInfo")
    private java.util.Map<String, SuccessInfoValue> successInfo;

    private StartWorkflowInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.successInfo = builder.successInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartWorkflowInstancesResponseBody create() {
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

        private Builder(StartWorkflowInstancesResponseBody model) {
            this.requestId = model.requestId;
            this.successInfo = model.successInfo;
        } 

        /**
         * <p>The ID of the request. You can use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The results of the batch operation. The data structure is a map where the key is the workflow instance ID and the value is the result information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;10001&quot;: {&quot;Success&quot;: false, &quot;Message&quot;: &quot;The instance does not exist.&quot;}}</p>
         */
        public Builder successInfo(java.util.Map<String, SuccessInfoValue> successInfo) {
            this.successInfo = successInfo;
            return this;
        }

        public StartWorkflowInstancesResponseBody build() {
            return new StartWorkflowInstancesResponseBody(this);
        } 

    } 

}
