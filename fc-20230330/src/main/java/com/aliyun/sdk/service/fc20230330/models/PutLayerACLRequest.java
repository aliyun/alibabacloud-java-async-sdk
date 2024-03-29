// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutLayerACLRequest} extends {@link RequestModel}
 *
 * <p>PutLayerACLRequest</p>
 */
public class PutLayerACLRequest extends Request {
    @Path
    @NameInMap("layerName")
    @Validation(required = true)
    private String layerName;

    @Query
    @NameInMap("public")
    private String _public;

    private PutLayerACLRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this._public = builder._public;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLayerACLRequest create() {
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
     * @return _public
     */
    public String get_public() {
        return this._public;
    }

    public static final class Builder extends Request.Builder<PutLayerACLRequest, Builder> {
        private String layerName; 
        private String _public; 

        private Builder() {
            super();
        } 

        private Builder(PutLayerACLRequest request) {
            super(request);
            this.layerName = request.layerName;
            this._public = request._public;
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
         * public.
         */
        public Builder _public(String _public) {
            this.putQueryParameter("public", _public);
            this._public = _public;
            return this;
        }

        @Override
        public PutLayerACLRequest build() {
            return new PutLayerACLRequest(this);
        } 

    } 

}
