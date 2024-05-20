// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextResult} extends {@link TeaModel}
 *
 * <p>TextResult</p>
 */
public class TextResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("text")
    @com.aliyun.core.annotation.Validation(required = true)
    private Text text;

    private TextResult(Builder builder) {
        this.requestId = builder.requestId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextResult create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return text
     */
    public Text getText() {
        return this.text;
    }

    public static final class Builder {
        private String requestId; 
        private Text text; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * text.
         */
        public Builder text(Text text) {
            this.text = text;
            return this;
        }

        public TextResult build() {
            return new TextResult(this);
        } 

    } 

}
