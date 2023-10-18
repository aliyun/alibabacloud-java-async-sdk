// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteVodTemplateRequest</p>
 */
public class DeleteVodTemplateRequest extends Request {
    @Query
    @NameInMap("VodTemplateId")
    @Validation(required = true)
    private String vodTemplateId;

    private DeleteVodTemplateRequest(Builder builder) {
        super(builder);
        this.vodTemplateId = builder.vodTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVodTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vodTemplateId
     */
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

    public static final class Builder extends Request.Builder<DeleteVodTemplateRequest, Builder> {
        private String vodTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVodTemplateRequest request) {
            super(request);
            this.vodTemplateId = request.vodTemplateId;
        } 

        /**
         * The ID of the snapshot template.
         */
        public Builder vodTemplateId(String vodTemplateId) {
            this.putQueryParameter("VodTemplateId", vodTemplateId);
            this.vodTemplateId = vodTemplateId;
            return this;
        }

        @Override
        public DeleteVodTemplateRequest build() {
            return new DeleteVodTemplateRequest(this);
        } 

    } 

}
