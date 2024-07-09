// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddZoneRecordResponseBody} extends {@link TeaModel}
 *
 * <p>AddZoneRecordResponseBody</p>
 */
public class AddZoneRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddZoneRecordResponseBody(Builder builder) {
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddZoneRecordResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long recordId; 
        private String requestId; 
        private Boolean success; 

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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddZoneRecordResponseBody build() {
            return new AddZoneRecordResponseBody(this);
        } 

    } 

}
