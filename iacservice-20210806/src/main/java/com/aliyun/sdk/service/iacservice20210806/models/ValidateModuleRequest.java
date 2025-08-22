// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ValidateModuleRequest} extends {@link RequestModel}
 *
 * <p>ValidateModuleRequest</p>
 */
public class ValidateModuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codeMap")
    private java.util.Map<String, ?> codeMap;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourcePath")
    private String sourcePath;

    private ValidateModuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.code = builder.code;
        this.codeMap = builder.codeMap;
        this.source = builder.source;
        this.sourcePath = builder.sourcePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateModuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeMap
     */
    public java.util.Map<String, ?> getCodeMap() {
        return this.codeMap;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourcePath
     */
    public String getSourcePath() {
        return this.sourcePath;
    }

    public static final class Builder extends Request.Builder<ValidateModuleRequest, Builder> {
        private String clientToken; 
        private String code; 
        private java.util.Map<String, ?> codeMap; 
        private String source; 
        private String sourcePath; 

        private Builder() {
            super();
        } 

        private Builder(ValidateModuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.code = request.code;
            this.codeMap = request.codeMap;
            this.source = request.source;
            this.sourcePath = request.sourcePath;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * codeMap.
         */
        public Builder codeMap(java.util.Map<String, ?> codeMap) {
            this.putBodyParameter("codeMap", codeMap);
            this.codeMap = codeMap;
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
         * sourcePath.
         */
        public Builder sourcePath(String sourcePath) {
            this.putBodyParameter("sourcePath", sourcePath);
            this.sourcePath = sourcePath;
            return this;
        }

        @Override
        public ValidateModuleRequest build() {
            return new ValidateModuleRequest(this);
        } 

    } 

}
