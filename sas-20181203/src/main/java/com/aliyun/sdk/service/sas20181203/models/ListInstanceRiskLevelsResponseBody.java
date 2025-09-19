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
 * {@link ListInstanceRiskLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceRiskLevelsResponseBody</p>
 */
public class ListInstanceRiskLevelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRiskLevels")
    private java.util.List<InstanceRiskLevels> instanceRiskLevels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstanceRiskLevelsResponseBody(Builder builder) {
        this.instanceRiskLevels = builder.instanceRiskLevels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRiskLevelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceRiskLevels
     */
    public java.util.List<InstanceRiskLevels> getInstanceRiskLevels() {
        return this.instanceRiskLevels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceRiskLevels> instanceRiskLevels; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstanceRiskLevelsResponseBody model) {
            this.instanceRiskLevels = model.instanceRiskLevels;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The risk levels of instances.</p>
         */
        public Builder instanceRiskLevels(java.util.List<InstanceRiskLevels> instanceRiskLevels) {
            this.instanceRiskLevels = instanceRiskLevels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceRiskLevelsResponseBody build() {
            return new ListInstanceRiskLevelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceRiskLevelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceRiskLevelsResponseBody</p>
     */
    public static class InstanceRiskLevels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private InstanceRiskLevels(Builder builder) {
            this.instanceId = builder.instanceId;
            this.level = builder.level;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRiskLevels create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String instanceId; 
            private String level; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(InstanceRiskLevels model) {
                this.instanceId = model.instanceId;
                this.level = model.level;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5efigezp50l2cmb****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * <li><strong>none</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The UUID of the server for which you want to modify the defense rule. You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
             * 
             * <strong>example:</strong>
             * <p>f2d6e901-1004-4ca8-9dae-53ec04a92765</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public InstanceRiskLevels build() {
                return new InstanceRiskLevels(this);
            } 

        } 

    }
}
