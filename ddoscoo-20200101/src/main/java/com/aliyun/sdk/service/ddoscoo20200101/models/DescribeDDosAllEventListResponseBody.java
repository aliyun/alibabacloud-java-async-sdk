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
 * {@link DescribeDDosAllEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosAllEventListResponseBody</p>
 */
public class DescribeDDosAllEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackEvents")
    private java.util.List<AttackEvents> attackEvents;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeDDosAllEventListResponseBody(Builder builder) {
        this.attackEvents = builder.attackEvents;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosAllEventListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackEvents
     */
    public java.util.List<AttackEvents> getAttackEvents() {
        return this.attackEvents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<AttackEvents> attackEvents; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(DescribeDDosAllEventListResponseBody model) {
            this.attackEvents = model.attackEvents;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The list of attack events.</p>
         */
        public Builder attackEvents(java.util.List<AttackEvents> attackEvents) {
            this.attackEvents = attackEvents;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25D83ED5-28CB-5683-9CF7-AECE521F3005</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of attack events returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDDosAllEventListResponseBody build() {
            return new DescribeDDosAllEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDosAllEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDosAllEventListResponseBody</p>
     */
    public static class AttackEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Mbps")
        private Long mbps;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Long pps;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private AttackEvents(Builder builder) {
            this.area = builder.area;
            this.endTime = builder.endTime;
            this.eventType = builder.eventType;
            this.ip = builder.ip;
            this.mbps = builder.mbps;
            this.port = builder.port;
            this.pps = builder.pps;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackEvents create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return mbps
         */
        public Long getMbps() {
            return this.mbps;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return pps
         */
        public Long getPps() {
            return this.pps;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String area; 
            private Long endTime; 
            private String eventType; 
            private String ip; 
            private Long mbps; 
            private String port; 
            private Long pps; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(AttackEvents model) {
                this.area = model.area;
                this.endTime = model.endTime;
                this.eventType = model.eventType;
                this.ip = model.ip;
                this.mbps = model.mbps;
                this.port = model.port;
                this.pps = model.pps;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The source region of the attack. Valid values:</p>
             * <ul>
             * <li><strong>cn</strong>: the Chinese mainland.</li>
             * <li><strong>alb-cn-hongkong-gf-2</strong>: Hong Kong (China).</li>
             * <li><strong>alb-us-west-1-gf-2</strong>: US (Silicon Valley).</li>
             * <li><strong>alb-ap-northeast-1-gf-1</strong>: Japan (Tokyo).</li>
             * <li><strong>alb-ap-southeast-gf-1</strong>: Singapore.</li>
             * <li><strong>alb-eu-central-1-gf-1</strong>: Germany (Frankfurt).</li>
             * <li><strong>alb-eu-west-1-gf-1</strong> and <strong>selb-eu-west-1-gf-1a</strong>: UK (London).</li>
             * <li><strong>alb-us-east-gf-1</strong>: US (Virginia).</li>
             * <li><strong>CT-yundi</strong>: Hong Kong (China). This value applies only to Anti-DDoS Pro and Anti-DDoS Premium secure acceleration line instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The end time of the attack. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634546030</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The type of the DDoS attack event. Valid values:</p>
             * <ul>
             * <li><strong>web-cc</strong>: web resource exhaustion attack.</li>
             * <li><strong>cc</strong>: connection flood attack.</li>
             * <li><strong>defense</strong>: volumetric attack (scrubbing event).</li>
             * <li><strong>blackhole</strong>: volumetric attack (blackhole filtering event).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cc</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The attacked object. The attacked object varies based on the attack event type:</p>
             * <ul>
             * <li>Web resource exhaustion attack (<strong>EventType</strong> is <strong>web-cc</strong>): this parameter indicates the attacked website domain name.</li>
             * <li>Connection flood attack (<strong>EventType</strong> is <strong>cc</strong>): this parameter indicates the attacked IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
             * <li>Volumetric attack (<strong>EventType</strong> is <strong>defense</strong> or <strong>blackhole</strong>): this parameter indicates the attacked IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>203.107.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The peak bandwidth of the attack traffic. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>101899</p>
             */
            public Builder mbps(Long mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * <p>The attacked port number.</p>
             * <blockquote>
             * <p>This parameter is not returned for web resource exhaustion attacks (<strong>EventType</strong> is <strong>web-cc</strong>).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The peak packet forwarding rate of the attack traffic. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>9664270</p>
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The start time of the attack. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634543764</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public AttackEvents build() {
                return new AttackEvents(this);
            } 

        } 

    }
}
