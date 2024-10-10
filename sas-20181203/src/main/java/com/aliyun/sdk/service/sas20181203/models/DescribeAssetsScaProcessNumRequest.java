// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAssetsScaProcessNumRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetsScaProcessNumRequest</p>
 */
public class DescribeAssetsScaProcessNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > uuidList;

    private DescribeAssetsScaProcessNumRequest(Builder builder) {
        super(builder);
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetsScaProcessNumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<DescribeAssetsScaProcessNumRequest, Builder> {
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetsScaProcessNumRequest request) {
            super(request);
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The UUIDs of the servers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public DescribeAssetsScaProcessNumRequest build() {
            return new DescribeAssetsScaProcessNumRequest(this);
        } 

    } 

}
