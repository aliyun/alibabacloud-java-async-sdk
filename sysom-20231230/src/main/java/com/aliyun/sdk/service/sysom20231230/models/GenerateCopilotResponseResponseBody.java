// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GenerateCopilotResponseResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateCopilotResponseResponseBody</p>
 */
public class GenerateCopilotResponseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("massage")
    private String massage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GenerateCopilotResponseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.massage = builder.massage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCopilotResponseResponseBody create() {
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
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return massage
     */
    public String getMassage() {
        return this.massage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String massage; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateCopilotResponseResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.massage = model.massage;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SysomOpenAPI.ServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned by the LLM service. The value is of the string type. If the value is a dict, convert and parse it on your own.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;choices\&quot;: [{\&quot;finish_reason\&quot;: \&quot;stop\&quot;, \&quot;index\&quot;: 0, \&quot;message\&quot;: {\&quot;content\&quot;: \&quot;Alinux is an open-source operating system based on Linux. It is primarily developed and maintained by Alibaba Group and is designed for large-scale cloud computing and big data processing environments. The system has been deeply customized and optimized for high concurrency, low latency, and resource utilization to meet the complex and massive business requirements within Alibaba. Due to its excellent performance and stability, Alinux has gradually been adopted by external enterprises and research institutions, especially in scenarios that require handling high workloads. Compared with standard Linux distributions, Alinux may include specific kernel patches, optimization toolsets, and other features developed internally by Alibaba. However, it is worth noting that although the &quot;Ali&quot; in the name may suggest a close relationship with Alibaba, Alinux as a project became a sub-project under the OpenAtom Foundation in 2021, known as OpenAnolis, marking its progress toward community-driven and broader adoption.\&quot;, \&quot;role\&quot;: \&quot;assistant\&quot;}}], \&quot;model\&quot;: \&quot;Qwen1.5\&quot;, \&quot;sentiment\&quot;: [], \&quot;status_code\&quot;: 200, \&quot;time\&quot;: 6.836989402770996, \&quot;usage\&quot;: {\&quot;completion_tokens\&quot;: 180, \&quot;prompt_tokens\&quot;: 176, \&quot;time_dict\&quot;: {\&quot;auto_regression_time\&quot;: 0.03798324399524265, \&quot;speed\&quot;: 26.327398474054736, \&quot;total_generate_time\&quot;: 6.836983919143677}, \&quot;total_tokens\&quot;: 356}}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code description. This value is empty if no error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>Requests for llm service failed</p>
         */
        public Builder massage(String massage) {
            this.massage = massage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateCopilotResponseResponseBody build() {
            return new GenerateCopilotResponseResponseBody(this);
        } 

    } 

}
