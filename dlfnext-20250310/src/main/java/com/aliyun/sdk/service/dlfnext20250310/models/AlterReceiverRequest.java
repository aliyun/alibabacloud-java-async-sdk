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
 * {@link AlterReceiverRequest} extends {@link RequestModel}
 *
 * <p>AlterReceiverRequest</p>
 */
public class AlterReceiverRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("receiver")
    private String receiver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("receiverName")
    private String receiverName;

    private AlterReceiverRequest(Builder builder) {
        super(builder);
        this.receiver = builder.receiver;
        this.comment = builder.comment;
        this.receiverName = builder.receiverName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterReceiverRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return this.receiver;
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

    public static final class Builder extends Request.Builder<AlterReceiverRequest, Builder> {
        private String receiver; 
        private String comment; 
        private String receiverName; 

        private Builder() {
            super();
        } 

        private Builder(AlterReceiverRequest request) {
            super(request);
            this.receiver = request.receiver;
            this.comment = request.comment;
            this.receiverName = request.receiverName;
        } 

        /**
         * receiver.
         */
        public Builder receiver(String receiver) {
            this.putPathParameter("receiver", receiver);
            this.receiver = receiver;
            return this;
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

        @Override
        public AlterReceiverRequest build() {
            return new AlterReceiverRequest(this);
        } 

    } 

}
