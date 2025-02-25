// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOpenedAccessLogInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpenedAccessLogInstancesResponseBody</p>
 */
public class ListOpenedAccessLogInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsConfigStatus")
    private java.util.List < SlsConfigStatus> slsConfigStatus;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOpenedAccessLogInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsConfigStatus = builder.slsConfigStatus;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenedAccessLogInstancesResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4DB64811-70A1-41C9-A0CE-CD8B260ED551</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configuration of log analysis for the Anti-DDoS Origin instance.</p>
         */
        public Builder slsConfigStatus(java.util.List < SlsConfigStatus> slsConfigStatus) {
            this.slsConfigStatus = slsConfigStatus;
            return this;
        }

        /**
         * <p>The number of the Anti-DDoS Origin instances for which log analysis was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOpenedAccessLogInstancesResponseBody build() {
            return new ListOpenedAccessLogInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOpenedAccessLogInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOpenedAccessLogInstancesResponseBody</p>
     */
    public static class SlsConfigStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private SlsConfigStatus(Builder builder) {
            this.enable = builder.enable;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsConfigStatus create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean enable; 
            private String instanceId; 

            /**
             * <p>Indicates whether log analysis was enabled for the Anti-DDoS Origin instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The ID of the Anti-DDoS Origin instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-m7r1zce2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public SlsConfigStatus build() {
                return new SlsConfigStatus(this);
            } 

        } 

    }
}
