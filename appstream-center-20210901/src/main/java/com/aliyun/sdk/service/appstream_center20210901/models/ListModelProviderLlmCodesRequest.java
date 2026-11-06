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
 * {@link ListModelProviderLlmCodesRequest} extends {@link RequestModel}
 *
 * <p>ListModelProviderLlmCodesRequest</p>
 */
public class ListModelProviderLlmCodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmCode")
    private String llmCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelBrands")
    private java.util.List<String> modelBrands;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recommended")
    private Boolean recommended;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecommendedLevels")
    private java.util.List<String> recommendedLevels;

    private ListModelProviderLlmCodesRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.llmCode = builder.llmCode;
        this.modelBrands = builder.modelBrands;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.providerName = builder.providerName;
        this.providerTemplateId = builder.providerTemplateId;
        this.recommended = builder.recommended;
        this.recommendedLevels = builder.recommendedLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelProviderLlmCodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return llmCode
     */
    public String getLlmCode() {
        return this.llmCode;
    }

    /**
     * @return modelBrands
     */
    public java.util.List<String> getModelBrands() {
        return this.modelBrands;
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
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    /**
     * @return providerTemplateId
     */
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    /**
     * @return recommended
     */
    public Boolean getRecommended() {
        return this.recommended;
    }

    /**
     * @return recommendedLevels
     */
    public java.util.List<String> getRecommendedLevels() {
        return this.recommendedLevels;
    }

    public static final class Builder extends Request.Builder<ListModelProviderLlmCodesRequest, Builder> {
        private String language; 
        private String llmCode; 
        private java.util.List<String> modelBrands; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String providerName; 
        private String providerTemplateId; 
        private Boolean recommended; 
        private java.util.List<String> recommendedLevels; 

        private Builder() {
            super();
        } 

        private Builder(ListModelProviderLlmCodesRequest request) {
            super(request);
            this.language = request.language;
            this.llmCode = request.llmCode;
            this.modelBrands = request.modelBrands;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.providerName = request.providerName;
            this.providerTemplateId = request.providerTemplateId;
            this.recommended = request.recommended;
            this.recommendedLevels = request.recommendedLevels;
        } 

        /**
         * <p>The display language for models. Valid values: zh-CN (Simplified Chinese), en-US (English), ja-JP (Japanese), and zh-TW (Traditional Chinese). Default value: zh-CN. Currently, zh-TW returns Simplified Chinese, and ja-JP returns English. If the text is not included in Model Studio or the English text is missing, the original source text is retained without automatic translation.</p>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The LLM code used for fuzzy match filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        public Builder llmCode(String llmCode) {
            this.putQueryParameter("LlmCode", llmCode);
            this.llmCode = llmCode;
            return this;
        }

        /**
         * <p>The list of model brands as a JSON array string. Supports multi-select filtering and returns results that match any of the specified brands.</p>
         */
        public Builder modelBrands(java.util.List<String> modelBrands) {
            this.putQueryParameter("ModelBrands", modelBrands);
            this.modelBrands = modelBrands;
            return this;
        }

        /**
         * <p>The page number, starting from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 1000. Maximum value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the model provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>moonshot</p>
         */
        public Builder providerName(String providerName) {
            this.putQueryParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        /**
         * <p>The ID of the provider template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pt-xxx-001</p>
         */
        public Builder providerTemplateId(String providerTemplateId) {
            this.putQueryParameter("ProviderTemplateId", providerTemplateId);
            this.providerTemplateId = providerTemplateId;
            return this;
        }

        /**
         * <p>Specifies whether to filter by recommended models. If this parameter is not specified, no filtering is applied.</p>
         */
        public Builder recommended(Boolean recommended) {
            this.putQueryParameter("Recommended", recommended);
            this.recommended = recommended;
            return this;
        }

        /**
         * <p>The list of recommended levels. This parameter takes effect only for wuying-plan. Results must match any of the selected levels and intersect with other filtering conditions such as region and brand. If this parameter is not specified or an empty array is passed, filtering by level is not applied.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Standard&quot;,&quot;Advanced&quot;]</p>
         */
        public Builder recommendedLevels(java.util.List<String> recommendedLevels) {
            this.putQueryParameter("RecommendedLevels", recommendedLevels);
            this.recommendedLevels = recommendedLevels;
            return this;
        }

        @Override
        public ListModelProviderLlmCodesRequest build() {
            return new ListModelProviderLlmCodesRequest(this);
        } 

    } 

}
