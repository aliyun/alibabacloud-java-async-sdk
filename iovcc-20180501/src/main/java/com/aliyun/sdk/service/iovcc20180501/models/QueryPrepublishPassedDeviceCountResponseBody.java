// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPrepublishPassedDeviceCountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPrepublishPassedDeviceCountResponseBody</p>
 */
public class QueryPrepublishPassedDeviceCountResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("RequestId")
    private String requestId;

    private QueryPrepublishPassedDeviceCountResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPrepublishPassedDeviceCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPrepublishPassedDeviceCountResponseBody build() {
            return new QueryPrepublishPassedDeviceCountResponseBody(this);
        } 

    } 

}
