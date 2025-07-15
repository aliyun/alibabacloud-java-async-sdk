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
 * {@link DescribeLiveDomainRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainRealtimeLogDeliveryResponseBody</p>
 */
public class DescribeLiveDomainRealtimeLogDeliveryResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveDomainRealtimeLogDeliveryResponseBody model) {
            this.logstore = model.logstore;
            this.project = model.project;
            this.region = model.region;
            this.requestId = model.requestId;
            this.status = model.status;
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
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F8F3852-912F-42AC-80EB-F1CF4284DE93</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of real-time log delivery. Valid values:</p>
         * <ul>
         * <li>online: Real-time log delivery is enabled.</li>
         * <li>offline: Real-time log delivery is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
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
