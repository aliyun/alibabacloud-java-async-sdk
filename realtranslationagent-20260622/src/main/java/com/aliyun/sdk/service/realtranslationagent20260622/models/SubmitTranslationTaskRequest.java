// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.realtranslationagent20260622.models;

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
 * {@link SubmitTranslationTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitTranslationTaskRequest</p>
 */
public class SubmitTranslationTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("APIKey")
    private String APIKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseTaskId")
    private String baseTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private Config config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomTerms")
    private java.util.List<CustomTerms> customTerms;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private SubmitTranslationTaskRequest(Builder builder) {
        super(builder);
        this.APIKey = builder.APIKey;
        this.baseTaskId = builder.baseTaskId;
        this.config = builder.config;
        this.customTerms = builder.customTerms;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTranslationTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APIKey
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * @return baseTaskId
     */
    public String getBaseTaskId() {
        return this.baseTaskId;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return customTerms
     */
    public java.util.List<CustomTerms> getCustomTerms() {
        return this.customTerms;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SubmitTranslationTaskRequest, Builder> {
        private String APIKey; 
        private String baseTaskId; 
        private Config config; 
        private java.util.List<CustomTerms> customTerms; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTranslationTaskRequest request) {
            super(request);
            this.APIKey = request.APIKey;
            this.baseTaskId = request.baseTaskId;
            this.config = request.config;
            this.customTerms = request.customTerms;
            this.taskId = request.taskId;
        } 

        /**
         * APIKey.
         */
        public Builder APIKey(String APIKey) {
            this.putQueryParameter("APIKey", APIKey);
            this.APIKey = APIKey;
            return this;
        }

        /**
         * BaseTaskId.
         */
        public Builder baseTaskId(String baseTaskId) {
            this.putBodyParameter("BaseTaskId", baseTaskId);
            this.baseTaskId = baseTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;SourceLanguage&quot;: &quot;zh&quot;,
         *         &quot;TargetLanguage&quot;: &quot;en&quot;,
         *         &quot;Style&quot;: &quot;minimal&quot;,
         *         &quot;Font&quot;: &quot;Arial&quot;
         *     }</p>
         */
        public Builder config(Config config) {
            String configShrink = shrink(config, "Config", "json");
            this.putBodyParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * CustomTerms.
         */
        public Builder customTerms(java.util.List<CustomTerms> customTerms) {
            String customTermsShrink = shrink(customTerms, "CustomTerms", "json");
            this.putQueryParameter("CustomTerms", customTermsShrink);
            this.customTerms = customTerms;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public SubmitTranslationTaskRequest build() {
            return new SubmitTranslationTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTranslationTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranslationTaskRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Font")
        private String font;

        @com.aliyun.core.annotation.NameInMap("SourceLanguage")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceLanguage;

        @com.aliyun.core.annotation.NameInMap("Style")
        private String style;

        @com.aliyun.core.annotation.NameInMap("TargetLanguage")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetLanguage;

        private Config(Builder builder) {
            this.font = builder.font;
            this.sourceLanguage = builder.sourceLanguage;
            this.style = builder.style;
            this.targetLanguage = builder.targetLanguage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return font
         */
        public String getFont() {
            return this.font;
        }

        /**
         * @return sourceLanguage
         */
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return targetLanguage
         */
        public String getTargetLanguage() {
            return this.targetLanguage;
        }

        public static final class Builder {
            private String font; 
            private String sourceLanguage; 
            private String style; 
            private String targetLanguage; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.font = model.font;
                this.sourceLanguage = model.sourceLanguage;
                this.style = model.style;
                this.targetLanguage = model.targetLanguage;
            } 

            /**
             * Font.
             */
            public Builder font(String font) {
                this.font = font;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder sourceLanguage(String sourceLanguage) {
                this.sourceLanguage = sourceLanguage;
                return this;
            }

            /**
             * Style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder targetLanguage(String targetLanguage) {
                this.targetLanguage = targetLanguage;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitTranslationTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranslationTaskRequest</p>
     */
    public static class CustomTerms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceTerm")
        private String sourceTerm;

        @com.aliyun.core.annotation.NameInMap("TargetTerm")
        private String targetTerm;

        private CustomTerms(Builder builder) {
            this.sourceTerm = builder.sourceTerm;
            this.targetTerm = builder.targetTerm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomTerms create() {
            return builder().build();
        }

        /**
         * @return sourceTerm
         */
        public String getSourceTerm() {
            return this.sourceTerm;
        }

        /**
         * @return targetTerm
         */
        public String getTargetTerm() {
            return this.targetTerm;
        }

        public static final class Builder {
            private String sourceTerm; 
            private String targetTerm; 

            private Builder() {
            } 

            private Builder(CustomTerms model) {
                this.sourceTerm = model.sourceTerm;
                this.targetTerm = model.targetTerm;
            } 

            /**
             * SourceTerm.
             */
            public Builder sourceTerm(String sourceTerm) {
                this.sourceTerm = sourceTerm;
                return this;
            }

            /**
             * TargetTerm.
             */
            public Builder targetTerm(String targetTerm) {
                this.targetTerm = targetTerm;
                return this;
            }

            public CustomTerms build() {
                return new CustomTerms(this);
            } 

        } 

    }
}
