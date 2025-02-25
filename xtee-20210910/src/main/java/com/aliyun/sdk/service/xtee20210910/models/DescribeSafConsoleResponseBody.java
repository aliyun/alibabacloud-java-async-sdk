// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSafConsoleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSafConsoleResponseBody</p>
 */
public class DescribeSafConsoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("bizData")
    private java.util.List < String > bizData;

    private DescribeSafConsoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.bizData = builder.bizData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafConsoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return bizData
     */
    public java.util.List < String > getBizData() {
        return this.bizData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > bizData; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * bizData.
         */
        public Builder bizData(java.util.List < String > bizData) {
            this.bizData = bizData;
            return this;
        }

        public DescribeSafConsoleResponseBody build() {
            return new DescribeSafConsoleResponseBody(this);
        } 

    } 

}
