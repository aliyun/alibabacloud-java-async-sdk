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
 * {@link DescribePolarFsQuotaRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarFsQuotaRequest</p>
 */
public class DescribePolarFsQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaType")
    private String quotaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribePolarFsQuotaRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.path = builder.path;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.quotaType = builder.quotaType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsQuotaRequest create() {
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
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return quotaType
     */
    public String getQuotaType() {
        return this.quotaType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribePolarFsQuotaRequest, Builder> {
        private String DBClusterId; 
        private String path; 
        private String polarFsInstanceId; 
        private String quotaType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarFsQuotaRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.path = request.path;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.quotaType = request.quotaType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Enterprise Edition, Basic Edition, and Data Lakehouse Edition: You can call the <a href="https://help.aliyun.com/document_detail/2319131.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The target path.</p>
         * 
         * <strong>example:</strong>
         * <p>/data</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The Polarlakebase instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The quota type to query.</p>
         * 
         * <strong>example:</strong>
         * <p>quotaPolicy</p>
         */
        public Builder quotaType(String quotaType) {
            this.putQueryParameter("QuotaType", quotaType);
            this.quotaType = quotaType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions for the current account, including region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribePolarFsQuotaRequest build() {
            return new DescribePolarFsQuotaRequest(this);
        } 

    } 

}
