// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeProblemRecoveryRequest} extends {@link RequestModel}
 *
 * <p>RevokeProblemRecoveryRequest</p>
 */
public class RevokeProblemRecoveryRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemNotifyType")
    private String problemNotifyType;

    private RevokeProblemRecoveryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
        this.problemNotifyType = builder.problemNotifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeProblemRecoveryRequest create() {
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

    public static final class Builder extends Request.Builder<RevokeProblemRecoveryRequest, Builder> {
        private String clientToken; 
        private Long problemId; 
        private String problemNotifyType; 

        private Builder() {
            super();
        } 

        private Builder(RevokeProblemRecoveryRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.problemId = response.problemId;
            this.problemNotifyType = response.problemNotifyType;
        } 

        /**
         * ????????????Id
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * ???????????? PROBLEM_NOTIFY??????????????? PROBLEM_UPDATE??????????????? PROBLEM_UPGRADE??????????????? PROBLEM_DEGRADE??????????????? PROBLEM_RECOVER??????????????? PROBLEM_REISSUE??? ???????????? PROBLEM_CANCEL???????????????
         */
        public Builder problemNotifyType(String problemNotifyType) {
            this.putBodyParameter("problemNotifyType", problemNotifyType);
            this.problemNotifyType = problemNotifyType;
            return this;
        }

        @Override
        public RevokeProblemRecoveryRequest build() {
            return new RevokeProblemRecoveryRequest(this);
        } 

    } 

}
