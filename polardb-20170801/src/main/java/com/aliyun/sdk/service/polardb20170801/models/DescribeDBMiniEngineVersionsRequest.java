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
 * {@link DescribeDBMiniEngineVersionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBMiniEngineVersionsRequest</p>
 */
public class DescribeDBMiniEngineVersionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationCategory")
    private String creationCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBMinorVersion")
    private String DBMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeDBMiniEngineVersionsRequest(Builder builder) {
        super(builder);
        this.architecture = builder.architecture;
        this.creationCategory = builder.creationCategory;
        this.DBMinorVersion = builder.DBMinorVersion;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBMiniEngineVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return creationCategory
     */
    public String getCreationCategory() {
        return this.creationCategory;
    }

    /**
     * @return DBMinorVersion
     */
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeDBMiniEngineVersionsRequest, Builder> {
        private String architecture; 
        private String creationCategory; 
        private String DBMinorVersion; 
        private String DBType; 
        private String DBVersion; 
        private String regionId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBMiniEngineVersionsRequest request) {
            super(request);
            this.architecture = request.architecture;
            this.creationCategory = request.creationCategory;
            this.DBMinorVersion = request.DBMinorVersion;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.regionId = request.regionId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The CPU architecture. Valid values:</p>
         * <ul>
         * <li><p><strong>X86</strong></p>
         * </li>
         * <li><p><strong>ARM</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>The product series. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Cluster Edition (default)</p>
         * </li>
         * <li><p><strong>SENormal</strong>: Standard Edition</p>
         * </li>
         * </ul>
         * <p>For more information about product series, see <a href="https://help.aliyun.com/document_detail/183258.html">Product series</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder creationCategory(String creationCategory) {
            this.putQueryParameter("CreationCategory", creationCategory);
            this.creationCategory = creationCategory;
            return this;
        }

        /**
         * <p>The minor version of the database engine.</p>
         * <ul>
         * <li><p>If <code>DBVersion</code> is set to <strong>8.0</strong>, valid values are:</p>
         * <ul>
         * <li><p><strong>8.0.2</strong></p>
         * </li>
         * <li><p><strong>8.0.1</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <code>DBVersion</code> is set to <strong>5.7</strong>, the valid value is <strong>5.7.28</strong>.</p>
         * </li>
         * <li><p>If <code>DBVersion</code> is set to <strong>5.6</strong>, the valid value is <strong>5.6.16</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8.0.1</p>
         */
        public Builder DBMinorVersion(String DBMinorVersion) {
            this.putQueryParameter("DBMinorVersion", DBMinorVersion);
            this.DBMinorVersion = DBMinorVersion;
            return this;
        }

        /**
         * <p>The database type. The only valid value is <strong>MySQL</strong>.</p>
         * <ul>
         * <li><strong>MySQL</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The major version of the database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>8.0</strong></p>
         * </li>
         * <li><p><strong>5.7</strong></p>
         * </li>
         * <li><p><strong>5.6</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeDBMiniEngineVersionsRequest build() {
            return new DescribeDBMiniEngineVersionsRequest(this);
        } 

    } 

}
