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
 * {@link DescribeCrossCloudRegionRequest} extends {@link RequestModel}
 *
 * <p>DescribeCrossCloudRegionRequest</p>
 */
public class DescribeCrossCloudRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProvider")
    private String cloudProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossCloudRegionId")
    private String crossCloudRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    private DescribeCrossCloudRegionRequest(Builder builder) {
        super(builder);
        this.cloudProvider = builder.cloudProvider;
        this.crossCloudRegionId = builder.crossCloudRegionId;
        this.DBType = builder.DBType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossCloudRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    public static final class Builder extends Request.Builder<DescribeCrossCloudRegionRequest, Builder> {
        private String cloudProvider; 
        private String crossCloudRegionId; 
        private String DBType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCrossCloudRegionRequest request) {
            super(request);
            this.cloudProvider = request.cloudProvider;
            this.crossCloudRegionId = request.crossCloudRegionId;
            this.DBType = request.DBType;
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

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        @Override
        public DescribeCrossCloudRegionRequest build() {
            return new DescribeCrossCloudRegionRequest(this);
        } 

    } 

}
