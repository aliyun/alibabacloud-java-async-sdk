// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorAgentProcessRequest</p>
 */
public class CreateMonitorAgentProcessRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ProcessName")
    @Validation(required = true)
    private String processName;

    @Query
    @NameInMap("ProcessUser")
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
         * The user who launches the process.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
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
