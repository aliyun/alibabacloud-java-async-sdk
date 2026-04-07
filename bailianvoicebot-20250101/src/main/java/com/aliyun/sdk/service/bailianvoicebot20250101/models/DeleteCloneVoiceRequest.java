// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link DeleteCloneVoiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloneVoiceRequest</p>
 */
public class DeleteCloneVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloneVoiceId")
    private String cloneVoiceId;

    private DeleteCloneVoiceRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.cloneVoiceId = builder.cloneVoiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloneVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return cloneVoiceId
     */
    public String getCloneVoiceId() {
        return this.cloneVoiceId;
    }

    public static final class Builder extends Request.Builder<DeleteCloneVoiceRequest, Builder> {
        private String businessUnitId; 
        private String cloneVoiceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloneVoiceRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.cloneVoiceId = request.cloneVoiceId;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * CloneVoiceId.
         */
        public Builder cloneVoiceId(String cloneVoiceId) {
            this.putBodyParameter("CloneVoiceId", cloneVoiceId);
            this.cloneVoiceId = cloneVoiceId;
            return this;
        }

        @Override
        public DeleteCloneVoiceRequest build() {
            return new DeleteCloneVoiceRequest(this);
        } 

    } 

}
