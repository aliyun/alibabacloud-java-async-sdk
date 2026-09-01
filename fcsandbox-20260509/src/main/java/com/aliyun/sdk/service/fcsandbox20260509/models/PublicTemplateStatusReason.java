// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link PublicTemplateStatusReason} extends {@link TeaModel}
 *
 * <p>PublicTemplateStatusReason</p>
 */
public class PublicTemplateStatusReason extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("step")
    private String step;

    private PublicTemplateStatusReason(Builder builder) {
        this.message = builder.message;
        this.step = builder.step;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateStatusReason create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return step
     */
    public String getStep() {
        return this.step;
    }

    public static final class Builder {
        private String message; 
        private String step; 

        private Builder() {
        } 

        private Builder(PublicTemplateStatusReason model) {
            this.message = model.message;
            this.step = model.step;
        } 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * step.
         */
        public Builder step(String step) {
            this.step = step;
            return this;
        }

        public PublicTemplateStatusReason build() {
            return new PublicTemplateStatusReason(this);
        } 

    } 

}
