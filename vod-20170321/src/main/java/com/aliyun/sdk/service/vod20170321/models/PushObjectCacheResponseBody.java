// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PushObjectCacheResponseBody model) {
            this.pushTaskId = model.pushTaskId;
            this.requestId = model.requestId;
        } 

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
