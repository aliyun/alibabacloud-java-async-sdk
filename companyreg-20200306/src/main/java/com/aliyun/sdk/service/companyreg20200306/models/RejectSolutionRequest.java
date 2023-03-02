// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectSolutionRequest} extends {@link RequestModel}
 *
 * <p>RejectSolutionRequest</p>
 */
public class RejectSolutionRequest extends Request {
    @Query
    @NameInMap("Note")
    @Validation(required = true)
    private String note;

    @Query
    @NameInMap("SolutionBizId")
    @Validation(required = true)
    private String solutionBizId;

    private RejectSolutionRequest(Builder builder) {
        super(builder);
        this.note = builder.note;
        this.solutionBizId = builder.solutionBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectSolutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return solutionBizId
     */
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

    public static final class Builder extends Request.Builder<RejectSolutionRequest, Builder> {
        private String note; 
        private String solutionBizId; 

        private Builder() {
            super();
        } 

        private Builder(RejectSolutionRequest request) {
            super(request);
            this.note = request.note;
            this.solutionBizId = request.solutionBizId;
        } 

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * SolutionBizId.
         */
        public Builder solutionBizId(String solutionBizId) {
            this.putQueryParameter("SolutionBizId", solutionBizId);
            this.solutionBizId = solutionBizId;
            return this;
        }

        @Override
        public RejectSolutionRequest build() {
            return new RejectSolutionRequest(this);
        } 

    } 

}
