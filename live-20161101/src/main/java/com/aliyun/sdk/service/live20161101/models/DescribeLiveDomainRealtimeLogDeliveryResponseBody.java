// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainRealtimeLogDeliveryResponseBody</p>
 */
public class DescribeLiveDomainRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("Logstore")
    private String logstore;

    @NameInMap("Project")
    private String project;

    @NameInMap("Region")
    private String region;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeLiveDomainRealtimeLogDeliveryResponseBody(Builder builder) {
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainRealtimeLogDeliveryResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeLiveDomainRealtimeLogDeliveryResponseBody build() {
            return new DescribeLiveDomainRealtimeLogDeliveryResponseBody(this);
        } 

    } 

}
