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
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
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
        private java.util.List<Applications> applications; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationsResponseBody model) {
            this.applications = model.applications;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of applications. In the Chinese environment, the applications are sorted in descending order of group name and ascending order of application level.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
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
         * <p>The total number of applications that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("DefaultAction")
        private String defaultAction;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private java.util.List<String> protocol;

        @com.aliyun.core.annotation.NameInMap("Requirements")
        private java.util.List<String> requirements;

        @com.aliyun.core.annotation.NameInMap("Risk")
        private String risk;

        @com.aliyun.core.annotation.NameInMap("Technology")
        private String technology;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.defaultAction = builder.defaultAction;
            this.description = builder.description;
            this.groupName = builder.groupName;
            this.level = builder.level;
            this.protocol = builder.protocol;
            this.requirements = builder.requirements;
            this.risk = builder.risk;
            this.technology = builder.technology;
            this.updatedTime = builder.updatedTime;
            this.vendor = builder.vendor;
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

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return defaultAction
         */
        public String getDefaultAction() {
            return this.defaultAction;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return protocol
         */
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

        /**
         * @return requirements
         */
        public java.util.List<String> getRequirements() {
            return this.requirements;
        }

        /**
         * @return risk
         */
        public String getRisk() {
            return this.risk;
        }

        /**
         * @return technology
         */
        public String getTechnology() {
            return this.technology;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Long applicationId; 
            private String applicationName; 
            private Long categoryId; 
            private String categoryName; 
            private String defaultAction; 
            private String description; 
            private String groupName; 
            private Long level; 
            private java.util.List<String> protocol; 
            private java.util.List<String> requirements; 
            private String risk; 
            private String technology; 
            private Long updatedTime; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.defaultAction = model.defaultAction;
                this.description = model.description;
                this.groupName = model.groupName;
                this.level = model.level;
                this.protocol = model.protocol;
                this.requirements = model.requirements;
                this.risk = model.risk;
                this.technology = model.technology;
                this.updatedTime = model.updatedTime;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The application ID in the built-in application signature library.</p>
             * 
             * <strong>example:</strong>
             * <p>10012150000</p>
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The application name. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The application category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The application category name. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Office collaboration</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The default action for the application in the built-in application library. The value is fixed as Alert (Monitor).</p>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
             */
            public Builder defaultAction(String defaultAction) {
                this.defaultAction = defaultAction;
                return this;
            }

            /**
             * <p>The application description. The description is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>An enterprise-grade intelligent mobile office and collaboration platform that provides features such as instant messaging, audio and video conferencing, organizational management, online documents, approval and attendance, and AI office assistants</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The application group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Dingtalk</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The level value of the application. The value is obtained from the built-in application signature library and used for list sorting.</p>
             * 
             * <strong>example:</strong>
             * <p>700</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The list of protocols used by the application.</p>
             */
            public Builder protocol(java.util.List<String> protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The list of detection prerequisites for the application.</p>
             */
            public Builder requirements(java.util.List<String> requirements) {
                this.requirements = requirements;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>Information</strong>: Informational.</li>
             * <li><strong>Low</strong>: Low.</li>
             * <li><strong>Medium</strong>: Medium.</li>
             * <li><strong>High</strong>: High.</li>
             * <li><strong>Critical</strong>: Critical.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Low</p>
             */
            public Builder risk(String risk) {
                this.risk = risk;
                return this;
            }

            /**
             * <p>The technology type name. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Browser-based</p>
             */
            public Builder technology(String technology) {
                this.technology = technology;
                return this;
            }

            /**
             * <p>The last update time of the application information. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731465600</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The application vendor name. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk Technology Co., Ltd</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
