// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link MultiModalGuardForBase64Request} extends {@link RequestModel}
 *
 * <p>MultiModalGuardForBase64Request</p>
 */
public class MultiModalGuardForBase64Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageBase64Str")
    private String imageBase64Str;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private MultiModalGuardForBase64Request(Builder builder) {
        super(builder);
        this.imageBase64Str = builder.imageBase64Str;
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalGuardForBase64Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageBase64Str
     */
    public String getImageBase64Str() {
        return this.imageBase64Str;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public static final class Builder extends Request.Builder<MultiModalGuardForBase64Request, Builder> {
        private String imageBase64Str; 
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(MultiModalGuardForBase64Request request) {
            super(request);
            this.imageBase64Str = request.imageBase64Str;
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * ImageBase64Str.
         */
        public Builder imageBase64Str(String imageBase64Str) {
            this.putBodyParameter("ImageBase64Str", imageBase64Str);
            this.imageBase64Str = imageBase64Str;
            return this;
        }

        /**
         * <p>Service</p>
         * 
         * <strong>example:</strong>
         * <p>query_security_check</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public MultiModalGuardForBase64Request build() {
            return new MultiModalGuardForBase64Request(this);
        } 

    } 

}
