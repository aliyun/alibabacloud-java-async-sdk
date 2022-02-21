// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHBaseInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListHBaseInstancesRequest</p>
 */
public class ListHBaseInstancesRequest extends Request {
    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private ListHBaseInstancesRequest(Builder builder) {
        super(builder);
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHBaseInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListHBaseInstancesRequest, Builder> {
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListHBaseInstancesRequest response) {
            super(response);
            this.vpcId = response.vpcId;
        } 

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListHBaseInstancesRequest build() {
            return new ListHBaseInstancesRequest(this);
        } 

    } 

}
