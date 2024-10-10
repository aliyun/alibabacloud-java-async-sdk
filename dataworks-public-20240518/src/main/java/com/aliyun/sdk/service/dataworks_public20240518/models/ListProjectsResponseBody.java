// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class AliyunResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AliyunResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunResourceTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AliyunResourceTags build() {
                return new AliyunResourceTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunResourceGroupId")
        private String aliyunResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("AliyunResourceTags")
        private java.util.List < AliyunResourceTags> aliyunResourceTags;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevEnvironmentEnabled")
        private Boolean devEnvironmentEnabled;

        @com.aliyun.core.annotation.NameInMap("DevRoleDisabled")
        private Boolean devRoleDisabled;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PaiTaskEnabled")
        private Boolean paiTaskEnabled;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Projects(Builder builder) {
            this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
            this.aliyunResourceTags = builder.aliyunResourceTags;
            this.description = builder.description;
            this.devEnvironmentEnabled = builder.devEnvironmentEnabled;
            this.devRoleDisabled = builder.devRoleDisabled;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.paiTaskEnabled = builder.paiTaskEnabled;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return aliyunResourceGroupId
         */
        public String getAliyunResourceGroupId() {
            return this.aliyunResourceGroupId;
        }

        /**
         * @return aliyunResourceTags
         */
        public java.util.List < AliyunResourceTags> getAliyunResourceTags() {
            return this.aliyunResourceTags;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return devEnvironmentEnabled
         */
        public Boolean getDevEnvironmentEnabled() {
            return this.devEnvironmentEnabled;
        }

        /**
         * @return devRoleDisabled
         */
        public Boolean getDevRoleDisabled() {
            return this.devRoleDisabled;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return paiTaskEnabled
         */
        public Boolean getPaiTaskEnabled() {
            return this.paiTaskEnabled;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aliyunResourceGroupId; 
            private java.util.List < AliyunResourceTags> aliyunResourceTags; 
            private String description; 
            private Boolean devEnvironmentEnabled; 
            private Boolean devRoleDisabled; 
            private String displayName; 
            private Long id; 
            private String name; 
            private String owner; 
            private Boolean paiTaskEnabled; 
            private String status; 

            /**
             * AliyunResourceGroupId.
             */
            public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
                this.aliyunResourceGroupId = aliyunResourceGroupId;
                return this;
            }

            /**
             * AliyunResourceTags.
             */
            public Builder aliyunResourceTags(java.util.List < AliyunResourceTags> aliyunResourceTags) {
                this.aliyunResourceTags = aliyunResourceTags;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DevEnvironmentEnabled.
             */
            public Builder devEnvironmentEnabled(Boolean devEnvironmentEnabled) {
                this.devEnvironmentEnabled = devEnvironmentEnabled;
                return this;
            }

            /**
             * DevRoleDisabled.
             */
            public Builder devRoleDisabled(Boolean devRoleDisabled) {
                this.devRoleDisabled = devRoleDisabled;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * PaiTaskEnabled.
             */
            public Builder paiTaskEnabled(Boolean paiTaskEnabled) {
                this.paiTaskEnabled = paiTaskEnabled;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Projects")
        private java.util.List < Projects> projects;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.projects = builder.projects;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return projects
         */
        public java.util.List < Projects> getProjects() {
            return this.projects;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Projects> projects; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Projects.
             */
            public Builder projects(java.util.List < Projects> projects) {
                this.projects = projects;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
