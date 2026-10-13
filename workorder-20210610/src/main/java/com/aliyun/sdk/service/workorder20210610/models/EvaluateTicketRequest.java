// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link EvaluateTicketRequest} extends {@link RequestModel}
 *
 * <p>EvaluateTicketRequest</p>
 */
public class EvaluateTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Score")
    @com.aliyun.core.annotation.Validation(required = true)
    private String score;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Solved")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean solved;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private EvaluateTicketRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.score = builder.score;
        this.solved = builder.solved;
        this.ticketId = builder.ticketId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return score
     */
    public String getScore() {
        return this.score;
    }

    /**
     * @return solved
     */
    public Boolean getSolved() {
        return this.solved;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<EvaluateTicketRequest, Builder> {
        private String content; 
        private String score; 
        private Boolean solved; 
        private String ticketId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(EvaluateTicketRequest request) {
            super(request);
            this.content = request.content;
            this.score = request.score;
            this.solved = request.solved;
            this.ticketId = request.ticketId;
            this.uid = request.uid;
        } 

        /**
         * <p>The content of the evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>Very satisfactory support experience</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The rating, from 1 to 5 stars.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder score(String score) {
            this.putBodyParameter("Score", score);
            this.score = score;
            return this;
        }

        /**
         * <p>Indicates whether the issue was resolved.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder solved(Boolean solved) {
            this.putBodyParameter("Solved", solved);
            this.solved = solved;
            return this;
        }

        /**
         * <p>The ticket ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>001ET1BU1P</p>
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * <p>The UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1902070573958003</p>
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public EvaluateTicketRequest build() {
            return new EvaluateTicketRequest(this);
        } 

    } 

}
