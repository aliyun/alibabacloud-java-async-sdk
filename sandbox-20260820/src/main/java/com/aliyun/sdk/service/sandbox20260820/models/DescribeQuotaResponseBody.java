// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link DescribeQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQuotaResponseBody</p>
 */
public class DescribeQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("quota")
    private Quota quota;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("usage")
    private QuotaUsage usage;

    private DescribeQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usage
     */
    public QuotaUsage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Quota quota; 
        private String requestId; 
        private QuotaUsage usage; 

        private Builder() {
        } 

        private Builder(DescribeQuotaResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.quota = model.quota;
            this.requestId = model.requestId;
            this.usage = model.usage;
        } 

        /**
         * <p>The response code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message. The value is success for a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The quota configuration information.</p>
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Team 当前配额用量。用量不可用时省略；成功查询且无占用时返回三项零值。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpuCores&quot;:1,&quot;memoryGB&quot;:1.5,&quot;instanceCount&quot;:1}</p>
         */
        public Builder usage(QuotaUsage usage) {
            this.usage = usage;
            return this;
        }

        public DescribeQuotaResponseBody build() {
            return new DescribeQuotaResponseBody(this);
        } 

    } 

}
