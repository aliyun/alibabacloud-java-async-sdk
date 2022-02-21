// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectTicketRequest} extends {@link RequestModel}
 *
 * <p>GetConnectTicketRequest</p>
 */
public class GetConnectTicketRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("AsyncMode")
    private Boolean asyncMode;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("UsePrivateIp")
    private Boolean usePrivateIp;

    @Query
    @NameInMap("UserName")
    private String userName;

    private GetConnectTicketRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.asyncMode = builder.asyncMode;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.taskId = builder.taskId;
        this.usePrivateIp = builder.usePrivateIp;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return asyncMode
     */
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return usePrivateIp
     */
    public Boolean getUsePrivateIp() {
        return this.usePrivateIp;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<GetConnectTicketRequest, Builder> {
        private String appName; 
        private Boolean asyncMode; 
        private String instanceId; 
        private String password; 
        private String taskId; 
        private Boolean usePrivateIp; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectTicketRequest response) {
            super(response);
            this.appName = response.appName;
            this.asyncMode = response.asyncMode;
            this.instanceId = response.instanceId;
            this.password = response.password;
            this.taskId = response.taskId;
            this.usePrivateIp = response.usePrivateIp;
            this.userName = response.userName;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AsyncMode.
         */
        public Builder asyncMode(Boolean asyncMode) {
            this.putQueryParameter("AsyncMode", asyncMode);
            this.asyncMode = asyncMode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * UsePrivateIp.
         */
        public Builder usePrivateIp(Boolean usePrivateIp) {
            this.putQueryParameter("UsePrivateIp", usePrivateIp);
            this.usePrivateIp = usePrivateIp;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GetConnectTicketRequest build() {
            return new GetConnectTicketRequest(this);
        } 

    } 

}
