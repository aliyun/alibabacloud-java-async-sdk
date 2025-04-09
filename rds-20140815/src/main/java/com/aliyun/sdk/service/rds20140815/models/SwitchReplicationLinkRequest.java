// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link SwitchReplicationLinkRequest} extends {@link RequestModel}
 *
 * <p>SwitchReplicationLinkRequest</p>
 */
public class SwitchReplicationLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInstanceRegionId;

    private SwitchReplicationLinkRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.targetInstanceName = builder.targetInstanceName;
        this.targetInstanceRegionId = builder.targetInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchReplicationLinkRequest create() {
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
     * @return targetInstanceName
     */
    public String getTargetInstanceName() {
        return this.targetInstanceName;
    }

    /**
     * @return targetInstanceRegionId
     */
    public String getTargetInstanceRegionId() {
        return this.targetInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<SwitchReplicationLinkRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String targetInstanceName; 
        private String targetInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchReplicationLinkRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.targetInstanceName = request.targetInstanceName;
            this.targetInstanceRegionId = request.targetInstanceRegionId;
        } 

        /**
         * <p>The ID of the source or primary instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zecuz9tolf******</p>
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
         * <p>The name of the destination DR instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4neh0q12v1******</p>
         */
        public Builder targetInstanceName(String targetInstanceName) {
            this.putQueryParameter("TargetInstanceName", targetInstanceName);
            this.targetInstanceName = targetInstanceName;
            return this;
        }

        /**
         * <p>The ID of the region in which the destination DR instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder targetInstanceRegionId(String targetInstanceRegionId) {
            this.putQueryParameter("TargetInstanceRegionId", targetInstanceRegionId);
            this.targetInstanceRegionId = targetInstanceRegionId;
            return this;
        }

        @Override
        public SwitchReplicationLinkRequest build() {
            return new SwitchReplicationLinkRequest(this);
        } 

    } 

}
