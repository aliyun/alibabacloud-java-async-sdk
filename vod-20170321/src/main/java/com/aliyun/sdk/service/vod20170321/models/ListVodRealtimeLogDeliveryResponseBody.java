// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListVodRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>ListVodRealtimeLogDeliveryResponseBody</p>
 */
public class ListVodRealtimeLogDeliveryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVodRealtimeLogDeliveryResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodRealtimeLogDeliveryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListVodRealtimeLogDeliveryResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVodRealtimeLogDeliveryResponseBody build() {
            return new ListVodRealtimeLogDeliveryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVodRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodRealtimeLogDeliveryResponseBody</p>
     */
    public static class RealtimeLogDeliveryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DmId")
        private Integer dmId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

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
            this.domainName = builder.domainName;
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
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
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
            private String domainName; 
            private String logstore; 
            private String project; 
            private String region; 
            private String status; 

            private Builder() {
            } 

            private Builder(RealtimeLogDeliveryInfo model) {
                this.dmId = model.dmId;
                this.domainName = model.domainName;
                this.logstore = model.logstore;
                this.project = model.project;
                this.region = model.region;
                this.status = model.status;
            } 

            /**
             * DmId.
             */
            public Builder dmId(Integer dmId) {
                this.dmId = dmId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Status.
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
     * {@link ListVodRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodRealtimeLogDeliveryResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Content model) {
                this.realtimeLogDeliveryInfo = model.realtimeLogDeliveryInfo;
            } 

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
