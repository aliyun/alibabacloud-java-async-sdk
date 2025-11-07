// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link ModelTypeDetermineRequest} extends {@link RequestModel}
 *
 * <p>ModelTypeDetermineRequest</p>
 */
public class ModelTypeDetermineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("history")
    private java.util.List<History> history;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inputText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputText;

    private ModelTypeDetermineRequest(Builder builder) {
        super(builder);
        this.history = builder.history;
        this.inputText = builder.inputText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelTypeDetermineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return history
     */
    public java.util.List<History> getHistory() {
        return this.history;
    }

    /**
     * @return inputText
     */
    public String getInputText() {
        return this.inputText;
    }

    public static final class Builder extends Request.Builder<ModelTypeDetermineRequest, Builder> {
        private java.util.List<History> history; 
        private String inputText; 

        private Builder() {
            super();
        } 

        private Builder(ModelTypeDetermineRequest request) {
            super(request);
            this.history = request.history;
            this.inputText = request.inputText;
        } 

        /**
         * history.
         */
        public Builder history(java.util.List<History> history) {
            String historyShrink = shrink(history, "history", "json");
            this.putBodyParameter("history", historyShrink);
            this.history = history;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputText(String inputText) {
            this.putBodyParameter("inputText", inputText);
            this.inputText = inputText;
            return this;
        }

        @Override
        public ModelTypeDetermineRequest build() {
            return new ModelTypeDetermineRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModelTypeDetermineRequest} extends {@link TeaModel}
     *
     * <p>ModelTypeDetermineRequest</p>
     */
    public static class History extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private History(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(History model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
}
