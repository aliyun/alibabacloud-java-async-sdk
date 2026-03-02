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
 * {@link PbcInstructionUpdateCmd} extends {@link TeaModel}
 *
 * <p>PbcInstructionUpdateCmd</p>
 */
public class PbcInstructionUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("document")
    private String document;

    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    private PbcInstructionUpdateCmd(Builder builder) {
        this.document = builder.document;
        this.pbcVersionId = builder.pbcVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcInstructionUpdateCmd create() {
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
     * @return pbcVersionId
     */
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public static final class Builder {
        private String document; 
        private Long pbcVersionId; 

        private Builder() {
        } 

        private Builder(PbcInstructionUpdateCmd model) {
            this.document = model.document;
            this.pbcVersionId = model.pbcVersionId;
        } 

        /**
         * document.
         */
        public Builder document(String document) {
            this.document = document;
            return this;
        }

        /**
         * pbcVersionId.
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        public PbcInstructionUpdateCmd build() {
            return new PbcInstructionUpdateCmd(this);
        } 

    } 

}
