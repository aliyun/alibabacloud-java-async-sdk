// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationHostsRequest} extends {@link RequestModel}
 *
 * <p>ListOperationHostsRequest</p>
 */
public class ListOperationHostsRequest extends Request {
    @Query
    @NameInMap("HostAddress")
    private String hostAddress;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OSType")
    private String OSType;

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

    private ListOperationHostsRequest(Builder builder) {
        super(builder);
        this.hostAddress = builder.hostAddress;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.OSType = builder.OSType;
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

    public static ListOperationHostsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAddress
     */
    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
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

    public static final class Builder extends Request.Builder<ListOperationHostsRequest, Builder> {
        private String hostAddress; 
        private String hostName; 
        private String instanceId; 
        private String OSType; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String source; 
        private String sourceInstanceId; 
        private String sourceInstanceState; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationHostsRequest request) {
            super(request);
            this.hostAddress = request.hostAddress;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.OSType = request.OSType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceInstanceId = request.sourceInstanceId;
            this.sourceInstanceState = request.sourceInstanceState;
        } 

        /**
         * HostAddress.
         */
        public Builder hostAddress(String hostAddress) {
            this.putQueryParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
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
         * OSType.
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
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
        public ListOperationHostsRequest build() {
            return new ListOperationHostsRequest(this);
        } 

    } 

}
