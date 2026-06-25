// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeleteMobileAgentPackageRequest} extends {@link RequestModel}
 *
 * <p>DeleteMobileAgentPackageRequest</p>
 */
public class DeleteMobileAgentPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List<String> packageIds;

    private DeleteMobileAgentPackageRequest(Builder builder) {
        super(builder);
        this.packageIds = builder.packageIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMobileAgentPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packageIds
     */
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    public static final class Builder extends Request.Builder<DeleteMobileAgentPackageRequest, Builder> {
        private java.util.List<String> packageIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMobileAgentPackageRequest request) {
            super(request);
            this.packageIds = request.packageIds;
        } 

        /**
         * PackageIds.
         */
        public Builder packageIds(java.util.List<String> packageIds) {
            this.putQueryParameter("PackageIds", packageIds);
            this.packageIds = packageIds;
            return this;
        }

        @Override
        public DeleteMobileAgentPackageRequest build() {
            return new DeleteMobileAgentPackageRequest(this);
        } 

    } 

}
