// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DeleteAppInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAppInstancesResponseBody</p>
 */
public class DeleteAppInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeleteAppInstanceModels")
    private java.util.List<DeleteAppInstanceModels> deleteAppInstanceModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAppInstancesResponseBody(Builder builder) {
        this.deleteAppInstanceModels = builder.deleteAppInstanceModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleteAppInstanceModels
     */
    public java.util.List<DeleteAppInstanceModels> getDeleteAppInstanceModels() {
        return this.deleteAppInstanceModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DeleteAppInstanceModels> deleteAppInstanceModels; 
        private String requestId; 

        /**
         * DeleteAppInstanceModels.
         */
        public Builder deleteAppInstanceModels(java.util.List<DeleteAppInstanceModels> deleteAppInstanceModels) {
            this.deleteAppInstanceModels = deleteAppInstanceModels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAppInstancesResponseBody build() {
            return new DeleteAppInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAppInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteAppInstancesResponseBody</p>
     */
    public static class DeleteAppInstanceModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private DeleteAppInstanceModels(Builder builder) {
            this.appInstanceId = builder.appInstanceId;
            this.code = builder.code;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteAppInstanceModels create() {
            return builder().build();
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
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
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String appInstanceId; 
            private String code; 
            private String message; 
            private Boolean success; 

            /**
             * AppInstanceId.
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public DeleteAppInstanceModels build() {
                return new DeleteAppInstanceModels(this);
            } 

        } 

    }
}
