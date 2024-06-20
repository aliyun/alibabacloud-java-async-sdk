// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCodeSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCodeSourcesResponseBody</p>
 */
public class ListCodeSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeSources")
    private java.util.List < CodeSourceItem > codeSources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCodeSourcesResponseBody(Builder builder) {
        this.codeSources = builder.codeSources;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCodeSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeSources
     */
    public java.util.List < CodeSourceItem > getCodeSources() {
        return this.codeSources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CodeSourceItem > codeSources; 
        private String requestId; 
        private Long totalCount; 

        /**
         * CodeSources.
         */
        public Builder codeSources(java.util.List < CodeSourceItem > codeSources) {
            this.codeSources = codeSources;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCodeSourcesResponseBody build() {
            return new ListCodeSourcesResponseBody(this);
        } 

    } 

}
