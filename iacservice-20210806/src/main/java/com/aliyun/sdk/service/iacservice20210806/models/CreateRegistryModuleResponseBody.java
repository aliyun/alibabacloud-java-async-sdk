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
 * {@link CreateRegistryModuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRegistryModuleResponseBody</p>
 */
public class CreateRegistryModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private CreateRegistryModuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRegistryModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private String requestId; 
        private String source; 

        private Builder() {
        } 

        private Builder(CreateRegistryModuleResponseBody model) {
            this.requestId = model.requestId;
            this.source = model.source;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C896FE0A-1BEA-5D01-BFF4-B03B82B9CA3D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The template source, which is a concatenation of \<namespaceName>/\<ModuleName>.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaceName/ModuleName</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public CreateRegistryModuleResponseBody build() {
            return new CreateRegistryModuleResponseBody(this);
        } 

    } 

}
