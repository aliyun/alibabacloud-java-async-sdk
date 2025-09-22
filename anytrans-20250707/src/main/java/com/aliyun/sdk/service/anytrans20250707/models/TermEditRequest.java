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
 * {@link TermEditRequest} extends {@link RequestModel}
 *
 * <p>TermEditRequest</p>
 */
public class TermEditRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ext")
    @com.aliyun.core.annotation.Validation(required = true)
    private Ext ext;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private TermEditRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.ext = builder.ext;
        this.scene = builder.scene;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TermEditRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return ext
     */
    public Ext getExt() {
        return this.ext;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<TermEditRequest, Builder> {
        private String action; 
        private Ext ext; 
        private String scene; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(TermEditRequest request) {
            super(request);
            this.action = request.action;
            this.ext = request.ext;
            this.scene = request.scene;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ext(Ext ext) {
            String extShrink = shrink(ext, "ext", "json");
            this.putBodyParameter("ext", extShrink);
            this.ext = ext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-turbo</p>
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
         * <p>en</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("sourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
         * <p>llm-kqtrcpdee4xm29xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public TermEditRequest build() {
            return new TermEditRequest(this);
        } 

    } 

    /**
     * 
     * {@link TermEditRequest} extends {@link TeaModel}
     *
     * <p>TermEditRequest</p>
     */
    public static class Terms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("src")
        @com.aliyun.core.annotation.Validation(required = true)
        private String src;

        @com.aliyun.core.annotation.NameInMap("termId")
        private String termId;

        @com.aliyun.core.annotation.NameInMap("tgt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tgt;

        private Terms(Builder builder) {
            this.src = builder.src;
            this.termId = builder.termId;
            this.tgt = builder.tgt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terms create() {
            return builder().build();
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
        }

        /**
         * @return termId
         */
        public String getTermId() {
            return this.termId;
        }

        /**
         * @return tgt
         */
        public String getTgt() {
            return this.tgt;
        }

        public static final class Builder {
            private String src; 
            private String termId; 
            private String tgt; 

            private Builder() {
            } 

            private Builder(Terms model) {
                this.src = model.src;
                this.termId = model.termId;
                this.tgt = model.tgt;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder src(String src) {
                this.src = src;
                return this;
            }

            /**
             * termId.
             */
            public Builder termId(String termId) {
                this.termId = termId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LLM</p>
             */
            public Builder tgt(String tgt) {
                this.tgt = tgt;
                return this;
            }

            public Terms build() {
                return new Terms(this);
            } 

        } 

    }
    /**
     * 
     * {@link TermEditRequest} extends {@link TeaModel}
     *
     * <p>TermEditRequest</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("terms")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Terms> terms;

        private Ext(Builder builder) {
            this.terms = builder.terms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return terms
         */
        public java.util.List<Terms> getTerms() {
            return this.terms;
        }

        public static final class Builder {
            private java.util.List<Terms> terms; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.terms = model.terms;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder terms(java.util.List<Terms> terms) {
                this.terms = terms;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
}
