// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemMeasureRequest} extends {@link RequestModel}
 *
 * <p>CreateProblemMeasureRequest</p>
 */
public class CreateProblemMeasureRequest extends Request {
    @Body
    @NameInMap("checkStandard")
    private String checkStandard;

    @Body
    @NameInMap("checkUserId")
    private Long checkUserId;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("content")
    private String content;

    @Body
    @NameInMap("directorId")
    private Long directorId;

    @Body
    @NameInMap("planFinishTime")
    private String planFinishTime;

    @Body
    @NameInMap("problemId")
    @Validation(required = true)
    private Long problemId;

    @Body
    @NameInMap("stalkerId")
    private Long stalkerId;

    @Body
    @NameInMap("status")
    private String status;

    @Body
    @NameInMap("type")
    private Integer type;

    private CreateProblemMeasureRequest(Builder builder) {
        super(builder);
        this.checkStandard = builder.checkStandard;
        this.checkUserId = builder.checkUserId;
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.directorId = builder.directorId;
        this.planFinishTime = builder.planFinishTime;
        this.problemId = builder.problemId;
        this.stalkerId = builder.stalkerId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemMeasureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkStandard
     */
    public String getCheckStandard() {
        return this.checkStandard;
    }

    /**
     * @return checkUserId
     */
    public Long getCheckUserId() {
        return this.checkUserId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return directorId
     */
    public Long getDirectorId() {
        return this.directorId;
    }

    /**
     * @return planFinishTime
     */
    public String getPlanFinishTime() {
        return this.planFinishTime;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return stalkerId
     */
    public Long getStalkerId() {
        return this.stalkerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateProblemMeasureRequest, Builder> {
        private String checkStandard; 
        private Long checkUserId; 
        private String clientToken; 
        private String content; 
        private Long directorId; 
        private String planFinishTime; 
        private Long problemId; 
        private Long stalkerId; 
        private String status; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateProblemMeasureRequest request) {
            super(request);
            this.checkStandard = request.checkStandard;
            this.checkUserId = request.checkUserId;
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.directorId = request.directorId;
            this.planFinishTime = request.planFinishTime;
            this.problemId = request.problemId;
            this.stalkerId = request.stalkerId;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * checkStandard.
         */
        public Builder checkStandard(String checkStandard) {
            this.putBodyParameter("checkStandard", checkStandard);
            this.checkStandard = checkStandard;
            return this;
        }

        /**
         * checkUserId.
         */
        public Builder checkUserId(Long checkUserId) {
            this.putBodyParameter("checkUserId", checkUserId);
            this.checkUserId = checkUserId;
            return this;
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
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * directorId.
         */
        public Builder directorId(Long directorId) {
            this.putBodyParameter("directorId", directorId);
            this.directorId = directorId;
            return this;
        }

        /**
         * planFinishTime.
         */
        public Builder planFinishTime(String planFinishTime) {
            this.putBodyParameter("planFinishTime", planFinishTime);
            this.planFinishTime = planFinishTime;
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
         * stalkerId.
         */
        public Builder stalkerId(Long stalkerId) {
            this.putBodyParameter("stalkerId", stalkerId);
            this.stalkerId = stalkerId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateProblemMeasureRequest build() {
            return new CreateProblemMeasureRequest(this);
        } 

    } 

}
