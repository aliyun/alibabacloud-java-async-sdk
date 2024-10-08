// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudServiceOrganizationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudServiceOrganizationStatusResponseBody</p>
 */
public class DescribeCloudServiceOrganizationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCloudServiceOrganizationStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudServiceOrganizationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudServiceOrganizationStatusResponseBody build() {
            return new DescribeCloudServiceOrganizationStatusResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantPrivilegeUrl")
        private String grantPrivilegeUrl;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("ServiceOpenStatus")
        private Boolean serviceOpenStatus;

        @com.aliyun.core.annotation.NameInMap("ServiceOpenUrl")
        private String serviceOpenUrl;

        @com.aliyun.core.annotation.NameInMap("ServicePrivilegeStatus")
        private Boolean servicePrivilegeStatus;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        private Result(Builder builder) {
            this.grantPrivilegeUrl = builder.grantPrivilegeUrl;
            this.organizationId = builder.organizationId;
            this.serviceOpenStatus = builder.serviceOpenStatus;
            this.serviceOpenUrl = builder.serviceOpenUrl;
            this.servicePrivilegeStatus = builder.servicePrivilegeStatus;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return grantPrivilegeUrl
         */
        public String getGrantPrivilegeUrl() {
            return this.grantPrivilegeUrl;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return serviceOpenStatus
         */
        public Boolean getServiceOpenStatus() {
            return this.serviceOpenStatus;
        }

        /**
         * @return serviceOpenUrl
         */
        public String getServiceOpenUrl() {
            return this.serviceOpenUrl;
        }

        /**
         * @return servicePrivilegeStatus
         */
        public Boolean getServicePrivilegeStatus() {
            return this.servicePrivilegeStatus;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private String grantPrivilegeUrl; 
            private String organizationId; 
            private Boolean serviceOpenStatus; 
            private String serviceOpenUrl; 
            private Boolean servicePrivilegeStatus; 
            private String serviceType; 

            /**
             * GrantPrivilegeUrl.
             */
            public Builder grantPrivilegeUrl(String grantPrivilegeUrl) {
                this.grantPrivilegeUrl = grantPrivilegeUrl;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * ServiceOpenStatus.
             */
            public Builder serviceOpenStatus(Boolean serviceOpenStatus) {
                this.serviceOpenStatus = serviceOpenStatus;
                return this;
            }

            /**
             * ServiceOpenUrl.
             */
            public Builder serviceOpenUrl(String serviceOpenUrl) {
                this.serviceOpenUrl = serviceOpenUrl;
                return this;
            }

            /**
             * ServicePrivilegeStatus.
             */
            public Builder servicePrivilegeStatus(Boolean servicePrivilegeStatus) {
                this.servicePrivilegeStatus = servicePrivilegeStatus;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
