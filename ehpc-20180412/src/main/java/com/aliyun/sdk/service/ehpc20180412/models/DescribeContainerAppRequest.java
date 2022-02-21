// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerAppRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerAppRequest</p>
 */
public class DescribeContainerAppRequest extends Request {
    @Query
    @NameInMap("ContainerId")
    @Validation(required = true)
    private String containerId;

    private DescribeContainerAppRequest(Builder builder) {
        super(builder);
        this.containerId = builder.containerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    public static final class Builder extends Request.Builder<DescribeContainerAppRequest, Builder> {
        private String containerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerAppRequest response) {
            super(response);
            this.containerId = response.containerId;
        } 

        /**
         * ContainerId.
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        @Override
        public DescribeContainerAppRequest build() {
            return new DescribeContainerAppRequest(this);
        } 

    } 

}
