// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRiskEventPayloadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventPayloadResponseBody</p>
 */
public class DescribeRiskEventPayloadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DstIP")
    private String dstIP;

    @com.aliyun.core.annotation.NameInMap("DstPort")
    private Integer dstPort;

    @com.aliyun.core.annotation.NameInMap("DstVpcId")
    private String dstVpcId;

    @com.aliyun.core.annotation.NameInMap("HitContentType")
    private Integer hitContentType;

    @com.aliyun.core.annotation.NameInMap("HitTo")
    private Integer hitTo;

    @com.aliyun.core.annotation.NameInMap("ParsedContent")
    private String parsedContent;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("PayloadLen")
    private Integer payloadLen;

    @com.aliyun.core.annotation.NameInMap("Proto")
    private String proto;

    @com.aliyun.core.annotation.NameInMap("RealIp")
    private String realIp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SrcIP")
    private String srcIP;

    @com.aliyun.core.annotation.NameInMap("SrcPort")
    private Integer srcPort;

    @com.aliyun.core.annotation.NameInMap("SrcVpcId")
    private String srcVpcId;

    @com.aliyun.core.annotation.NameInMap("XForwardFor")
    private String xForwardFor;

    private DescribeRiskEventPayloadResponseBody(Builder builder) {
        this.dstIP = builder.dstIP;
        this.dstPort = builder.dstPort;
        this.dstVpcId = builder.dstVpcId;
        this.hitContentType = builder.hitContentType;
        this.hitTo = builder.hitTo;
        this.parsedContent = builder.parsedContent;
        this.payload = builder.payload;
        this.payloadLen = builder.payloadLen;
        this.proto = builder.proto;
        this.realIp = builder.realIp;
        this.requestId = builder.requestId;
        this.srcIP = builder.srcIP;
        this.srcPort = builder.srcPort;
        this.srcVpcId = builder.srcVpcId;
        this.xForwardFor = builder.xForwardFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventPayloadResponseBody create() {
        return builder().build();
    }

    /**
     * @return dstIP
     */
    public String getDstIP() {
        return this.dstIP;
    }

    /**
     * @return dstPort
     */
    public Integer getDstPort() {
        return this.dstPort;
    }

    /**
     * @return dstVpcId
     */
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    /**
     * @return hitContentType
     */
    public Integer getHitContentType() {
        return this.hitContentType;
    }

    /**
     * @return hitTo
     */
    public Integer getHitTo() {
        return this.hitTo;
    }

    /**
     * @return parsedContent
     */
    public String getParsedContent() {
        return this.parsedContent;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return payloadLen
     */
    public Integer getPayloadLen() {
        return this.payloadLen;
    }

    /**
     * @return proto
     */
    public String getProto() {
        return this.proto;
    }

    /**
     * @return realIp
     */
    public String getRealIp() {
        return this.realIp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return srcIP
     */
    public String getSrcIP() {
        return this.srcIP;
    }

    /**
     * @return srcPort
     */
    public Integer getSrcPort() {
        return this.srcPort;
    }

    /**
     * @return srcVpcId
     */
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    /**
     * @return xForwardFor
     */
    public String getXForwardFor() {
        return this.xForwardFor;
    }

    public static final class Builder {
        private String dstIP; 
        private Integer dstPort; 
        private String dstVpcId; 
        private Integer hitContentType; 
        private Integer hitTo; 
        private String parsedContent; 
        private String payload; 
        private Integer payloadLen; 
        private String proto; 
        private String realIp; 
        private String requestId; 
        private String srcIP; 
        private Integer srcPort; 
        private String srcVpcId; 
        private String xForwardFor; 

        /**
         * <p>The destination IP address of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.1</p>
         */
        public Builder dstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }

        /**
         * <p>The destination port of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder dstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }

        /**
         * <p>The destination VPC ID of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp10w5nb30r4jzfyc****</p>
         */
        public Builder dstVpcId(String dstVpcId) {
            this.dstVpcId = dstVpcId;
            return this;
        }

        /**
         * HitContentType.
         */
        public Builder hitContentType(Integer hitContentType) {
            this.hitContentType = hitContentType;
            return this;
        }

        /**
         * HitTo.
         */
        public Builder hitTo(Integer hitTo) {
            this.hitTo = hitTo;
            return this;
        }

        /**
         * ParsedContent.
         */
        public Builder parsedContent(String parsedContent) {
            this.parsedContent = parsedContent;
            return this;
        }

        /**
         * <p>The attack payload of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>302902010004067075626c6963a01c0204036a5f43020100020100300e300c06082b060102010101000500</p>
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * <p>The length of the attack payload of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>457</p>
         */
        public Builder payloadLen(Integer payloadLen) {
            this.payloadLen = payloadLen;
            return this;
        }

        /**
         * <p>The protocol type of intrusion event. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder proto(String proto) {
            this.proto = proto;
            return this;
        }

        /**
         * <p>The HTTP X-Real-IP field.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.3</p>
         */
        public Builder realIp(String realIp) {
            this.realIp = realIp;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68055BA4-D8BD-5611-AC49-C651E619A12E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source IP address of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.2</p>
         */
        public Builder srcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }

        /**
         * <p>The source port of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>54360</p>
         */
        public Builder srcPort(Integer srcPort) {
            this.srcPort = srcPort;
            return this;
        }

        /**
         * <p>The source VPC ID of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4nlt09olhpazpoeg****</p>
         */
        public Builder srcVpcId(String srcVpcId) {
            this.srcVpcId = srcVpcId;
            return this;
        }

        /**
         * <p>The HTTP X-Forwarded-For field.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.4</p>
         */
        public Builder xForwardFor(String xForwardFor) {
            this.xForwardFor = xForwardFor;
            return this;
        }

        public DescribeRiskEventPayloadResponseBody build() {
            return new DescribeRiskEventPayloadResponseBody(this);
        } 

    } 

}
