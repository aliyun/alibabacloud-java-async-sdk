// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRecordRemarkResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRecordRemarkResponseBody</p>
 */
public class UpdateRecordRemarkResponseBody extends TeaModel {
    @NameInMap("RecordId")
    private Long recordId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateRecordRemarkResponseBody(Builder builder) {
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecordRemarkResponseBody create() {
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
         * RecordId.
         */
        public Builder recordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateRecordRemarkResponseBody build() {
            return new UpdateRecordRemarkResponseBody(this);
        } 

    } 

}
