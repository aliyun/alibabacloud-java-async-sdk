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
 * {@link DescribeCloudGtmAddressReferenceRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudGtmAddressReferenceRequest</p>
 */
public class DescribeCloudGtmAddressReferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressId")
    private String addressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private DescribeCloudGtmAddressReferenceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressId = builder.addressId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmAddressReferenceRequest create() {
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
     * @return addressId
     */
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DescribeCloudGtmAddressReferenceRequest, Builder> {
        private String acceptLanguage; 
        private String addressId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudGtmAddressReferenceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressId = request.addressId;
            this.clientToken = request.clientToken;
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
         * <p>The address ID. This ID uniquely identifies the address.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-89518218114368**92</p>
         */
        public Builder addressId(String addressId) {
            this.putQueryParameter("AddressId", addressId);
            this.addressId = addressId;
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

        @Override
        public DescribeCloudGtmAddressReferenceRequest build() {
            return new DescribeCloudGtmAddressReferenceRequest(this);
        } 

    } 

}
