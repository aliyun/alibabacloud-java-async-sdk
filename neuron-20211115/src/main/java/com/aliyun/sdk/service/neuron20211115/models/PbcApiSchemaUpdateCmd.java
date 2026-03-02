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
 * {@link PbcApiSchemaUpdateCmd} extends {@link TeaModel}
 *
 * <p>PbcApiSchemaUpdateCmd</p>
 */
public class PbcApiSchemaUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiSchema")
    private String apiSchema;

    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    private PbcApiSchemaUpdateCmd(Builder builder) {
        this.apiSchema = builder.apiSchema;
        this.pbcVersionId = builder.pbcVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcApiSchemaUpdateCmd create() {
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
     * @return pbcVersionId
     */
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public static final class Builder {
        private String apiSchema; 
        private Long pbcVersionId; 

        private Builder() {
        } 

        private Builder(PbcApiSchemaUpdateCmd model) {
            this.apiSchema = model.apiSchema;
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
         * pbcVersionId.
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        public PbcApiSchemaUpdateCmd build() {
            return new PbcApiSchemaUpdateCmd(this);
        } 

    } 

}
