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
 * {@link CreateModuleVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModuleVersionResponseBody</p>
 */
public class CreateModuleVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    private String moduleVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateModuleVersionResponseBody(Builder builder) {
        this.moduleVersion = builder.moduleVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModuleVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String moduleVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateModuleVersionResponseBody model) {
            this.moduleVersion = model.moduleVersion;
            this.requestId = model.requestId;
        } 

        /**
         * moduleVersion.
         */
        public Builder moduleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModuleVersionResponseBody build() {
            return new CreateModuleVersionResponseBody(this);
        } 

    } 

}
