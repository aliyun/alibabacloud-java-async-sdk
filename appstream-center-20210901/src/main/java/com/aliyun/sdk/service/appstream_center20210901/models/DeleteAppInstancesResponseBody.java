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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteAppInstancesResponseBody model) {
            this.deleteAppInstanceModels = model.deleteAppInstanceModels;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder deleteAppInstanceModels(java.util.List<DeleteAppInstanceModels> deleteAppInstanceModels) {
            this.deleteAppInstanceModels = deleteAppInstanceModels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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

            private Builder() {
            } 

            private Builder(DeleteAppInstanceModels model) {
                this.appInstanceId = model.appInstanceId;
                this.code = model.code;
                this.message = model.message;
                this.success = model.success;
            } 

            /**
             * <p>The ID of the application instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-gbuea*****</p>
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.ProductType</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The parameter ProductType is invalid.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Specifies whether the application instance is deleted.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
