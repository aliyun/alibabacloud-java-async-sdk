// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemMeasureRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemMeasureRequest</p>
 */
public class UpdateProblemMeasureRequest extends Request {
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
    @NameInMap("measureId")
    private Long measureId;

    @Body
    @NameInMap("planFinishTime")
    private String planFinishTime;

    @Body
    @NameInMap("problemId")
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

    private UpdateProblemMeasureRequest(Builder builder) {
        super(builder);
        this.checkStandard = builder.checkStandard;
        this.checkUserId = builder.checkUserId;
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.directorId = builder.directorId;
        this.measureId = builder.measureId;
        this.planFinishTime = builder.planFinishTime;
        this.problemId = builder.problemId;
        this.stalkerId = builder.stalkerId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProblemMeasureRequest create() {
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
     * @return measureId
     */
    public Long getMeasureId() {
        return this.measureId;
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

    public static final class Builder extends Request.Builder<UpdateProblemMeasureRequest, Builder> {
        private String checkStandard; 
        private Long checkUserId; 
        private String clientToken; 
        private String content; 
        private Long directorId; 
        private Long measureId; 
        private String planFinishTime; 
        private Long problemId; 
        private Long stalkerId; 
        private String status; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProblemMeasureRequest response) {
            super(response);
            this.checkStandard = response.checkStandard;
            this.checkUserId = response.checkUserId;
            this.clientToken = response.clientToken;
            this.content = response.content;
            this.directorId = response.directorId;
            this.measureId = response.measureId;
            this.planFinishTime = response.planFinishTime;
            this.problemId = response.problemId;
            this.stalkerId = response.stalkerId;
            this.status = response.status;
            this.type = response.type;
        } 

        /**
         * 验收标准
         */
        public Builder checkStandard(String checkStandard) {
            this.putBodyParameter("checkStandard", checkStandard);
            this.checkStandard = checkStandard;
            return this;
        }

        /**
         * 验收人id
         */
        public Builder checkUserId(Long checkUserId) {
            this.putBodyParameter("checkUserId", checkUserId);
            this.checkUserId = checkUserId;
            return this;
        }

        /**
         * 幂等校验token
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 措施内容
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * 负责人id
         */
        public Builder directorId(Long directorId) {
            this.putBodyParameter("directorId", directorId);
            this.directorId = directorId;
            return this;
        }

        /**
         * 措施Id
         */
        public Builder measureId(Long measureId) {
            this.putBodyParameter("measureId", measureId);
            this.measureId = measureId;
            return this;
        }

        /**
         * 计划完成时间
         */
        public Builder planFinishTime(String planFinishTime) {
            this.putBodyParameter("planFinishTime", planFinishTime);
            this.planFinishTime = planFinishTime;
            return this;
        }

        /**
         * 故障Id
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * 跟踪人id
         */
        public Builder stalkerId(Long stalkerId) {
            this.putBodyParameter("stalkerId", stalkerId);
            this.stalkerId = stalkerId;
            return this;
        }

        /**
         * 状态 IMPROVED 改进 2 未改进UNIMPROVED
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * 措施类型 码表 PROBLEM_REPLAY_IMPROVEMENT
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateProblemMeasureRequest build() {
            return new UpdateProblemMeasureRequest(this);
        } 

    } 

}
