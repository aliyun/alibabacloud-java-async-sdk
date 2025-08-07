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
 * {@link CreateReceiverRequest} extends {@link RequestModel}
 *
 * <p>CreateReceiverRequest</p>
 */
public class CreateReceiverRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("receiverName")
    private String receiverName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("receiverTenantId")
    private Long receiverTenantId;

    private CreateReceiverRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.receiverName = builder.receiverName;
        this.receiverTenantId = builder.receiverTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReceiverRequest create() {
        return builder().build();
    }

@Override
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

    public static final class Builder extends Request.Builder<CreateReceiverRequest, Builder> {
        private String comment; 
        private String receiverName; 
        private Long receiverTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReceiverRequest request) {
            super(request);
            this.comment = request.comment;
            this.receiverName = request.receiverName;
            this.receiverTenantId = request.receiverTenantId;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * receiverName.
         */
        public Builder receiverName(String receiverName) {
            this.putBodyParameter("receiverName", receiverName);
            this.receiverName = receiverName;
            return this;
        }

        /**
         * receiverTenantId.
         */
        public Builder receiverTenantId(Long receiverTenantId) {
            this.putBodyParameter("receiverTenantId", receiverTenantId);
            this.receiverTenantId = receiverTenantId;
            return this;
        }

        @Override
        public CreateReceiverRequest build() {
            return new CreateReceiverRequest(this);
        } 

    } 

}
