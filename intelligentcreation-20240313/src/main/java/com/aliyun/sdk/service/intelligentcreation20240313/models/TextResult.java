// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TextResult model) {
            this.requestId = model.requestId;
            this.text = model.text;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
