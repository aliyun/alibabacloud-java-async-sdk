// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpdRequest} extends {@link RequestModel}
 *
 * <p>GetVpdRequest</p>
 */
public class GetVpdRequest extends Request {
    @Body
    @NameInMap("VpdId")
    private String vpdId;

    private GetVpdRequest(Builder builder) {
        super(builder);
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<GetVpdRequest, Builder> {
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(GetVpdRequest request) {
            super(request);
            this.vpdId = request.vpdId;
        } 

        /**
         * 灵骏网段ID
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public GetVpdRequest build() {
            return new GetVpdRequest(this);
        } 

    } 

}
