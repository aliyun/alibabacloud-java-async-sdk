// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Address pool name, supports fuzzy search for the entered address pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>AddressPool-1</p>
         */
        public Builder addressPoolName(String addressPoolName) {
            this.putQueryParameter("AddressPoolName", addressPoolName);
            this.addressPoolName = addressPoolName;
            return this;
        }

        /**
         * <p>Address pool type, supports precise query for address pool types:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * <li>domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder addressPoolType(String addressPoolType) {
            this.putQueryParameter("AddressPoolType", addressPoolType);
            this.addressPoolType = addressPoolType;
            return this;
        }

        /**
         * <p>Address pool availability status, supporting precise queries for address pool availability:</p>
         * <ul>
         * <li>available: Available</li>
         * <li>unavailable: Unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder availableStatus(String availableStatus) {
            this.putQueryParameter("AvailableStatus", availableStatus);
            this.availableStatus = availableStatus;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Address pool enable status, supports precise query of address pool enable status:</p>
         * <ul>
         * <li>enable: Enabled status</li>
         * <li>disable: Disabled status</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The health state of the address pool. You can enter a health state for exact search. Valid values:</p>
         * <p>ok: The health state of the address pool is normal and all addresses that are referenced by the address pool are available.</p>
         * <p>ok_alert: The health state of the address pool is warning and some of the addresses that are referenced by the address pool are unavailable. However, the address pool is deemed normal. In this case, only the available addresses are returned for Domain Name System (DNS) requests.</p>
         * <p>exceptional: The health state of the address pool is abnormal and some or all of the addresses that are referenced by the address pool are unavailable. In this case, the address pool is deemed abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * <p>Current page number, starting from 1, default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Address pool remarks, supporting fuzzy search for the input remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
