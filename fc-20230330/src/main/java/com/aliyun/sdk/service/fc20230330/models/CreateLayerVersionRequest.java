// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateLayerVersionRequest</p>
 */
public class CreateLayerVersionRequest extends Request {
    @Path
    @NameInMap("layerName")
    @Validation(required = true)
    private String layerName;

    @Body
    @NameInMap("request")
    @Validation(required = true)
    private CreateLayerVersionInput request;

    private CreateLayerVersionRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.request = builder.request;
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
     * @return request
     */
    public CreateLayerVersionInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<CreateLayerVersionRequest, Builder> {
        private String layerName; 
        private CreateLayerVersionInput request; 

        private Builder() {
            super();
        } 

        private Builder(CreateLayerVersionRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.request = request.request;
        } 

        /**
         * layerName.
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * request.
         */
        public Builder request(CreateLayerVersionInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public CreateLayerVersionRequest build() {
            return new CreateLayerVersionRequest(this);
        } 

    } 

}
