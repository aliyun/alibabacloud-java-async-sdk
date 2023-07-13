// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitoringAgentProcessRequest</p>
 */
public class DeleteMonitoringAgentProcessRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ProcessId")
    private String processId;

    @Query
    @NameInMap("ProcessName")
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
         * The ID of the process.
         * <p>
         * 
         * >  You must specify either the `ProcessId` or the `ProcessName` parameter.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
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
