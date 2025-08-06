// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>AddWorkflowResponseBody</p>
 */
public class AddWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private AddWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWorkflowResponseBody create() {
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
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder {
        private String requestId; 
        private String workflowId; 

        private Builder() {
        } 

        private Builder(AddWorkflowResponseBody model) {
            this.requestId = model.requestId;
            this.workflowId = model.workflowId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        public AddWorkflowResponseBody build() {
            return new AddWorkflowResponseBody(this);
        } 

    } 

}
