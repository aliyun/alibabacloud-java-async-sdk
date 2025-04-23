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
 * {@link ListCloudGtmAddressPoolsRequest} extends {@link RequestModel}
 *
 * <p>ListCloudGtmAddressPoolsRequest</p>
 */
public class ListCloudGtmAddressPoolsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private ListCloudGtmAddressPoolsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPoolName = builder.addressPoolName;
        this.addressPoolType = builder.addressPoolType;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmAddressPoolsRequest create() {
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

    public static final class Builder extends Request.Builder<ListCloudGtmAddressPoolsRequest, Builder> {
        private String acceptLanguage; 
        private String addressPoolName; 
        private String addressPoolType; 
        private String clientToken; 
        private String enableStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudGtmAddressPoolsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPoolName = request.addressPoolName;
            this.addressPoolType = request.addressPoolType;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
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
         * <p>Address pool name.</p>
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
         * <p>The type of the address pool. Valid values:</p>
         * <ul>
         * <li>IPv4: indicates that the service address to be resolved is an IPv4 address.</li>
         * <li>IPv6: indicates that the service address to be resolved is an IPv6 address.</li>
         * <li>domain: indicates that the service address to be resolved is a domain name.</li>
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
         * <p>The enabling state of the address pool. Valid values:</p>
         * <ul>
         * <li>enable: The address pool is enabled.</li>
         * <li>disable: The address pool is disabled.</li>
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
         * <p>Current page number, starting at <strong>1</strong>, default is <strong>1</strong>.</p>
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
         * <p>The number of rows per page when paginating queries, with a maximum value of <strong>100</strong>, and a default of <strong>20</strong>.</p>
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
         * <p>The additional description of the address pool.</p>
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
        public ListCloudGtmAddressPoolsRequest build() {
            return new ListCloudGtmAddressPoolsRequest(this);
        } 

    } 

}
