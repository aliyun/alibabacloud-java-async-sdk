// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTargetResponseBody</p>
 */
public class DescribeTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Targets")
    private java.util.List<Targets> targets;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
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
        private java.util.List<Targets> targets; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTargetResponseBody model) {
            this.requestId = model.requestId;
            this.targets = model.targets;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the server.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.targets = targets;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTargetResponseBody build() {
            return new DescribeTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTargetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTargetResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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

            private Builder() {
            } 

            private Builder(Targets model) {
                this.flag = model.flag;
                this.target = model.target;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The flag that is added to the server. This parameter can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>del</p>
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The UUID of the server or the ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>5c5f0169-3527-40a2-b5ff-0bc1db8f****</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <ul>
             * <li><strong>uuid</strong>: a server</li>
             * <li><strong>groupId</strong>: a server group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>uuid</p>
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
