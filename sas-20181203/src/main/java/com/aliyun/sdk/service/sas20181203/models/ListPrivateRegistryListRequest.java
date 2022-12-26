// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateRegistryListRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateRegistryListRequest</p>
 */
public class ListPrivateRegistryListRequest extends Request {
    @Query
    @NameInMap("RegistryType")
    private String registryType;

    private ListPrivateRegistryListRequest(Builder builder) {
        super(builder);
        this.registryType = builder.registryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateRegistryListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryType
     */
    public String getRegistryType() {
        return this.registryType;
    }

    public static final class Builder extends Request.Builder<ListPrivateRegistryListRequest, Builder> {
        private String registryType; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateRegistryListRequest request) {
            super(request);
            this.registryType = request.registryType;
        } 

        /**
         * RegistryType.
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        @Override
        public ListPrivateRegistryListRequest build() {
            return new ListPrivateRegistryListRequest(this);
        } 

    } 

}
