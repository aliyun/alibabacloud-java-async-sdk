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
 * {@link DeleteRegistryNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteRegistryNamespaceRequest</p>
 */
public class DeleteRegistryNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    private DeleteRegistryNamespaceRequest(Builder builder) {
        super(builder);
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRegistryNamespaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public static final class Builder extends Request.Builder<DeleteRegistryNamespaceRequest, Builder> {
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRegistryNamespaceRequest request) {
            super(request);
            this.namespaceName = request.namespaceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putPathParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        @Override
        public DeleteRegistryNamespaceRequest build() {
            return new DeleteRegistryNamespaceRequest(this);
        } 

    } 

}
