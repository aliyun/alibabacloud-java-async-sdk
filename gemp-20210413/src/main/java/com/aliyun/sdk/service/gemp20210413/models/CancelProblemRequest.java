// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelProblemRequest} extends {@link RequestModel}
 *
 * <p>CancelProblemRequest</p>
 */
public class CancelProblemRequest extends Request {
    @Body
    @NameInMap("cancelReason")
    private Long cancelReason;

    @Body
    @NameInMap("cancelReasonDescription")
    private String cancelReasonDescription;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemNotifyType")
    private Long problemNotifyType;

    private CancelProblemRequest(Builder builder) {
        super(builder);
        this.cancelReason = builder.cancelReason;
        this.cancelReasonDescription = builder.cancelReasonDescription;
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
        this.problemNotifyType = builder.problemNotifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelProblemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelReason
     */
    public Long getCancelReason() {
        return this.cancelReason;
    }

    /**
     * @return cancelReasonDescription
     */
    public String getCancelReasonDescription() {
        return this.cancelReasonDescription;
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
    public Long getProblemNotifyType() {
        return this.problemNotifyType;
    }

    public static final class Builder extends Request.Builder<CancelProblemRequest, Builder> {
        private Long cancelReason; 
        private String cancelReasonDescription; 
        private String clientToken; 
        private Long problemId; 
        private Long problemNotifyType; 

        private Builder() {
            super();
        } 

        private Builder(CancelProblemRequest response) {
            super(response);
            this.cancelReason = response.cancelReason;
            this.cancelReasonDescription = response.cancelReasonDescription;
            this.clientToken = response.clientToken;
            this.problemId = response.problemId;
            this.problemNotifyType = response.problemNotifyType;
        } 

        /**
         * 取消原因
         */
        public Builder cancelReason(Long cancelReason) {
            this.putBodyParameter("cancelReason", cancelReason);
            this.cancelReason = cancelReason;
            return this;
        }

        /**
         * 取消原因描述
         */
        public Builder cancelReasonDescription(String cancelReasonDescription) {
            this.putBodyParameter("cancelReasonDescription", cancelReasonDescription);
            this.cancelReasonDescription = cancelReasonDescription;
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
         * 故障id
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * PROBLEM_NOTIFY	通告类型 PROBLEM_NOTIFY：故障通告 PROBLEM_UPDATE：故障更新 PROBLEM_UPGRADE：故障升级 PROBLEM_DEGRADE：故障降级 PROBLEM_RECOVER：故障恢复 PROBLEM_REISSUE： 故障补发 PROBLEM_CANCEL：故障取消
         */
        public Builder problemNotifyType(Long problemNotifyType) {
            this.putBodyParameter("problemNotifyType", problemNotifyType);
            this.problemNotifyType = problemNotifyType;
            return this;
        }

        @Override
        public CancelProblemRequest build() {
            return new CancelProblemRequest(this);
        } 

    } 

}
