// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPreTrainServiceNewRequest} extends {@link RequestModel}
 *
 * <p>RunPreTrainServiceNewRequest</p>
 */
public class RunPreTrainServiceNewRequest extends Request {
    @Body
    @NameInMap("PredictContent")
    @Validation(required = true)
    private String predictContent;

    @Body
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    private RunPreTrainServiceNewRequest(Builder builder) {
        super(builder);
        this.predictContent = builder.predictContent;
        this.serviceName = builder.serviceName;
        this.serviceVersion = builder.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPreTrainServiceNewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return predictContent
     */
    public String getPredictContent() {
        return this.predictContent;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static final class Builder extends Request.Builder<RunPreTrainServiceNewRequest, Builder> {
        private String predictContent; 
        private String serviceName; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(RunPreTrainServiceNewRequest request) {
            super(request);
            this.predictContent = request.predictContent;
            this.serviceName = request.serviceName;
            this.serviceVersion = request.serviceVersion;
        } 

        /**
         * PredictContent.
         */
        public Builder predictContent(String predictContent) {
            this.putBodyParameter("PredictContent", predictContent);
            this.predictContent = predictContent;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putBodyParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public RunPreTrainServiceNewRequest build() {
            return new RunPreTrainServiceNewRequest(this);
        } 

    } 

}
