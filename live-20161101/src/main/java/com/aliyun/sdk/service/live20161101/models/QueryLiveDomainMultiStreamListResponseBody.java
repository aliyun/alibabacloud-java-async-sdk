// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link QueryLiveDomainMultiStreamListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLiveDomainMultiStreamListResponseBody</p>
 */
public class QueryLiveDomainMultiStreamListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnlineStreams")
    private java.util.List<OnlineStreams> onlineStreams;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryLiveDomainMultiStreamListResponseBody(Builder builder) {
        this.onlineStreams = builder.onlineStreams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLiveDomainMultiStreamListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onlineStreams
     */
    public java.util.List<OnlineStreams> getOnlineStreams() {
        return this.onlineStreams;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<OnlineStreams> onlineStreams; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(QueryLiveDomainMultiStreamListResponseBody model) {
            this.onlineStreams = model.onlineStreams;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The online streams returned.</p>
         */
        public Builder onlineStreams(java.util.List<OnlineStreams> onlineStreams) {
            this.onlineStreams = onlineStreams;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF60DB6A-7FD6-426E-9288-122CC1A5****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryLiveDomainMultiStreamListResponseBody build() {
            return new QueryLiveDomainMultiStreamListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryLiveDomainMultiStreamListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLiveDomainMultiStreamListResponseBody</p>
     */
    public static class ChangeLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeReason")
        private String changeReason;

        @com.aliyun.core.annotation.NameInMap("ChangeTime")
        private String changeTime;

        @com.aliyun.core.annotation.NameInMap("MasterUpstream")
        private String masterUpstream;

        @com.aliyun.core.annotation.NameInMap("UpstreamIp")
        private String upstreamIp;

        @com.aliyun.core.annotation.NameInMap("UpstreamSequence")
        private String upstreamSequence;

        private ChangeLogs(Builder builder) {
            this.changeReason = builder.changeReason;
            this.changeTime = builder.changeTime;
            this.masterUpstream = builder.masterUpstream;
            this.upstreamIp = builder.upstreamIp;
            this.upstreamSequence = builder.upstreamSequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeLogs create() {
            return builder().build();
        }

        /**
         * @return changeReason
         */
        public String getChangeReason() {
            return this.changeReason;
        }

        /**
         * @return changeTime
         */
        public String getChangeTime() {
            return this.changeTime;
        }

        /**
         * @return masterUpstream
         */
        public String getMasterUpstream() {
            return this.masterUpstream;
        }

        /**
         * @return upstreamIp
         */
        public String getUpstreamIp() {
            return this.upstreamIp;
        }

        /**
         * @return upstreamSequence
         */
        public String getUpstreamSequence() {
            return this.upstreamSequence;
        }

        public static final class Builder {
            private String changeReason; 
            private String changeTime; 
            private String masterUpstream; 
            private String upstreamIp; 
            private String upstreamSequence; 

            private Builder() {
            } 

            private Builder(ChangeLogs model) {
                this.changeReason = model.changeReason;
                this.changeTime = model.changeTime;
                this.masterUpstream = model.masterUpstream;
                this.upstreamIp = model.upstreamIp;
                this.upstreamSequence = model.upstreamSequence;
            } 

            /**
             * <p>The reason for the switchover.</p>
             * <ul>
             * <li>merge cut manually: You proactively switched the stream.</li>
             * <li>master stream no data: No data is available in the active stream.</li>
             * <li>master stream low quality: The quality of the active stream deteriorated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>merge cut manually</p>
             */
            public Builder changeReason(String changeReason) {
                this.changeReason = changeReason;
                return this;
            }

            /**
             * <p>The switchover time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-13T09:20:47Z</p>
             */
            public Builder changeTime(String changeTime) {
                this.changeTime = changeTime;
                return this;
            }

            /**
             * <p>The stream used after the switchover.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://118.178.168.35:1936/wwMultitest/pull.livetest2.aliyunlive.com_wwMultitest428_AliRewrite_2?vhost=pull.livetest2.aliyunlive.com&amp;live_rtmp_test=on</p>
             */
            public Builder masterUpstream(String masterUpstream) {
                this.masterUpstream = masterUpstream;
                return this;
            }

            /**
             * <p>The IP address used after the switchover.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder upstreamIp(String upstreamIp) {
                this.upstreamIp = upstreamIp;
                return this;
            }

            /**
             * <p>The identifier of the stream after the switchover.</p>
             * 
             * <strong>example:</strong>
             * <p>***test_AliRewrite_2</p>
             */
            public Builder upstreamSequence(String upstreamSequence) {
                this.upstreamSequence = upstreamSequence;
                return this;
            }

            public ChangeLogs build() {
                return new ChangeLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLiveDomainMultiStreamListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLiveDomainMultiStreamListResponseBody</p>
     */
    public static class UpstreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MasterFlag")
        private Boolean masterFlag;

        @com.aliyun.core.annotation.NameInMap("UpstreamIp")
        private String upstreamIp;

        @com.aliyun.core.annotation.NameInMap("UpstreamSequence")
        private String upstreamSequence;

        @com.aliyun.core.annotation.NameInMap("UpstreamTime")
        private String upstreamTime;

        private UpstreamList(Builder builder) {
            this.masterFlag = builder.masterFlag;
            this.upstreamIp = builder.upstreamIp;
            this.upstreamSequence = builder.upstreamSequence;
            this.upstreamTime = builder.upstreamTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpstreamList create() {
            return builder().build();
        }

        /**
         * @return masterFlag
         */
        public Boolean getMasterFlag() {
            return this.masterFlag;
        }

        /**
         * @return upstreamIp
         */
        public String getUpstreamIp() {
            return this.upstreamIp;
        }

        /**
         * @return upstreamSequence
         */
        public String getUpstreamSequence() {
            return this.upstreamSequence;
        }

        /**
         * @return upstreamTime
         */
        public String getUpstreamTime() {
            return this.upstreamTime;
        }

        public static final class Builder {
            private Boolean masterFlag; 
            private String upstreamIp; 
            private String upstreamSequence; 
            private String upstreamTime; 

            private Builder() {
            } 

            private Builder(UpstreamList model) {
                this.masterFlag = model.masterFlag;
                this.upstreamIp = model.upstreamIp;
                this.upstreamSequence = model.upstreamSequence;
                this.upstreamTime = model.upstreamTime;
            } 

            /**
             * <p>The active/standby tag.</p>
             * <blockquote>
             * <p> This parameter indicates whether the active or standby stream is being distributed.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder masterFlag(Boolean masterFlag) {
                this.masterFlag = masterFlag;
                return this;
            }

            /**
             * <p>The IP address of the stream ingest client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder upstreamIp(String upstreamIp) {
                this.upstreamIp = upstreamIp;
                return this;
            }

            /**
             * <p>The unique identifier of the stream ingest.</p>
             * 
             * <strong>example:</strong>
             * <p>***test_Alirewrite1</p>
             */
            public Builder upstreamSequence(String upstreamSequence) {
                this.upstreamSequence = upstreamSequence;
                return this;
            }

            /**
             * <p>The stream ingest time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-13T09:20:47Z</p>
             */
            public Builder upstreamTime(String upstreamTime) {
                this.upstreamTime = upstreamTime;
                return this;
            }

            public UpstreamList build() {
                return new UpstreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryLiveDomainMultiStreamListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLiveDomainMultiStreamListResponseBody</p>
     */
    public static class OnlineStreams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ChangeLogs")
        private java.util.List<ChangeLogs> changeLogs;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("OptimalMode")
        private String optimalMode;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("UpstreamList")
        private java.util.List<UpstreamList> upstreamList;

        private OnlineStreams(Builder builder) {
            this.appName = builder.appName;
            this.changeLogs = builder.changeLogs;
            this.domain = builder.domain;
            this.optimalMode = builder.optimalMode;
            this.streamName = builder.streamName;
            this.upstreamList = builder.upstreamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineStreams create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return changeLogs
         */
        public java.util.List<ChangeLogs> getChangeLogs() {
            return this.changeLogs;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return optimalMode
         */
        public String getOptimalMode() {
            return this.optimalMode;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return upstreamList
         */
        public java.util.List<UpstreamList> getUpstreamList() {
            return this.upstreamList;
        }

        public static final class Builder {
            private String appName; 
            private java.util.List<ChangeLogs> changeLogs; 
            private String domain; 
            private String optimalMode; 
            private String streamName; 
            private java.util.List<UpstreamList> upstreamList; 

            private Builder() {
            } 

            private Builder(OnlineStreams model) {
                this.appName = model.appName;
                this.changeLogs = model.changeLogs;
                this.domain = model.domain;
                this.optimalMode = model.optimalMode;
                this.streamName = model.streamName;
                this.upstreamList = model.upstreamList;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>apptest</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The switchover records.</p>
             */
            public Builder changeLogs(java.util.List<ChangeLogs> changeLogs) {
                this.changeLogs = changeLogs;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>play.***.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether the dual-stream disaster recovery feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled</li>
             * <li><strong>off</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder optimalMode(String optimalMode) {
                this.optimalMode = optimalMode;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>teststream</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The standby streams.</p>
             */
            public Builder upstreamList(java.util.List<UpstreamList> upstreamList) {
                this.upstreamList = upstreamList;
                return this;
            }

            public OnlineStreams build() {
                return new OnlineStreams(this);
            } 

        } 

    }
}
