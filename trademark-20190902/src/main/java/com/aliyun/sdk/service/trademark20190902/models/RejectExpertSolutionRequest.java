// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectExpertSolutionRequest} extends {@link RequestModel}
 *
 * <p>RejectExpertSolutionRequest</p>
 */
public class RejectExpertSolutionRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("Note")
    private String note;

    private RejectExpertSolutionRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.note = builder.note;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectExpertSolutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    public static final class Builder extends Request.Builder<RejectExpertSolutionRequest, Builder> {
        private String bizId; 
        private String note; 

        private Builder() {
            super();
        } 

        private Builder(RejectExpertSolutionRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.note = request.note;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        @Override
        public RejectExpertSolutionRequest build() {
            return new RejectExpertSolutionRequest(this);
        } 

    } 

}
