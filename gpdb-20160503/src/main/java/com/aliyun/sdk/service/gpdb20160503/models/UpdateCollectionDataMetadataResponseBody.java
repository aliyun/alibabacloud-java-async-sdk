// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The number of effective rows.
         */
        public Builder appliedRows(Long appliedRows) {
            this.appliedRows = appliedRows;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
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
