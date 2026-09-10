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
 * {@link GetCanTrySasRequest} extends {@link RequestModel}
 *
 * <p>GetCanTrySasRequest</p>
 */
public class GetCanTrySasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private GetCanTrySasRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCanTrySasRequest create() {
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

    public static final class Builder extends Request.Builder<GetCanTrySasRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(GetCanTrySasRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Security Center SDK request parameters.</p>
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public GetCanTrySasRequest build() {
            return new GetCanTrySasRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetCanTrySasRequest} extends {@link TeaModel}
     *
     * <p>GetCanTrySasRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromEcs")
        private Boolean fromEcs;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        private SdkRequest(Builder builder) {
            this.fromEcs = builder.fromEcs;
            this.lang = builder.lang;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
        }

        /**
         * @return fromEcs
         */
        public Boolean getFromEcs() {
            return this.fromEcs;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        public static final class Builder {
            private Boolean fromEcs; 
            private String lang; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.fromEcs = model.fromEcs;
                this.lang = model.lang;
            } 

            /**
             * <p>Specifies whether the request is from the ECS console. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The request is from the ECS console.</li>
             * <li><strong>false</strong>: The request is not from the ECS console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fromEcs(Boolean fromEcs) {
                this.fromEcs = fromEcs;
                return this;
            }

            /**
             * <p>The language type for the request and response messages. Default value: zh. Valid values:</p>
             * <ul>
             * <li><strong>zh</strong>: Chinese</li>
             * <li><strong>en</strong>: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
