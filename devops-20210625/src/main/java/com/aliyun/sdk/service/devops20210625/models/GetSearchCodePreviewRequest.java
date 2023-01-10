// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSearchCodePreviewRequest} extends {@link RequestModel}
 *
 * <p>GetSearchCodePreviewRequest</p>
 */
public class GetSearchCodePreviewRequest extends Request {
    @Query
    @NameInMap("docId")
    @Validation(required = true)
    private String docId;

    @Query
    @NameInMap("isDsl")
    private Boolean isDsl;

    @Query
    @NameInMap("keyword")
    @Validation(required = true)
    private String keyword;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private GetSearchCodePreviewRequest(Builder builder) {
        super(builder);
        this.docId = builder.docId;
        this.isDsl = builder.isDsl;
        this.keyword = builder.keyword;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSearchCodePreviewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return isDsl
     */
    public Boolean getIsDsl() {
        return this.isDsl;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<GetSearchCodePreviewRequest, Builder> {
        private String docId; 
        private Boolean isDsl; 
        private String keyword; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetSearchCodePreviewRequest request) {
            super(request);
            this.docId = request.docId;
            this.isDsl = request.isDsl;
            this.keyword = request.keyword;
            this.organizationId = request.organizationId;
        } 

        /**
         * docId.
         */
        public Builder docId(String docId) {
            this.putQueryParameter("docId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * isDsl.
         */
        public Builder isDsl(Boolean isDsl) {
            this.putQueryParameter("isDsl", isDsl);
            this.isDsl = isDsl;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public GetSearchCodePreviewRequest build() {
            return new GetSearchCodePreviewRequest(this);
        } 

    } 

}
