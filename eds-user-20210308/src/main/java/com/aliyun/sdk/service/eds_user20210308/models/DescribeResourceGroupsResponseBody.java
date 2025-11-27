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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68BA1DF7-8814-5AED-B844-F8F7F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource groups.</p>
         */
        public Builder resourceGroup(java.util.List<ResourceGroup> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The total number of resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-a8jnatl8kjasb***</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Specifies whether to use the default policy.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The policy name.</p>
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
             * <p>The ID of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>t-asdzx0mbjhg***</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the scheduled task.</p>
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
             * <p>The number of administrators that are authorized to access the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authCount(String authCount) {
                this.authCount = authCount;
                return this;
            }

            /**
             * <p>The time when the resource group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-29T17:25:40.000000000Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <blockquote>
             * <p> The policy that is associated with the resource group.</p>
             * </blockquote>
             * <ul>
             * <li><p>The policy applies to cloud computers in the resource group. If multiple policies exist, they are enforced in order of priority.</p>
             * </li>
             * <li><p>If any of these cloud computers are already associated with other policies, the resource group&quot;s policy takes precedence.</p>
             * </li>
             * </ul>
             */
            public Builder policies(java.util.List<Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The number of resources in the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>119</p>
             */
            public Builder resourceCount(String resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-cyo0il2pzge1***</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <blockquote>
             * <p> The associated scheduled task.</p>
             * </blockquote>
             * <ul>
             * <li>The scheduled task applies to all cloud computers in the resource group. If any of these cloud computers are already associated with other scheduled tasks, the resource group&quot;s scheduled task takes precedence.</li>
             * </ul>
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
