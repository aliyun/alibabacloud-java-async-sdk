// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link CreateTagOptionRequest} extends {@link RequestModel}
 *
 * <p>CreateTagOptionRequest</p>
 */
public class CreateTagOptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String key;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String value;

    private CreateTagOptionRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTagOptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateTagOptionRequest, Builder> {
        private String key; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateTagOptionRequest request) {
            super(request);
            this.key = request.key;
            this.value = request.value;
        } 

        /**
         * <p>The key of the tag option.</p>
         * <p>The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The value of the tag option.</p>
         * <p>The value can be up to 128 characters in length. It cannot start with <code>acs:</code>and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateTagOptionRequest build() {
            return new CreateTagOptionRequest(this);
        } 

    } 

}
