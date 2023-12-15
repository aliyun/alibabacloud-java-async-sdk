// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudServiceTypeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudServiceTypeStatusResponseBody</p>
 */
public class DescribeCloudServiceTypeStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeCloudServiceTypeStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudServiceTypeStatusResponseBody create() {
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
    public Result getResult() {
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
        private Result result; 
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
        public Builder result(Result result) {
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

        public DescribeCloudServiceTypeStatusResponseBody build() {
            return new DescribeCloudServiceTypeStatusResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("GrantPrivilegeUrl")
        private String grantPrivilegeUrl;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("ServiceOpenStatus")
        private Boolean serviceOpenStatus;

        @NameInMap("ServiceOpenUrl")
        private String serviceOpenUrl;

        @NameInMap("ServicePrivilegeStatus")
        private Boolean servicePrivilegeStatus;

        @NameInMap("ServiceType")
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
