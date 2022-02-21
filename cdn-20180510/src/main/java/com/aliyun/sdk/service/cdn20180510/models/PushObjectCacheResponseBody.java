// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushObjectCacheResponseBody} extends {@link TeaModel}
 *
 * <p>PushObjectCacheResponseBody</p>
 */
public class PushObjectCacheResponseBody extends TeaModel {
    @NameInMap("PushTaskId")
    private String pushTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private PushObjectCacheResponseBody(Builder builder) {
        this.pushTaskId = builder.pushTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushObjectCacheResponseBody create() {
        return builder().build();
    }

    /**
     * @return pushTaskId
     */
    public String getPushTaskId() {
        return this.pushTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String pushTaskId; 
        private String requestId; 

        /**
         * PushTaskId.
         */
        public Builder pushTaskId(String pushTaskId) {
            this.pushTaskId = pushTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushObjectCacheResponseBody build() {
            return new PushObjectCacheResponseBody(this);
        } 

    } 

}
