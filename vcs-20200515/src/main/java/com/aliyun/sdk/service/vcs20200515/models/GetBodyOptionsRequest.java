// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBodyOptionsRequest} extends {@link RequestModel}
 *
 * <p>GetBodyOptionsRequest</p>
 */
public class GetBodyOptionsRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    private GetBodyOptionsRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBodyOptionsRequest create() {
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

    public static final class Builder extends Request.Builder<GetBodyOptionsRequest, Builder> {
        private String corpId; 

        private Builder() {
            super();
        } 

        private Builder(GetBodyOptionsRequest response) {
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
        public GetBodyOptionsRequest build() {
            return new GetBodyOptionsRequest(this);
        } 

    } 

}
