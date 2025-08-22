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
 * {@link GetRegistryNamespaceRequest} extends {@link RequestModel}
 *
 * <p>GetRegistryNamespaceRequest</p>
 */
public class GetRegistryNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    private GetRegistryNamespaceRequest(Builder builder) {
        super(builder);
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegistryNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<GetRegistryNamespaceRequest, Builder> {
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(GetRegistryNamespaceRequest request) {
            super(request);
            this.namespaceName = request.namespaceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform-alicloud-modules</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putPathParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        @Override
        public GetRegistryNamespaceRequest build() {
            return new GetRegistryNamespaceRequest(this);
        } 

    } 

}
