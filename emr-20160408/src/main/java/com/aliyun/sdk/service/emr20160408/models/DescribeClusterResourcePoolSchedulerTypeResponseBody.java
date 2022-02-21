// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResourcePoolSchedulerTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResourcePoolSchedulerTypeResponseBody</p>
 */
public class DescribeClusterResourcePoolSchedulerTypeResponseBody extends TeaModel {
    @NameInMap("CurrentSchedulerType")
    private String currentSchedulerType;

    @NameInMap("DefaultSchedulerType")
    private String defaultSchedulerType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportSchedulerType")
    private String supportSchedulerType;

    private DescribeClusterResourcePoolSchedulerTypeResponseBody(Builder builder) {
        this.currentSchedulerType = builder.currentSchedulerType;
        this.defaultSchedulerType = builder.defaultSchedulerType;
        this.requestId = builder.requestId;
        this.supportSchedulerType = builder.supportSchedulerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterResourcePoolSchedulerTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentSchedulerType
     */
    public String getCurrentSchedulerType() {
        return this.currentSchedulerType;
    }

    /**
     * @return defaultSchedulerType
     */
    public String getDefaultSchedulerType() {
        return this.defaultSchedulerType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportSchedulerType
     */
    public String getSupportSchedulerType() {
        return this.supportSchedulerType;
    }

    public static final class Builder {
        private String currentSchedulerType; 
        private String defaultSchedulerType; 
        private String requestId; 
        private String supportSchedulerType; 

        /**
         * CurrentSchedulerType.
         */
        public Builder currentSchedulerType(String currentSchedulerType) {
            this.currentSchedulerType = currentSchedulerType;
            return this;
        }

        /**
         * DefaultSchedulerType.
         */
        public Builder defaultSchedulerType(String defaultSchedulerType) {
            this.defaultSchedulerType = defaultSchedulerType;
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
         * SupportSchedulerType.
         */
        public Builder supportSchedulerType(String supportSchedulerType) {
            this.supportSchedulerType = supportSchedulerType;
            return this;
        }

        public DescribeClusterResourcePoolSchedulerTypeResponseBody build() {
            return new DescribeClusterResourcePoolSchedulerTypeResponseBody(this);
        } 

    } 

}
