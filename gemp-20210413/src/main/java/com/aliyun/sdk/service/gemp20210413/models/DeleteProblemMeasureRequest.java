// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProblemMeasureRequest} extends {@link RequestModel}
 *
 * <p>DeleteProblemMeasureRequest</p>
 */
public class DeleteProblemMeasureRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("measureId")
    private Long measureId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    private String problemId;

    private DeleteProblemMeasureRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.measureId = builder.measureId;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProblemMeasureRequest create() {
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
     * @return measureId
     */
    public Long getMeasureId() {
        return this.measureId;
    }

    /**
     * @return problemId
     */
    public String getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<DeleteProblemMeasureRequest, Builder> {
        private String clientToken; 
        private Long measureId; 
        private String problemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProblemMeasureRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.measureId = request.measureId;
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
         * measureId.
         */
        public Builder measureId(Long measureId) {
            this.putBodyParameter("measureId", measureId);
            this.measureId = measureId;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(String problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        @Override
        public DeleteProblemMeasureRequest build() {
            return new DeleteProblemMeasureRequest(this);
        } 

    } 

}
