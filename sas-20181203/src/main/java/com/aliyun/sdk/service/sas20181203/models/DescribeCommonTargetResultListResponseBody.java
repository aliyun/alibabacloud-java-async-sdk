// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonTargetResultListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonTargetResultListResponseBody</p>
 */
public class DescribeCommonTargetResultListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetConfig")
    private TargetConfig targetConfig;

    private DescribeCommonTargetResultListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetConfig = builder.targetConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonTargetResultListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetConfig
     */
    public TargetConfig getTargetConfig() {
        return this.targetConfig;
    }

    public static final class Builder {
        private String requestId; 
        private TargetConfig targetConfig; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the configuration item.
         */
        public Builder targetConfig(TargetConfig targetConfig) {
            this.targetConfig = targetConfig;
            return this;
        }

        public DescribeCommonTargetResultListResponseBody build() {
            return new DescribeCommonTargetResultListResponseBody(this);
        } 

    } 

    public static class TargetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("TargetDefault")
        private String targetDefault;

        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List < String > targetList;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TargetConfig(Builder builder) {
            this.flag = builder.flag;
            this.targetDefault = builder.targetDefault;
            this.targetList = builder.targetList;
            this.targetType = builder.targetType;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfig create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return targetDefault
         */
        public String getTargetDefault() {
            return this.targetDefault;
        }

        /**
         * @return targetList
         */
        public java.util.List < String > getTargetList() {
            return this.targetList;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String flag; 
            private String targetDefault; 
            private java.util.List < String > targetList; 
            private String targetType; 
            private String totalCount; 
            private String type; 

            /**
             * The identifier that indicates whether the configuration item is applied to the server. Valid values:
             * <p>
             * 
             * *   **add**: applied
             * *   **del**: not applied
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The default identifier.
             */
            public Builder targetDefault(String targetDefault) {
                this.targetDefault = targetDefault;
                return this;
            }

            /**
             * An array that consists of the IDs of the server groups or the UUIDs of the servers.
             * <p>
             * 
             * >  If **uuid** is returned for the **TargetType** parameter, **UUIDs** of the servers are returned. If **groupId** is returned for the **TargetType** parameter, IDs of the server groups are returned.
             */
            public Builder targetList(java.util.List < String > targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * The type of the server to which the configuration item is applied. Valid values:
             * <p>
             * 
             * *   **uuid**: a server
             * *   **groupId**: a server group
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The type of the configuration item. Valid values:
             * <p>
             * 
             * *   **webshell_timescan**: webshell detection and removal
             * *   **aliscriptengine**: in-depth detection engine
             * *   **alidetect**: installation scope of local file detection
             * *   **alidetect-scan-enable**: detection scope of local file detection
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetConfig build() {
                return new TargetConfig(this);
            } 

        } 

    }
}
