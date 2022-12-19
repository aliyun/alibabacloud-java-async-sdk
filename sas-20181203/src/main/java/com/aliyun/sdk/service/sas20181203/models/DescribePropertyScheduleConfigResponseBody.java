// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyScheduleConfigResponseBody</p>
 */
public class DescribePropertyScheduleConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    private String config;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePropertyScheduleConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScheduleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String config; 
        private String requestId; 

        /**
         * The configuration time. Unit: hours.
         * <p>
         * 
         * >  The value **0** indicates that asset fingerprint collection is disabled for this type of asset.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyScheduleConfigResponseBody build() {
            return new DescribePropertyScheduleConfigResponseBody(this);
        } 

    } 

}
