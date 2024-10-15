// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEdgeMachineActiveProcessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineActiveProcessResponseBody</p>
 */
public class DescribeEdgeMachineActiveProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logs")
    private String logs;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Long progress;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("step")
    private String step;

    private DescribeEdgeMachineActiveProcessResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.step = builder.step;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineActiveProcessResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public String getLogs() {
        return this.logs;
    }

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return step
     */
    public String getStep() {
        return this.step;
    }

    public static final class Builder {
        private String logs; 
        private Long progress; 
        private String requestId; 
        private String state; 
        private String step; 

        /**
         * <p>The activation progress list.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;content&quot;:&quot;步骤 &quot;颁发激活凭证&quot; 执行开始&quot;,&quot;id&quot;:0,&quot;level&quot;:3,&quot;timestamp&quot;:1625994913000},{&quot;content&quot;:&quot;步骤 &quot;颁发激活凭证&quot; 执行成功&quot;,&quot;id&quot;:1,&quot;level&quot;:3,&quot;timestamp&quot;:1625994914000},{&quot;content&quot;:&quot;步骤 &quot;初始化主机配置&quot; 执行开始&quot;,&quot;id&quot;:2,&quot;level&quot;:3,&quot;timestamp&quot;:1625994975000},{&quot;content&quot;:&quot;步骤 &quot;初始化主机配置&quot; 执行成功&quot;,&quot;id&quot;:3,&quot;level&quot;:3,&quot;timestamp&quot;:1625994975000}]</p>
         */
        public Builder logs(String logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The activation progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b62796a8-c5a6-4d3f-beb2-7650e4309cb1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The activation status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATED</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The activation step.</p>
         * 
         * <strong>example:</strong>
         * <p>步骤 &quot;初始化主机配置&quot; 执行成功</p>
         */
        public Builder step(String step) {
            this.step = step;
            return this;
        }

        public DescribeEdgeMachineActiveProcessResponseBody build() {
            return new DescribeEdgeMachineActiveProcessResponseBody(this);
        } 

    } 

}
