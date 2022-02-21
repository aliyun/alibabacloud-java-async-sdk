// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceLiveUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceLiveUrlResponseBody</p>
 */
public class GetDeviceLiveUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("OutProtocol")
    private String outProtocol;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamType")
    private Long streamType;

    @NameInMap("Url")
    private String url;

    private GetDeviceLiveUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.outProtocol = builder.outProtocol;
        this.requestId = builder.requestId;
        this.streamType = builder.streamType;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceLiveUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outProtocol
     */
    public String getOutProtocol() {
        return this.outProtocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamType
     */
    public Long getStreamType() {
        return this.streamType;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String outProtocol; 
        private String requestId; 
        private Long streamType; 
        private String url; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OutProtocol.
         */
        public Builder outProtocol(String outProtocol) {
            this.outProtocol = outProtocol;
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
         * StreamType.
         */
        public Builder streamType(Long streamType) {
            this.streamType = streamType;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetDeviceLiveUrlResponseBody build() {
            return new GetDeviceLiveUrlResponseBody(this);
        } 

    } 

}
