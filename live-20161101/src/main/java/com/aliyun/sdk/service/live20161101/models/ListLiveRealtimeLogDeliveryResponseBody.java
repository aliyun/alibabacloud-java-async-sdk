// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRealtimeLogDeliveryResponseBody</p>
 */
public class ListLiveRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("Content")
    private Content content;

    @NameInMap("RequestId")
    private String requestId;

    private ListLiveRealtimeLogDeliveryResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRealtimeLogDeliveryResponseBody create() {
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

        public ListLiveRealtimeLogDeliveryResponseBody build() {
            return new ListLiveRealtimeLogDeliveryResponseBody(this);
        } 

    } 

    public static class RealtimeLogDeliveryInfo extends TeaModel {
        @NameInMap("DmId")
        private Integer dmId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Logstore")
        private String logstore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
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
    public static class Content extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfo")
        private java.util.List < RealtimeLogDeliveryInfo> realtimeLogDeliveryInfo;

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
        public java.util.List < RealtimeLogDeliveryInfo> getRealtimeLogDeliveryInfo() {
            return this.realtimeLogDeliveryInfo;
        }

        public static final class Builder {
            private java.util.List < RealtimeLogDeliveryInfo> realtimeLogDeliveryInfo; 

            /**
             * RealtimeLogDeliveryInfo.
             */
            public Builder realtimeLogDeliveryInfo(java.util.List < RealtimeLogDeliveryInfo> realtimeLogDeliveryInfo) {
                this.realtimeLogDeliveryInfo = realtimeLogDeliveryInfo;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
