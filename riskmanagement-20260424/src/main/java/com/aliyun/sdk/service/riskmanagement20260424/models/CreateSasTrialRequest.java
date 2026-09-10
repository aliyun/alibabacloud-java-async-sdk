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
         * <p>The region ID of the access control instance. You can call the DescribeRegions operation to query the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Security Center SDK request.</p>
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
             * <p>The reason for applying for the trial.</p>
             * 
             * <strong>example:</strong>
             * <p>for poc</p>
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
             * <p>The language of the request and response. Valid values:</p>
             * <ul>
             * <li><p><strong>zh</strong> (default): Chinese.</p>
             * </li>
             * <li><p><strong>en</strong>: English.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The reason for applying for the trial.</p>
             */
            public Builder requestForm(RequestForm requestForm) {
                this.requestForm = requestForm;
                return this;
            }

            /**
             * <p>The trial type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: trial not allowed</li>
             * <li><strong>1</strong>: first trial</li>
             * <li><strong>2</strong>: second trial</li>
             * </ul>
             * <blockquote>
             * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain this parameter. The trial can be started only when the value is not 0.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tryType(Integer tryType) {
                this.tryType = tryType;
                return this;
            }

            /**
             * <p>The trial edition. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: Enterprise Edition.</li>
             * <li><strong>7</strong>: Ultimate Edition.</li>
             * </ul>
             * <blockquote>
             * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
