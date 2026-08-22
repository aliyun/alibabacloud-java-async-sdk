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
 * {@link CreateContext0Request} extends {@link RequestModel}
 *
 * <p>CreateContext0Request</p>
 */
public class CreateContext0Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenSearchInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openSearchInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateContext0Request(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.openSearchInstanceName = builder.openSearchInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContext0Request create() {
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
     * @return openSearchInstanceName
     */
    public String getOpenSearchInstanceName() {
        return this.openSearchInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateContext0Request, Builder> {
        private String DBInstanceName; 
        private String openSearchInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateContext0Request request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.openSearchInstanceName = request.openSearchInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>关联的 PolarDB-X 实例名（pxc- 前缀）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
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
         * <p>pxs-********</p>
         */
        public Builder openSearchInstanceName(String openSearchInstanceName) {
            this.putQueryParameter("OpenSearchInstanceName", openSearchInstanceName);
            this.openSearchInstanceName = openSearchInstanceName;
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

        @Override
        public CreateContext0Request build() {
            return new CreateContext0Request(this);
        } 

    } 

}
