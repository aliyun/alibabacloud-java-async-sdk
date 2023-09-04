// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemTimelinesRequest} extends {@link RequestModel}
 *
 * <p>CreateProblemTimelinesRequest</p>
 */
public class CreateProblemTimelinesRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    @Validation(required = true)
    private Long problemId;

    @Body
    @NameInMap("timelineNodes")
    private String timelineNodes;

    private CreateProblemTimelinesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
        this.timelineNodes = builder.timelineNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemTimelinesRequest create() {
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
     * @return timelineNodes
     */
    public String getTimelineNodes() {
        return this.timelineNodes;
    }

    public static final class Builder extends Request.Builder<CreateProblemTimelinesRequest, Builder> {
        private String clientToken; 
        private Long problemId; 
        private String timelineNodes; 

        private Builder() {
            super();
        } 

        private Builder(CreateProblemTimelinesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.problemId = request.problemId;
            this.timelineNodes = request.timelineNodes;
        } 

        /**
         * clientToken
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
         * timelineNodes.
         */
        public Builder timelineNodes(String timelineNodes) {
            this.putBodyParameter("timelineNodes", timelineNodes);
            this.timelineNodes = timelineNodes;
            return this;
        }

        @Override
        public CreateProblemTimelinesRequest build() {
            return new CreateProblemTimelinesRequest(this);
        } 

    } 

}
