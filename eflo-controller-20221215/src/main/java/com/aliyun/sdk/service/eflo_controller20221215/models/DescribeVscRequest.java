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
 * {@link DescribeVscRequest} extends {@link RequestModel}
 *
 * <p>DescribeVscRequest</p>
 */
public class DescribeVscRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VscId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vscId;

    private DescribeVscRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vscId = builder.vscId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVscRequest create() {
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
     * @return vscId
     */
    public String getVscId() {
        return this.vscId;
    }

    public static final class Builder extends Request.Builder<DescribeVscRequest, Builder> {
        private String regionId; 
        private String vscId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVscRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vscId = request.vscId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-001</p>
         */
        public Builder vscId(String vscId) {
            this.putBodyParameter("VscId", vscId);
            this.vscId = vscId;
            return this;
        }

        @Override
        public DescribeVscRequest build() {
            return new DescribeVscRequest(this);
        } 

    } 

}
