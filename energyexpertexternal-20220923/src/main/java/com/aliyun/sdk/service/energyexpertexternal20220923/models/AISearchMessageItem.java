// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link AISearchMessageItem} extends {@link TeaModel}
 *
 * <p>AISearchMessageItem</p>
 */
public class AISearchMessageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("params")
    private Object params;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private AISearchMessageItem(Builder builder) {
        this.content = builder.content;
        this.params = builder.params;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchMessageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return params
     */
    public Object getParams() {
        return this.params;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String content; 
        private Object params; 
        private String type; 

        private Builder() {
        } 

        private Builder(AISearchMessageItem model) {
            this.content = model.content;
            this.params = model.params;
            this.type = model.type;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * params.
         */
        public Builder params(Object params) {
            this.params = params;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AISearchMessageItem build() {
            return new AISearchMessageItem(this);
        } 

    } 

}
