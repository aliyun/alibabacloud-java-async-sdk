// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BindRoleToEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindRoleToEdgeInstanceRequest</p>
 */
public class BindRoleToEdgeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    private BindRoleToEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.roleArn = builder.roleArn;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindRoleToEdgeInstanceRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<BindRoleToEdgeInstanceRequest, Builder> {
        private String instanceId; 
        private String iotInstanceId; 
        private String roleArn; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(BindRoleToEdgeInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.roleArn = request.roleArn;
            this.roleName = request.roleName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F3APY0tPLhmgGtx0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::176********:role/iotedgerole</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IoTEdgeRole</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public BindRoleToEdgeInstanceRequest build() {
            return new BindRoleToEdgeInstanceRequest(this);
        } 

    } 

}
