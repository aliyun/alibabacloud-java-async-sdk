// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AddMediaConnectFlowOutputResponseBody} extends {@link TeaModel}
 *
 * <p>AddMediaConnectFlowOutputResponseBody</p>
 */
public class AddMediaConnectFlowOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private String retCode;

    private AddMediaConnectFlowOutputResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaConnectFlowOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public String getRetCode() {
        return this.retCode;
    }

    public static final class Builder {
        private Content content; 
        private String description; 
        private String requestId; 
        private String retCode; 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * RetCode.
         */
        public Builder retCode(String retCode) {
            this.retCode = retCode;
            return this;
        }

        public AddMediaConnectFlowOutputResponseBody build() {
            return new AddMediaConnectFlowOutputResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddMediaConnectFlowOutputResponseBody} extends {@link TeaModel}
     *
     * <p>AddMediaConnectFlowOutputResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        private Content(Builder builder) {
            this.outputUrl = builder.outputUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public static final class Builder {
            private String outputUrl; 

            /**
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
