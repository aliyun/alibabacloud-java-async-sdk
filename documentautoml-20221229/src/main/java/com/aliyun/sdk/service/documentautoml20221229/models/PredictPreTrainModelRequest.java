// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictPreTrainModelRequest} extends {@link RequestModel}
 *
 * <p>PredictPreTrainModelRequest</p>
 */
public class PredictPreTrainModelRequest extends Request {
    @Query
    @NameInMap("BinaryToText")
    private Boolean binaryToText;

    @Body
    @NameInMap("Body")
    private String body;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    private PredictPreTrainModelRequest(Builder builder) {
        super(builder);
        this.binaryToText = builder.binaryToText;
        this.body = builder.body;
        this.content = builder.content;
        this.serviceName = builder.serviceName;
        this.serviceVersion = builder.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictPreTrainModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return binaryToText
     */
    public Boolean getBinaryToText() {
        return this.binaryToText;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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

    public static final class Builder extends Request.Builder<PredictPreTrainModelRequest, Builder> {
        private Boolean binaryToText; 
        private String body; 
        private String content; 
        private String serviceName; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(PredictPreTrainModelRequest request) {
            super(request);
            this.binaryToText = request.binaryToText;
            this.body = request.body;
            this.content = request.content;
            this.serviceName = request.serviceName;
            this.serviceVersion = request.serviceVersion;
        } 

        /**
         * BinaryToText.
         */
        public Builder binaryToText(Boolean binaryToText) {
            this.putQueryParameter("BinaryToText", binaryToText);
            this.binaryToText = binaryToText;
            return this;
        }

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public PredictPreTrainModelRequest build() {
            return new PredictPreTrainModelRequest(this);
        } 

    } 

}
