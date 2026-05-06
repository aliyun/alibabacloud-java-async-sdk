// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListLlmTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListLlmTemplatesRequest</p>
 */
public class ListLlmTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmCode")
    private String llmCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmTemplateIds")
    private java.util.List<String> llmTemplateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    private String modelTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
    private String providerTemplateId;

    private ListLlmTemplatesRequest(Builder builder) {
        super(builder);
        this.llmCode = builder.llmCode;
        this.llmTemplateIds = builder.llmTemplateIds;
        this.modelTemplateId = builder.modelTemplateId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.providerTemplateId = builder.providerTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLlmTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return llmCode
     */
    public String getLlmCode() {
        return this.llmCode;
    }

    /**
     * @return llmTemplateIds
     */
    public java.util.List<String> getLlmTemplateIds() {
        return this.llmTemplateIds;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return providerTemplateId
     */
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public static final class Builder extends Request.Builder<ListLlmTemplatesRequest, Builder> {
        private String llmCode; 
        private java.util.List<String> llmTemplateIds; 
        private String modelTemplateId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String providerTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(ListLlmTemplatesRequest request) {
            super(request);
            this.llmCode = request.llmCode;
            this.llmTemplateIds = request.llmTemplateIds;
            this.modelTemplateId = request.modelTemplateId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.providerTemplateId = request.providerTemplateId;
        } 

        /**
         * LlmCode.
         */
        public Builder llmCode(String llmCode) {
            this.putQueryParameter("LlmCode", llmCode);
            this.llmCode = llmCode;
            return this;
        }

        /**
         * LlmTemplateIds.
         */
        public Builder llmTemplateIds(java.util.List<String> llmTemplateIds) {
            String llmTemplateIdsShrink = shrink(llmTemplateIds, "LlmTemplateIds", "json");
            this.putQueryParameter("LlmTemplateIds", llmTemplateIdsShrink);
            this.llmTemplateIds = llmTemplateIds;
            return this;
        }

        /**
         * ModelTemplateId.
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProviderTemplateId.
         */
        public Builder providerTemplateId(String providerTemplateId) {
            this.putQueryParameter("ProviderTemplateId", providerTemplateId);
            this.providerTemplateId = providerTemplateId;
            return this;
        }

        @Override
        public ListLlmTemplatesRequest build() {
            return new ListLlmTemplatesRequest(this);
        } 

    } 

}
