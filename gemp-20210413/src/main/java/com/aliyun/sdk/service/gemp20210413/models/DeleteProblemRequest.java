// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProblemRequest} extends {@link RequestModel}
 *
 * <p>DeleteProblemRequest</p>
 */
public class DeleteProblemRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    private DeleteProblemRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProblemRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProblemRequest, Builder> {
        private String clientToken; 
        private Long problemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProblemRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.problemId = response.problemId;
        } 

        /**
         * 幂等校验
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

        @Override
        public DeleteProblemRequest build() {
            return new DeleteProblemRequest(this);
        } 

    } 

}
