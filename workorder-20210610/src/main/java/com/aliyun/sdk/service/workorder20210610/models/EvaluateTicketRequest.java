// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateTicketRequest} extends {@link RequestModel}
 *
 * <p>EvaluateTicketRequest</p>
 */
public class EvaluateTicketRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("Score")
    @Validation(required = true)
    private String score;

    @Body
    @NameInMap("Solved")
    @Validation(required = true)
    private Boolean solved;

    @Body
    @NameInMap("TicketId")
    @Validation(required = true)
    private String ticketId;

    private EvaluateTicketRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.score = builder.score;
        this.solved = builder.solved;
        this.ticketId = builder.ticketId;
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

    public static final class Builder extends Request.Builder<EvaluateTicketRequest, Builder> {
        private String content; 
        private String score; 
        private Boolean solved; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(EvaluateTicketRequest request) {
            super(request);
            this.content = request.content;
            this.score = request.score;
            this.solved = request.solved;
            this.ticketId = request.ticketId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(String score) {
            this.putBodyParameter("Score", score);
            this.score = score;
            return this;
        }

        /**
         * Solved.
         */
        public Builder solved(Boolean solved) {
            this.putBodyParameter("Solved", solved);
            this.solved = solved;
            return this;
        }

        /**
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public EvaluateTicketRequest build() {
            return new EvaluateTicketRequest(this);
        } 

    } 

}
