// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeRequest</p>
 */
public class GetResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-accept-language")
    private String xAcsAcceptLanguage;

    private GetResourceTypeRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.xAcsAcceptLanguage = builder.xAcsAcceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPath
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * @return xAcsAcceptLanguage
     */
    public String getXAcsAcceptLanguage() {
        return this.xAcsAcceptLanguage;
    }

    public static final class Builder extends Request.Builder<GetResourceTypeRequest, Builder> {
        private String requestPath; 
        private String xAcsAcceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTypeRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.xAcsAcceptLanguage = request.xAcsAcceptLanguage;
        } 

        /**
         * <p>The request path. Specify this parameter in the following format: /api/v1/providers/{provider}/products/{product}/resourceTypes/{resourceType}</p>
         * <p>Variables in the request path. Valid values:</p>
         * <p>provider: the cloud service provider. Currently, only Aliyun is supported.</p>
         * <p>product: the product code.</p>
         * <p>resourceType: the type of the resource. If there is a parent resource, the format is {parent resource type code}/{resource type code}</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/providers/Aliyun/products/Redis/resourceTypes/DBInstance</p>
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * <p>The language selected for the returned product.</p>
         * <p>zh_CH: Chinese (default)</p>
         * <p>en_US: English</p>
         * 
         * <strong>example:</strong>
         * <p>zh_CH</p>
         */
        public Builder xAcsAcceptLanguage(String xAcsAcceptLanguage) {
            this.putHeaderParameter("x-acs-accept-language", xAcsAcceptLanguage);
            this.xAcsAcceptLanguage = xAcsAcceptLanguage;
            return this;
        }

        @Override
        public GetResourceTypeRequest build() {
            return new GetResourceTypeRequest(this);
        } 

    } 

}
