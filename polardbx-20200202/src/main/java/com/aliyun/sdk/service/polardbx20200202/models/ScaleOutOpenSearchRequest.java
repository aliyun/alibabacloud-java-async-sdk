// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ScaleOutOpenSearchRequest} extends {@link RequestModel}
 *
 * <p>ScaleOutOpenSearchRequest</p>
 */
public class ScaleOutOpenSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchNodeCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchNodeCount;

    private ScaleOutOpenSearchRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.searchNodeCount = builder.searchNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleOutOpenSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchNodeCount
     */
    public String getSearchNodeCount() {
        return this.searchNodeCount;
    }

    public static final class Builder extends Request.Builder<ScaleOutOpenSearchRequest, Builder> {
        private String DBInstanceName; 
        private String regionId; 
        private String searchNodeCount; 

        private Builder() {
            super();
        } 

        private Builder(ScaleOutOpenSearchRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.searchNodeCount = request.searchNodeCount;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfz</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder searchNodeCount(String searchNodeCount) {
            this.putQueryParameter("SearchNodeCount", searchNodeCount);
            this.searchNodeCount = searchNodeCount;
            return this;
        }

        @Override
        public ScaleOutOpenSearchRequest build() {
            return new ScaleOutOpenSearchRequest(this);
        } 

    } 

}
