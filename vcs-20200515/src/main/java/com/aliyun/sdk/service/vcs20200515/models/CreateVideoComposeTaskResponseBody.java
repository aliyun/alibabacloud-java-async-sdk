// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoComposeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVideoComposeTaskResponseBody</p>
 */
public class CreateVideoComposeTaskResponseBody extends TeaModel {
    @NameInMap("BucketName")
    private String bucketName;

    @NameInMap("Code")
    private String code;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateVideoComposeTaskResponseBody(Builder builder) {
        this.bucketName = builder.bucketName;
        this.code = builder.code;
        this.domainName = builder.domainName;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoComposeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
        private String bucketName; 
        private String code; 
        private String domainName; 
        private String message; 
        private String requestId; 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVideoComposeTaskResponseBody build() {
            return new CreateVideoComposeTaskResponseBody(this);
        } 

    } 

}
