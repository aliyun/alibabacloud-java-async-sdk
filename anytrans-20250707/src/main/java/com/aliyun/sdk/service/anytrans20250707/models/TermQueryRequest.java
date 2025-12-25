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
 * {@link TermQueryRequest} extends {@link RequestModel}
 *
 * <p>TermQueryRequest</p>
 */
public class TermQueryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ext")
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
    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private TermQueryRequest(Builder builder) {
        super(builder);
        this.ext = builder.ext;
        this.scene = builder.scene;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
        this.text = builder.text;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TermQueryRequest create() {
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

    public static final class Builder extends Request.Builder<TermQueryRequest, Builder> {
        private Ext ext; 
        private String scene; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private String text; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(TermQueryRequest request) {
            super(request);
            this.ext = request.ext;
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
         * <p>zh</p>
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
         * <p>en</p>
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
        public TermQueryRequest build() {
            return new TermQueryRequest(this);
        } 

    } 

    /**
     * 
     * {@link TermQueryRequest} extends {@link TeaModel}
     *
     * <p>TermQueryRequest</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("paramMap")
        private Object paramMap;

        private Ext(Builder builder) {
            this.paramMap = builder.paramMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return paramMap
         */
        public Object getParamMap() {
            return this.paramMap;
        }

        public static final class Builder {
            private Object paramMap; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.paramMap = model.paramMap;
            } 

            /**
             * paramMap.
             */
            public Builder paramMap(Object paramMap) {
                this.paramMap = paramMap;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
}
