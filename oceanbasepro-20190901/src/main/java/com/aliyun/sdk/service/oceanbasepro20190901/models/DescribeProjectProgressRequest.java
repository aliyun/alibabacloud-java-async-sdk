// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeProjectProgressRequest</p>
 */
public class DescribeProjectProgressRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DescribeProjectProgressRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectProgressRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DescribeProjectProgressRequest, Builder> {
        private String regionId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProjectProgressRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
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
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DescribeProjectProgressRequest build() {
            return new DescribeProjectProgressRequest(this);
        } 

    } 

}
