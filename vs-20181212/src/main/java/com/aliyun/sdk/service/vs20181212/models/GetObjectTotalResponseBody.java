// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetObjectTotalResponseBody} extends {@link TeaModel}
 *
 * <p>GetObjectTotalResponseBody</p>
 */
public class GetObjectTotalResponseBody extends TeaModel {
    @NameInMap("ObjectCount")
    private Long objectCount;

    @NameInMap("RequestId")
    private String requestId;

    private GetObjectTotalResponseBody(Builder builder) {
        this.objectCount = builder.objectCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectTotalResponseBody create() {
        return builder().build();
    }

    /**
     * @return objectCount
     */
    public Long getObjectCount() {
        return this.objectCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long objectCount; 
        private String requestId; 

        /**
         * ObjectCount.
         */
        public Builder objectCount(Long objectCount) {
            this.objectCount = objectCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetObjectTotalResponseBody build() {
            return new GetObjectTotalResponseBody(this);
        } 

    } 

}
