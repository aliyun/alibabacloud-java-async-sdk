// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateChatSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateChatSessionRequest</p>
 */
public class CreateChatSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<String> products;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("talkType")
    private String talkType;

    private CreateChatSessionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.products = builder.products;
        this.talkType = builder.talkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return products
     */
    public java.util.List<String> getProducts() {
        return this.products;
    }

    /**
     * @return talkType
     */
    public String getTalkType() {
        return this.talkType;
    }

    public static final class Builder extends Request.Builder<CreateChatSessionRequest, Builder> {
        private String name; 
        private java.util.List<String> products; 
        private String talkType; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatSessionRequest request) {
            super(request);
            this.name = request.name;
            this.products = request.products;
            this.talkType = request.talkType;
        } 

        /**
         * <p>The name of the chat session.</p>
         * 
         * <strong>example:</strong>
         * <p>Product consultation session</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of API products associated with the chat session.</p>
         */
        public Builder products(java.util.List<String> products) {
            this.putBodyParameter("products", products);
            this.products = products;
            return this;
        }

        /**
         * <p>The conversation type of the session. Valid values: MODEL and AGENT.</p>
         * 
         * <strong>example:</strong>
         * <p>MODEL</p>
         */
        public Builder talkType(String talkType) {
            this.putBodyParameter("talkType", talkType);
            this.talkType = talkType;
            return this;
        }

        @Override
        public CreateChatSessionRequest build() {
            return new CreateChatSessionRequest(this);
        } 

    } 

}
