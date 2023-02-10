// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTargetResponseBody</p>
 */
public class DescribeTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Targets")
    private java.util.List < Targets> targets;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targets = builder.targets;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targets
     */
    public java.util.List < Targets> getTargets() {
        return this.targets;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Targets> targets; 
        private Integer totalCount; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the servers.
         */
        public Builder targets(java.util.List < Targets> targets) {
            this.targets = targets;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTargetResponseBody build() {
            return new DescribeTargetResponseBody(this);
        } 

    } 

    public static class Targets extends TeaModel {
        @NameInMap("Flag")
        private String flag;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private Targets(Builder builder) {
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * The tag that is added to the server. This parameter can be empty.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The UUID of the server or the ID of the server group.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The condition by which vulnerability scan is enabled for the server. Valid values:
             * <p>
             * 
             * *   **uuid**: the UUID of the server
             * *   **groupId**: the ID of the server group
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
