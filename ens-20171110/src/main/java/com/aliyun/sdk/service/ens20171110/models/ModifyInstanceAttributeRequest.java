// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAttributeRequest</p>
 */
public class ModifyInstanceAttributeRequest extends Request {
    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("UserData")
    private String userData;

    private ModifyInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.password = builder.password;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceAttributeRequest, Builder> {
        private String hostName; 
        private String instanceId; 
        private String instanceName; 
        private String password; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAttributeRequest request) {
            super(request);
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.password = request.password;
            this.userData = request.userData;
        } 

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public ModifyInstanceAttributeRequest build() {
            return new ModifyInstanceAttributeRequest(this);
        } 

    } 

}
