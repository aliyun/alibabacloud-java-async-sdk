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
 * {@link DescribeDBNodePerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBNodePerformanceRequest</p>
 */
public class DescribeDBNodePerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharacterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String characterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeRole")
    private String DBNodeRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDBNodePerformanceRequest(Builder builder) {
        super(builder);
        this.characterType = builder.characterType;
        this.DBInstanceName = builder.DBInstanceName;
        this.DBNodeIds = builder.DBNodeIds;
        this.DBNodeRole = builder.DBNodeRole;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBNodePerformanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return characterType
     */
    public String getCharacterType() {
        return this.characterType;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBNodeIds
     */
    public String getDBNodeIds() {
        return this.DBNodeIds;
    }

    /**
     * @return DBNodeRole
     */
    public String getDBNodeRole() {
        return this.DBNodeRole;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDBNodePerformanceRequest, Builder> {
        private String characterType; 
        private String DBInstanceName; 
        private String DBNodeIds; 
        private String DBNodeRole; 
        private String endTime; 
        private String key; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBNodePerformanceRequest request) {
            super(request);
            this.characterType = request.characterType;
            this.DBInstanceName = request.DBInstanceName;
            this.DBNodeIds = request.DBNodeIds;
            this.DBNodeRole = request.DBNodeRole;
            this.endTime = request.endTime;
            this.key = request.key;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The node type. Valid values: polarx_cn, polarx_dn, polarx_cdc, polarx_gms, and polarx_columnar.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx_cn</p>
         */
        public Builder characterType(String characterType) {
            this.putQueryParameter("CharacterType", characterType);
            this.characterType = characterType;
            return this;
        }

        /**
         * <p>The name of the PolarDB-X instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*******</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The node names. Separate multiple names with commas (,). You can specify up to 10 CDC nodes or compute nodes at a time, and up to 1 data node at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-i-<strong><strong><strong>,pxc-i-</strong></strong></strong>*</p>
         */
        public Builder DBNodeIds(String DBNodeIds) {
            this.putQueryParameter("DBNodeIds", DBNodeIds);
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * <p>The node role. Valid values:</p>
         * <ul>
         * <li>master: primary node.</li>
         * <li>slave: secondary node. Applies to DN and GMS nodes.</li>
         * <li>standby: secondary node. Applies to CN nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        public Builder DBNodeRole(String DBNodeRole) {
            this.putQueryParameter("DBNodeRole", DBNodeRole);
            this.DBNodeRole = DBNodeRole;
            return this;
        }

        /**
         * <p>The end time of the query. Format: YYYY-MM-ddTHH:mmZ (UTC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2012-06-18T15:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The metric names. Separate multiple names with commas (,). You can specify up to 6 metrics. For more information, see <a href="https://help.aliyun.com/document_detail/332726.html">Performance metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cpu_Usage,Mem_Usage</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
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
         * <p>The start time of the query. Format: YYYY-MM-ddTHH:mmZ (UTC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2012-06-08T15:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBNodePerformanceRequest build() {
            return new DescribeDBNodePerformanceRequest(this);
        } 

    } 

}
