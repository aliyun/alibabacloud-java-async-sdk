// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link CheckDirectSendMessageSampleRequest} extends {@link RequestModel}
 *
 * <p>CheckDirectSendMessageSampleRequest</p>
 */
public class CheckDirectSendMessageSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interactive")
    private java.util.Map<String, ?> interactive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    private java.util.Map<String, ?> text;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CheckDirectSendMessageSampleRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.interactive = builder.interactive;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDirectSendMessageSampleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return interactive
     */
    public java.util.Map<String, ?> getInteractive() {
        return this.interactive;
    }

    /**
     * @return text
     */
    public java.util.Map<String, ?> getText() {
        return this.text;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CheckDirectSendMessageSampleRequest, Builder> {
        private String custSpaceId; 
        private java.util.Map<String, ?> interactive; 
        private java.util.Map<String, ?> text; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CheckDirectSendMessageSampleRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.interactive = request.interactive;
            this.text = request.text;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-xx**</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * Interactive.
         */
        public Builder interactive(java.util.Map<String, ?> interactive) {
            String interactiveShrink = shrink(interactive, "Interactive", "json");
            this.putQueryParameter("Interactive", interactiveShrink);
            this.interactive = interactive;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(java.util.Map<String, ?> text) {
            String textShrink = shrink(text, "Text", "json");
            this.putQueryParameter("Text", textShrink);
            this.text = text;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CheckDirectSendMessageSampleRequest build() {
            return new CheckDirectSendMessageSampleRequest(this);
        } 

    } 

}
