// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceAuthsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceAuthsResponseBody</p>
 */
public class ListServiceAuthsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("serviceAuths")
    private java.util.List < ServiceAuths> serviceAuths;

    @NameInMap("success")
    private Boolean success;

    private ListServiceAuthsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.serviceAuths = builder.serviceAuths;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceAuthsResponseBody create() {
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
     * @return serviceAuths
     */
    public java.util.List < ServiceAuths> getServiceAuths() {
        return this.serviceAuths;
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
        private java.util.List < ServiceAuths> serviceAuths; 
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
         * serviceAuths.
         */
        public Builder serviceAuths(java.util.List < ServiceAuths> serviceAuths) {
            this.serviceAuths = serviceAuths;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListServiceAuthsResponseBody build() {
            return new ListServiceAuthsResponseBody(this);
        } 

    } 

    public static class ServiceAuths extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("ownerName")
        private String ownerName;

        @NameInMap("ownerStaffId")
        private String ownerStaffId;

        @NameInMap("type")
        private String type;

        private ServiceAuths(Builder builder) {
            this.id = builder.id;
            this.ownerName = builder.ownerName;
            this.ownerStaffId = builder.ownerStaffId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceAuths create() {
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

            public ServiceAuths build() {
                return new ServiceAuths(this);
            } 

        } 

    }
}
