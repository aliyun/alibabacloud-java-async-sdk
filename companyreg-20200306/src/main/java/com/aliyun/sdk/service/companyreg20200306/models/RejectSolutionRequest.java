// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RejectSolutionRequest} extends {@link RequestModel}
 *
 * <p>RejectSolutionRequest</p>
 */
public class RejectSolutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    @com.aliyun.core.annotation.Validation(required = true)
    private String note;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String solutionBizId;

    private RejectSolutionRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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
        private String bizType; 
        private String note; 
        private String solutionBizId; 

        private Builder() {
            super();
        } 

        private Builder(RejectSolutionRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.note = request.note;
            this.solutionBizId = request.solutionBizId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>S20200512114050000001</p>
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
