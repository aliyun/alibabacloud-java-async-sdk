// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link LanguageDetectRequest} extends {@link RequestModel}
 *
 * <p>LanguageDetectRequest</p>
 */
public class LanguageDetectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceText;

    private LanguageDetectRequest(Builder builder) {
        super(builder);
        this.scene = builder.scene;
        this.sourceText = builder.sourceText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LanguageDetectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sourceText
     */
    public String getSourceText() {
        return this.sourceText;
    }

    public static final class Builder extends Request.Builder<LanguageDetectRequest, Builder> {
        private String scene; 
        private String sourceText; 

        private Builder() {
            super();
        } 

        private Builder(LanguageDetectRequest request) {
            super(request);
            this.scene = request.scene;
            this.sourceText = request.sourceText;
        } 

        /**
         * <p>The detection scenario. Default value: common. For search phrase scenarios, set this parameter to query. If an invalid value is specified or this parameter is left empty, the common general detection scenario is used. Note: The value query must be in lowercase.</p>
         * 
         * <strong>example:</strong>
         * <p>query</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The source text to be detected. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test text</p>
         */
        public Builder sourceText(String sourceText) {
            this.putQueryParameter("SourceText", sourceText);
            this.sourceText = sourceText;
            return this;
        }

        @Override
        public LanguageDetectRequest build() {
            return new LanguageDetectRequest(this);
        } 

    } 

}
