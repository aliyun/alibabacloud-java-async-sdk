// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListUserAnalyzerEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAnalyzerEntriesResponseBody</p>
 */
public class ListUserAnalyzerEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.Map<String, ?> result;

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
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, ?> result; 

        private Builder() {
        } 

        private Builder(ListUserAnalyzerEntriesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>516A02B7-2167-8D92-12D0-B639A2A0F3C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The entries of the custom analyzer. For more information, see <a href="https://www.alibabacloud.com/help/en/open-search/industry-algorithm-edition/useranalyzerentry">UserAnalyzerEntry</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder result(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }

        public ListUserAnalyzerEntriesResponseBody build() {
            return new ListUserAnalyzerEntriesResponseBody(this);
        } 

    } 

}
