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
 * {@link CreateServiceTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceTaskRequest</p>
 */
public class CreateServiceTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskConfig")
    private String taskConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateServiceTaskRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.serviceId = builder.serviceId;
        this.ip = builder.ip;
        this.taskConfig = builder.taskConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return taskConfig
     */
    public String getTaskConfig() {
        return this.taskConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateServiceTaskRequest, Builder> {
        private String workspace; 
        private String serviceId; 
        private String ip; 
        private String taskConfig; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceTaskRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.serviceId = request.serviceId;
            this.ip = request.ip;
            this.taskConfig = request.taskConfig;
            this.type = request.type;
        } 

        /**
         * <p>The workspace name. Example: default-cms-<uid>-<region>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1672753017899339-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>The application or service ID (pid).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ggxw4lnjuz@f2fd3a6265a254a052afb</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The IP address of the target instance. This parameter is optional. If not specified, some tasks can match instances by scope (such as instanceIds). This parameter is typically required for heap dump scenarios.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        public Builder ip(String ip) {
            this.putBodyParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The task configuration. The value is a JSON string with a maximum length of 65536 characters. This parameter is required for LiveDebug task types. Use a flat JSON structure and pass a single command or probe object directly. Do not wrap it in a commands or probes array. Probe example (dynamic log): {&quot;probeType&quot;:&quot;LOG&quot;,&quot;language&quot;:&quot;java&quot;,&quot;target&quot;:{&quot;typeName&quot;:&quot;com.example.UserService&quot;,&quot;methodName&quot;:&quot;getUser&quot;,&quot;location&quot;:&quot;exit&quot;,&quot;instanceIds&quot;:[&quot;<em>&quot;]},&quot;action&quot;:{&quot;type&quot;:&quot;LOG&quot;,&quot;template&quot;:&quot;userId=${args[0]}&quot;,&quot;templateSegments&quot;:[{&quot;type&quot;:&quot;TEXT&quot;,&quot;value&quot;:&quot;userId=&quot;},{&quot;type&quot;:&quot;EXPRESSION&quot;,&quot;value&quot;:&quot;args[0]&quot;]},&quot;ttl&quot;:&quot;1h&quot;,&quot;captureCount&quot;:100}. Command example (OGNL): {&quot;commandType&quot;:&quot;EVALUATE_EXPRESSION&quot;,&quot;language&quot;:&quot;java&quot;,&quot;params&quot;:{&quot;expression&quot;:&quot;@java.lang.System@getProperty(\&quot;java.home\&quot;)&quot;},&quot;instanceIds&quot;:[&quot;</em>&quot;]}. Note: The Command type must include instanceIds at the top level. For Probe types, instanceIds is placed inside the target object. The action.metricType for METRIC probes can be set to COUNTER, GAUGE, HISTOGRAM, or SUMMARY. The Java Agent supports only COUNTER and GAUGE.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;probeType&quot;:&quot;LOG&quot;,&quot;language&quot;:&quot;java&quot;,&quot;target&quot;:{&quot;typeName&quot;:&quot;com.example.service.UserServiceImpl&quot;,&quot;methodName&quot;:&quot;findById&quot;,&quot;location&quot;:&quot;exit&quot;,&quot;instanceIds&quot;:[&quot;*&quot;]},&quot;action&quot;:{&quot;type&quot;:&quot;LOG&quot;,&quot;template&quot;:&quot;userId=${args[0]} cost=${durationMs}ms&quot;,&quot;templateSegments&quot;:[{&quot;type&quot;:&quot;TEXT&quot;,&quot;value&quot;:&quot;userId=&quot;},{&quot;type&quot;:&quot;EXPRESSION&quot;,&quot;value&quot;:&quot;args[0]&quot;},{&quot;type&quot;:&quot;TEXT&quot;,&quot;value&quot;:&quot; cost=&quot;},{&quot;type&quot;:&quot;EXPRESSION&quot;,&quot;value&quot;:&quot;durationMs&quot;},{&quot;type&quot;:&quot;TEXT&quot;,&quot;value&quot;:&quot;ms&quot;}]},&quot;ttl&quot;:&quot;1h&quot;,&quot;captureCount&quot;:100}</p>
         */
        public Builder taskConfig(String taskConfig) {
            this.putBodyParameter("taskConfig", taskConfig);
            this.taskConfig = taskConfig;
            return this;
        }

        /**
         * <p>The task type. This parameter is required. Valid values: heapdump (heap dump). LiveDebug Probe: live_debug_log_probe, live_debug_snapshot_probe, live_debug_metric_probe, live_debug_span_probe, live_debug_span_tag_probe. LiveDebug Command: live_debug_inspect_object, live_debug_search_type, live_debug_search_method, live_debug_decompile, live_debug_get_thread_info, live_debug_get_runtime_info, live_debug_get_memory_info, live_debug_evaluate_expression, live_debug_modify_logger_level. LiveDebug Code Replace: live_debug_code_replace.</p>
         * 
         * <strong>example:</strong>
         * <p>live_debug_log_probe</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateServiceTaskRequest build() {
            return new CreateServiceTaskRequest(this);
        } 

    } 

}
