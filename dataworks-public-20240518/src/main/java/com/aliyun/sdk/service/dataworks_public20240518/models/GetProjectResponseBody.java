// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Project")
    private Project project;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProjectResponseBody(Builder builder) {
        this.project = builder.project;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return project
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Project project; 
        private String requestId; 

        /**
         * Project.
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
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
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class Project extends TeaModel {
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

        private Project(Builder builder) {
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

        public static Project create() {
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

            public Project build() {
                return new Project(this);
            } 

        } 

    }
}
