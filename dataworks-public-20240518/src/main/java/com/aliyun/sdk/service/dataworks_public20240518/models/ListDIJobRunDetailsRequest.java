// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDIJobRunDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListDIJobRunDetailsRequest</p>
 */
public class ListDIJobRunDetailsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDataSourceName")
    private String sourceDataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDatabaseName")
    private String sourceDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceSchemaName")
    private String sourceSchemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceTableName")
    private String sourceTableName;

    private ListDIJobRunDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sourceDataSourceName = builder.sourceDataSourceName;
        this.sourceDatabaseName = builder.sourceDatabaseName;
        this.sourceSchemaName = builder.sourceSchemaName;
        this.sourceTableName = builder.sourceTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobRunDetailsRequest create() {
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
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
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
     * @return sourceDataSourceName
     */
    public String getSourceDataSourceName() {
        return this.sourceDataSourceName;
    }

    /**
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * @return sourceSchemaName
     */
    public String getSourceSchemaName() {
        return this.sourceSchemaName;
    }

    /**
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return this.sourceTableName;
    }

    public static final class Builder extends Request.Builder<ListDIJobRunDetailsRequest, Builder> {
        private String regionId; 
        private Long DIJobId; 
        private Long instanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String sourceDataSourceName; 
        private String sourceDatabaseName; 
        private String sourceSchemaName; 
        private String sourceTableName; 

        private Builder() {
            super();
        } 

        private Builder(ListDIJobRunDetailsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sourceDataSourceName = request.sourceDataSourceName;
            this.sourceDatabaseName = request.sourceDatabaseName;
            this.sourceSchemaName = request.sourceSchemaName;
            this.sourceTableName = request.sourceTableName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11265</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SourceDataSourceName.
         */
        public Builder sourceDataSourceName(String sourceDataSourceName) {
            this.putQueryParameter("SourceDataSourceName", sourceDataSourceName);
            this.sourceDataSourceName = sourceDataSourceName;
            return this;
        }

        /**
         * SourceDatabaseName.
         */
        public Builder sourceDatabaseName(String sourceDatabaseName) {
            this.putQueryParameter("SourceDatabaseName", sourceDatabaseName);
            this.sourceDatabaseName = sourceDatabaseName;
            return this;
        }

        /**
         * SourceSchemaName.
         */
        public Builder sourceSchemaName(String sourceSchemaName) {
            this.putQueryParameter("SourceSchemaName", sourceSchemaName);
            this.sourceSchemaName = sourceSchemaName;
            return this;
        }

        /**
         * SourceTableName.
         */
        public Builder sourceTableName(String sourceTableName) {
            this.putQueryParameter("SourceTableName", sourceTableName);
            this.sourceTableName = sourceTableName;
            return this;
        }

        @Override
        public ListDIJobRunDetailsRequest build() {
            return new ListDIJobRunDetailsRequest(this);
        } 

    } 

}
