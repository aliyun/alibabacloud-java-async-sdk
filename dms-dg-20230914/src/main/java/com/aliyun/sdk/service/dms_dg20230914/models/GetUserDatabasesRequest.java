// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserDatabasesRequest} extends {@link RequestModel}
 *
 * <p>GetUserDatabasesRequest</p>
 */
public class GetUserDatabasesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    private GetUserDatabasesRequest(Builder builder) {
        super(builder);
        this.dbType = builder.dbType;
        this.gatewayId = builder.gatewayId;
        this.host = builder.host;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDatabasesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
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
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    public static final class Builder extends Request.Builder<GetUserDatabasesRequest, Builder> {
        private String dbType; 
        private String gatewayId; 
        private String host; 
        private String instanceId; 
        private String pageNumber; 
        private String pageSize; 
        private Integer port; 
        private String regionId; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(GetUserDatabasesRequest request) {
            super(request);
            this.dbType = request.dbType;
            this.gatewayId = request.gatewayId;
            this.host = request.host;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.regionId = request.regionId;
            this.searchKey = request.searchKey;
        } 

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.putBodyParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putBodyParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public GetUserDatabasesRequest build() {
            return new GetUserDatabasesRequest(this);
        } 

    } 

}
