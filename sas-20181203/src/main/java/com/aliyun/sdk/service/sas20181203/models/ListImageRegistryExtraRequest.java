// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListImageRegistryExtraRequest} extends {@link RequestModel}
 *
 * <p>ListImageRegistryExtraRequest</p>
 */
public class ListImageRegistryExtraRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registryId;

    private ListImageRegistryExtraRequest(Builder builder) {
        super(builder);
        this.registryId = builder.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageRegistryExtraRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryId
     */
    public Long getRegistryId() {
        return this.registryId;
    }

    public static final class Builder extends Request.Builder<ListImageRegistryExtraRequest, Builder> {
        private Long registryId; 

        private Builder() {
            super();
        } 

        private Builder(ListImageRegistryExtraRequest request) {
            super(request);
            this.registryId = request.registryId;
        } 

        /**
         * <p>Image registry ID.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~PageImageRegistry~~">PageImageRegistry</a> interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25363</p>
         */
        public Builder registryId(Long registryId) {
            this.putQueryParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        @Override
        public ListImageRegistryExtraRequest build() {
            return new ListImageRegistryExtraRequest(this);
        } 

    } 

}
