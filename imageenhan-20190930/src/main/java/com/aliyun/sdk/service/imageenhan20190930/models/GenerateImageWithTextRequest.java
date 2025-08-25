// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageenhan20190930.models;

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
 * {@link GenerateImageWithTextRequest} extends {@link RequestModel}
 *
 * <p>GenerateImageWithTextRequest</p>
 */
public class GenerateImageWithTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Number")
    private Integer number;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private GenerateImageWithTextRequest(Builder builder) {
        super(builder);
        this.number = builder.number;
        this.resolution = builder.resolution;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateImageWithTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return number
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<GenerateImageWithTextRequest, Builder> {
        private Integer number; 
        private String resolution; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(GenerateImageWithTextRequest request) {
            super(request);
            this.number = request.number;
            this.resolution = request.resolution;
            this.text = request.text;
        } 

        /**
         * Number.
         */
        public Builder number(Integer number) {
            this.putBodyParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * Resolution.
         */
        public Builder resolution(String resolution) {
            this.putBodyParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public GenerateImageWithTextRequest build() {
            return new GenerateImageWithTextRequest(this);
        } 

    } 

}
