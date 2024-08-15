// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemTimeLinesRequest} extends {@link RequestModel}
 *
 * <p>ListProblemTimeLinesRequest</p>
 */
public class ListProblemTimeLinesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    private Long problemId;

    private ListProblemTimeLinesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProblemTimeLinesRequest create() {
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

    public static final class Builder extends Request.Builder<ListProblemTimeLinesRequest, Builder> {
        private String clientToken; 
        private Long problemId; 

        private Builder() {
            super();
        } 

        private Builder(ListProblemTimeLinesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
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
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        @Override
        public ListProblemTimeLinesRequest build() {
            return new ListProblemTimeLinesRequest(this);
        } 

    } 

}
