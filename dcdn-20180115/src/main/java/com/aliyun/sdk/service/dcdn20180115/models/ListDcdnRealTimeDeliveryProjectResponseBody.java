// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDcdnRealTimeDeliveryProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListDcdnRealTimeDeliveryProjectResponseBody</p>
 */
public class ListDcdnRealTimeDeliveryProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDcdnRealTimeDeliveryProjectResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDcdnRealTimeDeliveryProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The configuration results of the domain name.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBody build() {
            return new ListDcdnRealTimeDeliveryProjectResponseBody(this);
        } 

    } 

    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("DataCenter")
        private String dataCenter;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SLSLogStore")
        private String SLSLogStore;

        @com.aliyun.core.annotation.NameInMap("SLSProject")
        private String SLSProject;

        @com.aliyun.core.annotation.NameInMap("SLSRegion")
        private String SLSRegion;

        @com.aliyun.core.annotation.NameInMap("SamplingRate")
        private Float samplingRate;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Projects(Builder builder) {
            this.businessType = builder.businessType;
            this.dataCenter = builder.dataCenter;
            this.domainName = builder.domainName;
            this.fieldName = builder.fieldName;
            this.projectName = builder.projectName;
            this.SLSLogStore = builder.SLSLogStore;
            this.SLSProject = builder.SLSProject;
            this.SLSRegion = builder.SLSRegion;
            this.samplingRate = builder.samplingRate;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return dataCenter
         */
        public String getDataCenter() {
            return this.dataCenter;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return SLSLogStore
         */
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        /**
         * @return SLSProject
         */
        public String getSLSProject() {
            return this.SLSProject;
        }

        /**
         * @return SLSRegion
         */
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        /**
         * @return samplingRate
         */
        public Float getSamplingRate() {
            return this.samplingRate;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String businessType; 
            private String dataCenter; 
            private String domainName; 
            private String fieldName; 
            private String projectName; 
            private String SLSLogStore; 
            private String SLSProject; 
            private String SLSRegion; 
            private Float samplingRate; 
            private String type; 

            /**
             * The type of the collected logs. Default value: cdn_log_access_l1. Valid values:
             * <p>
             * 
             * *   **cdn_log_access_l1**: access logs of DCDN POPs
             * *   **cdn_log_origin**: back-to-origin logs
             * *   **cdn_log_er**: EdgeRoutine logs
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * The region from which logs were collected.
             */
            public Builder dataCenter(String dataCenter) {
                this.dataCenter = dataCenter;
                return this;
            }

            /**
             * The domain names from which logs were collected. You can specify one or more domain names. Separate multiple domain names with commas (,).
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The name of the field. For more information about fields in real-time log entries, see [Fields in a real-time log](~~324199~~).
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The name of the Logstore.
             */
            public Builder SLSLogStore(String SLSLogStore) {
                this.SLSLogStore = SLSLogStore;
                return this;
            }

            /**
             * The name of the log file.
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * The region to which logs were delivered.
             */
            public Builder SLSRegion(String SLSRegion) {
                this.SLSRegion = SLSRegion;
                return this;
            }

            /**
             * The sampling rate.
             */
            public Builder samplingRate(Float samplingRate) {
                this.samplingRate = samplingRate;
                return this;
            }

            /**
             * The type of log delivery. Only **SLS_POST** is supported.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Projects")
        private java.util.List < Projects> projects;

        private Content(Builder builder) {
            this.projects = builder.projects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return projects
         */
        public java.util.List < Projects> getProjects() {
            return this.projects;
        }

        public static final class Builder {
            private java.util.List < Projects> projects; 

            /**
             * Projects.
             */
            public Builder projects(java.util.List < Projects> projects) {
                this.projects = projects;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
