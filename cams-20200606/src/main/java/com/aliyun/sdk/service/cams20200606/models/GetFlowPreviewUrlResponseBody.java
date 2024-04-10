// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowPreviewUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowPreviewUrlResponseBody</p>
 */
public class GetFlowPreviewUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetFlowPreviewUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowPreviewUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * If OK is returned, the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFlowPreviewUrlResponseBody build() {
            return new GetFlowPreviewUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        @NameInMap("PreviewUrlExpires")
        private Long previewUrlExpires;

        private Data(Builder builder) {
            this.flowId = builder.flowId;
            this.previewUrl = builder.previewUrl;
            this.previewUrlExpires = builder.previewUrlExpires;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return previewUrlExpires
         */
        public Long getPreviewUrlExpires() {
            return this.previewUrlExpires;
        }

        public static final class Builder {
            private String flowId; 
            private String previewUrl; 
            private Long previewUrlExpires; 

            /**
             * The Flow ID.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * The temporary preview URL.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * The time when the preview URL expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder previewUrlExpires(Long previewUrlExpires) {
                this.previewUrlExpires = previewUrlExpires;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
