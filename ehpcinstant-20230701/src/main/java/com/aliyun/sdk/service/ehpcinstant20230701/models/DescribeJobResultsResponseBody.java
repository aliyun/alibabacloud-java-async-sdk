// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link DescribeJobResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResultsResponseBody</p>
 */
public class DescribeJobResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExitCode")
    private Long exitCode;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeJobResultsResponseBody(Builder builder) {
        this.exitCode = builder.exitCode;
        this.output = builder.output;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exitCode
     */
    public Long getExitCode() {
        return this.exitCode;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long exitCode; 
        private String output; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeJobResultsResponseBody model) {
            this.exitCode = model.exitCode;
            this.output = model.output;
            this.requestId = model.requestId;
        } 

        /**
         * ExitCode.
         */
        public Builder exitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BABC742E-04D7-5BA5-8A5F-7D9461D37B19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobResultsResponseBody build() {
            return new DescribeJobResultsResponseBody(this);
        } 

    } 

}
