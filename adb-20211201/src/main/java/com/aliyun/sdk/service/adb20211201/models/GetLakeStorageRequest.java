// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetLakeStorageRequest} extends {@link RequestModel}
 *
 * <p>GetLakeStorageRequest</p>
 */
public class GetLakeStorageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LakeStorageId")
    private String lakeStorageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetLakeStorageRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.lakeStorageId = builder.lakeStorageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLakeStorageRequest create() {
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
     * @return lakeStorageId
     */
    public String getLakeStorageId() {
        return this.lakeStorageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetLakeStorageRequest, Builder> {
        private String DBClusterId; 
        private String lakeStorageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLakeStorageRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.lakeStorageId = request.lakeStorageId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The lake storage ID.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder lakeStorageId(String lakeStorageId) {
            this.putQueryParameter("LakeStorageId", lakeStorageId);
            this.lakeStorageId = lakeStorageId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetLakeStorageRequest build() {
            return new GetLakeStorageRequest(this);
        } 

    } 

}
