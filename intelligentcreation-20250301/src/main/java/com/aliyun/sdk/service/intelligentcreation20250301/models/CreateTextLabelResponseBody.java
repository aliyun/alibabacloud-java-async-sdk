// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20250301.models;

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
 * {@link CreateTextLabelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTextLabelResponseBody</p>
 */
public class CreateTextLabelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tokens")
    private String tokens;

    private CreateTextLabelResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.tokens = builder.tokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTextLabelResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokens
     */
    public String getTokens() {
        return this.tokens;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 
        private String tokens; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tokens.
         */
        public Builder tokens(String tokens) {
            this.tokens = tokens;
            return this;
        }

        public CreateTextLabelResponseBody build() {
            return new CreateTextLabelResponseBody(this);
        } 

    } 

}
