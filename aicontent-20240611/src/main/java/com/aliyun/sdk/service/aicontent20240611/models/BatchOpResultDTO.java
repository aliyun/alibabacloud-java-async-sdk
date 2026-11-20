// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BatchOpResultDTO} extends {@link TeaModel}
 *
 * <p>BatchOpResultDTO</p>
 */
public class BatchOpResultDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failed")
    private java.util.List<BatchFailedItemDTO> failed;

    @com.aliyun.core.annotation.NameInMap("succeeded")
    private java.util.List<Long> succeeded;

    private BatchOpResultDTO(Builder builder) {
        this.failed = builder.failed;
        this.succeeded = builder.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchOpResultDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failed
     */
    public java.util.List<BatchFailedItemDTO> getFailed() {
        return this.failed;
    }

    /**
     * @return succeeded
     */
    public java.util.List<Long> getSucceeded() {
        return this.succeeded;
    }

    public static final class Builder {
        private java.util.List<BatchFailedItemDTO> failed; 
        private java.util.List<Long> succeeded; 

        private Builder() {
        } 

        private Builder(BatchOpResultDTO model) {
            this.failed = model.failed;
            this.succeeded = model.succeeded;
        } 

        /**
         * <p>The list of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder failed(java.util.List<BatchFailedItemDTO> failed) {
            this.failed = failed;
            return this;
        }

        /**
         * <p>The list of successful member user IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder succeeded(java.util.List<Long> succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        public BatchOpResultDTO build() {
            return new BatchOpResultDTO(this);
        } 

    } 

}
