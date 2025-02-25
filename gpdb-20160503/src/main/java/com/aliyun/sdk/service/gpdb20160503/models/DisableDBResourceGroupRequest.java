// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DisableDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>DisableDBResourceGroupRequest</p>
 */
public class DisableDBResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DisableDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableDBResourceGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DisableDBResourceGroupRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DisableDBResourceGroupRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
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

        @Override
        public DisableDBResourceGroupRequest build() {
            return new DisableDBResourceGroupRequest(this);
        } 

    } 

}
