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

        private Builder(DescribeGroupedTagsRequest response) {
            super(response);
            this.machineTypes = response.machineTypes;
        } 

        /**
         * MachineTypes.
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
