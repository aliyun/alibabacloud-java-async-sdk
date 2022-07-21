// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDynamicGroupDevicesRequest} extends {@link RequestModel}
 *
 * <p>QueryDynamicGroupDevicesRequest</p>
 */
public class QueryDynamicGroupDevicesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("FuzzyName")
    private Boolean fuzzyName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("Status")
    private String status;

    private QueryDynamicGroupDevicesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deviceName = builder.deviceName;
        this.fuzzyName = builder.fuzzyName;
        this.groupId = builder.groupId;
        this.iotInstanceId = builder.iotInstanceId;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDynamicGroupDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return fuzzyName
     */
    public Boolean getFuzzyName() {
        return this.fuzzyName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryDynamicGroupDevicesRequest, Builder> {
        private Integer currentPage; 
        private String deviceName; 
        private Boolean fuzzyName; 
        private String groupId; 
        private String iotInstanceId; 
        private String nextToken; 
        private Integer pageSize; 
        private String productKey; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QueryDynamicGroupDevicesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deviceName = request.deviceName;
            this.fuzzyName = request.fuzzyName;
            this.groupId = request.groupId;
            this.iotInstanceId = request.iotInstanceId;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.status = request.status;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * FuzzyName.
         */
        public Builder fuzzyName(Boolean fuzzyName) {
            this.putQueryParameter("FuzzyName", fuzzyName);
            this.fuzzyName = fuzzyName;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryDynamicGroupDevicesRequest build() {
            return new QueryDynamicGroupDevicesRequest(this);
        } 

    } 

}
