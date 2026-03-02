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
 * {@link UpdatePdpLaneRequest} extends {@link RequestModel}
 *
 * <p>UpdatePdpLaneRequest</p>
 */
public class UpdatePdpLaneRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private PdpLaneUpdateCmd body;

    private UpdatePdpLaneRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePdpLaneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return body
     */
    public PdpLaneUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePdpLaneRequest, Builder> {
        private Long id; 
        private PdpLaneUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePdpLaneRequest request) {
            super(request);
            this.id = request.id;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(PdpLaneUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePdpLaneRequest build() {
            return new UpdatePdpLaneRequest(this);
        } 

    } 

}
