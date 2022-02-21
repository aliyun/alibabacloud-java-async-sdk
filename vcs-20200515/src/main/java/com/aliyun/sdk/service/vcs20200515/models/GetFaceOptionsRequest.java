// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFaceOptionsRequest} extends {@link RequestModel}
 *
 * <p>GetFaceOptionsRequest</p>
 */
public class GetFaceOptionsRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    private GetFaceOptionsRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFaceOptionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    public static final class Builder extends Request.Builder<GetFaceOptionsRequest, Builder> {
        private String corpId; 

        private Builder() {
            super();
        } 

        private Builder(GetFaceOptionsRequest response) {
            super(response);
            this.corpId = response.corpId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        @Override
        public GetFaceOptionsRequest build() {
            return new GetFaceOptionsRequest(this);
        } 

    } 

}
