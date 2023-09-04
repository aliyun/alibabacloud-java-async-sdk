// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProblemEffectionServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteProblemEffectionServiceRequest</p>
 */
public class DeleteProblemEffectionServiceRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("effectionServiceId")
    private Long effectionServiceId;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    private DeleteProblemEffectionServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.effectionServiceId = builder.effectionServiceId;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProblemEffectionServiceRequest create() {
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
     * @return effectionServiceId
     */
    public Long getEffectionServiceId() {
        return this.effectionServiceId;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<DeleteProblemEffectionServiceRequest, Builder> {
        private String clientToken; 
        private Long effectionServiceId; 
        private Long problemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProblemEffectionServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.effectionServiceId = request.effectionServiceId;
            this.problemId = request.problemId;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * effectionServiceId.
         */
        public Builder effectionServiceId(Long effectionServiceId) {
            this.putBodyParameter("effectionServiceId", effectionServiceId);
            this.effectionServiceId = effectionServiceId;
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

        @Override
        public DeleteProblemEffectionServiceRequest build() {
            return new DeleteProblemEffectionServiceRequest(this);
        } 

    } 

}
