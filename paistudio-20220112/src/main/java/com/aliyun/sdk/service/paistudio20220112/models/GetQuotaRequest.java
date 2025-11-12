// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaRequest</p>
 */
public class GetQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithNodeMeta")
    private Boolean withNodeMeta;

    private GetQuotaRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.verbose = builder.verbose;
        this.withNodeMeta = builder.withNodeMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return withNodeMeta
     */
    public Boolean getWithNodeMeta() {
        return this.withNodeMeta;
    }

    public static final class Builder extends Request.Builder<GetQuotaRequest, Builder> {
        private String quotaId; 
        private Boolean verbose; 
        private Boolean withNodeMeta; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.verbose = request.verbose;
            this.withNodeMeta = request.withNodeMeta;
        } 

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * WithNodeMeta.
         */
        public Builder withNodeMeta(Boolean withNodeMeta) {
            this.putQueryParameter("WithNodeMeta", withNodeMeta);
            this.withNodeMeta = withNodeMeta;
            return this;
        }

        @Override
        public GetQuotaRequest build() {
            return new GetQuotaRequest(this);
        } 

    } 

}
