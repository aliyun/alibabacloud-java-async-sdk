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
 * {@link PbcInstructionCreateCmd} extends {@link TeaModel}
 *
 * <p>PbcInstructionCreateCmd</p>
 */
public class PbcInstructionCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("document")
    private String document;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    private PbcInstructionCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.document = builder.document;
        this.id = builder.id;
        this.marketId = builder.marketId;
        this.pbcVersionId = builder.pbcVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcInstructionCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
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
        private Long companyId; 
        private String document; 
        private Long id; 
        private Long marketId; 
        private Long pbcVersionId; 

        private Builder() {
        } 

        private Builder(PbcInstructionCreateCmd model) {
            this.companyId = model.companyId;
            this.document = model.document;
            this.id = model.id;
            this.marketId = model.marketId;
            this.pbcVersionId = model.pbcVersionId;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * document.
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

        public PbcInstructionCreateCmd build() {
            return new PbcInstructionCreateCmd(this);
        } 

    } 

}
