// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>207541****</p>
         */
        public Builder recordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39CB16E5-4180-49F2-A060-23C0ECEB80D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the DNS record. Valid values:</p>
         * <ul>
         * <li>ENABLE: The DNS record is enabled.</li>
         * <li>DISABLE: The DNS record is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLE</p>
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
