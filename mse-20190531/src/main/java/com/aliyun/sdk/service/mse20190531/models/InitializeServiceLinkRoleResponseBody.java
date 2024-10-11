// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InitializeServiceLinkRoleResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeServiceLinkRoleResponseBody</p>
 */
public class InitializeServiceLinkRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InitializeServiceLinkRoleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeServiceLinkRoleResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
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

        public InitializeServiceLinkRoleResponseBody build() {
            return new InitializeServiceLinkRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitializeServiceLinkRoleResponseBody} extends {@link TeaModel}
     *
     * <p>InitializeServiceLinkRoleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequiredPermission")
        private String requiredPermission;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private Data(Builder builder) {
            this.requiredPermission = builder.requiredPermission;
            this.roleName = builder.roleName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return requiredPermission
         */
        public String getRequiredPermission() {
            return this.requiredPermission;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String requiredPermission; 
            private String roleName; 
            private String serviceName; 

            /**
             * RequiredPermission.
             */
            public Builder requiredPermission(String requiredPermission) {
                this.requiredPermission = requiredPermission;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
