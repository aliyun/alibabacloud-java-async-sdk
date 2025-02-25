// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMonitorAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorAgentProcessRequest</p>
 */
public class CreateMonitorAgentProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessUser")
    private String processUser;

    private CreateMonitorAgentProcessRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.processName = builder.processName;
        this.processUser = builder.processUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorAgentProcessRequest create() {
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

    public static final class Builder extends Request.Builder<CreateMonitorAgentProcessRequest, Builder> {
        private String instanceId; 
        private String processName; 
        private String processUser; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorAgentProcessRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.processName = request.processName;
            this.processUser = request.processUser;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze2d6j5uhg20x47****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the process.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYunDun</p>
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * <p>The user who launches the process.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder processUser(String processUser) {
            this.putQueryParameter("ProcessUser", processUser);
            this.processUser = processUser;
            return this;
        }

        @Override
        public CreateMonitorAgentProcessRequest build() {
            return new CreateMonitorAgentProcessRequest(this);
        } 

    } 

}
