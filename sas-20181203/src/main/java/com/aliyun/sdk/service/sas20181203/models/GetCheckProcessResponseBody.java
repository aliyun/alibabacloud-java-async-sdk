// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckProcessResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckProcessResponseBody</p>
 */
public class GetCheckProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FinishCount")
    private Integer finishCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetCheckProcessResponseBody(Builder builder) {
        this.finishCount = builder.finishCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckProcessResponseBody create() {
        return builder().build();
    }

    /**
     * @return finishCount
     */
    public Integer getFinishCount() {
        return this.finishCount;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer finishCount; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The total number of assets on which the task is complete.
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of assets on which the task is performed.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetCheckProcessResponseBody build() {
            return new GetCheckProcessResponseBody(this);
        } 

    } 

}
