// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetVodTemplateRequest</p>
 */
public class GetVodTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VodTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vodTemplateId;

    private GetVodTemplateRequest(Builder builder) {
        super(builder);
        this.vodTemplateId = builder.vodTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<GetVodTemplateRequest, Builder> {
        private String vodTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(GetVodTemplateRequest request) {
            super(request);
            this.vodTemplateId = request.vodTemplateId;
        } 

        /**
         * <p>The ID of the snapshot template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c49f2f4c0969*****fcd446690</p>
         */
        public Builder vodTemplateId(String vodTemplateId) {
            this.putQueryParameter("VodTemplateId", vodTemplateId);
            this.vodTemplateId = vodTemplateId;
            return this;
        }

        @Override
        public GetVodTemplateRequest build() {
            return new GetVodTemplateRequest(this);
        } 

    } 

}
