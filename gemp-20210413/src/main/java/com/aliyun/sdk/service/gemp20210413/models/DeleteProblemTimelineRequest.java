// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProblemTimelineRequest} extends {@link RequestModel}
 *
 * <p>DeleteProblemTimelineRequest</p>
 */
public class DeleteProblemTimelineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    private Long problemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemTimelineId")
    private Long problemTimelineId;

    private DeleteProblemTimelineRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
        this.problemTimelineId = builder.problemTimelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProblemTimelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return problemTimelineId
     */
    public Long getProblemTimelineId() {
        return this.problemTimelineId;
    }

    public static final class Builder extends Request.Builder<DeleteProblemTimelineRequest, Builder> {
        private String clientToken; 
        private Long problemId; 
        private Long problemTimelineId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProblemTimelineRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.problemId = request.problemId;
            this.problemTimelineId = request.problemTimelineId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * problemTimelineId.
         */
        public Builder problemTimelineId(Long problemTimelineId) {
            this.putBodyParameter("problemTimelineId", problemTimelineId);
            this.problemTimelineId = problemTimelineId;
            return this;
        }

        @Override
        public DeleteProblemTimelineRequest build() {
            return new DeleteProblemTimelineRequest(this);
        } 

    } 

}
