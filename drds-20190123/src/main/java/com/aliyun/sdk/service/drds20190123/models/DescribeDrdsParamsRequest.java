// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsParamsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsParamsRequest</p>
 */
public class DescribeDrdsParamsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeDrdsParamsRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.paramLevel = builder.paramLevel;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsParamsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return paramLevel
     */
    public String getParamLevel() {
        return this.paramLevel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsParamsRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String paramLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsParamsRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.paramLevel = request.paramLevel;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeDrdsParams</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The type of nodes whose parameters you want to query. Valid values:</p>
         * <ul>
         * <li><strong>INSTANCE: the instance level.</strong></li>
         * <li><strong>DB</strong>: the database level.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder paramLevel(String paramLevel) {
            this.putQueryParameter("ParamLevel", paramLevel);
            this.paramLevel = paramLevel;
            return this;
        }

        /**
         * <p>The ID of the region where the PolarDB-X 1.0 instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDrdsParamsRequest build() {
            return new DescribeDrdsParamsRequest(this);
        } 

    } 

}
