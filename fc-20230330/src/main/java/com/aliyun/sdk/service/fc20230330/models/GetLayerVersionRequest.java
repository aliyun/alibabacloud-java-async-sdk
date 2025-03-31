// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link GetLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>GetLayerVersionRequest</p>
 */
public class GetLayerVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("layerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the layer.</p>
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
         * <p>The version of the layer.</p>
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
        public GetLayerVersionRequest build() {
            return new GetLayerVersionRequest(this);
        } 

    } 

}
