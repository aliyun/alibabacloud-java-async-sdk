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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WarningLine.
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
