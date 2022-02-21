// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessLogDispatchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogDispatchStatusResponseBody</p>
 */
public class DescribeWebAccessLogDispatchStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsConfigStatus")
    private java.util.List < SlsConfigStatus> slsConfigStatus;

    @NameInMap("TotalCount")
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
    public java.util.List < SlsConfigStatus> getSlsConfigStatus() {
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
        private java.util.List < SlsConfigStatus> slsConfigStatus; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsConfigStatus.
         */
        public Builder slsConfigStatus(java.util.List < SlsConfigStatus> slsConfigStatus) {
            this.slsConfigStatus = slsConfigStatus;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebAccessLogDispatchStatusResponseBody build() {
            return new DescribeWebAccessLogDispatchStatusResponseBody(this);
        } 

    } 

    public static class SlsConfigStatus extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Enable")
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Enable.
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
