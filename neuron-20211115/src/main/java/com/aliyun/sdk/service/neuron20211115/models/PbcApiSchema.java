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
 * {@link PbcApiSchema} extends {@link TeaModel}
 *
 * <p>PbcApiSchema</p>
 */
public class PbcApiSchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiSchema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiSchema;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PbcApiSchema(Builder builder) {
        this.apiSchema = builder.apiSchema;
        this.id = builder.id;
        this.pbcVersionId = builder.pbcVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcApiSchema create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return pbcVersionId
     */
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiSchema; 
        private Long id; 
        private Long pbcVersionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PbcApiSchema model) {
            this.apiSchema = model.apiSchema;
            this.id = model.id;
            this.pbcVersionId = model.pbcVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiSchema(String apiSchema) {
            this.apiSchema = apiSchema;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * pbcVersionId.
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PbcApiSchema build() {
            return new PbcApiSchema(this);
        } 

    } 

}
