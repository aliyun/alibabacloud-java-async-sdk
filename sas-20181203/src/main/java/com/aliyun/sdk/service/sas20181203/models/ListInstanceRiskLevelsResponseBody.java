// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRiskLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceRiskLevelsResponseBody</p>
 */
public class ListInstanceRiskLevelsResponseBody extends TeaModel {
    @NameInMap("InstanceRiskLevels")
    private java.util.List < InstanceRiskLevels> instanceRiskLevels;

    @NameInMap("RequestId")
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

    /**
     * @return instanceRiskLevels
     */
    public java.util.List < InstanceRiskLevels> getInstanceRiskLevels() {
        return this.instanceRiskLevels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceRiskLevels> instanceRiskLevels; 
        private String requestId; 

        /**
         * The risk levels of instances.
         */
        public Builder instanceRiskLevels(java.util.List < InstanceRiskLevels> instanceRiskLevels) {
            this.instanceRiskLevels = instanceRiskLevels;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceRiskLevelsResponseBody build() {
            return new ListInstanceRiskLevelsResponseBody(this);
        } 

    } 

    public static class InstanceRiskLevels extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Level")
        private String level;

        @NameInMap("Uuid")
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

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             * *   **none**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The UUID of the server for which you want to modify the defense rule. You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.
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
