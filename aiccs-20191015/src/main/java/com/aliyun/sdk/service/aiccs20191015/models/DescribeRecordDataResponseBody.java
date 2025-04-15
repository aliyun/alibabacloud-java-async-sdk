// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link DescribeRecordDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordDataResponseBody</p>
 */
public class DescribeRecordDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acid")
    private String acid;

    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OssLink")
    private String ossLink;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRecordDataResponseBody model) {
            this.acid = model.acid;
            this.agentId = model.agentId;
            this.code = model.code;
            this.message = model.message;
            this.ossLink = model.ossLink;
            this.requestId = model.requestId;
        } 

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
