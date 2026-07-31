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
 * {@link CheckFormationSchemaExistsRequest} extends {@link RequestModel}
 *
 * <p>CheckFormationSchemaExistsRequest</p>
 */
public class CheckFormationSchemaExistsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrefixMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean prefixMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schema;

    private CheckFormationSchemaExistsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.prefixMode = builder.prefixMode;
        this.regionId = builder.regionId;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFormationSchemaExistsRequest create() {
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
     * @return prefixMode
     */
    public Boolean getPrefixMode() {
        return this.prefixMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<CheckFormationSchemaExistsRequest, Builder> {
        private String DBClusterId; 
        private Boolean prefixMode; 
        private String regionId; 
        private String schema; 

        private Builder() {
            super();
        } 

        private Builder(CheckFormationSchemaExistsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.prefixMode = request.prefixMode;
            this.regionId = request.regionId;
            this.schema = request.schema;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prefixMode(Boolean prefixMode) {
            this.putBodyParameter("PrefixMode", prefixMode);
            this.prefixMode = prefixMode;
            return this;
        }

        /**
         * <p>RegionId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>schema 。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb01</p>
         */
        public Builder schema(String schema) {
            this.putBodyParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public CheckFormationSchemaExistsRequest build() {
            return new CheckFormationSchemaExistsRequest(this);
        } 

    } 

}
