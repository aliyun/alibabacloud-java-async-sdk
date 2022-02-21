// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIEventListResponseBody</p>
 */
public class DescribeAIEventListResponseBody extends TeaModel {
    @NameInMap("AIEventList")
    private String AIEventList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAIEventListResponseBody(Builder builder) {
        this.AIEventList = builder.AIEventList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIEventList
     */
    public String getAIEventList() {
        return this.AIEventList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String AIEventList; 
        private String requestId; 

        /**
         * AIEventList.
         */
        public Builder AIEventList(String AIEventList) {
            this.AIEventList = AIEventList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIEventListResponseBody build() {
            return new DescribeAIEventListResponseBody(this);
        } 

    } 

}
