// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dg20190327.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabaseAccessPointRequest} extends {@link RequestModel}
 *
 * <p>ListDatabaseAccessPointRequest</p>
 */
public class ListDatabaseAccessPointRequest extends Request {
    @Body
    @NameInMap("DbInstanceId")
    private String dbInstanceId;

    @Body
    @NameInMap("GatewayId")
    private String gatewayId;

    @Body
    @NameInMap("Host")
    private String host;

    @Body
    @NameInMap("PageNumber")
    private String pageNumber;

    @Body
    @NameInMap("PageSize")
    private String pageSize;

    @Body
    @NameInMap("Port")
    @Validation(maximum = 65535)
    private Integer port;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SearchKey")
    private String searchKey;

    @Body
    @NameInMap("VpcId")
    private String vpcId;

    private ListDatabaseAccessPointRequest(Builder builder) {
        super(builder);
        this.dbInstanceId = builder.dbInstanceId;
        this.gatewayId = builder.gatewayId;
        this.host = builder.host;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.searchKey = builder.searchKey;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
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

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListDatabaseAccessPointRequest, Builder> {
        private String dbInstanceId; 
        private String gatewayId; 
        private String host; 
        private String pageNumber; 
        private String pageSize; 
        private Integer port; 
        private String regionId; 
        private String searchKey; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatabaseAccessPointRequest request) {
            super(request);
            this.dbInstanceId = request.dbInstanceId;
            this.gatewayId = request.gatewayId;
            this.host = request.host;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.regionId = request.regionId;
            this.searchKey = request.searchKey;
            this.vpcId = request.vpcId;
        } 

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putBodyParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
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

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListDatabaseAccessPointRequest build() {
            return new ListDatabaseAccessPointRequest(this);
        } 

    } 

}
