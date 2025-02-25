// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteZoneRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteZoneRecordResponseBody</p>
 */
public class DeleteZoneRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteZoneRecordResponseBody(Builder builder) {
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteZoneRecordResponseBody create() {
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

    public static final class Builder {
        private Long recordId; 
        private String requestId; 

        /**
         * <p>The ID of the DNS record.</p>
         * 
         * <strong>example:</strong>
         * <p>306279****</p>
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

        public DeleteZoneRecordResponseBody build() {
            return new DeleteZoneRecordResponseBody(this);
        } 

    } 

}
