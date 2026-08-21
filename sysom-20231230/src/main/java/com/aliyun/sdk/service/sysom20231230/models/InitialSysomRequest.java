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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("check_only")
    private Boolean checkOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private InitialSysomRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.checkOnly = builder.checkOnly;
        this.source = builder.source;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return checkOnly
     */
    public Boolean getCheckOnly() {
        return this.checkOnly;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<InitialSysomRequest, Builder> {
        private String xDebugId; 
        private Boolean checkOnly; 
        private String source; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(InitialSysomRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.checkOnly = request.checkOnly;
            this.source = request.source;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * check_only.
         */
        public Builder checkOnly(Boolean checkOnly) {
            this.putBodyParameter("check_only", checkOnly);
            this.checkOnly = checkOnly;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public InitialSysomRequest build() {
            return new InitialSysomRequest(this);
        } 

    } 

}
