// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetPropertiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetPropertiesResponseBody</p>
 */
public class GetPropertiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPropertiesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPropertiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPropertiesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPropertiesResponseBody build() {
            return new GetPropertiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class ConsoleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TipContent")
        private String tipContent;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ConsoleConfig(Builder builder) {
            this.tipContent = builder.tipContent;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsoleConfig create() {
            return builder().build();
        }

        /**
         * @return tipContent
         */
        public String getTipContent() {
            return this.tipContent;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String tipContent; 
            private String title; 

            private Builder() {
            } 

            private Builder(ConsoleConfig model) {
                this.tipContent = model.tipContent;
                this.title = model.title;
            } 

            /**
             * TipContent.
             */
            public Builder tipContent(String tipContent) {
                this.tipContent = tipContent;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ConsoleConfig build() {
                return new ConsoleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class CopilotPreciseSearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CopilotPreciseSearchSources(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CopilotPreciseSearchSources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 
            private String name; 

            private Builder() {
            } 

            private Builder(CopilotPreciseSearchSources model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CopilotPreciseSearchSources build() {
                return new CopilotPreciseSearchSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Select")
        private Boolean select;

        @com.aliyun.core.annotation.NameInMap("Stared")
        private Boolean stared;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Articles(Builder builder) {
            this.select = builder.select;
            this.stared = builder.stared;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Articles create() {
            return builder().build();
        }

        /**
         * @return select
         */
        public Boolean getSelect() {
            return this.select;
        }

        /**
         * @return stared
         */
        public Boolean getStared() {
            return this.stared;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean select; 
            private Boolean stared; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Articles model) {
                this.select = model.select;
                this.stared = model.stared;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Select.
             */
            public Builder select(Boolean select) {
                this.select = select;
                return this;
            }

            /**
             * Stared.
             */
            public Builder stared(Boolean stared) {
                this.stared = stared;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Articles build() {
                return new Articles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class SearchSamples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Articles")
        private java.util.List<Articles> articles;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private SearchSamples(Builder builder) {
            this.articles = builder.articles;
            this.prompt = builder.prompt;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSamples create() {
            return builder().build();
        }

        /**
         * @return articles
         */
        public java.util.List<Articles> getArticles() {
            return this.articles;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<Articles> articles; 
            private String prompt; 
            private String text; 

            private Builder() {
            } 

            private Builder(SearchSamples model) {
                this.articles = model.articles;
                this.prompt = model.prompt;
                this.text = model.text;
            } 

            /**
             * Articles.
             */
            public Builder articles(java.util.List<Articles> articles) {
                this.articles = articles;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public SearchSamples build() {
                return new SearchSamples(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class SearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SearchSources(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 
            private String name; 

            private Builder() {
            } 

            private Builder(SearchSources model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SearchSources build() {
                return new SearchSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class IntelligentSearchConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CopilotPreciseSearchSources")
        private java.util.List<CopilotPreciseSearchSources> copilotPreciseSearchSources;

        @com.aliyun.core.annotation.NameInMap("ProductDescription")
        private String productDescription;

        @com.aliyun.core.annotation.NameInMap("SearchSamples")
        private java.util.List<SearchSamples> searchSamples;

        @com.aliyun.core.annotation.NameInMap("SearchSources")
        private java.util.List<SearchSources> searchSources;

        private IntelligentSearchConfig(Builder builder) {
            this.copilotPreciseSearchSources = builder.copilotPreciseSearchSources;
            this.productDescription = builder.productDescription;
            this.searchSamples = builder.searchSamples;
            this.searchSources = builder.searchSources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntelligentSearchConfig create() {
            return builder().build();
        }

        /**
         * @return copilotPreciseSearchSources
         */
        public java.util.List<CopilotPreciseSearchSources> getCopilotPreciseSearchSources() {
            return this.copilotPreciseSearchSources;
        }

        /**
         * @return productDescription
         */
        public String getProductDescription() {
            return this.productDescription;
        }

        /**
         * @return searchSamples
         */
        public java.util.List<SearchSamples> getSearchSamples() {
            return this.searchSamples;
        }

        /**
         * @return searchSources
         */
        public java.util.List<SearchSources> getSearchSources() {
            return this.searchSources;
        }

        public static final class Builder {
            private java.util.List<CopilotPreciseSearchSources> copilotPreciseSearchSources; 
            private String productDescription; 
            private java.util.List<SearchSamples> searchSamples; 
            private java.util.List<SearchSources> searchSources; 

            private Builder() {
            } 

            private Builder(IntelligentSearchConfig model) {
                this.copilotPreciseSearchSources = model.copilotPreciseSearchSources;
                this.productDescription = model.productDescription;
                this.searchSamples = model.searchSamples;
                this.searchSources = model.searchSources;
            } 

            /**
             * CopilotPreciseSearchSources.
             */
            public Builder copilotPreciseSearchSources(java.util.List<CopilotPreciseSearchSources> copilotPreciseSearchSources) {
                this.copilotPreciseSearchSources = copilotPreciseSearchSources;
                return this;
            }

            /**
             * ProductDescription.
             */
            public Builder productDescription(String productDescription) {
                this.productDescription = productDescription;
                return this;
            }

            /**
             * SearchSamples.
             */
            public Builder searchSamples(java.util.List<SearchSamples> searchSamples) {
                this.searchSamples = searchSamples;
                return this;
            }

            /**
             * SearchSources.
             */
            public Builder searchSources(java.util.List<SearchSources> searchSources) {
                this.searchSources = searchSources;
                return this;
            }

            public IntelligentSearchConfig build() {
                return new IntelligentSearchConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class ModelInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        private ModelInfos(Builder builder) {
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelInfos create() {
            return builder().build();
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        public static final class Builder {
            private String modelId; 
            private String modelName; 

            private Builder() {
            } 

            private Builder(ModelInfos model) {
                this.modelId = model.modelId;
                this.modelName = model.modelName;
            } 

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            public ModelInfos build() {
                return new ModelInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class MiaosouConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxDocSize")
        private Long maxDocSize;

        @com.aliyun.core.annotation.NameInMap("ModelInfos")
        private java.util.List<ModelInfos> modelInfos;

        @com.aliyun.core.annotation.NameInMap("UseDocSize")
        private Long useDocSize;

        private MiaosouConfig(Builder builder) {
            this.maxDocSize = builder.maxDocSize;
            this.modelInfos = builder.modelInfos;
            this.useDocSize = builder.useDocSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiaosouConfig create() {
            return builder().build();
        }

        /**
         * @return maxDocSize
         */
        public Long getMaxDocSize() {
            return this.maxDocSize;
        }

        /**
         * @return modelInfos
         */
        public java.util.List<ModelInfos> getModelInfos() {
            return this.modelInfos;
        }

        /**
         * @return useDocSize
         */
        public Long getUseDocSize() {
            return this.useDocSize;
        }

        public static final class Builder {
            private Long maxDocSize; 
            private java.util.List<ModelInfos> modelInfos; 
            private Long useDocSize; 

            private Builder() {
            } 

            private Builder(MiaosouConfig model) {
                this.maxDocSize = model.maxDocSize;
                this.modelInfos = model.modelInfos;
                this.useDocSize = model.useDocSize;
            } 

            /**
             * MaxDocSize.
             */
            public Builder maxDocSize(Long maxDocSize) {
                this.maxDocSize = maxDocSize;
                return this;
            }

            /**
             * ModelInfos.
             */
            public Builder modelInfos(java.util.List<ModelInfos> modelInfos) {
                this.modelInfos = modelInfos;
                return this;
            }

            /**
             * UseDocSize.
             */
            public Builder useDocSize(Long useDocSize) {
                this.useDocSize = useDocSize;
                return this;
            }

            public MiaosouConfig build() {
                return new MiaosouConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class SearchSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SearchSourceList(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSourceList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 
            private String name; 

            private Builder() {
            } 

            private Builder(SearchSourceList model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SearchSourceList build() {
                return new SearchSourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class DataSearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataSearchSources(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSearchSources create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataSearchSources model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataSearchSources build() {
                return new DataSearchSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private UserInfo(Builder builder) {
            this.agentId = builder.agentId;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String agentId; 
            private String tenantId; 
            private String userId; 
            private String username; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.agentId = model.agentId;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
                this.username = model.username;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class WanxiangImageSizeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private WanxiangImageSizeConfig(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WanxiangImageSizeConfig create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(WanxiangImageSizeConfig model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public WanxiangImageSizeConfig build() {
                return new WanxiangImageSizeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class WanxiangImageStyleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pic")
        private String pic;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private WanxiangImageStyleConfig(Builder builder) {
            this.name = builder.name;
            this.pic = builder.pic;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WanxiangImageStyleConfig create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pic
         */
        public String getPic() {
            return this.pic;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String pic; 
            private String value; 

            private Builder() {
            } 

            private Builder(WanxiangImageStyleConfig model) {
                this.name = model.name;
                this.pic = model.pic;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pic.
             */
            public Builder pic(String pic) {
                this.pic = pic;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public WanxiangImageStyleConfig build() {
                return new WanxiangImageStyleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPropertiesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatConfig")
        private java.util.Map<String, ?> chatConfig;

        @com.aliyun.core.annotation.NameInMap("ConsoleConfig")
        private ConsoleConfig consoleConfig;

        @com.aliyun.core.annotation.NameInMap("GeneralConfigMap")
        private java.util.Map<String, ?> generalConfigMap;

        @com.aliyun.core.annotation.NameInMap("IntelligentSearchConfig")
        private IntelligentSearchConfig intelligentSearchConfig;

        @com.aliyun.core.annotation.NameInMap("MiaosouConfig")
        private MiaosouConfig miaosouConfig;

        @com.aliyun.core.annotation.NameInMap("SearchSourceList")
        private java.util.List<SearchSourceList> searchSourceList;

        @com.aliyun.core.annotation.NameInMap("SearchSources")
        private java.util.List<DataSearchSources> searchSources;

        @com.aliyun.core.annotation.NameInMap("SlrAuthorized")
        private Boolean slrAuthorized;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private UserInfo userInfo;

        @com.aliyun.core.annotation.NameInMap("WanxiangImageSizeConfig")
        private java.util.List<WanxiangImageSizeConfig> wanxiangImageSizeConfig;

        @com.aliyun.core.annotation.NameInMap("WanxiangImageStyleConfig")
        private java.util.List<WanxiangImageStyleConfig> wanxiangImageStyleConfig;

        private Data(Builder builder) {
            this.chatConfig = builder.chatConfig;
            this.consoleConfig = builder.consoleConfig;
            this.generalConfigMap = builder.generalConfigMap;
            this.intelligentSearchConfig = builder.intelligentSearchConfig;
            this.miaosouConfig = builder.miaosouConfig;
            this.searchSourceList = builder.searchSourceList;
            this.searchSources = builder.searchSources;
            this.slrAuthorized = builder.slrAuthorized;
            this.userInfo = builder.userInfo;
            this.wanxiangImageSizeConfig = builder.wanxiangImageSizeConfig;
            this.wanxiangImageStyleConfig = builder.wanxiangImageStyleConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chatConfig
         */
        public java.util.Map<String, ?> getChatConfig() {
            return this.chatConfig;
        }

        /**
         * @return consoleConfig
         */
        public ConsoleConfig getConsoleConfig() {
            return this.consoleConfig;
        }

        /**
         * @return generalConfigMap
         */
        public java.util.Map<String, ?> getGeneralConfigMap() {
            return this.generalConfigMap;
        }

        /**
         * @return intelligentSearchConfig
         */
        public IntelligentSearchConfig getIntelligentSearchConfig() {
            return this.intelligentSearchConfig;
        }

        /**
         * @return miaosouConfig
         */
        public MiaosouConfig getMiaosouConfig() {
            return this.miaosouConfig;
        }

        /**
         * @return searchSourceList
         */
        public java.util.List<SearchSourceList> getSearchSourceList() {
            return this.searchSourceList;
        }

        /**
         * @return searchSources
         */
        public java.util.List<DataSearchSources> getSearchSources() {
            return this.searchSources;
        }

        /**
         * @return slrAuthorized
         */
        public Boolean getSlrAuthorized() {
            return this.slrAuthorized;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        /**
         * @return wanxiangImageSizeConfig
         */
        public java.util.List<WanxiangImageSizeConfig> getWanxiangImageSizeConfig() {
            return this.wanxiangImageSizeConfig;
        }

        /**
         * @return wanxiangImageStyleConfig
         */
        public java.util.List<WanxiangImageStyleConfig> getWanxiangImageStyleConfig() {
            return this.wanxiangImageStyleConfig;
        }

        public static final class Builder {
            private java.util.Map<String, ?> chatConfig; 
            private ConsoleConfig consoleConfig; 
            private java.util.Map<String, ?> generalConfigMap; 
            private IntelligentSearchConfig intelligentSearchConfig; 
            private MiaosouConfig miaosouConfig; 
            private java.util.List<SearchSourceList> searchSourceList; 
            private java.util.List<DataSearchSources> searchSources; 
            private Boolean slrAuthorized; 
            private UserInfo userInfo; 
            private java.util.List<WanxiangImageSizeConfig> wanxiangImageSizeConfig; 
            private java.util.List<WanxiangImageStyleConfig> wanxiangImageStyleConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chatConfig = model.chatConfig;
                this.consoleConfig = model.consoleConfig;
                this.generalConfigMap = model.generalConfigMap;
                this.intelligentSearchConfig = model.intelligentSearchConfig;
                this.miaosouConfig = model.miaosouConfig;
                this.searchSourceList = model.searchSourceList;
                this.searchSources = model.searchSources;
                this.slrAuthorized = model.slrAuthorized;
                this.userInfo = model.userInfo;
                this.wanxiangImageSizeConfig = model.wanxiangImageSizeConfig;
                this.wanxiangImageStyleConfig = model.wanxiangImageStyleConfig;
            } 

            /**
             * ChatConfig.
             */
            public Builder chatConfig(java.util.Map<String, ?> chatConfig) {
                this.chatConfig = chatConfig;
                return this;
            }

            /**
             * ConsoleConfig.
             */
            public Builder consoleConfig(ConsoleConfig consoleConfig) {
                this.consoleConfig = consoleConfig;
                return this;
            }

            /**
             * GeneralConfigMap.
             */
            public Builder generalConfigMap(java.util.Map<String, ?> generalConfigMap) {
                this.generalConfigMap = generalConfigMap;
                return this;
            }

            /**
             * IntelligentSearchConfig.
             */
            public Builder intelligentSearchConfig(IntelligentSearchConfig intelligentSearchConfig) {
                this.intelligentSearchConfig = intelligentSearchConfig;
                return this;
            }

            /**
             * MiaosouConfig.
             */
            public Builder miaosouConfig(MiaosouConfig miaosouConfig) {
                this.miaosouConfig = miaosouConfig;
                return this;
            }

            /**
             * SearchSourceList.
             */
            public Builder searchSourceList(java.util.List<SearchSourceList> searchSourceList) {
                this.searchSourceList = searchSourceList;
                return this;
            }

            /**
             * SearchSources.
             */
            public Builder searchSources(java.util.List<DataSearchSources> searchSources) {
                this.searchSources = searchSources;
                return this;
            }

            /**
             * SlrAuthorized.
             */
            public Builder slrAuthorized(Boolean slrAuthorized) {
                this.slrAuthorized = slrAuthorized;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            /**
             * WanxiangImageSizeConfig.
             */
            public Builder wanxiangImageSizeConfig(java.util.List<WanxiangImageSizeConfig> wanxiangImageSizeConfig) {
                this.wanxiangImageSizeConfig = wanxiangImageSizeConfig;
                return this;
            }

            /**
             * WanxiangImageStyleConfig.
             */
            public Builder wanxiangImageStyleConfig(java.util.List<WanxiangImageStyleConfig> wanxiangImageStyleConfig) {
                this.wanxiangImageStyleConfig = wanxiangImageStyleConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
