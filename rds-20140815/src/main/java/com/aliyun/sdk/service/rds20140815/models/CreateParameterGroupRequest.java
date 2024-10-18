// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateParameterGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateParameterGroupRequest</p>
 */
public class CreateParameterGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
    private String parameterGroupDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateParameterGroupRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.ownerId = builder.ownerId;
        this.parameterGroupDesc = builder.parameterGroupDesc;
        this.parameterGroupName = builder.parameterGroupName;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParameterGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parameterGroupDesc
     */
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    /**
     * @return parameterGroupName
     */
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateParameterGroupRequest, Builder> {
        private String engine; 
        private String engineVersion; 
        private Long ownerId; 
        private String parameterGroupDesc; 
        private String parameterGroupName; 
        private String parameters; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateParameterGroupRequest request) {
            super(request);
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.ownerId = request.ownerId;
            this.parameterGroupDesc = request.parameterGroupDesc;
            this.parameterGroupName = request.parameterGroupName;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>mysql</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version of the instance.</p>
         * <ul>
         * <li><p>If the instance runs MySQL, the instance must run one of the following MySQL versions:</p>
         * <ul>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>8.0</strong></li>
         * </ul>
         * </li>
         * <li><p>If the instance runs PostgreSQL, the instance must run one of the following PostgreSQL versions:</p>
         * <ul>
         * <li><strong>10.0</strong></li>
         * <li><strong>11.0</strong></li>
         * <li><strong>12.0</strong></li>
         * <li><strong>13.0</strong></li>
         * <li><strong>14.0</strong></li>
         * <li><strong>15.0</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
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
         * <p>The description of the parameter template. The value can be up to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder parameterGroupDesc(String parameterGroupDesc) {
            this.putQueryParameter("ParameterGroupDesc", parameterGroupDesc);
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }

        /**
         * <p>The name of the parameter template.</p>
         * <ul>
         * <li>The value must start with a letter and can contain letters, digits, periods (.), and underscores (_).</li>
         * <li>The value can be 8 to 64 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234</p>
         */
        public Builder parameterGroupName(String parameterGroupName) {
            this.putQueryParameter("ParameterGroupName", parameterGroupName);
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * <p>A JSON string that consists of parameters and their values in the parameter template. Format: {&quot;Parameter 1&quot;:&quot;Value of Parameter 1&quot;,&quot;Parameter 2&quot;:&quot;Value of Parameter 2&quot;...}. For more information about the parameters that can be modified, see <a href="https://help.aliyun.com/document_detail/96063.html">Modify the parameters of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/96751.html">Modify the parameters of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;back_log&quot;:&quot;3000&quot;,&quot;wait_timeout&quot;:&quot;86400&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID of the parameter template. You can call the DescribeRegions operation to query the most recent zone list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to obtain the resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateParameterGroupRequest build() {
            return new CreateParameterGroupRequest(this);
        } 

    } 

}
