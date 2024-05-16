// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealtimeLogDeliveryResponseBody</p>
 */
public class DescribeDomainRealtimeLogDeliveryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logstore")
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeDomainRealtimeLogDeliveryResponseBody(Builder builder) {
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealtimeLogDeliveryResponseBody create() {
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String logstore; 
        private String project; 
        private String region; 
        private String requestId; 
        private String status; 

        /**
         * The name of the Logstore where log entries are stored.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * The name of the Log Service project that is used for real-time log delivery.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * The ID of the region where the Log Service project is deployed.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of real-time log delivery. Valid values:
         * <p>
         * 
         * *   **online**
         * *   **offline**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDomainRealtimeLogDeliveryResponseBody build() {
            return new DescribeDomainRealtimeLogDeliveryResponseBody(this);
        } 

    } 

}
