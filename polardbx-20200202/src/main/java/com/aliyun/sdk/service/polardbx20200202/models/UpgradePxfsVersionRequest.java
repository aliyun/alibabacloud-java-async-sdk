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
 * {@link UpgradePxfsVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradePxfsVersionRequest</p>
 */
public class UpgradePxfsVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpgradePxfsVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.minorVersion = builder.minorVersion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePxfsVersionRequest create() {
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
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpgradePxfsVersionRequest, Builder> {
        private String DBInstanceName; 
        private String minorVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradePxfsVersionRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.minorVersion = request.minorVersion;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Agent文件服务关联的PolarDB-X实例ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>升级后的Agent文件服务目标小版本；不传时使用最新可用版本。</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        public Builder minorVersion(String minorVersion) {
            this.putQueryParameter("MinorVersion", minorVersion);
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * <p>Agent文件服务实例所属地域的ID。</p>
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
        public UpgradePxfsVersionRequest build() {
            return new UpgradePxfsVersionRequest(this);
        } 

    } 

}
