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
 * {@link UpdatePbcSchemaRequest} extends {@link RequestModel}
 *
 * <p>UpdatePbcSchemaRequest</p>
 */
public class UpdatePbcSchemaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private PbcSchema body;

    private UpdatePbcSchemaRequest(Builder builder) {
        super(builder);
        this.pbcVersionId = builder.pbcVersionId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePbcSchemaRequest create() {
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
    public PbcSchema getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePbcSchemaRequest, Builder> {
        private Long pbcVersionId; 
        private PbcSchema body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePbcSchemaRequest request) {
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
         * <p>This parameter is required.</p>
         */
        public Builder body(PbcSchema body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePbcSchemaRequest build() {
            return new UpdatePbcSchemaRequest(this);
        } 

    } 

}
