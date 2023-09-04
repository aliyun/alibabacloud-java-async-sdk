// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemSubtotalRequest} extends {@link RequestModel}
 *
 * <p>CreateProblemSubtotalRequest</p>
 */
public class CreateProblemSubtotalRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("problemId")
    @Validation(required = true)
    private Long problemId;

    private CreateProblemSubtotalRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemSubtotalRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<CreateProblemSubtotalRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Long problemId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProblemSubtotalRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.problemId = request.problemId;
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
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
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
        public CreateProblemSubtotalRequest build() {
            return new CreateProblemSubtotalRequest(this);
        } 

    } 

}
