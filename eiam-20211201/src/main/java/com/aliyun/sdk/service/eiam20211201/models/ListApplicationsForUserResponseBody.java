// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsForUserResponseBody</p>
 */
public class ListApplicationsForUserResponseBody extends TeaModel {
    @NameInMap("Applications")
    private java.util.List < Applications> applications;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationsForUserResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return applications
     */
    public java.util.List < Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Applications> applications; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Applications.
         */
        public Builder applications(java.util.List < Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 列表总条数目。
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsForUserResponseBody build() {
            return new ListApplicationsForUserResponseBody(this);
        } 

    } 

    public static class Applications extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("HasDirectAuthorization")
        private Boolean hasDirectAuthorization;

        @NameInMap("HasInheritAuthorization")
        private Boolean hasInheritAuthorization;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.hasDirectAuthorization = builder.hasDirectAuthorization;
            this.hasInheritAuthorization = builder.hasInheritAuthorization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return hasDirectAuthorization
         */
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        /**
         * @return hasInheritAuthorization
         */
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
        }

        public static final class Builder {
            private String applicationId; 
            private Boolean hasDirectAuthorization; 
            private Boolean hasInheritAuthorization; 

            /**
             * 应用的唯一标识。
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * 直接分配给当前用户的权限，视为直接授权。
             */
            public Builder hasDirectAuthorization(Boolean hasDirectAuthorization) {
                this.hasDirectAuthorization = hasDirectAuthorization;
                return this;
            }

            /**
             * 通过用户隶属的组织、组获取的权限，视为继承权限。
             */
            public Builder hasInheritAuthorization(Boolean hasInheritAuthorization) {
                this.hasInheritAuthorization = hasInheritAuthorization;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
