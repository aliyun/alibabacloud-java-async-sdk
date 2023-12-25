// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReportUnReadCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportUnReadCountResponseBody</p>
 */
public class GetReportUnReadCountResponseBody extends TeaModel {
    @NameInMap("count")
    private Long count;

    @NameInMap("requestId")
    private String requestId;

    private GetReportUnReadCountResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportUnReadCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long count; 
        private String requestId; 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetReportUnReadCountResponseBody build() {
            return new GetReportUnReadCountResponseBody(this);
        } 

    } 

}
