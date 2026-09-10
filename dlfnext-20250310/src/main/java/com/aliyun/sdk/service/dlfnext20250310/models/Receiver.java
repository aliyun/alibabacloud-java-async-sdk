// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link Receiver} extends {@link TeaModel}
 *
 * <p>Receiver</p>
 */
public class Receiver extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("receiverName")
    private String receiverName;

    @com.aliyun.core.annotation.NameInMap("receiverTenantId")
    private Long receiverTenantId;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    private Receiver(Builder builder) {
        this.comment = builder.comment;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.receiverName = builder.receiverName;
        this.receiverTenantId = builder.receiverTenantId;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Receiver create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return receiverName
     */
    public String getReceiverName() {
        return this.receiverName;
    }

    /**
     * @return receiverTenantId
     */
    public Long getReceiverTenantId() {
        return this.receiverTenantId;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public static final class Builder {
        private String comment; 
        private Long createdAt; 
        private String createdBy; 
        private String receiverName; 
        private Long receiverTenantId; 
        private Long updatedAt; 
        private String updatedBy; 

        private Builder() {
        } 

        private Builder(Receiver model) {
            this.comment = model.comment;
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.receiverName = model.receiverName;
            this.receiverTenantId = model.receiverTenantId;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The time when the receiver was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>The name of the receiver.</p>
         * 
         * <strong>example:</strong>
         * <p>receiver_name</p>
         */
        public Builder receiverName(String receiverName) {
            this.receiverName = receiverName;
            return this;
        }

        /**
         * <p>The receiver\&quot;s account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder receiverTenantId(Long receiverTenantId) {
            this.receiverTenantId = receiverTenantId;
            return this;
        }

        /**
         * <p>The time when the receiver was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The user who last updated the receiver.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Receiver build() {
            return new Receiver(this);
        } 

    } 

}
