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
 * {@link UpdatePbcInstructionRequest} extends {@link RequestModel}
 *
 * <p>UpdatePbcInstructionRequest</p>
 */
public class UpdatePbcInstructionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PbcInstructionUpdateCmd body;

    private UpdatePbcInstructionRequest(Builder builder) {
        super(builder);
        this.pbcVersionId = builder.pbcVersionId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePbcInstructionRequest create() {
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

    /**
     * @return body
     */
    public PbcInstructionUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePbcInstructionRequest, Builder> {
        private Long pbcVersionId; 
        private PbcInstructionUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePbcInstructionRequest request) {
            super(request);
            this.pbcVersionId = request.pbcVersionId;
            this.body = request.body;
        } 

        /**
         * pbcVersionId.
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.putPathParameter("pbcVersionId", pbcVersionId);
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(PbcInstructionUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePbcInstructionRequest build() {
            return new UpdatePbcInstructionRequest(this);
        } 

    } 

}
