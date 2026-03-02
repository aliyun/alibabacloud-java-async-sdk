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
 * {@link CreateLibraryInstructionRequest} extends {@link RequestModel}
 *
 * <p>CreateLibraryInstructionRequest</p>
 */
public class CreateLibraryInstructionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("document")
    private String document;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private Integer id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    private CreateLibraryInstructionRequest(Builder builder) {
        super(builder);
        this.libraryId = builder.libraryId;
        this.companyId = builder.companyId;
        this.document = builder.document;
        this.id = builder.id;
        this.marketId = builder.marketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLibraryInstructionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libraryId
     */
    public Long getLibraryId() {
        return this.libraryId;
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
    public Integer getId() {
        return this.id;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    public static final class Builder extends Request.Builder<CreateLibraryInstructionRequest, Builder> {
        private Long libraryId; 
        private Long companyId; 
        private String document; 
        private Integer id; 
        private Long marketId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLibraryInstructionRequest request) {
            super(request);
            this.libraryId = request.libraryId;
            this.companyId = request.companyId;
            this.document = request.document;
            this.id = request.id;
            this.marketId = request.marketId;
        } 

        /**
         * libraryId.
         */
        public Builder libraryId(Long libraryId) {
            this.putPathParameter("libraryId", libraryId);
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putBodyParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * document.
         */
        public Builder document(String document) {
            this.putBodyParameter("document", document);
            this.document = document;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Integer id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.putBodyParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        @Override
        public CreateLibraryInstructionRequest build() {
            return new CreateLibraryInstructionRequest(this);
        } 

    } 

}
