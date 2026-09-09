// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeCustomBaseRuleCompileResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomBaseRuleCompileResultResponseBody</p>
 */
public class DescribeCustomBaseRuleCompileResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private DescribeCustomBaseRuleCompileResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomBaseRuleCompileResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        private Builder() {
        } 

        private Builder(DescribeCustomBaseRuleCompileResultResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58FDF266-3D56-5DE8-91E0-96A26BAB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The compilation result. Valid values:</p>
         * <ul>
         * <li><p><strong>success</strong>: The rule is successfully compiled.</p>
         * </li>
         * <li><p><strong>compiling</strong>: The rule is being compiled.</p>
         * </li>
         * <li><p><strong>failed</strong>: The rule failed to be compiled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public DescribeCustomBaseRuleCompileResultResponseBody build() {
            return new DescribeCustomBaseRuleCompileResultResponseBody(this);
        } 

    } 

}
