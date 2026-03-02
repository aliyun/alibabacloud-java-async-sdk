// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link GetPbcInstructionRequest} extends {@link RequestModel}
 *
 * <p>GetPbcInstructionRequest</p>
 */
public class GetPbcInstructionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    private GetPbcInstructionRequest(Builder builder) {
        super(builder);
        this.pbcVersionId = builder.pbcVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPbcInstructionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcVersionId
     */
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public static final class Builder extends Request.Builder<GetPbcInstructionRequest, Builder> {
        private Long pbcVersionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPbcInstructionRequest request) {
            super(request);
            this.pbcVersionId = request.pbcVersionId;
        } 

        /**
         * pbcVersionId.
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.putPathParameter("pbcVersionId", pbcVersionId);
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        @Override
        public GetPbcInstructionRequest build() {
            return new GetPbcInstructionRequest(this);
        } 

    } 

}
