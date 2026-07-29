// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetServiceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTaskResponseBody</p>
 */
public class GetServiceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("serviceTask")
    private java.util.Map<String, ?> serviceTask;

    private GetServiceTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceTask = builder.serviceTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTaskResponseBody create() {
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
     * @return serviceTask
     */
    public java.util.Map<String, ?> getServiceTask() {
        return this.serviceTask;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, ?> serviceTask; 

        private Builder() {
        } 

        private Builder(GetServiceTaskResponseBody model) {
            this.requestId = model.requestId;
            this.serviceTask = model.serviceTask;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * serviceTask.
         */
        public Builder serviceTask(java.util.Map<String, ?> serviceTask) {
            this.serviceTask = serviceTask;
            return this;
        }

        public GetServiceTaskResponseBody build() {
            return new GetServiceTaskResponseBody(this);
        } 

    } 

}
