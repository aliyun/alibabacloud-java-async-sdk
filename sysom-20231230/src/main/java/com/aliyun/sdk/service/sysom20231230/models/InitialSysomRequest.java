// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link InitialSysomRequest} extends {@link RequestModel}
 *
 * <p>InitialSysomRequest</p>
 */
public class InitialSysomRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("check_only")
    private Boolean checkOnly;

    private InitialSysomRequest(Builder builder) {
        super(builder);
        this.checkOnly = builder.checkOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitialSysomRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkOnly
     */
    public Boolean getCheckOnly() {
        return this.checkOnly;
    }

    public static final class Builder extends Request.Builder<InitialSysomRequest, Builder> {
        private Boolean checkOnly; 

        private Builder() {
            super();
        } 

        private Builder(InitialSysomRequest request) {
            super(request);
            this.checkOnly = request.checkOnly;
        } 

        /**
         * check_only.
         */
        public Builder checkOnly(Boolean checkOnly) {
            this.putBodyParameter("check_only", checkOnly);
            this.checkOnly = checkOnly;
            return this;
        }

        @Override
        public InitialSysomRequest build() {
            return new InitialSysomRequest(this);
        } 

    } 

}
