// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribePropertyScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyScheduleConfigResponseBody</p>
 */
public class DescribePropertyScheduleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The configuration time. Unit: hours.</p>
         * <blockquote>
         * <p> A value <strong>0</strong> indicates that asset fingerprint collection is disabled for this type of asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
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
