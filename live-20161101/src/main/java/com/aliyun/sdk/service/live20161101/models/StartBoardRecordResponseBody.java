// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBoardRecordResponseBody} extends {@link TeaModel}
 *
 * <p>StartBoardRecordResponseBody</p>
 */
public class StartBoardRecordResponseBody extends TeaModel {
    @NameInMap("RecordId")
    private String recordId;

    @NameInMap("RequestId")
    private String requestId;

    private StartBoardRecordResponseBody(Builder builder) {
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBoardRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String recordId; 
        private String requestId; 

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
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

        public StartBoardRecordResponseBody build() {
            return new StartBoardRecordResponseBody(this);
        } 

    } 

}
