// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link DispatchConsoleAPIForPartnerRequest} extends {@link RequestModel}
 *
 * <p>DispatchConsoleAPIForPartnerRequest</p>
 */
public class DispatchConsoleAPIForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteHost")
    private String siteHost;

    private DispatchConsoleAPIForPartnerRequest(Builder builder) {
        super(builder);
        this.liveToken = builder.liveToken;
        this.operation = builder.operation;
        this.params = builder.params;
        this.product = builder.product;
        this.siteHost = builder.siteHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DispatchConsoleAPIForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveToken
     */
    public String getLiveToken() {
        return this.liveToken;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return siteHost
     */
    public String getSiteHost() {
        return this.siteHost;
    }

    public static final class Builder extends Request.Builder<DispatchConsoleAPIForPartnerRequest, Builder> {
        private String liveToken; 
        private String operation; 
        private String params; 
        private String product; 
        private String siteHost; 

        private Builder() {
            super();
        } 

        private Builder(DispatchConsoleAPIForPartnerRequest request) {
            super(request);
            this.liveToken = request.liveToken;
            this.operation = request.operation;
            this.params = request.params;
            this.product = request.product;
            this.siteHost = request.siteHost;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder liveToken(String liveToken) {
            this.putQueryParameter("LiveToken", liveToken);
            this.liveToken = liveToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbaseue</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * SiteHost.
         */
        public Builder siteHost(String siteHost) {
            this.putQueryParameter("SiteHost", siteHost);
            this.siteHost = siteHost;
            return this;
        }

        @Override
        public DispatchConsoleAPIForPartnerRequest build() {
            return new DispatchConsoleAPIForPartnerRequest(this);
        } 

    } 

}
