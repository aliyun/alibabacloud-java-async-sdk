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
         * <p>The request path. Format:
         * /api/v1/providers/{provider}/products/{product}/resourceTypes/{resourceType}</p>
         * <p>Description of variables in the request path:</p>
         * <p>provider: The cloud provider. Currently, only Aliyun is supported.</p>
         * <p>product: The product code.</p>
         * <p>resourceType: The resource type. If a parent resource exists, the format is {parentResourceTypeCode}/{resourceTypeCode}.</p>
         * 
         * <strong>example:</strong>
         * <p>No parent resource: /api/v1/providers/Aliyun/products/Redis/resourceTypes/DBInstance</p>
         * <p>Has parent resource: /api/v1/providers/Aliyun/products/Redis/resourceTypes/DBInstance/Account</p>
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * <p>The language in which the product information is returned. Valid values:</p>
         * <p>zh_CH: Chinese (default)</p>
         * <p>en_US: English.</p>
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
