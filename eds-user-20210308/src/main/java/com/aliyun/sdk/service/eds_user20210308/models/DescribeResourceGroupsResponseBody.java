// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceGroupsResponseBody</p>
 */
public class DescribeResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private java.util.List<ResourceGroup> resourceGroup;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeResourceGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroup = builder.resourceGroup;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroup
     */
    public java.util.List<ResourceGroup> getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourceGroup> resourceGroup; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeResourceGroupsResponseBody model) {
            this.requestId = model.requestId;
            this.resourceGroup = model.resourceGroup;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroup.
         */
        public Builder resourceGroup(java.util.List<ResourceGroup> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeResourceGroupsResponseBody build() {
            return new DescribeResourceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceGroupsResponseBody</p>
     */
    public static class AppRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private AppRules(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppRules create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(AppRules model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
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
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public AppRules build() {
                return new AppRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceGroupsResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Policies(Builder builder) {
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private Boolean isDefault; 
            private String name; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.id = model.id;
                this.isDefault = model.isDefault;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceGroupsResponseBody</p>
     */
    public static class Timers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindStatus")
        private String bindStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TimerStatus")
        private String timerStatus;

        private Timers(Builder builder) {
            this.bindStatus = builder.bindStatus;
            this.id = builder.id;
            this.name = builder.name;
            this.timerStatus = builder.timerStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timers create() {
            return builder().build();
        }

        /**
         * @return bindStatus
         */
        public String getBindStatus() {
            return this.bindStatus;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return timerStatus
         */
        public String getTimerStatus() {
            return this.timerStatus;
        }

        public static final class Builder {
            private String bindStatus; 
            private String id; 
            private String name; 
            private String timerStatus; 

            private Builder() {
            } 

            private Builder(Timers model) {
                this.bindStatus = model.bindStatus;
                this.id = model.id;
                this.name = model.name;
                this.timerStatus = model.timerStatus;
            } 

            /**
             * BindStatus.
             */
            public Builder bindStatus(String bindStatus) {
                this.bindStatus = bindStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
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
             * TimerStatus.
             */
            public Builder timerStatus(String timerStatus) {
                this.timerStatus = timerStatus;
                return this;
            }

            public Timers build() {
                return new Timers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceGroupsResponseBody</p>
     */
    public static class ResourceGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppRules")
        private java.util.List<AppRules> appRules;

        @com.aliyun.core.annotation.NameInMap("AuthCount")
        private String authCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List<Policies> policies;

        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private String resourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("Timers")
        private java.util.List<Timers> timers;

        private ResourceGroup(Builder builder) {
            this.appRules = builder.appRules;
            this.authCount = builder.authCount;
            this.createTime = builder.createTime;
            this.policies = builder.policies;
            this.resourceCount = builder.resourceCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.timers = builder.timers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroup create() {
            return builder().build();
        }

        /**
         * @return appRules
         */
        public java.util.List<AppRules> getAppRules() {
            return this.appRules;
        }

        /**
         * @return authCount
         */
        public String getAuthCount() {
            return this.authCount;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return policies
         */
        public java.util.List<Policies> getPolicies() {
            return this.policies;
        }

        /**
         * @return resourceCount
         */
        public String getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return timers
         */
        public java.util.List<Timers> getTimers() {
            return this.timers;
        }

        public static final class Builder {
            private java.util.List<AppRules> appRules; 
            private String authCount; 
            private String createTime; 
            private java.util.List<Policies> policies; 
            private String resourceCount; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private java.util.List<Timers> timers; 

            private Builder() {
            } 

            private Builder(ResourceGroup model) {
                this.appRules = model.appRules;
                this.authCount = model.authCount;
                this.createTime = model.createTime;
                this.policies = model.policies;
                this.resourceCount = model.resourceCount;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.timers = model.timers;
            } 

            /**
             * AppRules.
             */
            public Builder appRules(java.util.List<AppRules> appRules) {
                this.appRules = appRules;
                return this;
            }

            /**
             * AuthCount.
             */
            public Builder authCount(String authCount) {
                this.authCount = authCount;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Policies.
             */
            public Builder policies(java.util.List<Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(String resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * Timers.
             */
            public Builder timers(java.util.List<Timers> timers) {
                this.timers = timers;
                return this;
            }

            public ResourceGroup build() {
                return new ResourceGroup(this);
            } 

        } 

    }
}
