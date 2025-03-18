// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExtensionsResponseBody</p>
 */
public class CreateExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extensions")
    private String extensions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExtensionsResponseBody(Builder builder) {
        this.extensions = builder.extensions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExtensionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String extensions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateExtensionsResponseBody model) {
            this.extensions = model.extensions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The name of the extension that you want to install. Multiple extension names are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>citext, dblink</p>
         */
        public Builder extensions(String extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExtensionsResponseBody build() {
            return new CreateExtensionsResponseBody(this);
        } 

    } 

}
