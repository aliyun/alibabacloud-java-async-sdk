// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDocParserJobResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocParserJobResultRequest</p>
 */
public class DescribeDocParserJobResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RagInstanceId")
    private String ragInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeDocParserJobResultRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.ragInstanceId = builder.ragInstanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocParserJobResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return ragInstanceId
     */
    public String getRagInstanceId() {
        return this.ragInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeDocParserJobResultRequest, Builder> {
        private String dtsJobId; 
        private String ragInstanceId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDocParserJobResultRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.ragInstanceId = request.ragInstanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The task ID (DtsJobId) returned when the document parsing task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-20250729-y0zz3t13h7d****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The instance ID of the DTS RagFlow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsgbe12he619iy801</p>
         */
        public Builder ragInstanceId(String ragInstanceId) {
            this.putQueryParameter("RagInstanceId", ragInstanceId);
            this.ragInstanceId = ragInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the task. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeDocParserJobResultRequest build() {
            return new DescribeDocParserJobResultRequest(this);
        } 

    } 

}
