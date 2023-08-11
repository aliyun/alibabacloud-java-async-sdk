// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceCredentialsResponseBody</p>
 */
public class ListServiceCredentialsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("serviceCredentials")
    private java.util.List < ServiceCredentials> serviceCredentials;

    @NameInMap("success")
    private Boolean success;

    private ListServiceCredentialsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.serviceCredentials = builder.serviceCredentials;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceCredentialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceCredentials
     */
    public java.util.List < ServiceCredentials> getServiceCredentials() {
        return this.serviceCredentials;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < ServiceCredentials> serviceCredentials; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * serviceCredentials.
         */
        public Builder serviceCredentials(java.util.List < ServiceCredentials> serviceCredentials) {
            this.serviceCredentials = serviceCredentials;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListServiceCredentialsResponseBody build() {
            return new ListServiceCredentialsResponseBody(this);
        } 

    } 

    public static class ServiceCredentials extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("ownerName")
        private String ownerName;

        @NameInMap("ownerStaffId")
        private String ownerStaffId;

        @NameInMap("type")
        private String type;

        private ServiceCredentials(Builder builder) {
            this.id = builder.id;
            this.ownerName = builder.ownerName;
            this.ownerStaffId = builder.ownerStaffId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceCredentials create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerStaffId
         */
        public String getOwnerStaffId() {
            return this.ownerStaffId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String ownerName; 
            private String ownerStaffId; 
            private String type; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ownerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * ownerStaffId.
             */
            public Builder ownerStaffId(String ownerStaffId) {
                this.ownerStaffId = ownerStaffId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ServiceCredentials build() {
                return new ServiceCredentials(this);
            } 

        } 

    }
}
