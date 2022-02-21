// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemImprovementRequest} extends {@link RequestModel}
 *
 * <p>GetProblemImprovementRequest</p>
 */
public class GetProblemImprovementRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    private String problemId;

    private GetProblemImprovementRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProblemImprovementRequest create() {
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
    public String getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<GetProblemImprovementRequest, Builder> {
        private String clientToken; 
        private String problemId; 

        private Builder() {
            super();
        } 

        private Builder(GetProblemImprovementRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.problemId = response.problemId;
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
         * 故障ID
         */
        public Builder problemId(String problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        @Override
        public GetProblemImprovementRequest build() {
            return new GetProblemImprovementRequest(this);
        } 

    } 

}
