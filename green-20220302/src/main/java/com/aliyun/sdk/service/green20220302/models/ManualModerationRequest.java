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
 * {@link ManualModerationRequest} extends {@link RequestModel}
 *
 * <p>ManualModerationRequest</p>
 */
public class ManualModerationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private ManualModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManualModerationRequest create() {
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

    public static final class Builder extends Request.Builder<ManualModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(ManualModerationRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>Service.</p>
         * 
         * <strong>example:</strong>
         * <p>imageManualCheck</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>Parameter set required for the review service, in JSON string format.</p>
         * <ul>
         * <li>url: The URL of the object to be checked. Please ensure that this URL is publicly accessible.</li>
         * <li>dataId: Optional, the data ID corresponding to the object being checked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;url&quot;: &quot;<a href="https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4">https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4</a>&quot;, &quot;dataId&quot;: &quot;data1234&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public ManualModerationRequest build() {
            return new ManualModerationRequest(this);
        } 

    } 

}
