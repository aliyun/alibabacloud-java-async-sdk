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
 * {@link DeletePolarOSSAuthorizedAccountRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarOSSAuthorizedAccountRequest</p>
 */
public class DeletePolarOSSAuthorizedAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizedUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PfsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pfsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeletePolarOSSAuthorizedAccountRequest(Builder builder) {
        super(builder);
        this.authorizedUserIds = builder.authorizedUserIds;
        this.DBClusterId = builder.DBClusterId;
        this.pfsInstanceId = builder.pfsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarOSSAuthorizedAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedUserIds
     */
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return pfsInstanceId
     */
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePolarOSSAuthorizedAccountRequest, Builder> {
        private String authorizedUserIds; 
        private String DBClusterId; 
        private String pfsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarOSSAuthorizedAccountRequest request) {
            super(request);
            this.authorizedUserIds = request.authorizedUserIds;
            this.DBClusterId = request.DBClusterId;
            this.pfsInstanceId = request.pfsInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890,acs:ram::123456:role/myrole</p>
         */
        public Builder authorizedUserIds(String authorizedUserIds) {
            this.putQueryParameter("AuthorizedUserIds", authorizedUserIds);
            this.authorizedUserIds = authorizedUserIds;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxxxxxxxxxxxxxxxx</p>
         */
        public Builder pfsInstanceId(String pfsInstanceId) {
            this.putQueryParameter("PfsInstanceId", pfsInstanceId);
            this.pfsInstanceId = pfsInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeletePolarOSSAuthorizedAccountRequest build() {
            return new DeletePolarOSSAuthorizedAccountRequest(this);
        } 

    } 

}
