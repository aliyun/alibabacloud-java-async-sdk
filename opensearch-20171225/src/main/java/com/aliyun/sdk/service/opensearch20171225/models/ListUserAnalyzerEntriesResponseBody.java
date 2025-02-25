// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserAnalyzerEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAnalyzerEntriesResponseBody</p>
 */
public class ListUserAnalyzerEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.Map < String, ? > result;

    private ListUserAnalyzerEntriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAnalyzerEntriesResponseBody create() {
        return builder().build();
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
    public java.util.Map < String, ? > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The entries of the custom analyzer. For more information, see [UserAnalyzerEntry](https://www.alibabacloud.com/help/en/open-search/industry-algorithm-edition/useranalyzerentry).
         */
        public Builder result(java.util.Map < String, ? > result) {
            this.result = result;
            return this;
        }

        public ListUserAnalyzerEntriesResponseBody build() {
            return new ListUserAnalyzerEntriesResponseBody(this);
        } 

    } 

}
