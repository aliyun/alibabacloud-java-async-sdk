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
 * {@link ListStatisticLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStatisticLogsResponseBody</p>
 */
public class ListStatisticLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<java.util.Map<String, ?>> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListStatisticLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatisticLogsResponseBody create() {
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
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<java.util.Map<String, ?>> result; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListStatisticLogsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F76ACE3D-E510-EE2C-B7B1-39B3136A61EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result. For more information, see</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/421248.html">Parameters of hotwords rankings</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder result(java.util.List<java.util.Map<String, ?>> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStatisticLogsResponseBody build() {
            return new ListStatisticLogsResponseBody(this);
        } 

    } 

}
