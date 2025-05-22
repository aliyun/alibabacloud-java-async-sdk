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
 * {@link RejectUserSolutionRequest} extends {@link RequestModel}
 *
 * <p>RejectUserSolutionRequest</p>
 */
public class RejectUserSolutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    @com.aliyun.core.annotation.Validation(required = true)
    private String note;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String solutionBizId;

    private RejectUserSolutionRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.note = builder.note;
        this.solutionBizId = builder.solutionBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectUserSolutionRequest create() {
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

    public static final class Builder extends Request.Builder<RejectUserSolutionRequest, Builder> {
        private String bizType; 
        private String note; 
        private String solutionBizId; 

        private Builder() {
            super();
        } 

        private Builder(RejectUserSolutionRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.note = request.note;
            this.solutionBizId = request.solutionBizId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.companyreg</p>
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
         * <p>S20211227151912000001</p>
         */
        public Builder solutionBizId(String solutionBizId) {
            this.putQueryParameter("SolutionBizId", solutionBizId);
            this.solutionBizId = solutionBizId;
            return this;
        }

        @Override
        public RejectUserSolutionRequest build() {
            return new RejectUserSolutionRequest(this);
        } 

    } 

}
