// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteLayerVersionRequest</p>
 */
public class DeleteLayerVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("layerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer version;

    private DeleteLayerVersionRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLayerVersionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLayerVersionRequest, Builder> {
        private String layerName; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLayerVersionRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.version = request.version;
        } 

        /**
         * <p>The layer name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-layer</p>
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * <p>The layer version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder version(Integer version) {
            this.putPathParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public DeleteLayerVersionRequest build() {
            return new DeleteLayerVersionRequest(this);
        } 

    } 

}
