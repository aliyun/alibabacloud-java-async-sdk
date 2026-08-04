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
 * {@link BatchFailedItemDTO} extends {@link TeaModel}
 *
 * <p>BatchFailedItemDTO</p>
 */
public class BatchFailedItemDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private BatchFailedItemDTO(Builder builder) {
        this.reason = builder.reason;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchFailedItemDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String reason; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(BatchFailedItemDTO model) {
            this.reason = model.reason;
            this.userId = model.userId;
        } 

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public BatchFailedItemDTO build() {
            return new BatchFailedItemDTO(this);
        } 

    } 

}
