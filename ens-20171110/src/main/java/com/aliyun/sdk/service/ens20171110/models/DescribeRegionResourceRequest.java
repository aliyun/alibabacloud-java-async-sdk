// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeRegionResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionResourceRequest</p>
 */
public class DescribeRegionResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspType")
    private String ispType;

    private DescribeRegionResourceRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.ispType = builder.ispType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return ispType
     */
    public String getIspType() {
        return this.ispType;
    }

    public static final class Builder extends Request.Builder<DescribeRegionResourceRequest, Builder> {
        private String ensRegionId; 
        private String ispType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionResourceRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.ispType = request.ispType;
        } 

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * IspType.
         */
        public Builder ispType(String ispType) {
            this.putQueryParameter("IspType", ispType);
            this.ispType = ispType;
            return this;
        }

        @Override
        public DescribeRegionResourceRequest build() {
            return new DescribeRegionResourceRequest(this);
        } 

    } 

}
