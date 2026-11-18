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
 * {@link GetResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceUsageResponseBody</p>
 */
public class GetResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceUsage")
    private ResourceUsage resourceUsage;

    private GetResourceUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resourceUsage = builder.resourceUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceUsageResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceUsage
     */
    public ResourceUsage getResourceUsage() {
        return this.resourceUsage;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResourceUsage resourceUsage; 

        private Builder() {
        } 

        private Builder(GetResourceUsageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resourceUsage = model.resourceUsage;
        } 

        /**
         * <p>The response code. A value of 200 indicates success. Other values indicate specific error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that describes the result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-5678-9abc-123456789abc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The usage results for the query interval and each group.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;granularity&quot;:&quot;Hour&quot;,&quot;groupBy&quot;:[&quot;teamID&quot;],&quot;groups&quot;:[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;items&quot;:[{&quot;usageName&quot;:&quot;cpuActive&quot;,&quot;unit&quot;:&quot;CoreSecond&quot;,&quot;total&quot;:5400,&quot;buckets&quot;:[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]}]}]}</p>
         */
        public Builder resourceUsage(ResourceUsage resourceUsage) {
            this.resourceUsage = resourceUsage;
            return this;
        }

        public GetResourceUsageResponseBody build() {
            return new GetResourceUsageResponseBody(this);
        } 

    } 

}
