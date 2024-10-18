// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchIndexFileMetaResponseBody} extends {@link TeaModel}
 *
 * <p>BatchIndexFileMetaResponseBody</p>
 */
public class BatchIndexFileMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchIndexFileMetaResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchIndexFileMetaResponseBody create() {
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
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>387-1DAPFFZplUZhuCuhnB6I9H****</p>
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F93E6D9-5AC0-49F9-914D-E02678A3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchIndexFileMetaResponseBody build() {
            return new BatchIndexFileMetaResponseBody(this);
        } 

    } 

}
