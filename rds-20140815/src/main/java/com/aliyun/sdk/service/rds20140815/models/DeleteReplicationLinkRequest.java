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
 * {@link DeleteReplicationLinkRequest} extends {@link RequestModel}
 *
 * <p>DeleteReplicationLinkRequest</p>
 */
public class DeleteReplicationLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromoteToMaster")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean promoteToMaster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteReplicationLinkRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.promoteToMaster = builder.promoteToMaster;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteReplicationLinkRequest create() {
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
     * @return promoteToMaster
     */
    public Boolean getPromoteToMaster() {
        return this.promoteToMaster;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DeleteReplicationLinkRequest, Builder> {
        private String DBInstanceId; 
        private Boolean promoteToMaster; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteReplicationLinkRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.promoteToMaster = request.promoteToMaster;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the DR instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1trqb4p1xd****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to delete the data synchronization link between the DR instance and the primary instance and promote the DR instance to the primary instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder promoteToMaster(Boolean promoteToMaster) {
            this.putQueryParameter("PromoteToMaster", promoteToMaster);
            this.promoteToMaster = promoteToMaster;
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
        public DeleteReplicationLinkRequest build() {
            return new DeleteReplicationLinkRequest(this);
        } 

    } 

}
