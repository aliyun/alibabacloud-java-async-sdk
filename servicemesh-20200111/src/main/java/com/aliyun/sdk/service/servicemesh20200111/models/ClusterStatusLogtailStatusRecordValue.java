// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClusterStatusLogtailStatusRecordValue} extends {@link TeaModel}
 *
 * <p>ClusterStatusLogtailStatusRecordValue</p>
 */
public class ClusterStatusLogtailStatusRecordValue extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("LogtailDetailStatus")
    private String logtailDetailStatus;

    @NameInMap("AccessLogDashboards")
    private java.util.List < AccessLogDashboards> accessLogDashboards;

    private ClusterStatusLogtailStatusRecordValue(Builder builder) {
        this.clusterId = builder.clusterId;
        this.logtailDetailStatus = builder.logtailDetailStatus;
        this.accessLogDashboards = builder.accessLogDashboards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterStatusLogtailStatusRecordValue create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return logtailDetailStatus
     */
    public String getLogtailDetailStatus() {
        return this.logtailDetailStatus;
    }

    /**
     * @return accessLogDashboards
     */
    public java.util.List < AccessLogDashboards> getAccessLogDashboards() {
        return this.accessLogDashboards;
    }

    public static final class Builder {
        private String clusterId; 
        private String logtailDetailStatus; 
        private java.util.List < AccessLogDashboards> accessLogDashboards; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * LogtailDetailStatus.
         */
        public Builder logtailDetailStatus(String logtailDetailStatus) {
            this.logtailDetailStatus = logtailDetailStatus;
            return this;
        }

        /**
         * AccessLogDashboards.
         */
        public Builder accessLogDashboards(java.util.List < AccessLogDashboards> accessLogDashboards) {
            this.accessLogDashboards = accessLogDashboards;
            return this;
        }

        public ClusterStatusLogtailStatusRecordValue build() {
            return new ClusterStatusLogtailStatusRecordValue(this);
        } 

    } 

    public static class AccessLogDashboards extends TeaModel {
        @NameInMap("Title")
        private String title;

        @NameInMap("Url")
        private String url;

        private AccessLogDashboards(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogDashboards create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AccessLogDashboards build() {
                return new AccessLogDashboards(this);
            } 

        } 

    }
}
