// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeParametersRequest</p>
 */
public class DescribeParametersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharacterType")
    private String characterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraParam")
    private String extraParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeParametersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.characterType = builder.characterType;
        this.DBInstanceId = builder.DBInstanceId;
        this.extraParam = builder.extraParam;
        this.nodeId = builder.nodeId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return characterType
     */
    public String getCharacterType() {
        return this.characterType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return extraParam
     */
    public String getExtraParam() {
        return this.extraParam;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<DescribeParametersRequest, Builder> {
        private String regionId; 
        private String characterType; 
        private String DBInstanceId; 
        private String extraParam; 
        private String nodeId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParametersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.characterType = request.characterType;
            this.DBInstanceId = request.DBInstanceId;
            this.extraParam = request.extraParam;
            this.nodeId = request.nodeId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The role of the instance. Valid values:</p>
         * <ul>
         * <li>db: a shard node.</li>
         * <li>cs: a Configserver node.</li>
         * <li>mongos: a mongos node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mongos</p>
         */
        public Builder characterType(String characterType) {
            this.putQueryParameter("CharacterType", characterType);
            this.characterType = characterType;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> If you set this parameter to the ID of a sharded cluster instance, you must also specify the <strong>NodeId</strong> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The parameter that is available in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>terrform</p>
         */
        public Builder extraParam(String extraParam) {
            this.putQueryParameter("ExtraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The ID of the mongos or shard node in the specified sharded cluster instance.</p>
         * <blockquote>
         * <p> This parameter is valid when the <strong>DBInstanceId</strong> parameter is set to the ID of a sharded cluster instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d-bpxxxxxxxx</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
        public DescribeParametersRequest build() {
            return new DescribeParametersRequest(this);
        } 

    } 

}
