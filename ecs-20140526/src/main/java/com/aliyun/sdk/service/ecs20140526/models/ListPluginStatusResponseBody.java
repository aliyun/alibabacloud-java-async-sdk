// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginStatusResponseBody</p>
 */
public class ListPluginStatusResponseBody extends TeaModel {
    @NameInMap("InstancePluginStatusSet")
    private InstancePluginStatusSet instancePluginStatusSet;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListPluginStatusResponseBody(Builder builder) {
        this.instancePluginStatusSet = builder.instancePluginStatusSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancePluginStatusSet
     */
    public InstancePluginStatusSet getInstancePluginStatusSet() {
        return this.instancePluginStatusSet;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private InstancePluginStatusSet instancePluginStatusSet; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * InstancePluginStatusSet.
         */
        public Builder instancePluginStatusSet(InstancePluginStatusSet instancePluginStatusSet) {
            this.instancePluginStatusSet = instancePluginStatusSet;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPluginStatusResponseBody build() {
            return new ListPluginStatusResponseBody(this);
        } 

    } 

    public static class PluginStatus extends TeaModel {
        @NameInMap("FirstHeartbeatTime")
        private String firstHeartbeatTime;

        @NameInMap("LastHeartbeatTime")
        private String lastHeartbeatTime;

        @NameInMap("PluginName")
        private String pluginName;

        @NameInMap("PluginStatus")
        private String pluginStatus;

        @NameInMap("PluginVersion")
        private String pluginVersion;

        private PluginStatus(Builder builder) {
            this.firstHeartbeatTime = builder.firstHeartbeatTime;
            this.lastHeartbeatTime = builder.lastHeartbeatTime;
            this.pluginName = builder.pluginName;
            this.pluginStatus = builder.pluginStatus;
            this.pluginVersion = builder.pluginVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginStatus create() {
            return builder().build();
        }

        /**
         * @return firstHeartbeatTime
         */
        public String getFirstHeartbeatTime() {
            return this.firstHeartbeatTime;
        }

        /**
         * @return lastHeartbeatTime
         */
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return pluginStatus
         */
        public String getPluginStatus() {
            return this.pluginStatus;
        }

        /**
         * @return pluginVersion
         */
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        public static final class Builder {
            private String firstHeartbeatTime; 
            private String lastHeartbeatTime; 
            private String pluginName; 
            private String pluginStatus; 
            private String pluginVersion; 

            /**
             * FirstHeartbeatTime.
             */
            public Builder firstHeartbeatTime(String firstHeartbeatTime) {
                this.firstHeartbeatTime = firstHeartbeatTime;
                return this;
            }

            /**
             * LastHeartbeatTime.
             */
            public Builder lastHeartbeatTime(String lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * PluginName.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * PluginStatus.
             */
            public Builder pluginStatus(String pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            /**
             * PluginVersion.
             */
            public Builder pluginVersion(String pluginVersion) {
                this.pluginVersion = pluginVersion;
                return this;
            }

            public PluginStatus build() {
                return new PluginStatus(this);
            } 

        } 

    }
    public static class PluginStatusSet extends TeaModel {
        @NameInMap("PluginStatus")
        private java.util.List < PluginStatus> pluginStatus;

        private PluginStatusSet(Builder builder) {
            this.pluginStatus = builder.pluginStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginStatusSet create() {
            return builder().build();
        }

        /**
         * @return pluginStatus
         */
        public java.util.List < PluginStatus> getPluginStatus() {
            return this.pluginStatus;
        }

        public static final class Builder {
            private java.util.List < PluginStatus> pluginStatus; 

            /**
             * PluginStatus.
             */
            public Builder pluginStatus(java.util.List < PluginStatus> pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            public PluginStatusSet build() {
                return new PluginStatusSet(this);
            } 

        } 

    }
    public static class InstancePluginStatus extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PluginStatusSet")
        private PluginStatusSet pluginStatusSet;

        private InstancePluginStatus(Builder builder) {
            this.instanceId = builder.instanceId;
            this.pluginStatusSet = builder.pluginStatusSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePluginStatus create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return pluginStatusSet
         */
        public PluginStatusSet getPluginStatusSet() {
            return this.pluginStatusSet;
        }

        public static final class Builder {
            private String instanceId; 
            private PluginStatusSet pluginStatusSet; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PluginStatusSet.
             */
            public Builder pluginStatusSet(PluginStatusSet pluginStatusSet) {
                this.pluginStatusSet = pluginStatusSet;
                return this;
            }

            public InstancePluginStatus build() {
                return new InstancePluginStatus(this);
            } 

        } 

    }
    public static class InstancePluginStatusSet extends TeaModel {
        @NameInMap("InstancePluginStatus")
        private java.util.List < InstancePluginStatus> instancePluginStatus;

        private InstancePluginStatusSet(Builder builder) {
            this.instancePluginStatus = builder.instancePluginStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePluginStatusSet create() {
            return builder().build();
        }

        /**
         * @return instancePluginStatus
         */
        public java.util.List < InstancePluginStatus> getInstancePluginStatus() {
            return this.instancePluginStatus;
        }

        public static final class Builder {
            private java.util.List < InstancePluginStatus> instancePluginStatus; 

            /**
             * InstancePluginStatus.
             */
            public Builder instancePluginStatus(java.util.List < InstancePluginStatus> instancePluginStatus) {
                this.instancePluginStatus = instancePluginStatus;
                return this;
            }

            public InstancePluginStatusSet build() {
                return new InstancePluginStatusSet(this);
            } 

        } 

    }
}
