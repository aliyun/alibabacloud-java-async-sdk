// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bss20140714.models;

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
 * {@link OpenCallbackRequest} extends {@link RequestModel}
 *
 * <p>OpenCallbackRequest</p>
 */
public class OpenCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paramStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramStr;

    private OpenCallbackRequest(Builder builder) {
        super(builder);
        this.paramStr = builder.paramStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramStr
     */
    public String getParamStr() {
        return this.paramStr;
    }

    public static final class Builder extends Request.Builder<OpenCallbackRequest, Builder> {
        private String paramStr; 

        private Builder() {
            super();
        } 

        private Builder(OpenCallbackRequest request) {
            super(request);
            this.paramStr = request.paramStr;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder paramStr(String paramStr) {
            this.putQueryParameter("paramStr", paramStr);
            this.paramStr = paramStr;
            return this;
        }

        @Override
        public OpenCallbackRequest build() {
            return new OpenCallbackRequest(this);
        } 

    } 

}
