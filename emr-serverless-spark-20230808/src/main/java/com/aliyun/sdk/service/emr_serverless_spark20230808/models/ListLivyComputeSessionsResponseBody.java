// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListLivyComputeSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLivyComputeSessionsResponseBody</p>
 */
public class ListLivyComputeSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessions")
    private java.util.List<Sessions> sessions;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListLivyComputeSessionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessions = builder.sessions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLivyComputeSessionsResponseBody create() {
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
     * @return sessions
     */
    public java.util.List<Sessions> getSessions() {
        return this.sessions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Sessions> sessions; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListLivyComputeSessionsResponseBody model) {
            this.requestId = model.requestId;
            this.sessions = model.sessions;
            this.totalCount = model.totalCount;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sessions.
         */
        public Builder sessions(java.util.List<Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLivyComputeSessionsResponseBody build() {
            return new ListLivyComputeSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLivyComputeSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLivyComputeSessionsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeId")
        private String computeId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("cuHours")
        private Double cuHours;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("mbSeconds")
        private Long mbSeconds;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("sparkConf")
        private String sparkConf;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("vcoreSeconds")
        private Long vcoreSeconds;

        @com.aliyun.core.annotation.NameInMap("webUI")
        private String webUI;

        private Sessions(Builder builder) {
            this.computeId = builder.computeId;
            this.createTime = builder.createTime;
            this.cuHours = builder.cuHours;
            this.endTime = builder.endTime;
            this.info = builder.info;
            this.mbSeconds = builder.mbSeconds;
            this.name = builder.name;
            this.queue = builder.queue;
            this.sessionId = builder.sessionId;
            this.sparkConf = builder.sparkConf;
            this.state = builder.state;
            this.vcoreSeconds = builder.vcoreSeconds;
            this.webUI = builder.webUI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return computeId
         */
        public String getComputeId() {
            return this.computeId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cuHours
         */
        public Double getCuHours() {
            return this.cuHours;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return mbSeconds
         */
        public Long getMbSeconds() {
            return this.mbSeconds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sparkConf
         */
        public String getSparkConf() {
            return this.sparkConf;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return vcoreSeconds
         */
        public Long getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        /**
         * @return webUI
         */
        public String getWebUI() {
            return this.webUI;
        }

        public static final class Builder {
            private String computeId; 
            private Long createTime; 
            private Double cuHours; 
            private Long endTime; 
            private String info; 
            private Long mbSeconds; 
            private String name; 
            private String queue; 
            private String sessionId; 
            private String sparkConf; 
            private String state; 
            private Long vcoreSeconds; 
            private String webUI; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.computeId = model.computeId;
                this.createTime = model.createTime;
                this.cuHours = model.cuHours;
                this.endTime = model.endTime;
                this.info = model.info;
                this.mbSeconds = model.mbSeconds;
                this.name = model.name;
                this.queue = model.queue;
                this.sessionId = model.sessionId;
                this.sparkConf = model.sparkConf;
                this.state = model.state;
                this.vcoreSeconds = model.vcoreSeconds;
                this.webUI = model.webUI;
            } 

            /**
             * computeId.
             */
            public Builder computeId(String computeId) {
                this.computeId = computeId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * cuHours.
             */
            public Builder cuHours(Double cuHours) {
                this.cuHours = cuHours;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * info.
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * mbSeconds.
             */
            public Builder mbSeconds(Long mbSeconds) {
                this.mbSeconds = mbSeconds;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * sparkConf.
             */
            public Builder sparkConf(String sparkConf) {
                this.sparkConf = sparkConf;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * vcoreSeconds.
             */
            public Builder vcoreSeconds(Long vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            /**
             * webUI.
             */
            public Builder webUI(String webUI) {
                this.webUI = webUI;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
