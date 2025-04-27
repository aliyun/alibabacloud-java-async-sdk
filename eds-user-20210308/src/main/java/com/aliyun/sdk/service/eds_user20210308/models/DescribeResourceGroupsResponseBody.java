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
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Timers(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timers create() {
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

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Timers model) {
                this.id = model.id;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
                this.authCount = model.authCount;
                this.createTime = model.createTime;
                this.policies = model.policies;
                this.resourceCount = model.resourceCount;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.timers = model.timers;
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
