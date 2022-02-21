// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskWarningLineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskWarningLineResponseBody</p>
 */
public class DescribeDiskWarningLineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WarningLine")
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
