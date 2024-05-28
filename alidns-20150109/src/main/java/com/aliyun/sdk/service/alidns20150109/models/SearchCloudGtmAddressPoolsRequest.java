// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchCloudGtmAddressPoolsRequest} extends {@link RequestModel}
 *
 * <p>SearchCloudGtmAddressPoolsRequest</p>
 */
public class SearchCloudGtmAddressPoolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolName")
    private String addressPoolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolType")
    private String addressPoolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableStatus")
    private String availableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private SearchCloudGtmAddressPoolsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPoolName = builder.addressPoolName;
        this.addressPoolType = builder.addressPoolType;
        this.availableStatus = builder.availableStatus;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.healthStatus = builder.healthStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCloudGtmAddressPoolsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return addressPoolName
     */
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    /**
     * @return addressPoolType
     */
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    /**
     * @return availableStatus
     */
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<SearchCloudGtmAddressPoolsRequest, Builder> {
        private String acceptLanguage; 
        private String addressPoolName; 
        private String addressPoolType; 
        private String availableStatus; 
        private String clientToken; 
        private String enableStatus; 
        private String healthStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(SearchCloudGtmAddressPoolsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPoolName = request.addressPoolName;
            this.addressPoolType = request.addressPoolType;
            this.availableStatus = request.availableStatus;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.healthStatus = request.healthStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AddressPoolName.
         */
        public Builder addressPoolName(String addressPoolName) {
            this.putQueryParameter("AddressPoolName", addressPoolName);
            this.addressPoolName = addressPoolName;
            return this;
        }

        /**
         * AddressPoolType.
         */
        public Builder addressPoolType(String addressPoolType) {
            this.putQueryParameter("AddressPoolType", addressPoolType);
            this.addressPoolType = addressPoolType;
            return this;
        }

        /**
         * AvailableStatus.
         */
        public Builder availableStatus(String availableStatus) {
            this.putQueryParameter("AvailableStatus", availableStatus);
            this.availableStatus = availableStatus;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * HealthStatus.
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public SearchCloudGtmAddressPoolsRequest build() {
            return new SearchCloudGtmAddressPoolsRequest(this);
        } 

    } 

}
