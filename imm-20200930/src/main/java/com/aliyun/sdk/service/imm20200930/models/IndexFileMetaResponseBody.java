// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IndexFileMetaResponseBody} extends {@link TeaModel}
 *
 * <p>IndexFileMetaResponseBody</p>
 */
public class IndexFileMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private IndexFileMetaResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexFileMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eventId; 
        private String requestId; 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public IndexFileMetaResponseBody build() {
            return new IndexFileMetaResponseBody(this);
        } 

    } 

}
