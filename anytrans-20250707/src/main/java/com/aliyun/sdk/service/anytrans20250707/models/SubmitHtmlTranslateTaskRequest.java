// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.anytrans20250707.models;

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
 * {@link SubmitHtmlTranslateTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitHtmlTranslateTaskRequest</p>
 */
public class SubmitHtmlTranslateTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ext")
    private Ext ext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format")
    private String format;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetLanguage")
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitHtmlTranslateTaskRequest(Builder builder) {
        super(builder);
        this.ext = builder.ext;
        this.format = builder.format;
        this.scene = builder.scene;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
        this.text = builder.text;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitHtmlTranslateTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ext
     */
    public Ext getExt() {
        return this.ext;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitHtmlTranslateTaskRequest, Builder> {
        private Ext ext; 
        private String format; 
        private String scene; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private String text; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitHtmlTranslateTaskRequest request) {
            super(request);
            this.ext = request.ext;
            this.format = request.format;
            this.scene = request.scene;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.text = request.text;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ext.
         */
        public Builder ext(Ext ext) {
            String extShrink = shrink(ext, "ext", "json");
            this.putBodyParameter("ext", extShrink);
            this.ext = ext;
            return this;
        }

        /**
         * format.
         */
        public Builder format(String format) {
            this.putBodyParameter("format", format);
            this.format = format;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * sourceLanguage.
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("sourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * targetLanguage.
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("targetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.putBodyParameter("text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-kqtrcpdee4xm29xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitHtmlTranslateTaskRequest build() {
            return new SubmitHtmlTranslateTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitHtmlTranslateTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHtmlTranslateTaskRequest</p>
     */
    public static class Examples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("src")
        private String src;

        @com.aliyun.core.annotation.NameInMap("tgt")
        private String tgt;

        private Examples(Builder builder) {
            this.src = builder.src;
            this.tgt = builder.tgt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Examples create() {
            return builder().build();
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
        }

        /**
         * @return tgt
         */
        public String getTgt() {
            return this.tgt;
        }

        public static final class Builder {
            private String src; 
            private String tgt; 

            private Builder() {
            } 

            private Builder(Examples model) {
                this.src = model.src;
                this.tgt = model.tgt;
            } 

            /**
             * src.
             */
            public Builder src(String src) {
                this.src = src;
                return this;
            }

            /**
             * tgt.
             */
            public Builder tgt(String tgt) {
                this.tgt = tgt;
                return this;
            }

            public Examples build() {
                return new Examples(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitHtmlTranslateTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHtmlTranslateTaskRequest</p>
     */
    public static class Terminologies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("src")
        private String src;

        @com.aliyun.core.annotation.NameInMap("tgt")
        private String tgt;

        private Terminologies(Builder builder) {
            this.src = builder.src;
            this.tgt = builder.tgt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terminologies create() {
            return builder().build();
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
        }

        /**
         * @return tgt
         */
        public String getTgt() {
            return this.tgt;
        }

        public static final class Builder {
            private String src; 
            private String tgt; 

            private Builder() {
            } 

            private Builder(Terminologies model) {
                this.src = model.src;
                this.tgt = model.tgt;
            } 

            /**
             * src.
             */
            public Builder src(String src) {
                this.src = src;
                return this;
            }

            /**
             * tgt.
             */
            public Builder tgt(String tgt) {
                this.tgt = tgt;
                return this;
            }

            public Terminologies build() {
                return new Terminologies(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitHtmlTranslateTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHtmlTranslateTaskRequest</p>
     */
    public static class TextTransform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("toLower")
        private Boolean toLower;

        @com.aliyun.core.annotation.NameInMap("toTitle")
        private Boolean toTitle;

        @com.aliyun.core.annotation.NameInMap("toUpper")
        private Boolean toUpper;

        private TextTransform(Builder builder) {
            this.toLower = builder.toLower;
            this.toTitle = builder.toTitle;
            this.toUpper = builder.toUpper;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextTransform create() {
            return builder().build();
        }

        /**
         * @return toLower
         */
        public Boolean getToLower() {
            return this.toLower;
        }

        /**
         * @return toTitle
         */
        public Boolean getToTitle() {
            return this.toTitle;
        }

        /**
         * @return toUpper
         */
        public Boolean getToUpper() {
            return this.toUpper;
        }

        public static final class Builder {
            private Boolean toLower; 
            private Boolean toTitle; 
            private Boolean toUpper; 

            private Builder() {
            } 

            private Builder(TextTransform model) {
                this.toLower = model.toLower;
                this.toTitle = model.toTitle;
                this.toUpper = model.toUpper;
            } 

            /**
             * toLower.
             */
            public Builder toLower(Boolean toLower) {
                this.toLower = toLower;
                return this;
            }

            /**
             * toTitle.
             */
            public Builder toTitle(Boolean toTitle) {
                this.toTitle = toTitle;
                return this;
            }

            /**
             * toUpper.
             */
            public Builder toUpper(Boolean toUpper) {
                this.toUpper = toUpper;
                return this;
            }

            public TextTransform build() {
                return new TextTransform(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitHtmlTranslateTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHtmlTranslateTaskRequest</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainHint")
        private String domainHint;

        @com.aliyun.core.annotation.NameInMap("examples")
        private java.util.List<Examples> examples;

        @com.aliyun.core.annotation.NameInMap("sensitives")
        private java.util.List<String> sensitives;

        @com.aliyun.core.annotation.NameInMap("terminologies")
        private java.util.List<Terminologies> terminologies;

        @com.aliyun.core.annotation.NameInMap("textTransform")
        private TextTransform textTransform;

        private Ext(Builder builder) {
            this.domainHint = builder.domainHint;
            this.examples = builder.examples;
            this.sensitives = builder.sensitives;
            this.terminologies = builder.terminologies;
            this.textTransform = builder.textTransform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return domainHint
         */
        public String getDomainHint() {
            return this.domainHint;
        }

        /**
         * @return examples
         */
        public java.util.List<Examples> getExamples() {
            return this.examples;
        }

        /**
         * @return sensitives
         */
        public java.util.List<String> getSensitives() {
            return this.sensitives;
        }

        /**
         * @return terminologies
         */
        public java.util.List<Terminologies> getTerminologies() {
            return this.terminologies;
        }

        /**
         * @return textTransform
         */
        public TextTransform getTextTransform() {
            return this.textTransform;
        }

        public static final class Builder {
            private String domainHint; 
            private java.util.List<Examples> examples; 
            private java.util.List<String> sensitives; 
            private java.util.List<Terminologies> terminologies; 
            private TextTransform textTransform; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.domainHint = model.domainHint;
                this.examples = model.examples;
                this.sensitives = model.sensitives;
                this.terminologies = model.terminologies;
                this.textTransform = model.textTransform;
            } 

            /**
             * domainHint.
             */
            public Builder domainHint(String domainHint) {
                this.domainHint = domainHint;
                return this;
            }

            /**
             * examples.
             */
            public Builder examples(java.util.List<Examples> examples) {
                this.examples = examples;
                return this;
            }

            /**
             * sensitives.
             */
            public Builder sensitives(java.util.List<String> sensitives) {
                this.sensitives = sensitives;
                return this;
            }

            /**
             * terminologies.
             */
            public Builder terminologies(java.util.List<Terminologies> terminologies) {
                this.terminologies = terminologies;
                return this;
            }

            /**
             * textTransform.
             */
            public Builder textTransform(TextTransform textTransform) {
                this.textTransform = textTransform;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
}
