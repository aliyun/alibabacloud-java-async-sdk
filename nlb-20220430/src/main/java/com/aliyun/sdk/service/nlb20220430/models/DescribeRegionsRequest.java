// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link DescribeRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionsRequest</p>
 */
public class DescribeRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    private DescribeRegionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<DescribeRegionsRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * <p>The supported natural language. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Chinese</li>
         * <li><strong>en-US</strong> (default): English</li>
         * <li><strong>ja</strong>: Japanese</li>
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
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate this value. Ensure that the value is unique among all requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** <strong>RequestId</strong> of each request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The service code. Set the value to <strong>nlb</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public DescribeRegionsRequest build() {
            return new DescribeRegionsRequest(this);
        } 

    } 

}
