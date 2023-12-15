// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInviterRequest} extends {@link RequestModel}
 *
 * <p>DescribeInviterRequest</p>
 */
public class DescribeInviterRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    private DescribeInviterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInviterRequest create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<DescribeInviterRequest, Builder> {
        private String regionId; 
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInviterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
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
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        @Override
        public DescribeInviterRequest build() {
            return new DescribeInviterRequest(this);
        } 

    } 

}
