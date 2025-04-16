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
 * {@link ListPluginStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginStatusResponseBody</p>
 */
public class ListPluginStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstancePluginStatusSet")
    private InstancePluginStatusSet instancePluginStatusSet;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListPluginStatusResponseBody(Builder builder) {
        this.instancePluginStatusSet = builder.instancePluginStatusSet;
        this.nextToken = builder.nextToken;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instancePluginStatusSet
     */
    public InstancePluginStatusSet getInstancePluginStatusSet() {
        return this.instancePluginStatusSet;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListPluginStatusResponseBody model) {
            this.instancePluginStatusSet = model.instancePluginStatusSet;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The states of Cloud Assistant plug-ins on the instances.</p>
         */
        public Builder instancePluginStatusSet(InstancePluginStatusSet instancePluginStatusSet) {
            this.instancePluginStatusSet = instancePluginStatusSet;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPluginStatusResponseBody build() {
            return new ListPluginStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPluginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginStatusResponseBody</p>
     */
    public static class PluginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstHeartbeatTime")
        private String firstHeartbeatTime;

        @com.aliyun.core.annotation.NameInMap("LastHeartbeatTime")
        private String lastHeartbeatTime;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("PluginStatus")
        private String pluginStatus;

        @com.aliyun.core.annotation.NameInMap("PluginVersion")
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

            private Builder() {
            } 

            private Builder(PluginStatus model) {
                this.firstHeartbeatTime = model.firstHeartbeatTime;
                this.lastHeartbeatTime = model.lastHeartbeatTime;
                this.pluginName = model.pluginName;
                this.pluginStatus = model.pluginStatus;
                this.pluginVersion = model.pluginVersion;
            } 

            /**
             * <p>The first time when Cloud Assistant reported the state of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:46Z</p>
             */
            public Builder firstHeartbeatTime(String firstHeartbeatTime) {
                this.firstHeartbeatTime = firstHeartbeatTime;
                return this;
            }

            /**
             * <p>The last time when Cloud Assistant reported the state of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:46Z</p>
             */
            public Builder lastHeartbeatTime(String lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * <p>The name of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * <p>The state of the Cloud Assistant plug-in. Valid values:</p>
             * <ul>
             * <li>NotInstalled: The plug-in is not installed.</li>
             * <li>Installed: The one-time plug-in is installed.</li>
             * <li>Running: The long-running plug-in is running.</li>
             * <li>Stopped: The long-running plug-in is not running.</li>
             * <li>Crashed: The plug-in is abnormal.</li>
             * <li>Removed: The plug-in is uninstalled.</li>
             * <li>Unknown: The state of the plug-in is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder pluginStatus(String pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            /**
             * <p>The version of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1</p>
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
    /**
     * 
     * {@link ListPluginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginStatusResponseBody</p>
     */
    public static class PluginStatusSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PluginStatus")
        private java.util.List<PluginStatus> pluginStatus;

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
        public java.util.List<PluginStatus> getPluginStatus() {
            return this.pluginStatus;
        }

        public static final class Builder {
            private java.util.List<PluginStatus> pluginStatus; 

            private Builder() {
            } 

            private Builder(PluginStatusSet model) {
                this.pluginStatus = model.pluginStatus;
            } 

            /**
             * <p>The state of the Cloud Assistant plug-in. Valid values:</p>
             * <ul>
             * <li>NotInstalled: The plug-in is not installed.</li>
             * <li>Installed: The one-time plug-in is installed.</li>
             * <li>Running: The long-running plug-in is running.</li>
             * <li>Stopped: The long-running plug-in is not running.</li>
             * <li>Crashed: The plug-in is abnormal.</li>
             * <li>Removed: The plug-in is uninstalled.</li>
             * <li>Unknown: The state of the plug-in is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder pluginStatus(java.util.List<PluginStatus> pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            public PluginStatusSet build() {
                return new PluginStatusSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginStatusResponseBody</p>
     */
    public static class InstancePluginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PluginStatusSet")
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

            private Builder() {
            } 

            private Builder(InstancePluginStatus model) {
                this.instanceId = model.instanceId;
                this.pluginStatusSet = model.pluginStatusSet;
            } 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The queried Cloud Assistant plug-ins.</p>
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
    /**
     * 
     * {@link ListPluginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginStatusResponseBody</p>
     */
    public static class InstancePluginStatusSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstancePluginStatus")
        private java.util.List<InstancePluginStatus> instancePluginStatus;

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
        public java.util.List<InstancePluginStatus> getInstancePluginStatus() {
            return this.instancePluginStatus;
        }

        public static final class Builder {
            private java.util.List<InstancePluginStatus> instancePluginStatus; 

            private Builder() {
            } 

            private Builder(InstancePluginStatusSet model) {
                this.instancePluginStatus = model.instancePluginStatus;
            } 

            /**
             * InstancePluginStatus.
             */
            public Builder instancePluginStatus(java.util.List<InstancePluginStatus> instancePluginStatus) {
                this.instancePluginStatus = instancePluginStatus;
                return this;
            }

            public InstancePluginStatusSet build() {
                return new InstancePluginStatusSet(this);
            } 

        } 

    }
}
