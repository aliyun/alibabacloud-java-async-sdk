// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeRequest</p>
 */
public class GetResourceTypeRequest extends Request {
    @Path
    @NameInMap("requestPath")
    private String requestPath;

    @Header
    @NameInMap("x-acs-accept-language")
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
         * requestPath.
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * x-acs-accept-language.
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
