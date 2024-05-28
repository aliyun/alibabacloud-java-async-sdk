// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDBResourceGroupRequest</p>
 */
public class CreateDBResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupName;

    private CreateDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.resourceGroupConfig = builder.resourceGroupConfig;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceGroupConfig
     */
    public String getResourceGroupConfig() {
        return this.resourceGroupConfig;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<CreateDBResourceGroupRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String resourceGroupConfig; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBResourceGroupRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.resourceGroupConfig = request.resourceGroupConfig;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceGroupConfig.
         */
        public Builder resourceGroupConfig(String resourceGroupConfig) {
            this.putQueryParameter("ResourceGroupConfig", resourceGroupConfig);
            this.resourceGroupConfig = resourceGroupConfig;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public CreateDBResourceGroupRequest build() {
            return new CreateDBResourceGroupRequest(this);
        } 

    } 

}
