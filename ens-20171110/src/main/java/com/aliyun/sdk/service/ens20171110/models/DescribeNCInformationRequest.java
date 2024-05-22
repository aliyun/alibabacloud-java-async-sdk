// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNCInformationRequest} extends {@link RequestModel}
 *
 * <p>DescribeNCInformationRequest</p>
 */
public class DescribeNCInformationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private DescribeNCInformationRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNCInformationRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<DescribeNCInformationRequest, Builder> {
        private String ensRegionId; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNCInformationRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.resourceId = request.resourceId;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public DescribeNCInformationRequest build() {
            return new DescribeNCInformationRequest(this);
        } 

    } 

}
