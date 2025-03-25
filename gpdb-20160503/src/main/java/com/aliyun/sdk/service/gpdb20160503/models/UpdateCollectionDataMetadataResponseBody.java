// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link UpdateCollectionDataMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCollectionDataMetadataResponseBody</p>
 */
public class UpdateCollectionDataMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppliedRows")
    private Long appliedRows;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateCollectionDataMetadataResponseBody(Builder builder) {
        this.appliedRows = builder.appliedRows;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCollectionDataMetadataResponseBody create() {
        return builder().build();
    }

    /**
     * @return appliedRows
     */
    public Long getAppliedRows() {
        return this.appliedRows;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Long appliedRows; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * <p>Number of effective entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder appliedRows(Long appliedRows) {
            this.appliedRows = appliedRows;
            return this;
        }

        /**
         * <p>Detailed information when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>failed to connect database, detailMsg: getConnection fail::SQL State: 28P01, Error Code: 0, Error Message: FATAL: password</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Status, with the following values:</p>
         * <ul>
         * <li><strong>success</strong>: Success.</li>
         * <li><strong>fail</strong>: Failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateCollectionDataMetadataResponseBody build() {
            return new UpdateCollectionDataMetadataResponseBody(this);
        } 

    } 

}
