// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>429570****</p>
         */
        public Builder recordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
