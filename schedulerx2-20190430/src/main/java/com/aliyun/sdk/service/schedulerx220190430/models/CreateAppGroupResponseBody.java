// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppGroupResponseBody</p>
 */
public class CreateAppGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateAppGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the job group.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned only if an error occurs.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the application is created. Valid values:
         * <p>
         * 
         * *   **true**: The application is created.
         * *   **false**: Failed to create the application.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAppGroupResponseBody build() {
            return new CreateAppGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppGroupId")
        private Long appGroupId;

        @NameInMap("AppKey")
        private String appKey;

        private Data(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appKey = builder.appKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        public static final class Builder {
            private Long appGroupId; 
            private String appKey; 

            /**
             * The ID of the job group.
             */
            public Builder appGroupId(Long appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * The AppKey for the application.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
