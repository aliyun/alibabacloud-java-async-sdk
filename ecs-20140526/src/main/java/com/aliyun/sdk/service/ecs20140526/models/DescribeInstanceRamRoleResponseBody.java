// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceRamRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRamRoleResponseBody</p>
 */
public class DescribeInstanceRamRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRamRoleSets")
    private InstanceRamRoleSets instanceRamRoleSets;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceRamRoleResponseBody(Builder builder) {
        this.instanceRamRoleSets = builder.instanceRamRoleSets;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRamRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceRamRoleSets
     */
    public InstanceRamRoleSets getInstanceRamRoleSets() {
        return this.instanceRamRoleSets;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private InstanceRamRoleSets instanceRamRoleSets; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeInstanceRamRoleResponseBody model) {
            this.instanceRamRoleSets = model.instanceRamRoleSets;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The IDs of the ECS instances and the names of the corresponding instance RAM roles.</p>
         */
        public Builder instanceRamRoleSets(InstanceRamRoleSets instanceRamRoleSets) {
            this.instanceRamRoleSets = instanceRamRoleSets;
            return this;
        }

        /**
         * <p>The region ID of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of ECS instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceRamRoleResponseBody build() {
            return new DescribeInstanceRamRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRamRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRamRoleResponseBody</p>
     */
    public static class InstanceRamRoleSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        private InstanceRamRoleSet(Builder builder) {
            this.instanceId = builder.instanceId;
            this.ramRoleName = builder.ramRoleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRamRoleSet create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public static final class Builder {
            private String instanceId; 
            private String ramRoleName; 

            private Builder() {
            } 

            private Builder(InstanceRamRoleSet model) {
                this.instanceId = model.instanceId;
                this.ramRoleName = model.ramRoleName;
            } 

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4p****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsServiceRole-EcsDocGuideTest</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            public InstanceRamRoleSet build() {
                return new InstanceRamRoleSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceRamRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRamRoleResponseBody</p>
     */
    public static class InstanceRamRoleSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceRamRoleSet")
        private java.util.List<InstanceRamRoleSet> instanceRamRoleSet;

        private InstanceRamRoleSets(Builder builder) {
            this.instanceRamRoleSet = builder.instanceRamRoleSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRamRoleSets create() {
            return builder().build();
        }

        /**
         * @return instanceRamRoleSet
         */
        public java.util.List<InstanceRamRoleSet> getInstanceRamRoleSet() {
            return this.instanceRamRoleSet;
        }

        public static final class Builder {
            private java.util.List<InstanceRamRoleSet> instanceRamRoleSet; 

            private Builder() {
            } 

            private Builder(InstanceRamRoleSets model) {
                this.instanceRamRoleSet = model.instanceRamRoleSet;
            } 

            /**
             * InstanceRamRoleSet.
             */
            public Builder instanceRamRoleSet(java.util.List<InstanceRamRoleSet> instanceRamRoleSet) {
                this.instanceRamRoleSet = instanceRamRoleSet;
                return this;
            }

            public InstanceRamRoleSets build() {
                return new InstanceRamRoleSets(this);
            } 

        } 

    }
}
