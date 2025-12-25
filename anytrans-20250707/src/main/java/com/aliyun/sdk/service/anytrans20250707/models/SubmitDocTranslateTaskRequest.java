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
 * {@link SubmitDocTranslateTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitDocTranslateTaskRequest</p>
 */
public class SubmitDocTranslateTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ext")
    private Ext ext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format")
    private String format;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetLanguage")
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitDocTranslateTaskRequest(Builder builder) {
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

    public static SubmitDocTranslateTaskRequest create() {
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

    public static final class Builder extends Request.Builder<SubmitDocTranslateTaskRequest, Builder> {
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

        private Builder(SubmitDocTranslateTaskRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spoke-llm</p>
         */
        public Builder scene(String scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf">https://xxx-hangzhou.aliyuncs.com/docs/tmp/%E6%A0%B7%E4%BE%8B_%E6%97%A0%E5%9B%BE.pdf</a></p>
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
         * <p>llm-kqtrcpdee4xm29xc</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitDocTranslateTaskRequest build() {
            return new SubmitDocTranslateTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitDocTranslateTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDocTranslateTaskRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("skipImgTrans")
        private Boolean skipImgTrans;

        private Config(Builder builder) {
            this.skipImgTrans = builder.skipImgTrans;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return skipImgTrans
         */
        public Boolean getSkipImgTrans() {
            return this.skipImgTrans;
        }

        public static final class Builder {
            private Boolean skipImgTrans; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.skipImgTrans = model.skipImgTrans;
            } 

            /**
             * skipImgTrans.
             */
            public Builder skipImgTrans(Boolean skipImgTrans) {
                this.skipImgTrans = skipImgTrans;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitDocTranslateTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDocTranslateTaskRequest</p>
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
     * {@link SubmitDocTranslateTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDocTranslateTaskRequest</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("domainHint")
        private String domainHint;

        @com.aliyun.core.annotation.NameInMap("paramMap")
        private Object paramMap;

        @com.aliyun.core.annotation.NameInMap("terminologies")
        private java.util.List<Terminologies> terminologies;

        private Ext(Builder builder) {
            this.config = builder.config;
            this.domainHint = builder.domainHint;
            this.paramMap = builder.paramMap;
            this.terminologies = builder.terminologies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return domainHint
         */
        public String getDomainHint() {
            return this.domainHint;
        }

        /**
         * @return paramMap
         */
        public Object getParamMap() {
            return this.paramMap;
        }

        /**
         * @return terminologies
         */
        public java.util.List<Terminologies> getTerminologies() {
            return this.terminologies;
        }

        public static final class Builder {
            private Config config; 
            private String domainHint; 
            private Object paramMap; 
            private java.util.List<Terminologies> terminologies; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.config = model.config;
                this.domainHint = model.domainHint;
                this.paramMap = model.paramMap;
                this.terminologies = model.terminologies;
            } 

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * domainHint.
             */
            public Builder domainHint(String domainHint) {
                this.domainHint = domainHint;
                return this;
            }

            /**
             * paramMap.
             */
            public Builder paramMap(Object paramMap) {
                this.paramMap = paramMap;
                return this;
            }

            /**
             * terminologies.
             */
            public Builder terminologies(java.util.List<Terminologies> terminologies) {
                this.terminologies = terminologies;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
}
