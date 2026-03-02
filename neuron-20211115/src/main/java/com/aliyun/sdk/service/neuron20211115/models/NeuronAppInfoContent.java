// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link NeuronAppInfoContent} extends {@link TeaModel}
 *
 * <p>NeuronAppInfoContent</p>
 */
public class NeuronAppInfoContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private NeuronAppInfoContent(Builder builder) {
        this.content = builder.content;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppInfoContent create() {
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String content; 
        private String title; 

        private Builder() {
        } 

        private Builder(NeuronAppInfoContent model) {
            this.content = model.content;
            this.title = model.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1343424</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public NeuronAppInfoContent build() {
            return new NeuronAppInfoContent(this);
        } 

    } 

}
