// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSlsAnalyzeOpenStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsAnalyzeOpenStatusResponseBody</p>
 */
public class DescribeSlsAnalyzeOpenStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpenStatus")
    private String openStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSlsAnalyzeOpenStatusResponseBody(Builder builder) {
        this.openStatus = builder.openStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsAnalyzeOpenStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openStatus
     */
    public String getOpenStatus() {
        return this.openStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String openStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSlsAnalyzeOpenStatusResponseBody model) {
            this.openStatus = model.openStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The enabled status of SLS. Valid values:</p>
         * <p><strong>true</strong>: enabled.</p>
         * <p><strong>false</strong>: disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder openStatus(String openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CC01A2B-92FB-535C-9415-9A951C20****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlsAnalyzeOpenStatusResponseBody build() {
            return new DescribeSlsAnalyzeOpenStatusResponseBody(this);
        } 

    } 

}
