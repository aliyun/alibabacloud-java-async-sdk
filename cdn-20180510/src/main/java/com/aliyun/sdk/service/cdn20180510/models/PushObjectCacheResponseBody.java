// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushObjectCacheResponseBody} extends {@link TeaModel}
 *
 * <p>PushObjectCacheResponseBody</p>
 */
public class PushObjectCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PushTaskId")
    private String pushTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The ID of the prefetch task. If multiple tasks are returned, the IDs are separated by commas (,). The task IDs are merged based on the following rules:
         * <p>
         * 
         * *   If the tasks are set for the same accelerated domain name, submitted within the same second, and prefetch content from URLs instead of directories, the tasks IDs are merged into the same task ID (RushTaskId).
         * *   If the number of tasks that are set for the same accelerated domain name, submitted within the same second, and prefetch content from URLs instead of directories exceeds 500, every 500 task IDs are merged into the same task ID (RushTaskId).
         */
        public Builder pushTaskId(String pushTaskId) {
            this.pushTaskId = pushTaskId;
            return this;
        }

        /**
         * The ID of the request.
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
