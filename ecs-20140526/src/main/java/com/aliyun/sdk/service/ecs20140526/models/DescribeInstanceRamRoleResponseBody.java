// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRamRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRamRoleResponseBody</p>
 */
public class DescribeInstanceRamRoleResponseBody extends TeaModel {
    @NameInMap("InstanceRamRoleSets")
    private InstanceRamRoleSets instanceRamRoleSets;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * Details about the instance RAM roles.
         */
        public Builder instanceRamRoleSets(InstanceRamRoleSets instanceRamRoleSets) {
            this.instanceRamRoleSets = instanceRamRoleSets;
            return this;
        }

        /**
         * The region ID of the instance RAM role.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The total number of instance RAM roles returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceRamRoleResponseBody build() {
            return new DescribeInstanceRamRoleResponseBody(this);
        } 

    } 

    public static class InstanceRamRoleSet extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RamRoleName")
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

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance RAM role.
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
    public static class InstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
        private java.util.List < InstanceRamRoleSet> instanceRamRoleSet;

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
        public java.util.List < InstanceRamRoleSet> getInstanceRamRoleSet() {
            return this.instanceRamRoleSet;
        }

        public static final class Builder {
            private java.util.List < InstanceRamRoleSet> instanceRamRoleSet; 

            /**
             * InstanceRamRoleSet.
             */
            public Builder instanceRamRoleSet(java.util.List < InstanceRamRoleSet> instanceRamRoleSet) {
                this.instanceRamRoleSet = instanceRamRoleSet;
                return this;
            }

            public InstanceRamRoleSets build() {
                return new InstanceRamRoleSets(this);
            } 

        } 

    }
}
