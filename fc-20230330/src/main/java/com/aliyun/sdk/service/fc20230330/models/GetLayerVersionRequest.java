// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>GetLayerVersionRequest</p>
 */
public class GetLayerVersionRequest extends Request {
    @Path
    @NameInMap("layerName")
    @Validation(required = true)
    private String layerName;

    @Path
    @NameInMap("version")
    @Validation(required = true)
    private Integer version;

    private GetLayerVersionRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLayerVersionRequest create() {
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
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetLayerVersionRequest, Builder> {
        private String layerName; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(GetLayerVersionRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.version = request.version;
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
         * The version of the layer.
         */
        public Builder version(Integer version) {
            this.putPathParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetLayerVersionRequest build() {
            return new GetLayerVersionRequest(this);
        } 

    } 

}
