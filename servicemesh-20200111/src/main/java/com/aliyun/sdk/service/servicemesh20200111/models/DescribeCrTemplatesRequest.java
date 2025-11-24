// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeCrTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCrTemplatesRequest</p>
 */
public class DescribeCrTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String istioVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Kind")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kind;

    private DescribeCrTemplatesRequest(Builder builder) {
        super(builder);
        this.istioVersion = builder.istioVersion;
        this.kind = builder.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return istioVersion
     */
    public String getIstioVersion() {
        return this.istioVersion;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    public static final class Builder extends Request.Builder<DescribeCrTemplatesRequest, Builder> {
        private String istioVersion; 
        private String kind; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCrTemplatesRequest request) {
            super(request);
            this.istioVersion = request.istioVersion;
            this.kind = request.kind;
        } 

        /**
         * <p>The version of Istio used by the ASM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.9.7.31-g24cdcb43-aliyun</p>
         */
        public Builder istioVersion(String istioVersion) {
            this.putBodyParameter("IstioVersion", istioVersion);
            this.istioVersion = istioVersion;
            return this;
        }

        /**
         * <p>The type of Istio resource whose common YAML templates you want to query. Valid values:</p>
         * <ul>
         * <li>AuthorizationPolicy</li>
         * <li>RequestAuthentication</li>
         * <li>PeerAuthentication</li>
         * <li>WorkloadGroup</li>
         * <li>WorkloadEntry</li>
         * <li>Sidecar</li>
         * <li>EnvoyFilter</li>
         * <li>ServiceEntry</li>
         * <li>Gateway</li>
         * <li>DestinationRule</li>
         * <li>VirtualService</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VirtualService</p>
         */
        public Builder kind(String kind) {
            this.putBodyParameter("Kind", kind);
            this.kind = kind;
            return this;
        }

        @Override
        public DescribeCrTemplatesRequest build() {
            return new DescribeCrTemplatesRequest(this);
        } 

    } 

}
