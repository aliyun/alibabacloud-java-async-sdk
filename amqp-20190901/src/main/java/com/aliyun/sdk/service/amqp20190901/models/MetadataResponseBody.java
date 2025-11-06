// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link MetadataResponseBody} extends {@link TeaModel}
 *
 * <p>MetadataResponseBody</p>
 */
public class MetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MetadataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetadataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(MetadataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MetadataResponseBody build() {
            return new MetadataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MetadataResponseBody} extends {@link TeaModel}
     *
     * <p>MetadataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("HasPretendPermission")
        private Boolean hasPretendPermission;

        @com.aliyun.core.annotation.NameInMap("InternalEndpoint")
        private String internalEndpoint;

        @com.aliyun.core.annotation.NameInMap("PretendUserId")
        private String pretendUserId;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private Integer userStatus;

        private Data(Builder builder) {
            this.endpoint = builder.endpoint;
            this.hasPretendPermission = builder.hasPretendPermission;
            this.internalEndpoint = builder.internalEndpoint;
            this.pretendUserId = builder.pretendUserId;
            this.userStatus = builder.userStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return hasPretendPermission
         */
        public Boolean getHasPretendPermission() {
            return this.hasPretendPermission;
        }

        /**
         * @return internalEndpoint
         */
        public String getInternalEndpoint() {
            return this.internalEndpoint;
        }

        /**
         * @return pretendUserId
         */
        public String getPretendUserId() {
            return this.pretendUserId;
        }

        /**
         * @return userStatus
         */
        public Integer getUserStatus() {
            return this.userStatus;
        }

        public static final class Builder {
            private String endpoint; 
            private Boolean hasPretendPermission; 
            private String internalEndpoint; 
            private String pretendUserId; 
            private Integer userStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endpoint = model.endpoint;
                this.hasPretendPermission = model.hasPretendPermission;
                this.internalEndpoint = model.internalEndpoint;
                this.pretendUserId = model.pretendUserId;
                this.userStatus = model.userStatus;
            } 

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * HasPretendPermission.
             */
            public Builder hasPretendPermission(Boolean hasPretendPermission) {
                this.hasPretendPermission = hasPretendPermission;
                return this;
            }

            /**
             * InternalEndpoint.
             */
            public Builder internalEndpoint(String internalEndpoint) {
                this.internalEndpoint = internalEndpoint;
                return this;
            }

            /**
             * PretendUserId.
             */
            public Builder pretendUserId(String pretendUserId) {
                this.pretendUserId = pretendUserId;
                return this;
            }

            /**
             * UserStatus.
             */
            public Builder userStatus(Integer userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
