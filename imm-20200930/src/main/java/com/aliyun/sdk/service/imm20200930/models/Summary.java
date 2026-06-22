// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Summary} extends {@link TeaModel}
 *
 * <p>Summary</p>
 */
public class Summary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private Illustration image;

    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    private Summary(Builder builder) {
        this.image = builder.image;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Summary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public Illustration getImage() {
        return this.image;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private Illustration image; 
        private String text; 

        private Builder() {
        } 

        private Builder(Summary model) {
            this.image = model.image;
            this.text = model.text;
        } 

        /**
         * Image.
         */
        public Builder image(Illustration image) {
            this.image = image;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Summary build() {
            return new Summary(this);
        } 

    } 

}
