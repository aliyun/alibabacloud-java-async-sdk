// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TextQueryResult} extends {@link TeaModel}
 *
 * <p>TextQueryResult</p>
 */
public class TextQueryResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("texts")
    private java.util.List < Text > texts;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private TextQueryResult(Builder builder) {
        this.requestId = builder.requestId;
        this.texts = builder.texts;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextQueryResult create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return texts
     */
    public java.util.List < Text > getTexts() {
        return this.texts;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Text > texts; 
        private Integer total; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * texts.
         */
        public Builder texts(java.util.List < Text > texts) {
            this.texts = texts;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public TextQueryResult build() {
            return new TextQueryResult(this);
        } 

    } 

}
