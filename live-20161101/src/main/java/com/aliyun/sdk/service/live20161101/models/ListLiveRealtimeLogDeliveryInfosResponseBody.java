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
 * {@link ListLiveRealtimeLogDeliveryInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRealtimeLogDeliveryInfosResponseBody</p>
 */
public class ListLiveRealtimeLogDeliveryInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLiveRealtimeLogDeliveryInfosResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRealtimeLogDeliveryInfosResponseBody create() {
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

        private Builder(ListLiveRealtimeLogDeliveryInfosResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the configuration of real-time log delivery.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>95D5B69F-8AEC-419B-8F3A-612B35032B0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLiveRealtimeLogDeliveryInfosResponseBody build() {
            return new ListLiveRealtimeLogDeliveryInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveRealtimeLogDeliveryInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveRealtimeLogDeliveryInfosResponseBody</p>
     */
    public static class RealtimeLogDeliveryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
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

            private Builder() {
            } 

            private Builder(RealtimeLogDeliveryInfos model) {
                this.logstore = model.logstore;
                this.project = model.project;
                this.region = model.region;
            } 

            /**
             * <p>The name of the Logstore to which log entries are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>logstore_example</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the Log Service project that is used for real-time log delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>project_example</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The ID of the region where the Log Service project is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link ListLiveRealtimeLogDeliveryInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveRealtimeLogDeliveryInfosResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RealtimeLogDeliveryInfos")
        private java.util.List<RealtimeLogDeliveryInfos> realtimeLogDeliveryInfos;

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
        public java.util.List<RealtimeLogDeliveryInfos> getRealtimeLogDeliveryInfos() {
            return this.realtimeLogDeliveryInfos;
        }

        public static final class Builder {
            private java.util.List<RealtimeLogDeliveryInfos> realtimeLogDeliveryInfos; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.realtimeLogDeliveryInfos = model.realtimeLogDeliveryInfos;
            } 

            /**
             * RealtimeLogDeliveryInfos.
             */
            public Builder realtimeLogDeliveryInfos(java.util.List<RealtimeLogDeliveryInfos> realtimeLogDeliveryInfos) {
                this.realtimeLogDeliveryInfos = realtimeLogDeliveryInfos;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
