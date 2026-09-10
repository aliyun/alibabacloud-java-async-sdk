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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task details object. Common fields include taskId, serviceId, workspace, regionId, ip, taskType, extraInfo (taskConfig JSON for LiveDebug), createTime, and updateTime.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;taskId&quot;:&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;serviceId&quot;:&quot;ggxw4lnjuz@f2fd3a6265a254a052afb&quot;,&quot;taskType&quot;:&quot;live_debug_log_probe&quot;,&quot;ip&quot;:&quot;10.0.0.1&quot;,&quot;extraInfo&quot;:&quot;{\&quot;probeType\&quot;:\&quot;LOG\&quot;,\&quot;language\&quot;:\&quot;java\&quot;}&quot;}</p>
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
