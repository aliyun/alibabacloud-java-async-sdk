// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link EnableDBClusterServerlessRequest} extends {@link RequestModel}
 *
 * <p>EnableDBClusterServerlessRequest</p>
 */
public class EnableDBClusterServerlessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMax")
    private String scaleApRoNumMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMin")
    private String scaleApRoNumMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private String scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private String scaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMax")
    private String scaleRoNumMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMin")
    private String scaleRoNumMin;

    private EnableDBClusterServerlessRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleApRoNumMax = builder.scaleApRoNumMax;
        this.scaleApRoNumMin = builder.scaleApRoNumMin;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.scaleRoNumMax = builder.scaleRoNumMax;
        this.scaleRoNumMin = builder.scaleRoNumMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableDBClusterServerlessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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

    /**
     * @return scaleApRoNumMax
     */
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    /**
     * @return scaleApRoNumMin
     */
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    /**
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return scaleRoNumMax
     */
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    /**
     * @return scaleRoNumMin
     */
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    public static final class Builder extends Request.Builder<EnableDBClusterServerlessRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scaleApRoNumMax; 
        private String scaleApRoNumMin; 
        private String scaleMax; 
        private String scaleMin; 
        private String scaleRoNumMax; 
        private String scaleRoNumMin; 

        private Builder() {
            super();
        } 

        private Builder(EnableDBClusterServerlessRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleApRoNumMax = request.scaleApRoNumMax;
            this.scaleApRoNumMin = request.scaleApRoNumMin;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.scaleRoNumMax = request.scaleRoNumMax;
            this.scaleRoNumMin = request.scaleRoNumMin;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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

        /**
         * <p>The maximum number of stable AP read-only nodes. Valid values: 0 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleApRoNumMax(String scaleApRoNumMax) {
            this.putQueryParameter("ScaleApRoNumMax", scaleApRoNumMax);
            this.scaleApRoNumMax = scaleApRoNumMax;
            return this;
        }

        /**
         * <p>The minimum number of stable AP read-only nodes. Valid values: 0 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleApRoNumMin(String scaleApRoNumMin) {
            this.putQueryParameter("ScaleApRoNumMin", scaleApRoNumMin);
            this.scaleApRoNumMin = scaleApRoNumMin;
            return this;
        }

        /**
         * <p>The maximum number of PCUs per node for scaling. Valid values: 1 to 8 PCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaleMax(String scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum number of PolarDB capacity units (PCUs) per node for scaling. Valid values: 1 to 8 PCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleMin(String scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * <p>The maximum number of read-only nodes for scaling. Valid values: 0 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaleRoNumMax(String scaleRoNumMax) {
            this.putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }

        /**
         * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleRoNumMin(String scaleRoNumMin) {
            this.putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }

        @Override
        public EnableDBClusterServerlessRequest build() {
            return new EnableDBClusterServerlessRequest(this);
        } 

    } 

}
