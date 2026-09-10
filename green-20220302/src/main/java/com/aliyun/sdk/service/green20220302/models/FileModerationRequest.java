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
 * {@link FileModerationRequest} extends {@link RequestModel}
 *
 * <p>FileModerationRequest</p>
 */
public class FileModerationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private FileModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileModerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<FileModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(FileModerationRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The service supported by enhanced document moderation.</p>
         * 
         * <strong>example:</strong>
         * <p>document_detection</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The set of parameters required for the moderation service. The value must be a JSON string.</p>
         * <ul>
         * <li>url: Required. The URL of the object to be moderated. Make sure that the URL can be accessed over the Internet.</li>
         * <li>dataId: Optional. The data ID that corresponds to the moderated object.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;url&quot;:&quot;<a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf%22%7D">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf&quot;}</a></p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public FileModerationRequest build() {
            return new FileModerationRequest(this);
        } 

    } 

}
