// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedBlockStorageClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeDedicatedBlockStorageClustersRequest</p>
 */
public class DescribeDedicatedBlockStorageClustersRequest extends Request {
    @Body
    @NameInMap("AzoneId")
    private String azoneId;

    @Body
    @NameInMap("Category")
    private String category;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DedicatedBlockStorageClusterId")
    private java.util.List < String > dedicatedBlockStorageClusterId;

    @Body
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Status")
    private java.util.List < String > status;

    private DescribeDedicatedBlockStorageClustersRequest(Builder builder) {
        super(builder);
        this.azoneId = builder.azoneId;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.dedicatedBlockStorageClusterId = builder.dedicatedBlockStorageClusterId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return azoneId
     */
    public String getAzoneId() {
        return this.azoneId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedicatedBlockStorageClusterId
     */
    public java.util.List < String > getDedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
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

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeDedicatedBlockStorageClustersRequest, Builder> {
        private String azoneId; 
        private String category; 
        private String clientToken; 
        private java.util.List < String > dedicatedBlockStorageClusterId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDedicatedBlockStorageClustersRequest request) {
            super(request);
            this.azoneId = request.azoneId;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.dedicatedBlockStorageClusterId = request.dedicatedBlockStorageClusterId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * 专属块存储集群所在的可用区ID。您可以调用DescribeZones
         * <p>
         * 查看阿里云地域下的可用区。
         */
        public Builder azoneId(String azoneId) {
            this.putBodyParameter("AzoneId", azoneId);
            this.azoneId = azoneId;
            return this;
        }

        /**
         * 专属块存储集群可创建的云盘类型。
         * <p>
         * 取值仅支持cloud_essd，即ESSD云盘。
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * 客户端幂等token
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 专属块存储集群ID，参数前缀DedicatedBlockStorageClusterId，后缀.n为可查询的多个专属存储集群id
         */
        public Builder dedicatedBlockStorageClusterId(java.util.List < String > dedicatedBlockStorageClusterId) {
            this.putBodyParameter("DedicatedBlockStorageClusterId", dedicatedBlockStorageClusterId);
            this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
            return this;
        }

        /**
         * 分页大小, 默认值10
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 查询凭证（Token），取值为上一次API调用返回的NextToken参数值
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 专属块存储集群所在的地域ID。您可以调用DescribeRegions
         * <p>
         * 查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 专属块存储集群的状态。取值范围：
         * <p>
         * Preparing：待交付
         * Running：运行中
         * Expired：集群到期
         * Offline：下线
         * N表示可同时设置多个状态，N的取值范围为1~4。
         */
        public Builder status(java.util.List < String > status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeDedicatedBlockStorageClustersRequest build() {
            return new DescribeDedicatedBlockStorageClustersRequest(this);
        } 

    } 

}
