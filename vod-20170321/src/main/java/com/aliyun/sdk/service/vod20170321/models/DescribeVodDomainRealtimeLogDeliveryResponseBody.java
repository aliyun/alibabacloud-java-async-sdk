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
 * {@link DescribeVodDomainRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainRealtimeLogDeliveryResponseBody</p>
 */
public class DescribeVodDomainRealtimeLogDeliveryResponseBody extends TeaModel {
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

    private DescribeVodDomainRealtimeLogDeliveryResponseBody(Builder builder) {
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainRealtimeLogDeliveryResponseBody create() {
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

        private Builder(DescribeVodDomainRealtimeLogDeliveryResponseBody model) {
            this.logstore = model.logstore;
            this.project = model.project;
            this.region = model.region;
            this.requestId = model.requestId;
            this.status = model.status;
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

        public DescribeVodDomainRealtimeLogDeliveryResponseBody build() {
            return new DescribeVodDomainRealtimeLogDeliveryResponseBody(this);
        } 

    } 

}
