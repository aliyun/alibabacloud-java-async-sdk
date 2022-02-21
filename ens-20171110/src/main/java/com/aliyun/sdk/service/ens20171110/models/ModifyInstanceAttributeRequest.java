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
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private ModifyInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.password = builder.password;
        this.version = builder.version;
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceAttributeRequest, Builder> {
        private String instanceId; 
        private String instanceName; 
        private String password; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAttributeRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.instanceName = response.instanceName;
            this.password = response.password;
            this.version = response.version;
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
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ModifyInstanceAttributeRequest build() {
            return new ModifyInstanceAttributeRequest(this);
        } 

    } 

}
