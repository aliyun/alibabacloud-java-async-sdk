// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetZoneRecordStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetZoneRecordStatusResponseBody</p>
 */
public class SetZoneRecordStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private SetZoneRecordStatusResponseBody(Builder builder) {
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetZoneRecordStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long recordId; 
        private String requestId; 
        private String status; 

        /**
         * The ID of the DNS record.
         */
        public Builder recordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the DNS record.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SetZoneRecordStatusResponseBody build() {
            return new SetZoneRecordStatusResponseBody(this);
        } 

    } 

}
