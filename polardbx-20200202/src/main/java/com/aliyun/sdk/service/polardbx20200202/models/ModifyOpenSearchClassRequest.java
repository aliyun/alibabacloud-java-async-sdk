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
 * {@link ModifyOpenSearchClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyOpenSearchClassRequest</p>
 */
public class ModifyOpenSearchClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDiskSize")
    private Integer DBInstanceDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchClassCode")
    private String searchClassCode;

    private ModifyOpenSearchClassRequest(Builder builder) {
        super(builder);
        this.DBInstanceDiskSize = builder.DBInstanceDiskSize;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.searchClassCode = builder.searchClassCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOpenSearchClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceDiskSize
     */
    public Integer getDBInstanceDiskSize() {
        return this.DBInstanceDiskSize;
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
     * @return searchClassCode
     */
    public String getSearchClassCode() {
        return this.searchClassCode;
    }

    public static final class Builder extends Request.Builder<ModifyOpenSearchClassRequest, Builder> {
        private Integer DBInstanceDiskSize; 
        private String DBInstanceName; 
        private String regionId; 
        private String searchClassCode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOpenSearchClassRequest request) {
            super(request);
            this.DBInstanceDiskSize = request.DBInstanceDiskSize;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.searchClassCode = request.searchClassCode;
        } 

        /**
         * DBInstanceDiskSize.
         */
        public Builder DBInstanceDiskSize(Integer DBInstanceDiskSize) {
            this.putQueryParameter("DBInstanceDiskSize", DBInstanceDiskSize);
            this.DBInstanceDiskSize = DBInstanceDiskSize;
            return this;
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
         * SearchClassCode.
         */
        public Builder searchClassCode(String searchClassCode) {
            this.putQueryParameter("SearchClassCode", searchClassCode);
            this.searchClassCode = searchClassCode;
            return this;
        }

        @Override
        public ModifyOpenSearchClassRequest build() {
            return new ModifyOpenSearchClassRequest(this);
        } 

    } 

}
