// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseInstanceResponseBody</p>
 */
public class ReleaseInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ReleaseInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstanceResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The description of the execution result.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which can be used for troubleshooting.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A value of true indicates that the execution is complete.
         * <p>
         * 
         * A value of false indicates that an error occurs during the execution.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReleaseInstanceResponseBody build() {
            return new ReleaseInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HostId")
        private String hostId;

        @NameInMap("ReleaseResult")
        private Boolean releaseResult;

        private Data(Builder builder) {
            this.hostId = builder.hostId;
            this.releaseResult = builder.releaseResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return releaseResult
         */
        public Boolean getReleaseResult() {
            return this.releaseResult;
        }

        public static final class Builder {
            private String hostId; 
            private Boolean releaseResult; 

            /**
             * The site of the execution host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * Indicates whether the instance is released.
             */
            public Builder releaseResult(Boolean releaseResult) {
                this.releaseResult = releaseResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
