// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverProblemRequest} extends {@link RequestModel}
 *
 * <p>RecoverProblemRequest</p>
 */
public class RecoverProblemRequest extends Request {
    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemNotifyType")
    private String problemNotifyType;

    @Body
    @NameInMap("recoveryTime")
    private String recoveryTime;

    private RecoverProblemRequest(Builder builder) {
        super(builder);
        this.problemId = builder.problemId;
        this.problemNotifyType = builder.problemNotifyType;
        this.recoveryTime = builder.recoveryTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverProblemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return recoveryTime
     */
    public String getRecoveryTime() {
        return this.recoveryTime;
    }

    public static final class Builder extends Request.Builder<RecoverProblemRequest, Builder> {
        private Long problemId; 
        private String problemNotifyType; 
        private String recoveryTime; 

        private Builder() {
            super();
        } 

        private Builder(RecoverProblemRequest response) {
            super(response);
            this.problemId = response.problemId;
            this.problemNotifyType = response.problemNotifyType;
            this.recoveryTime = response.recoveryTime;
        } 

        /**
         * 故障ID
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

        /**
         * 恢复时间
         */
        public Builder recoveryTime(String recoveryTime) {
            this.putBodyParameter("recoveryTime", recoveryTime);
            this.recoveryTime = recoveryTime;
            return this;
        }

        @Override
        public RecoverProblemRequest build() {
            return new RecoverProblemRequest(this);
        } 

    } 

}
