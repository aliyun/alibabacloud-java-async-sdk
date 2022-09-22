// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileTransRequest} extends {@link RequestModel}
 *
 * <p>GetFileTransRequest</p>
 */
public class GetFileTransRequest extends Request {
    @Path
    @NameInMap("TransId")
    @Validation(required = true)
    private String transId;

    private GetFileTransRequest(Builder builder) {
        super(builder);
        this.transId = builder.transId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileTransRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return transId
     */
    public String getTransId() {
        return this.transId;
    }

    public static final class Builder extends Request.Builder<GetFileTransRequest, Builder> {
        private String transId; 

        private Builder() {
            super();
        } 

        private Builder(GetFileTransRequest request) {
            super(request);
            this.transId = request.transId;
        } 

        /**
         * 任务ID。
         */
        public Builder transId(String transId) {
            this.putPathParameter("TransId", transId);
            this.transId = transId;
            return this;
        }

        @Override
        public GetFileTransRequest build() {
            return new GetFileTransRequest(this);
        } 

    } 

}
