// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCrTemplatesRequest</p>
 */
public class DescribeCrTemplatesRequest extends Request {
    @Body
    @NameInMap("IstioVersion")
    @Validation(required = true)
    private String istioVersion;

    @Body
    @NameInMap("Kind")
    @Validation(required = true)
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

        private Builder(DescribeCrTemplatesRequest response) {
            super(response);
            this.istioVersion = response.istioVersion;
            this.kind = response.kind;
        } 

        /**
         * IstioVersion.
         */
        public Builder istioVersion(String istioVersion) {
            this.putBodyParameter("IstioVersion", istioVersion);
            this.istioVersion = istioVersion;
            return this;
        }

        /**
         * Kind.
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
