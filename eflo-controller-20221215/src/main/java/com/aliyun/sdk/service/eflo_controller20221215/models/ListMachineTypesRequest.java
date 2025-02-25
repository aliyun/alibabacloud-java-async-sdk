// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListMachineTypesRequest} extends {@link RequestModel}
 *
 * <p>ListMachineTypesRequest</p>
 */
public class ListMachineTypesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private ListMachineTypesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachineTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ListMachineTypesRequest, Builder> {
        private String regionId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListMachineTypesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ListMachineTypesRequest build() {
            return new ListMachineTypesRequest(this);
        } 

    } 

}
