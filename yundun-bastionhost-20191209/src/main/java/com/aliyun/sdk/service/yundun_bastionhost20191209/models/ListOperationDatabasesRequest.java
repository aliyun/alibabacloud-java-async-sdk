// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationDatabasesRequest} extends {@link RequestModel}
 *
 * <p>ListOperationDatabasesRequest</p>
 */
public class ListOperationDatabasesRequest extends Request {
    @Query
    @NameInMap("DatabaseAddress")
    private String databaseAddress;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("DatabaseType")
    private String databaseType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @Query
    @NameInMap("SourceInstanceState")
    private String sourceInstanceState;

    private ListOperationDatabasesRequest(Builder builder) {
        super(builder);
        this.databaseAddress = builder.databaseAddress;
        this.databaseName = builder.databaseName;
        this.databaseType = builder.databaseType;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.sourceInstanceState = builder.sourceInstanceState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationDatabasesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAddress
     */
    public String getDatabaseAddress() {
        return this.databaseAddress;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return sourceInstanceState
     */
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

    public static final class Builder extends Request.Builder<ListOperationDatabasesRequest, Builder> {
        private String databaseAddress; 
        private String databaseName; 
        private String databaseType; 
        private String instanceId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String source; 
        private String sourceInstanceId; 
        private String sourceInstanceState; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationDatabasesRequest request) {
            super(request);
            this.databaseAddress = request.databaseAddress;
            this.databaseName = request.databaseName;
            this.databaseType = request.databaseType;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceInstanceId = request.sourceInstanceId;
            this.sourceInstanceState = request.sourceInstanceState;
        } 

        /**
         * DatabaseAddress.
         */
        public Builder databaseAddress(String databaseAddress) {
            this.putQueryParameter("DatabaseAddress", databaseAddress);
            this.databaseAddress = databaseAddress;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * DatabaseType.
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * SourceInstanceId.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * SourceInstanceState.
         */
        public Builder sourceInstanceState(String sourceInstanceState) {
            this.putQueryParameter("SourceInstanceState", sourceInstanceState);
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }

        @Override
        public ListOperationDatabasesRequest build() {
            return new ListOperationDatabasesRequest(this);
        } 

    } 

}
