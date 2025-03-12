// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ListRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>ListRealtimeLogDeliveryResponseBody</p>
 */
public class ListRealtimeLogDeliveryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRealtimeLogDeliveryResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeLogDeliveryResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        /**
         * <p>The logging information.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>30559C03-86C9-4EEC-B840-0DC5F5A2189B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRealtimeLogDeliveryResponseBody build() {
            return new ListRealtimeLogDeliveryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeLogDeliveryResponseBody</p>
     */
    public static class RealtimeLogDeliveryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DmId")
        private Integer dmId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RealtimeLogDeliveryInfo(Builder builder) {
            this.dmId = builder.dmId;
            this.domain = builder.domain;
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeLogDeliveryInfo create() {
            return builder().build();
        }

        /**
         * @return dmId
         */
        public Integer getDmId() {
            return this.dmId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer dmId; 
            private String domain; 
            private String logstore; 
            private String project; 
            private String region; 
            private String status; 

            /**
             * <p>The domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001010</p>
             */
            public Builder dmId(Integer dmId) {
                this.dmId = dmId;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The name of the Logstore where log entries are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the Log Service project that is used for real-time log delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The ID of the region where the Log Service project is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-corp</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The status of real-time log delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RealtimeLogDeliveryInfo build() {
                return new RealtimeLogDeliveryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeLogDeliveryResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RealtimeLogDeliveryInfo")
        private java.util.List<RealtimeLogDeliveryInfo> realtimeLogDeliveryInfo;

        private Content(Builder builder) {
            this.realtimeLogDeliveryInfo = builder.realtimeLogDeliveryInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return realtimeLogDeliveryInfo
         */
        public java.util.List<RealtimeLogDeliveryInfo> getRealtimeLogDeliveryInfo() {
            return this.realtimeLogDeliveryInfo;
        }

        public static final class Builder {
            private java.util.List<RealtimeLogDeliveryInfo> realtimeLogDeliveryInfo; 

            /**
             * RealtimeLogDeliveryInfo.
             */
            public Builder realtimeLogDeliveryInfo(java.util.List<RealtimeLogDeliveryInfo> realtimeLogDeliveryInfo) {
                this.realtimeLogDeliveryInfo = realtimeLogDeliveryInfo;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
