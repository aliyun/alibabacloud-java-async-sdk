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
 * {@link PbcInstruction} extends {@link TeaModel}
 *
 * <p>PbcInstruction</p>
 */
public class PbcInstruction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("document")
    @com.aliyun.core.annotation.Validation(required = true)
    private String document;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PbcInstruction(Builder builder) {
        this.document = builder.document;
        this.id = builder.id;
        this.pbcVersionId = builder.pbcVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcInstruction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return document
     */
    public String getDocument() {
        return this.document;
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
        private String document; 
        private Long id; 
        private Long pbcVersionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PbcInstruction model) {
            this.document = model.document;
            this.id = model.id;
            this.pbcVersionId = model.pbcVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder document(String document) {
            this.document = document;
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

        public PbcInstruction build() {
            return new PbcInstruction(this);
        } 

    } 

}
