// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDIJobsRequest} extends {@link RequestModel}
 *
 * <p>ListDIJobsRequest</p>
 */
public class ListDIJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
    private String destinationDataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationType")
    private String migrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
    private String sourceDataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    private ListDIJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationDataSourceType = builder.destinationDataSourceType;
        this.migrationType = builder.migrationType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sourceDataSourceType = builder.sourceDataSourceType;
        this.specType = builder.specType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobsRequest create() {
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
     * @return destinationDataSourceType
     */
    public String getDestinationDataSourceType() {
        return this.destinationDataSourceType;
    }

    /**
     * @return migrationType
     */
    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return sourceDataSourceType
     */
    public String getSourceDataSourceType() {
        return this.sourceDataSourceType;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    public static final class Builder extends Request.Builder<ListDIJobsRequest, Builder> {
        private String regionId; 
        private String destinationDataSourceType; 
        private String migrationType; 
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long projectId; 
        private String sourceDataSourceType; 
        private String specType; 

        private Builder() {
            super();
        } 

        private Builder(ListDIJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationDataSourceType = request.destinationDataSourceType;
            this.migrationType = request.migrationType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sourceDataSourceType = request.sourceDataSourceType;
            this.specType = request.specType;
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
         * <p>The type of the destination data source. If you do not specify this parameter, jobs are not filtered by this criterion. Valid values: <code>Hologres</code>, <code>OSS-HDFS</code>, <code>OSS</code>, <code>MaxCompute</code>, <code>LogHub</code>, <code>StarRocks</code>, <code>DataHub</code>, <code>AnalyticDB_For_MySQL</code>, <code>Kafka</code>, and <code>Hive</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        public Builder destinationDataSourceType(String destinationDataSourceType) {
            this.putQueryParameter("DestinationDataSourceType", destinationDataSourceType);
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }

        /**
         * <p>The synchronization type. Valid values:</p>
         * <ul>
         * <li><p><code>FullAndRealtimeIncremental</code>: full and real-time incremental synchronization</p>
         * </li>
         * <li><p><code>RealtimeIncremental</code>: real-time incremental synchronization</p>
         * </li>
         * <li><p><code>Full</code>: full synchronization</p>
         * </li>
         * <li><p><code>OfflineIncremental</code>: offline incremental synchronization</p>
         * </li>
         * <li><p><code>FullAndOfflineIncremental</code>: full and offline incremental synchronization</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        public Builder migrationType(String migrationType) {
            this.putQueryParameter("MigrationType", migrationType);
            this.migrationType = migrationType;
            return this;
        }

        /**
         * <p>The name of the Data Integration job.</p>
         * <p>The name must be unique within the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_export_01</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number. Pages are numbered starting from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default: 10. Maximum: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1967</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The type of the source data source. If you do not specify this parameter, jobs are not filtered by this criterion. Valid values: <code>PolarDB</code>, <code>MySQL</code>, <code>Kafka</code>, <code>LogHub</code>, <code>Hologres</code>, <code>Oracle</code>, <code>OceanBase</code>, <code>MongoDB</code>, <code>RedShift</code>, <code>Hive</code>, <code>SQLServer</code>, <code>Doris</code>, and <code>ClickHouse</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder sourceDataSourceType(String sourceDataSourceType) {
            this.putQueryParameter("SourceDataSourceType", sourceDataSourceType);
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }

        /**
         * <p>The configuration type of the job. Valid values: <code>FILESPEC</code>, <code>CLASSIC</code>, and <code>ALL</code>. <code>FILESPEC</code> indicates a new job type configured based on a structured file specification. <code>CLASSIC</code> indicates a job configured in the traditional mode. If you set this parameter to <code>ALL</code>, jobs of both types are returned.</p>
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        @Override
        public ListDIJobsRequest build() {
            return new ListDIJobsRequest(this);
        } 

    } 

}
