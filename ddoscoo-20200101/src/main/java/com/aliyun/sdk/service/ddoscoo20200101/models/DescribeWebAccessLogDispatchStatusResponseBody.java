// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebAccessLogDispatchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogDispatchStatusResponseBody</p>
 */
public class DescribeWebAccessLogDispatchStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsConfigStatus")
    private java.util.List<SlsConfigStatus> slsConfigStatus;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebAccessLogDispatchStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsConfigStatus = builder.slsConfigStatus;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebAccessLogDispatchStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsConfigStatus
     */
    public java.util.List<SlsConfigStatus> getSlsConfigStatus() {
        return this.slsConfigStatus;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SlsConfigStatus> slsConfigStatus; 
        private Integer totalCount; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the log analysis feature is enabled for domain names.</p>
         */
        public Builder slsConfigStatus(java.util.List<SlsConfigStatus> slsConfigStatus) {
            this.slsConfigStatus = slsConfigStatus;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebAccessLogDispatchStatusResponseBody build() {
            return new DescribeWebAccessLogDispatchStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebAccessLogDispatchStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebAccessLogDispatchStatusResponseBody</p>
     */
    public static class SlsConfigStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private SlsConfigStatus(Builder builder) {
            this.domain = builder.domain;
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsConfigStatus create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String domain; 
            private Boolean enable; 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether the log analysis feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public SlsConfigStatus build() {
                return new SlsConfigStatus(this);
            } 

        } 

    }
}
