// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInvadeEventPayloadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventPayloadResponseBody</p>
 */
public class DescribeInvadeEventPayloadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetsInstanceId")
    private String assetsInstanceId;

    @com.aliyun.core.annotation.NameInMap("EventUuid")
    private String eventUuid;

    @com.aliyun.core.annotation.NameInMap("HighlightEnd")
    private Integer highlightEnd;

    @com.aliyun.core.annotation.NameInMap("HighlightStart")
    private Integer highlightStart;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("PayloadLen")
    private Integer payloadLen;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInvadeEventPayloadResponseBody(Builder builder) {
        this.assetsInstanceId = builder.assetsInstanceId;
        this.eventUuid = builder.eventUuid;
        this.highlightEnd = builder.highlightEnd;
        this.highlightStart = builder.highlightStart;
        this.payload = builder.payload;
        this.payloadLen = builder.payloadLen;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEventPayloadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsInstanceId
     */
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    /**
     * @return eventUuid
     */
    public String getEventUuid() {
        return this.eventUuid;
    }

    /**
     * @return highlightEnd
     */
    public Integer getHighlightEnd() {
        return this.highlightEnd;
    }

    /**
     * @return highlightStart
     */
    public Integer getHighlightStart() {
        return this.highlightStart;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String assetsInstanceId; 
        private String eventUuid; 
        private Integer highlightEnd; 
        private Integer highlightStart; 
        private String payload; 
        private Integer payloadLen; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInvadeEventPayloadResponseBody model) {
            this.assetsInstanceId = model.assetsInstanceId;
            this.eventUuid = model.eventUuid;
            this.highlightEnd = model.highlightEnd;
            this.highlightStart = model.highlightStart;
            this.payload = model.payload;
            this.payloadLen = model.payloadLen;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID of the asset to which the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6faknmuby7ezht****</p>
         */
        public Builder assetsInstanceId(String assetsInstanceId) {
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>fadd-dfdd-****</p>
         */
        public Builder eventUuid(String eventUuid) {
            this.eventUuid = eventUuid;
            return this;
        }

        /**
         * <p>The end position (character index) of the matched content in the payload.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder highlightEnd(Integer highlightEnd) {
            this.highlightEnd = highlightEnd;
            return this;
        }

        /**
         * <p>The start position (character index) of the matched content in the payload.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder highlightStart(Integer highlightStart) {
            this.highlightStart = highlightStart;
            return this;
        }

        /**
         * <p>The original packet payload of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>302902010004067075626c6963a01c0204036a5f43020100020100300e300c06082b060102010101000500</p>
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * <p>The length of the payload in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>457</p>
         */
        public Builder payloadLen(Integer payloadLen) {
            this.payloadLen = payloadLen;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B14757D0-4640-4B44-AC67-7F558FE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvadeEventPayloadResponseBody build() {
            return new DescribeInvadeEventPayloadResponseBody(this);
        } 

    } 

}
