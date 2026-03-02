// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PbcApiSchemaCreateCmd} extends {@link TeaModel}
 *
 * <p>PbcApiSchemaCreateCmd</p>
 */
public class PbcApiSchemaCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiSchema")
    private String apiSchema;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    private PbcApiSchemaCreateCmd(Builder builder) {
        this.apiSchema = builder.apiSchema;
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
        this.pbcVersionId = builder.pbcVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcApiSchemaCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiSchema
     */
    public String getApiSchema() {
        return this.apiSchema;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return pbcVersionId
     */
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public static final class Builder {
        private String apiSchema; 
        private Long companyId; 
        private Long marketId; 
        private Long pbcVersionId; 

        private Builder() {
        } 

        private Builder(PbcApiSchemaCreateCmd model) {
            this.apiSchema = model.apiSchema;
            this.companyId = model.companyId;
            this.marketId = model.marketId;
            this.pbcVersionId = model.pbcVersionId;
        } 

        /**
         * apiSchema.
         */
        public Builder apiSchema(String apiSchema) {
            this.apiSchema = apiSchema;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * pbcVersionId.
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        public PbcApiSchemaCreateCmd build() {
            return new PbcApiSchemaCreateCmd(this);
        } 

    } 

}
