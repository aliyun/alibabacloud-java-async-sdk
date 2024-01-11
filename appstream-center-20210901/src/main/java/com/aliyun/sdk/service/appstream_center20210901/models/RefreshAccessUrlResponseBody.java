// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAccessUrlResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshAccessUrlResponseBody</p>
 */
public class RefreshAccessUrlResponseBody extends TeaModel {
    @NameInMap("AccessUrl")
    private String accessUrl;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private RefreshAccessUrlResponseBody(Builder builder) {
        this.accessUrl = builder.accessUrl;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAccessUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessUrl
     */
    public String getAccessUrl() {
        return this.accessUrl;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessUrl; 
        private String code; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * AccessUrl.
         */
        public Builder accessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }

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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public RefreshAccessUrlResponseBody build() {
            return new RefreshAccessUrlResponseBody(this);
        } 

    } 

}
