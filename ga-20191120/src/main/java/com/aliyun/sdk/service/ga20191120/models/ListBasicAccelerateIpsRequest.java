// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAccelerateIpsRequest} extends {@link RequestModel}
 *
 * <p>ListBasicAccelerateIpsRequest</p>
 */
public class ListBasicAccelerateIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateIpAddress")
    private String accelerateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListBasicAccelerateIpsRequest(Builder builder) {
        super(builder);
        this.accelerateIpAddress = builder.accelerateIpAddress;
        this.accelerateIpId = builder.accelerateIpId;
        this.clientToken = builder.clientToken;
        this.ipSetId = builder.ipSetId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBasicAccelerateIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateIpAddress
     */
    public String getAccelerateIpAddress() {
        return this.accelerateIpAddress;
    }

    /**
     * @return accelerateIpId
     */
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListBasicAccelerateIpsRequest, Builder> {
        private String accelerateIpAddress; 
        private String accelerateIpId; 
        private String clientToken; 
        private String ipSetId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBasicAccelerateIpsRequest request) {
            super(request);
            this.accelerateIpAddress = request.accelerateIpAddress;
            this.accelerateIpId = request.accelerateIpId;
            this.clientToken = request.clientToken;
            this.ipSetId = request.ipSetId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * The accelerated IP address of the basic GA instance.
         */
        public Builder accelerateIpAddress(String accelerateIpAddress) {
            this.putQueryParameter("AccelerateIpAddress", accelerateIpAddress);
            this.accelerateIpAddress = accelerateIpAddress;
            return this;
        }

        /**
         * The ID of the accelerated IP address of the basic GA instance.
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.putQueryParameter("AccelerateIpId", accelerateIpId);
            this.accelerateIpId = accelerateIpId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the acceleration region.
         * <p>
         * 
         * You can call the [GetBasicAccelerator](~~2253380~~) operation to query the ID of the acceleration region.
         */
        public Builder ipSetId(String ipSetId) {
            this.putQueryParameter("IpSetId", ipSetId);
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If this is your first query and no next queries are to be sent, ignore this parameter.
         * *   If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListBasicAccelerateIpsRequest build() {
            return new ListBasicAccelerateIpsRequest(this);
        } 

    } 

}
