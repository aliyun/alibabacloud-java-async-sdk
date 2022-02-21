// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("InstanceRamRoleSets")
    private InstanceRamRoleSets instanceRamRoleSets;

    private DescribeInstanceRamRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.regionId = builder.regionId;
        this.instanceRamRoleSets = builder.instanceRamRoleSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRamRoleResponseBody create() {
        return builder().build();
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceRamRoleSets
     */
    public InstanceRamRoleSets getInstanceRamRoleSets() {
        return this.instanceRamRoleSets;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private String regionId; 
        private InstanceRamRoleSets instanceRamRoleSets; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of RAM roles returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The region of the instance RAM role.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * A set of information consisting of instance RAM role types InstanceRamRoleSet.
         */
        public Builder instanceRamRoleSets(InstanceRamRoleSets instanceRamRoleSets) {
            this.instanceRamRoleSets = instanceRamRoleSets;
            return this;
        }

        public DescribeInstanceRamRoleResponseBody build() {
            return new DescribeInstanceRamRoleResponseBody(this);
        } 

    } 

    public static class InstanceRamRoleSet extends TeaModel {
        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("InstanceId")
        private String instanceId;

        private InstanceRamRoleSet(Builder builder) {
            this.ramRoleName = builder.ramRoleName;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRamRoleSet create() {
            return builder().build();
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String ramRoleName; 
            private String instanceId; 

            /**
             * The list of instance RAM role names.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
