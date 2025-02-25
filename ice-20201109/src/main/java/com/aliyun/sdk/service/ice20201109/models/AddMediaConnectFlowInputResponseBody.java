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
 * {@link AddMediaConnectFlowInputResponseBody} extends {@link TeaModel}
 *
 * <p>AddMediaConnectFlowInputResponseBody</p>
 */
public class AddMediaConnectFlowInputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    private AddMediaConnectFlowInputResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaConnectFlowInputResponseBody create() {
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
    public Integer getRetCode() {
        return this.retCode;
    }

    public static final class Builder {
        private Content content; 
        private String description; 
        private String requestId; 
        private Integer retCode; 

        /**
         * <p>Response body</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Description of the API call</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>11357BE8-4C54-58EA-890A-5AB646EDE4B2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned error code, 0 indicates success</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        public AddMediaConnectFlowInputResponseBody build() {
            return new AddMediaConnectFlowInputResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddMediaConnectFlowInputResponseBody} extends {@link TeaModel}
     *
     * <p>AddMediaConnectFlowInputResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputUrl")
        private String inputUrl;

        private Content(Builder builder) {
            this.inputUrl = builder.inputUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return inputUrl
         */
        public String getInputUrl() {
            return this.inputUrl;
        }

        public static final class Builder {
            private String inputUrl; 

            /**
             * <p>Input URL</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://1.2.3.4:1935/live/AliTestInput_8666ec062190f00e263012666319a5be</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
