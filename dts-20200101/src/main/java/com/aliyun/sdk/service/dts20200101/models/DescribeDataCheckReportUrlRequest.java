// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDataCheckReportUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataCheckReportUrlRequest</p>
 */
public class DescribeDataCheckReportUrlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tbName;

    private DescribeDataCheckReportUrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkType = builder.checkType;
        this.dbName = builder.dbName;
        this.dtsJobId = builder.dtsJobId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tbName = builder.tbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCheckReportUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tbName
     */
    public String getTbName() {
        return this.tbName;
    }

    public static final class Builder extends Request.Builder<DescribeDataCheckReportUrlRequest, Builder> {
        private String regionId; 
        private Integer checkType; 
        private String dbName; 
        private String dtsJobId; 
        private String resourceGroupId; 
        private String tbName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataCheckReportUrlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkType = request.checkType;
            this.dbName = request.dbName;
            this.dtsJobId = request.dtsJobId;
            this.resourceGroupId = request.resourceGroupId;
            this.tbName = request.tbName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The data verification method. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: full data verification.</li>
         * <li><strong>2</strong>: incremental data verification.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The name of the verified source database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsdb</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of the Data Transmission Service (DTS) task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f4612nr2182****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the table verified in the source database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>student</p>
         */
        public Builder tbName(String tbName) {
            this.putQueryParameter("TbName", tbName);
            this.tbName = tbName;
            return this;
        }

        @Override
        public DescribeDataCheckReportUrlRequest build() {
            return new DescribeDataCheckReportUrlRequest(this);
        } 

    } 

}
