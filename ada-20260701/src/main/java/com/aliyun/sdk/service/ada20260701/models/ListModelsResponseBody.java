// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link ListModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelsResponseBody</p>
 */
public class ListModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Models")
    private java.util.List<Models> models;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListModelsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.models = builder.models;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<Models> models; 
        private String nextToken; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListModelsResponseBody model) {
            this.maxResults = model.maxResults;
            this.models = model.models;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The maximum number of results used for the current pagination. If pagination is not used, this value is the total number of results. This value is not the actual number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The array of model structures. For nested fields, refer to the supplementary description of response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Id&quot;:&quot;text-model-example&quot;,&quot;Object&quot;:&quot;model&quot;,&quot;Created&quot;:1793491200,&quot;OwnedBy&quot;:&quot;provider-example&quot;,&quot;DisplayName&quot;:&quot;示例文本模型&quot;,&quot;Capabilities&quot;:{&quot;InputModalities&quot;:[&quot;text&quot;]},&quot;CreditsCoefficient&quot;:&quot;2.5&quot;,&quot;ThinkingLevels&quot;:[&quot;off&quot;,&quot;low&quot;,&quot;medium&quot;,&quot;high&quot;],&quot;ThinkingLevel&quot;:&quot;off&quot;}]</p>
         */
        public Builder models(java.util.List<Models> models) {
            this.models = models;
            return this;
        }

        /**
         * <p>The token for the next page. An empty value indicates that no more pages exist.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-example</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of models that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListModelsResponseBody build() {
            return new ListModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputModalities")
        private java.util.List<String> inputModalities;

        private Capabilities(Builder builder) {
            this.inputModalities = builder.inputModalities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
        }

        /**
         * @return inputModalities
         */
        public java.util.List<String> getInputModalities() {
            return this.inputModalities;
        }

        public static final class Builder {
            private java.util.List<String> inputModalities; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.inputModalities = model.inputModalities;
            } 

            /**
             * <p>The supported input modalities. For text sessions, select a model that includes text.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;text&quot;]</p>
             */
            public Builder inputModalities(java.util.List<String> inputModalities) {
                this.inputModalities = inputModalities;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelsResponseBody</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capabilities")
        private Capabilities capabilities;

        @com.aliyun.core.annotation.NameInMap("ContextWindow")
        @Deprecated
        private Long contextWindow;

        @com.aliyun.core.annotation.NameInMap("Created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("CreditsCoefficient")
        private String creditsCoefficient;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MaxContextWindow")
        @Deprecated
        private Long maxContextWindow;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("OwnedBy")
        private String ownedBy;

        @com.aliyun.core.annotation.NameInMap("SupportsThinking")
        @Deprecated
        private Integer supportsThinking;

        @com.aliyun.core.annotation.NameInMap("ThinkingLevel")
        private String thinkingLevel;

        @com.aliyun.core.annotation.NameInMap("ThinkingLevels")
        private java.util.List<String> thinkingLevels;

        @com.aliyun.core.annotation.NameInMap("ThinkingMode")
        @Deprecated
        private Integer thinkingMode;

        private Models(Builder builder) {
            this.capabilities = builder.capabilities;
            this.contextWindow = builder.contextWindow;
            this.created = builder.created;
            this.creditsCoefficient = builder.creditsCoefficient;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.maxContextWindow = builder.maxContextWindow;
            this.object = builder.object;
            this.ownedBy = builder.ownedBy;
            this.supportsThinking = builder.supportsThinking;
            this.thinkingLevel = builder.thinkingLevel;
            this.thinkingLevels = builder.thinkingLevels;
            this.thinkingMode = builder.thinkingMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return capabilities
         */
        public Capabilities getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return contextWindow
         */
        public Long getContextWindow() {
            return this.contextWindow;
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return creditsCoefficient
         */
        public String getCreditsCoefficient() {
            return this.creditsCoefficient;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return maxContextWindow
         */
        public Long getMaxContextWindow() {
            return this.maxContextWindow;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return ownedBy
         */
        public String getOwnedBy() {
            return this.ownedBy;
        }

        /**
         * @return supportsThinking
         */
        public Integer getSupportsThinking() {
            return this.supportsThinking;
        }

        /**
         * @return thinkingLevel
         */
        public String getThinkingLevel() {
            return this.thinkingLevel;
        }

        /**
         * @return thinkingLevels
         */
        public java.util.List<String> getThinkingLevels() {
            return this.thinkingLevels;
        }

        /**
         * @return thinkingMode
         */
        public Integer getThinkingMode() {
            return this.thinkingMode;
        }

        public static final class Builder {
            private Capabilities capabilities; 
            private Long contextWindow; 
            private Long created; 
            private String creditsCoefficient; 
            private String displayName; 
            private String id; 
            private Long maxContextWindow; 
            private String object; 
            private String ownedBy; 
            private Integer supportsThinking; 
            private String thinkingLevel; 
            private java.util.List<String> thinkingLevels; 
            private Integer thinkingMode; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.capabilities = model.capabilities;
                this.contextWindow = model.contextWindow;
                this.created = model.created;
                this.creditsCoefficient = model.creditsCoefficient;
                this.displayName = model.displayName;
                this.id = model.id;
                this.maxContextWindow = model.maxContextWindow;
                this.object = model.object;
                this.ownedBy = model.ownedBy;
                this.supportsThinking = model.supportsThinking;
                this.thinkingLevel = model.thinkingLevel;
                this.thinkingLevels = model.thinkingLevels;
                this.thinkingMode = model.thinkingMode;
            } 

            /**
             * <p>The model capabilities structure.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;InputModalities&quot;:[&quot;text&quot;]}</p>
             */
            public Builder capabilities(Capabilities capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>The deprecated compatibility field. This field is not returned. Do not rely on this field for integration.</p>
             * 
             * <strong>example:</strong>
             * <p>32768</p>
             */
            public Builder contextWindow(Long contextWindow) {
                this.contextWindow = contextWindow;
                return this;
            }

            /**
             * <p>The time when the model was created. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1793491200</p>
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The credits coefficient of the model. The value is returned as a decimal string. This parameter is not returned if it is not configured.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5</p>
             */
            public Builder creditsCoefficient(String creditsCoefficient) {
                this.creditsCoefficient = creditsCoefficient;
                return this;
            }

            /**
             * <p>The display name of the model. Do not pass this value as the model identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample text model</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The model identifier. Used as Params.modelId for SetAgentSessionModel. Use the actual returned value.</p>
             * 
             * <strong>example:</strong>
             * <p>text-model-example</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The deprecated compatibility field. This field is not returned. Do not rely on this field for integration.</p>
             * 
             * <strong>example:</strong>
             * <p>131072</p>
             */
            public Builder maxContextWindow(Long maxContextWindow) {
                this.maxContextWindow = maxContextWindow;
                return this;
            }

            /**
             * <p>The object type. The value is fixed to model.</p>
             * 
             * <strong>example:</strong>
             * <p>model</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The identifier of the model provider.</p>
             * 
             * <strong>example:</strong>
             * <p>provider-example</p>
             */
            public Builder ownedBy(String ownedBy) {
                this.ownedBy = ownedBy;
                return this;
            }

            /**
             * <p>The deprecated compatibility field. This field is not returned. Use ThinkingLevels instead.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder supportsThinking(Integer supportsThinking) {
                this.supportsThinking = supportsThinking;
                return this;
            }

            /**
             * <p>The default thinking level in the model catalog. This value does not represent the current value of the session. Query the current value by using GetAgentSessionModel.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder thinkingLevel(String thinkingLevel) {
                this.thinkingLevel = thinkingLevel;
                return this;
            }

            /**
             * <p>The thinking levels supported by the model. An empty array does not indicate that all levels are supported. The target session still requires validation.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;off&quot;,&quot;low&quot;,&quot;medium&quot;,&quot;high&quot;]</p>
             */
            public Builder thinkingLevels(java.util.List<String> thinkingLevels) {
                this.thinkingLevels = thinkingLevels;
                return this;
            }

            /**
             * <p>The deprecated compatibility field. This field is not returned. Use ThinkingLevel instead.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder thinkingMode(Integer thinkingMode) {
                this.thinkingMode = thinkingMode;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
