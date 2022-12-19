// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedTagsRequest</p>
 */
public class DescribeGroupedTagsRequest extends Request {
    @Query
    @NameInMap("MachineTypes")
    private String machineTypes;

    private DescribeGroupedTagsRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public static final class Builder extends Request.Builder<DescribeGroupedTagsRequest, Builder> {
        private String machineTypes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupedTagsRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
        } 

        /**
         * The type of the asset to query. If you do not specify this parameter, the tags of all asset types are queried. Valid values:
         * <p>
         * 
         * *   **ecs**: server
         * *   **cloud_product**: Alibaba Cloud service
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        @Override
        public DescribeGroupedTagsRequest build() {
            return new DescribeGroupedTagsRequest(this);
        } 

    } 

}
