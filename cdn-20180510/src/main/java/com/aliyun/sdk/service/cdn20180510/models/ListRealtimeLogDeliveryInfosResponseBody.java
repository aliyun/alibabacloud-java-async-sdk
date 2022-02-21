// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRealtimeLogDeliveryInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListRealtimeLogDeliveryInfosResponseBody</p>
 */
public class ListRealtimeLogDeliveryInfosResponseBody extends TeaModel {
    @NameInMap("Content")
    private Content content;

    @NameInMap("RequestId")
    private String requestId;

    private ListRealtimeLogDeliveryInfosResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeLogDeliveryInfosResponseBody create() {
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

        public ListRealtimeLogDeliveryInfosResponseBody build() {
            return new ListRealtimeLogDeliveryInfosResponseBody(this);
        } 

    } 

    public static class RealtimeLogDeliveryInfos extends TeaModel {
        @NameInMap("Logstore")
        private String logstore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Region")
        private String region;

        private RealtimeLogDeliveryInfos(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeLogDeliveryInfos create() {
            return builder().build();
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

        public static final class Builder {
            private String logstore; 
            private String project; 
            private String region; 

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

            public RealtimeLogDeliveryInfos build() {
                return new RealtimeLogDeliveryInfos(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfos")
        private java.util.List < RealtimeLogDeliveryInfos> realtimeLogDeliveryInfos;

        private Content(Builder builder) {
            this.realtimeLogDeliveryInfos = builder.realtimeLogDeliveryInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return realtimeLogDeliveryInfos
         */
        public java.util.List < RealtimeLogDeliveryInfos> getRealtimeLogDeliveryInfos() {
            return this.realtimeLogDeliveryInfos;
        }

        public static final class Builder {
            private java.util.List < RealtimeLogDeliveryInfos> realtimeLogDeliveryInfos; 

            /**
             * RealtimeLogDeliveryInfos.
             */
            public Builder realtimeLogDeliveryInfos(java.util.List < RealtimeLogDeliveryInfos> realtimeLogDeliveryInfos) {
                this.realtimeLogDeliveryInfos = realtimeLogDeliveryInfos;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
