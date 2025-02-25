// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsRdsInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsRdsInstancesRequest</p>
 */
public class DescribeDrdsRdsInstancesRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private DescribeDrdsRdsInstancesRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsRdsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsRdsInstancesRequest, Builder> {
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsRdsInstancesRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * The ID of the PolarDB-X instance.
         * <p>
         * 
         * > You can call the [DescribeDrdsInstances](~~139284~~) operation to query the information about instances in the specified account, such as the IDs of the instances.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public DescribeDrdsRdsInstancesRequest build() {
            return new DescribeDrdsRdsInstancesRequest(this);
        } 

    } 

}
