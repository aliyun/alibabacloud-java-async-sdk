// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDDoSStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSStatusResponseBody</p>
 */
public class DescribeDDoSStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DDoSStatus")
    private java.util.List<DDoSStatus> dDoSStatus;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dDoSStatus
     */
    public java.util.List<DDoSStatus> getDDoSStatus() {
        return this.dDoSStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DDoSStatus> dDoSStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDDoSStatusResponseBody model) {
            this.dDoSStatus = model.dDoSStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The current DDoS status.</p>
         */
        public Builder dDoSStatus(java.util.List<DDoSStatus> dDoSStatus) {
            this.dDoSStatus = dDoSStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

            private Builder() {
            } 

            private Builder(DDoSStatus model) {
                this.eventType = model.eventType;
                this.status = model.status;
            } 

            /**
             * <p>The event type. Valid values:</p>
             * <ul>
             * <li>defense: DDoS scrubbing events.</li>
             * <li>blackhole: DDoS blackhole filtering events.</li>
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
             * <p>The DDoS status. Valid values:</p>
             * <ul>
             * <li><strong>doing</strong>: under DDoS attack.</li>
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
