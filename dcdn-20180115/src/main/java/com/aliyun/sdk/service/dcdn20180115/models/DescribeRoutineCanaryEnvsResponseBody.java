// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRoutineCanaryEnvsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoutineCanaryEnvsResponseBody</p>
 */
public class DescribeRoutineCanaryEnvsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map < String, ? > content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRoutineCanaryEnvsResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineCanaryEnvsResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.Map < String, ? > getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > content; 
        private String requestId; 

        /**
         * <p>The canary release environments that are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>presetCanaryShanghai</p>
         */
        public Builder content(java.util.Map < String, ? > content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CDCD94C0-F7FE-412F-B8F8-7E3C610C78E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRoutineCanaryEnvsResponseBody build() {
            return new DescribeRoutineCanaryEnvsResponseBody(this);
        } 

    } 

}
