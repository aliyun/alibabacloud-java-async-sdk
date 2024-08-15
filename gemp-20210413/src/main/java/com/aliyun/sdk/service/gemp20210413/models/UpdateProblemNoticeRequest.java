// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemNoticeRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemNoticeRequest</p>
 */
public class UpdateProblemNoticeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    private Long problemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemNotifyType")
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

        private Builder(UpdateProblemNoticeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.problemId = request.problemId;
            this.problemNotifyType = request.problemNotifyType;
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
         * problemNotifyType.
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
