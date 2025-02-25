// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyClusterDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterDescriptionRequest</p>
 */
public class ModifyClusterDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyClusterDescriptionRequest(Builder builder) {
        super(builder);
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyClusterDescriptionRequest, Builder> {
        private String DBClusterDescription; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterDescriptionRequest request) {
            super(request);
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1qx68m06981****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
        public ModifyClusterDescriptionRequest build() {
            return new ModifyClusterDescriptionRequest(this);
        } 

    } 

}
