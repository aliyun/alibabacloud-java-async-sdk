// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link CreateEventSubscribeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEventSubscribeResponseBody</p>
 */
public class CreateEventSubscribeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubscribeId")
    private String subscribeId;

    private CreateEventSubscribeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subscribeId = builder.subscribeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventSubscribeResponseBody create() {
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
     * @return subscribeId
     */
    public String getSubscribeId() {
        return this.subscribeId;
    }

    public static final class Builder {
        private String requestId; 
        private String subscribeId; 

        private Builder() {
        } 

        private Builder(CreateEventSubscribeResponseBody model) {
            this.requestId = model.requestId;
            this.subscribeId = model.subscribeId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>760bad53276431c499e30dc36f6b26be</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the created subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>ad53276431c****</p>
         */
        public Builder subscribeId(String subscribeId) {
            this.subscribeId = subscribeId;
            return this;
        }

        public CreateEventSubscribeResponseBody build() {
            return new CreateEventSubscribeResponseBody(this);
        } 

    } 

}
