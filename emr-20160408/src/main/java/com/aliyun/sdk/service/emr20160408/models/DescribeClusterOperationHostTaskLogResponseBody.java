// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterOperationHostTaskLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterOperationHostTaskLogResponseBody</p>
 */
public class DescribeClusterOperationHostTaskLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stderr")
    private String stderr;

    @NameInMap("Stdout")
    private String stdout;

    private DescribeClusterOperationHostTaskLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stderr = builder.stderr;
        this.stdout = builder.stdout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterOperationHostTaskLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stderr
     */
    public String getStderr() {
        return this.stderr;
    }

    /**
     * @return stdout
     */
    public String getStdout() {
        return this.stdout;
    }

    public static final class Builder {
        private String requestId; 
        private String stderr; 
        private String stdout; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Stderr.
         */
        public Builder stderr(String stderr) {
            this.stderr = stderr;
            return this;
        }

        /**
         * Stdout.
         */
        public Builder stdout(String stdout) {
            this.stdout = stdout;
            return this;
        }

        public DescribeClusterOperationHostTaskLogResponseBody build() {
            return new DescribeClusterOperationHostTaskLogResponseBody(this);
        } 

    } 

}
