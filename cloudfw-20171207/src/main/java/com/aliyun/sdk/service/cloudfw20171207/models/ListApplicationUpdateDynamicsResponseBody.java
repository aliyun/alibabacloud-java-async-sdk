// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ListApplicationUpdateDynamicsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationUpdateDynamicsResponseBody</p>
 */
public class ListApplicationUpdateDynamicsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dynamics")
    private java.util.List<Dynamics> dynamics;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationUpdateDynamicsResponseBody(Builder builder) {
        this.dynamics = builder.dynamics;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationUpdateDynamicsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamics
     */
    public java.util.List<Dynamics> getDynamics() {
        return this.dynamics;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
        private java.util.List<Dynamics> dynamics; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationUpdateDynamicsResponseBody model) {
            this.dynamics = model.dynamics;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of update records for the application signature library, sorted in descending order of update time.</p>
         */
        public Builder dynamics(java.util.List<Dynamics> dynamics) {
            this.dynamics = dynamics;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of update records that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationUpdateDynamicsResponseBody build() {
            return new ListApplicationUpdateDynamicsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationUpdateDynamicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationUpdateDynamicsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
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
        public Long getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        public static final class Builder {
            private Long applicationId; 
            private String applicationName; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
            } 

            /**
             * <p>The ID of the application in the built-in application signature library.</p>
             * 
             * <strong>example:</strong>
             * <p>10012150000</p>
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The name of the application. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationUpdateDynamicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationUpdateDynamicsResponseBody</p>
     */
    public static class Dynamics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List<Applications> applications;

        @com.aliyun.core.annotation.NameInMap("DynamicInfo")
        private String dynamicInfo;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Dynamics(Builder builder) {
            this.applications = builder.applications;
            this.dynamicInfo = builder.dynamicInfo;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dynamics create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<Applications> getApplications() {
            return this.applications;
        }

        /**
         * @return dynamicInfo
         */
        public String getDynamicInfo() {
            return this.dynamicInfo;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<Applications> applications; 
            private String dynamicInfo; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Dynamics model) {
                this.applications = model.applications;
                this.dynamicInfo = model.dynamicInfo;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The list of applications added or updated in this update.</p>
             */
            public Builder applications(java.util.List<Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The update description. The description is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Added 1 application signature library, such as DingTalk</p>
             */
            public Builder dynamicInfo(String dynamicInfo) {
                this.dynamicInfo = dynamicInfo;
                return this;
            }

            /**
             * <p>The time when the signature library was updated. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731465600</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Dynamics build() {
                return new Dynamics(this);
            } 

        } 

    }
}
