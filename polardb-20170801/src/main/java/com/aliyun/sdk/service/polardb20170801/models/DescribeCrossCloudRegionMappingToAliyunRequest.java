// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeCrossCloudRegionMappingToAliyunRequest} extends {@link RequestModel}
 *
 * <p>DescribeCrossCloudRegionMappingToAliyunRequest</p>
 */
public class DescribeCrossCloudRegionMappingToAliyunRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunRegionId")
    private String aliyunRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProvider")
    private String cloudProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossCloudRegionId")
    private String crossCloudRegionId;

    private DescribeCrossCloudRegionMappingToAliyunRequest(Builder builder) {
        super(builder);
        this.aliyunRegionId = builder.aliyunRegionId;
        this.cloudProvider = builder.cloudProvider;
        this.crossCloudRegionId = builder.crossCloudRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossCloudRegionMappingToAliyunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunRegionId
     */
    public String getAliyunRegionId() {
        return this.aliyunRegionId;
    }

    /**
     * @return cloudProvider
     */
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    /**
     * @return crossCloudRegionId
     */
    public String getCrossCloudRegionId() {
        return this.crossCloudRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeCrossCloudRegionMappingToAliyunRequest, Builder> {
        private String aliyunRegionId; 
        private String cloudProvider; 
        private String crossCloudRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCrossCloudRegionMappingToAliyunRequest request) {
            super(request);
            this.aliyunRegionId = request.aliyunRegionId;
            this.cloudProvider = request.cloudProvider;
            this.crossCloudRegionId = request.crossCloudRegionId;
        } 

        /**
         * AliyunRegionId.
         */
        public Builder aliyunRegionId(String aliyunRegionId) {
            this.putQueryParameter("AliyunRegionId", aliyunRegionId);
            this.aliyunRegionId = aliyunRegionId;
            return this;
        }

        /**
         * CloudProvider.
         */
        public Builder cloudProvider(String cloudProvider) {
            this.putQueryParameter("CloudProvider", cloudProvider);
            this.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * CrossCloudRegionId.
         */
        public Builder crossCloudRegionId(String crossCloudRegionId) {
            this.putQueryParameter("CrossCloudRegionId", crossCloudRegionId);
            this.crossCloudRegionId = crossCloudRegionId;
            return this;
        }

        @Override
        public DescribeCrossCloudRegionMappingToAliyunRequest build() {
            return new DescribeCrossCloudRegionMappingToAliyunRequest(this);
        } 

    } 

}
