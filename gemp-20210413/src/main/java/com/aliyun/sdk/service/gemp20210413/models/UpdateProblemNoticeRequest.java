// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemNoticeRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemNoticeRequest</p>
 */
public class UpdateProblemNoticeRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemNotifyType")
    private String problemNotifyType;

    private UpdateProblemNoticeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
        this.problemNotifyType = builder.problemNotifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProblemNoticeRequest create() {
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
     * @return problemNotifyType
     */
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

    public static final class Builder extends Request.Builder<UpdateProblemNoticeRequest, Builder> {
        private String clientToken; 
        private Long problemId; 
        private String problemNotifyType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProblemNoticeRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.problemId = response.problemId;
            this.problemNotifyType = response.problemNotifyType;
        } 

        /**
         * 幂等校验Id
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
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
         * 通告类型 PROBLEM_NOTIFY：故障通告 PROBLEM_UPDATE：故障更新 PROBLEM_UPGRADE：故障升级 PROBLEM_DEGRADE：故障降级 PROBLEM_RECOVER：故障恢复 PROBLEM_REISSUE： 故障补发 PROBLEM_CANCEL：故障取消
         */
        public Builder problemNotifyType(String problemNotifyType) {
            this.putBodyParameter("problemNotifyType", problemNotifyType);
            this.problemNotifyType = problemNotifyType;
            return this;
        }

        @Override
        public UpdateProblemNoticeRequest build() {
            return new UpdateProblemNoticeRequest(this);
        } 

    } 

}
