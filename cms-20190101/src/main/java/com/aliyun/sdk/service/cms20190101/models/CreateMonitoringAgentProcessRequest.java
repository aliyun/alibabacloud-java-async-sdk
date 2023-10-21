// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitoringAgentProcessRequest</p>
 */
public class CreateMonitoringAgentProcessRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ProcessName")
    private String processName;

    @Query
    @NameInMap("ProcessUser")
    private String processUser;

    private CreateMonitoringAgentProcessRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.processName = builder.processName;
        this.processUser = builder.processUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitoringAgentProcessRequest create() {
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
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return processUser
     */
    public String getProcessUser() {
        return this.processUser;
    }

    public static final class Builder extends Request.Builder<CreateMonitoringAgentProcessRequest, Builder> {
        private String instanceId; 
        private String processName; 
        private String processUser; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitoringAgentProcessRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.processName = request.processName;
            this.processUser = request.processUser;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the process.
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * The user who launches the process.
         */
        public Builder processUser(String processUser) {
            this.putQueryParameter("ProcessUser", processUser);
            this.processUser = processUser;
            return this;
        }

        @Override
        public CreateMonitoringAgentProcessRequest build() {
            return new CreateMonitoringAgentProcessRequest(this);
        } 

    } 

}
