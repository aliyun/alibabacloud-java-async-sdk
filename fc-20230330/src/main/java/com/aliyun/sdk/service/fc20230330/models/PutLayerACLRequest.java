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
 * {@link PutLayerACLRequest} extends {@link RequestModel}
 *
 * <p>PutLayerACLRequest</p>
 */
public class PutLayerACLRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("layerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("acl")
    private String acl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("public")
    @Deprecated
    private String _public;

    private PutLayerACLRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.acl = builder.acl;
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
     * @return acl
     */
    public String getAcl() {
        return this.acl;
    }

    /**
     * @return _public
     */
    public String get_public() {
        return this._public;
    }

    public static final class Builder extends Request.Builder<PutLayerACLRequest, Builder> {
        private String layerName; 
        private String acl; 
        private String _public; 

        private Builder() {
            super();
        } 

        private Builder(PutLayerACLRequest request) {
            super(request);
            this.layerName = request.layerName;
            this.acl = request.acl;
            this._public = request._public;
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
         * <p>Specify the access permission of the layer. A value of 1 indicates public and a value of 0 indicates private. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder acl(String acl) {
            this.putQueryParameter("acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>Specify whether the layer is a public layer. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
