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
 * {@link DescribeFileModerationResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeFileModerationResultRequest</p>
 */
public class DescribeFileModerationResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private DescribeFileModerationResultRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileModerationResultRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeFileModerationResultRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFileModerationResultRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The service supported by the enhanced file moderation feature.</p>
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
         * <p>The set of parameters required by the moderation service, in JSON character string format.</p>
         * <ul>
         * <li>taskId: Required. The URL of the object to be moderated. Make sure that the URL is accessible through public network access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;taskId\&quot;:\&quot;vi_f_hPgx9PFIQISdlfA888hOFG-1yJq8v\&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public DescribeFileModerationResultRequest build() {
            return new DescribeFileModerationResultRequest(this);
        } 

    } 

}
