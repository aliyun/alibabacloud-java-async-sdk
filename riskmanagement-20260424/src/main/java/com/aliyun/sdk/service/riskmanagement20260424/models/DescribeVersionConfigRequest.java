// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link DescribeVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeVersionConfigRequest</p>
 */
public class DescribeVersionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private DescribeVersionConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionConfigRequest create() {
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
     * @return sdkRequest
     */
    public SdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static final class Builder extends Request.Builder<DescribeVersionConfigRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVersionConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SdkRequest.
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public DescribeVersionConfigRequest build() {
            return new DescribeVersionConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVersionConfigRequest} extends {@link TeaModel}
     *
     * <p>DescribeVersionConfigRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
        private Long resourceDirectoryAccountId;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        private SdkRequest(Builder builder) {
            this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
            this.sourceIp = builder.sourceIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
        }

        /**
         * @return resourceDirectoryAccountId
         */
        public Long getResourceDirectoryAccountId() {
            return this.resourceDirectoryAccountId;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        public static final class Builder {
            private Long resourceDirectoryAccountId; 
            private String sourceIp; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.resourceDirectoryAccountId = model.resourceDirectoryAccountId;
                this.sourceIp = model.sourceIp;
            } 

            /**
             * ResourceDirectoryAccountId.
             */
            public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
                this.resourceDirectoryAccountId = resourceDirectoryAccountId;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
