// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsForOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsForOrganizationalUnitResponseBody</p>
 */
public class ListApplicationsForOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("Applications")
    private java.util.List < Applications> applications;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationsForOrganizationalUnitResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForOrganizationalUnitResponseBody create() {
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

        public ListApplicationsForOrganizationalUnitResponseBody build() {
            return new ListApplicationsForOrganizationalUnitResponseBody(this);
        } 

    } 

    public static class Applications extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
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

        public static final class Builder {
            private String applicationId; 

            /**
             * 应用的唯一标识。
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
