// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateLayerVersionRequest</p>
 */
public class CreateLayerVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("layerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateLayerVersionInput body;

    private CreateLayerVersionRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayerVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return body
     */
    public CreateLayerVersionInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateLayerVersionRequest, Builder> {
        private String layerName; 
        private CreateLayerVersionInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateLayerVersionRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.body = request.body;
        } 

        /**
         * The name of the layer.
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * The information about layer configurations.
         */
        public Builder body(CreateLayerVersionInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateLayerVersionRequest build() {
            return new CreateLayerVersionRequest(this);
        } 

    } 

}
