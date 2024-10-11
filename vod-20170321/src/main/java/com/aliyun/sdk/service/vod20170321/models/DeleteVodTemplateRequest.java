// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteVodTemplateRequest</p>
 */
public class DeleteVodTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VodTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the snapshot template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f5b228fe6930e*****d6bf55bd87789</p>
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
