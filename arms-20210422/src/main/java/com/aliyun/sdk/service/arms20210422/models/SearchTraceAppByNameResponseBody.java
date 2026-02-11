// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link SearchTraceAppByNameResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTraceAppByNameResponseBody</p>
 */
public class SearchTraceAppByNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceApps")
    private java.util.List<TraceApps> traceApps;

    private SearchTraceAppByNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.traceApps = builder.traceApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTraceAppByNameResponseBody create() {
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
     * @return traceApps
     */
    public java.util.List<TraceApps> getTraceApps() {
        return this.traceApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TraceApps> traceApps; 

        private Builder() {
        } 

        private Builder(SearchTraceAppByNameResponseBody model) {
            this.requestId = model.requestId;
            this.traceApps = model.traceApps;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TraceApps.
         */
        public Builder traceApps(java.util.List<TraceApps> traceApps) {
            this.traceApps = traceApps;
            return this;
        }

        public SearchTraceAppByNameResponseBody build() {
            return new SearchTraceAppByNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchTraceAppByNameResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTraceAppByNameResponseBody</p>
     */
    public static class TraceApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Show")
        private Boolean show;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private TraceApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.labels = builder.labels;
            this.pid = builder.pid;
            this.regionId = builder.regionId;
            this.show = builder.show;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return labels
         */
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return show
         */
        public Boolean getShow() {
            return this.show;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private Long createTime; 
            private java.util.List<String> labels; 
            private String pid; 
            private String regionId; 
            private Boolean show; 
            private String type; 
            private Long updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TraceApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.createTime = model.createTime;
                this.labels = model.labels;
                this.pid = model.pid;
                this.regionId = model.regionId;
                this.show = model.show;
                this.type = model.type;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Show.
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TraceApps build() {
                return new TraceApps(this);
            } 

        } 

    }
}
