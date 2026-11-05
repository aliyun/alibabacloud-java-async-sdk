// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CmsV1MigrationCheck} extends {@link TeaModel}
 *
 * <p>CmsV1MigrationCheck</p>
 */
public class CmsV1MigrationCheck extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private CmsV1MigrationCheck(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CmsV1MigrationCheck create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String code; 
        private String message; 

        private Builder() {
        } 

        private Builder(CmsV1MigrationCheck model) {
            this.code = model.code;
            this.message = model.message;
        } 

        /**
         * <p>The check result code, where NAME_ indicates a naming issue and UNSUPPORTED_ indicates an unsupported resource.</p>
         * 
         * <strong>example:</strong>
         * <p>NAME_INVALID</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The check result description.</p>
         * 
         * <strong>example:</strong>
         * <p>Target name must contain 1 to 256 characters</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public CmsV1MigrationCheck build() {
            return new CmsV1MigrationCheck(this);
        } 

    } 

}
