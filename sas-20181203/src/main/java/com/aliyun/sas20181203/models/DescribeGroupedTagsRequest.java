// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public static final class Builder extends Request.Builder {
        private String machineTypes; 

        /**
         * <p>MachineTypes.</p>
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        public DescribeGroupedTagsRequest build() {
            return new DescribeGroupedTagsRequest(this);
        } 

    } 

}
