// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AiTransformField} extends {@link TeaModel}
 *
 * <p>AiTransformField</p>
 */
public class AiTransformField extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Form")
    private String form;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private AiTransformField(Builder builder) {
        this.form = builder.form;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiTransformField create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return form
     */
    public String getForm() {
        return this.form;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String form; 
        private String value; 

        private Builder() {
        } 

        private Builder(AiTransformField model) {
            this.form = model.form;
            this.value = model.value;
        } 

        /**
         * <p>The value form. Currently uses JSONPATH.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        public Builder form(String form) {
            this.form = form;
            return this;
        }

        /**
         * <p>The JSONPath expression.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.message</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public AiTransformField build() {
            return new AiTransformField(this);
        } 

    } 

}
