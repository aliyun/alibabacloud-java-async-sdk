// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetRCSSignatureRequest} extends {@link RequestModel}
 *
 * <p>GetRCSSignatureRequest</p>
 */
public class GetRCSSignatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    private GetRCSSignatureRequest(Builder builder) {
        super(builder);
        this.signName = builder.signName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRCSSignatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    public static final class Builder extends Request.Builder<GetRCSSignatureRequest, Builder> {
        private String signName; 

        private Builder() {
            super();
        } 

        private Builder(GetRCSSignatureRequest request) {
            super(request);
            this.signName = request.signName;
        } 

        /**
         * <p>签名名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        @Override
        public GetRCSSignatureRequest build() {
            return new GetRCSSignatureRequest(this);
        } 

    } 

}
