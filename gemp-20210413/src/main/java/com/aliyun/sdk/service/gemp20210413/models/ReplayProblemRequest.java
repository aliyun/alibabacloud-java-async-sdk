// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplayProblemRequest} extends {@link RequestModel}
 *
 * <p>ReplayProblemRequest</p>
 */
public class ReplayProblemRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("replayDutyUserId")
    private Long replayDutyUserId;

    private ReplayProblemRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
        this.replayDutyUserId = builder.replayDutyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplayProblemRequest create() {
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
     * @return replayDutyUserId
     */
    public Long getReplayDutyUserId() {
        return this.replayDutyUserId;
    }

    public static final class Builder extends Request.Builder<ReplayProblemRequest, Builder> {
        private String clientToken; 
        private Long problemId; 
        private Long replayDutyUserId; 

        private Builder() {
            super();
        } 

        private Builder(ReplayProblemRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.problemId = request.problemId;
            this.replayDutyUserId = request.replayDutyUserId;
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
         * replayDutyUserId.
         */
        public Builder replayDutyUserId(Long replayDutyUserId) {
            this.putBodyParameter("replayDutyUserId", replayDutyUserId);
            this.replayDutyUserId = replayDutyUserId;
            return this;
        }

        @Override
        public ReplayProblemRequest build() {
            return new ReplayProblemRequest(this);
        } 

    } 

}
