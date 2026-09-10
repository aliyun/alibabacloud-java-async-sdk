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
 * {@link CreateRegistryNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRegistryNamespaceResponseBody</p>
 */
public class CreateRegistryNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateRegistryNamespaceResponseBody(Builder builder) {
        this.namespaceName = builder.namespaceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRegistryNamespaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String namespaceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRegistryNamespaceResponseBody model) {
            this.namespaceName = model.namespaceName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>NamespaceName</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4672AE3-C313-5B7A-BB24-45345570D398</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRegistryNamespaceResponseBody build() {
            return new CreateRegistryNamespaceResponseBody(this);
        } 

    } 

}
