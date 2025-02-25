// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitoringAgentProcessRequest</p>
 */
public class DeleteMonitoringAgentProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    private String processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    private DeleteMonitoringAgentProcessRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.processId = builder.processId;
        this.processName = builder.processName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitoringAgentProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    public static final class Builder extends Request.Builder<DeleteMonitoringAgentProcessRequest, Builder> {
        private String instanceId; 
        private String processId; 
        private String processName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitoringAgentProcessRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.processId = request.processId;
            this.processName = request.processName;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-KpVny6l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The process ID.</p>
         * <blockquote>
         * <p>You must configure either <code>ProcessId</code> or <code>ProcessName</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>The process name.</p>
         * <blockquote>
         * <p>You must configure either <code>ProcessId</code> or <code>ProcessName</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        @Override
        public DeleteMonitoringAgentProcessRequest build() {
            return new DeleteMonitoringAgentProcessRequest(this);
        } 

    } 

}
