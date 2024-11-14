// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDDoSStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSStatusResponseBody</p>
 */
public class DescribeDDoSStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DDoSStatus")
    private java.util.List < DDoSStatus> dDoSStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDDoSStatusResponseBody(Builder builder) {
        this.dDoSStatus = builder.dDoSStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return dDoSStatus
     */
    public java.util.List < DDoSStatus> getDDoSStatus() {
        return this.dDoSStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DDoSStatus> dDoSStatus; 
        private String requestId; 

        /**
         * <p>Indicates whether DDoS attacks occur on specific domain names.</p>
         */
        public Builder dDoSStatus(java.util.List < DDoSStatus> dDoSStatus) {
            this.dDoSStatus = dDoSStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDoSStatusResponseBody build() {
            return new DescribeDDoSStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDoSStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDoSStatusResponseBody</p>
     */
    public static class DDoSStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DDoSStatus(Builder builder) {
            this.eventType = builder.eventType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DDoSStatus create() {
            return builder().build();
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eventType; 
            private String status; 

            /**
             * <p>The type of events that are triggered by DDoS attacks. Valid values:</p>
             * <ul>
             * <li>defense: traffic scrubbing events.</li>
             * <li>blackhole: blackhole filtering events.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>blackhole</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>Indicates whether DDoS attacks occur on specific domain names. Valid value:</p>
             * <ul>
             * <li><strong>doing</strong>: DDoS attacks occur on specific domain names.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>doing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DDoSStatus build() {
                return new DDoSStatus(this);
            } 

        } 

    }
}
