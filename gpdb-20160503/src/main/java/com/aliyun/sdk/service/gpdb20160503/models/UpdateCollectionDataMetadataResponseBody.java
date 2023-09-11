// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCollectionDataMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCollectionDataMetadataResponseBody</p>
 */
public class UpdateCollectionDataMetadataResponseBody extends TeaModel {
    @NameInMap("AppliedRows")
    private Long appliedRows;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
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
         * AppliedRows.
         */
        public Builder appliedRows(Long appliedRows) {
            this.appliedRows = appliedRows;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
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
