// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordDataResponseBody</p>
 */
public class DescribeRecordDataResponseBody extends TeaModel {
    @NameInMap("Acid")
    private String acid;

    @NameInMap("AgentId")
    private String agentId;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("OssLink")
    private String ossLink;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRecordDataResponseBody(Builder builder) {
        this.acid = builder.acid;
        this.agentId = builder.agentId;
        this.code = builder.code;
        this.message = builder.message;
        this.ossLink = builder.ossLink;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ossLink
     */
    public String getOssLink() {
        return this.ossLink;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String acid; 
        private String agentId; 
        private String code; 
        private String message; 
        private String ossLink; 
        private String requestId; 

        /**
         * Acid.
         */
        public Builder acid(String acid) {
            this.acid = acid;
            return this;
        }

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OssLink.
         */
        public Builder ossLink(String ossLink) {
            this.ossLink = ossLink;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRecordDataResponseBody build() {
            return new DescribeRecordDataResponseBody(this);
        } 

    } 

}
