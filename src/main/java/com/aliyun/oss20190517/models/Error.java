// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Error} extends {@link TeaModel}
 *
 * <p>Error</p>
 */
public class Error extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("HostId")
    private String hostId;


    private Error(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.hostId = builder.hostId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Error create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String code() {
        return this.code;
    }

    /**
     * @return message
     */
    public String message() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * @return hostId
     */
    public String hostId() {
        return this.hostId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String hostId; 

        /**
         * <p>The error code that OSS returns to the user</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed error message provided by OSS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID that uniquely identifies a request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the host in the accessed OSS cluster</p>
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        public Error build() {
            return new Error(this);
        } 

    } 

}
