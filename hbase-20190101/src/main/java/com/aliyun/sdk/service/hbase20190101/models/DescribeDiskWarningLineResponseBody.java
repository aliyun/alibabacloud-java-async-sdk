// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeDiskWarningLineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskWarningLineResponseBody</p>
 */
public class DescribeDiskWarningLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WarningLine")
    private String warningLine;

    private DescribeDiskWarningLineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.warningLine = builder.warningLine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskWarningLineResponseBody create() {
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
     * @return warningLine
     */
    public String getWarningLine() {
        return this.warningLine;
    }

    public static final class Builder {
        private String requestId; 
        private String warningLine; 

        private Builder() {
        } 

        private Builder(DescribeDiskWarningLineResponseBody model) {
            this.requestId = model.requestId;
            this.warningLine = model.warningLine;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08DF8283-D290-4107-931E-7913D6D3480D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The disk capacity alert threshold. For example, if the value is 75, an alert is triggered when disk usage exceeds 75%. If no value is returned, the user has not configured this parameter, and the system default value is 80%.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder warningLine(String warningLine) {
            this.warningLine = warningLine;
            return this;
        }

        public DescribeDiskWarningLineResponseBody build() {
            return new DescribeDiskWarningLineResponseBody(this);
        } 

    } 

}
