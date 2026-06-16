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
 * {@link CreateSasTrialRequest} extends {@link RequestModel}
 *
 * <p>CreateSasTrialRequest</p>
 */
public class CreateSasTrialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private CreateSasTrialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSasTrialRequest create() {
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

    public static final class Builder extends Request.Builder<CreateSasTrialRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(CreateSasTrialRequest request) {
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
        public CreateSasTrialRequest build() {
            return new CreateSasTrialRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSasTrialRequest} extends {@link TeaModel}
     *
     * <p>CreateSasTrialRequest</p>
     */
    public static class RequestForm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TryReason")
        private String tryReason;

        private RequestForm(Builder builder) {
            this.tryReason = builder.tryReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestForm create() {
            return builder().build();
        }

        /**
         * @return tryReason
         */
        public String getTryReason() {
            return this.tryReason;
        }

        public static final class Builder {
            private String tryReason; 

            private Builder() {
            } 

            private Builder(RequestForm model) {
                this.tryReason = model.tryReason;
            } 

            /**
             * TryReason.
             */
            public Builder tryReason(String tryReason) {
                this.tryReason = tryReason;
                return this;
            }

            public RequestForm build() {
                return new RequestForm(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSasTrialRequest} extends {@link TeaModel}
     *
     * <p>CreateSasTrialRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromEcs")
        private Boolean fromEcs;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("RequestForm")
        private RequestForm requestForm;

        @com.aliyun.core.annotation.NameInMap("TryType")
        private Integer tryType;

        @com.aliyun.core.annotation.NameInMap("TryVersion")
        private Integer tryVersion;

        private SdkRequest(Builder builder) {
            this.fromEcs = builder.fromEcs;
            this.lang = builder.lang;
            this.requestForm = builder.requestForm;
            this.tryType = builder.tryType;
            this.tryVersion = builder.tryVersion;
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

        /**
         * @return requestForm
         */
        public RequestForm getRequestForm() {
            return this.requestForm;
        }

        /**
         * @return tryType
         */
        public Integer getTryType() {
            return this.tryType;
        }

        /**
         * @return tryVersion
         */
        public Integer getTryVersion() {
            return this.tryVersion;
        }

        public static final class Builder {
            private Boolean fromEcs; 
            private String lang; 
            private RequestForm requestForm; 
            private Integer tryType; 
            private Integer tryVersion; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.fromEcs = model.fromEcs;
                this.lang = model.lang;
                this.requestForm = model.requestForm;
                this.tryType = model.tryType;
                this.tryVersion = model.tryVersion;
            } 

            /**
             * FromEcs.
             */
            public Builder fromEcs(Boolean fromEcs) {
                this.fromEcs = fromEcs;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * RequestForm.
             */
            public Builder requestForm(RequestForm requestForm) {
                this.requestForm = requestForm;
                return this;
            }

            /**
             * TryType.
             */
            public Builder tryType(Integer tryType) {
                this.tryType = tryType;
                return this;
            }

            /**
             * TryVersion.
             */
            public Builder tryVersion(Integer tryVersion) {
                this.tryVersion = tryVersion;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
