// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSignatureRequest} extends {@link RequestModel}
 *
 * <p>GetSignatureRequest</p>
 */
public class GetSignatureRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private GetSignatureRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSignatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetSignatureRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetSignatureRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 签名Id，可通过ListSignatures查询账号下的签名列表，获取签名Id。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetSignatureRequest build() {
            return new GetSignatureRequest(this);
        } 

    } 

}
