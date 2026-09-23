// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListOIDCProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOIDCProvidersResponseBody</p>
 */
public class ListOIDCProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("OIDCProviders")
    private OIDCProviders OIDCProviders;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListOIDCProvidersResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.OIDCProviders = builder.OIDCProviders;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOIDCProvidersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return OIDCProviders
     */
    public OIDCProviders getOIDCProviders() {
        return this.OIDCProviders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String marker; 
        private OIDCProviders OIDCProviders; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListOIDCProvidersResponseBody model) {
            this.isTruncated = model.isTruncated;
            this.marker = model.marker;
            this.OIDCProviders = model.OIDCProviders;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The <code>marker</code>. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.\<code>\\</code></p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * OIDCProviders.
         */
        public Builder OIDCProviders(OIDCProviders OIDCProviders) {
            this.OIDCProviders = OIDCProviders;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D2148337-B86A-57F0-8B31-EB7BE0125226</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOIDCProvidersResponseBody build() {
            return new ListOIDCProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOIDCProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOIDCProvidersResponseBody</p>
     */
    public static class OIDCProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("ClientIds")
        private String clientIds;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Fingerprints")
        private String fingerprints;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IssuanceLimitTime")
        private Long issuanceLimitTime;

        @com.aliyun.core.annotation.NameInMap("IssuerUrl")
        private String issuerUrl;

        @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
        private String OIDCProviderName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private OIDCProvider(Builder builder) {
            this.arn = builder.arn;
            this.clientIds = builder.clientIds;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.fingerprints = builder.fingerprints;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.issuanceLimitTime = builder.issuanceLimitTime;
            this.issuerUrl = builder.issuerUrl;
            this.OIDCProviderName = builder.OIDCProviderName;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OIDCProvider create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return clientIds
         */
        public String getClientIds() {
            return this.clientIds;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fingerprints
         */
        public String getFingerprints() {
            return this.fingerprints;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return issuanceLimitTime
         */
        public Long getIssuanceLimitTime() {
            return this.issuanceLimitTime;
        }

        /**
         * @return issuerUrl
         */
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        /**
         * @return OIDCProviderName
         */
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String arn; 
            private String clientIds; 
            private String createDate; 
            private String description; 
            private String fingerprints; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long issuanceLimitTime; 
            private String issuerUrl; 
            private String OIDCProviderName; 
            private String updateDate; 

            private Builder() {
            } 

            private Builder(OIDCProvider model) {
                this.arn = model.arn;
                this.clientIds = model.clientIds;
                this.createDate = model.createDate;
                this.description = model.description;
                this.fingerprints = model.fingerprints;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.issuanceLimitTime = model.issuanceLimitTime;
                this.issuerUrl = model.issuerUrl;
                this.OIDCProviderName = model.OIDCProviderName;
                this.updateDate = model.updateDate;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * ClientIds.
             */
            public Builder clientIds(String clientIds) {
                this.clientIds = clientIds;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Fingerprints.
             */
            public Builder fingerprints(String fingerprints) {
                this.fingerprints = fingerprints;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IssuanceLimitTime.
             */
            public Builder issuanceLimitTime(Long issuanceLimitTime) {
                this.issuanceLimitTime = issuanceLimitTime;
                return this;
            }

            /**
             * IssuerUrl.
             */
            public Builder issuerUrl(String issuerUrl) {
                this.issuerUrl = issuerUrl;
                return this;
            }

            /**
             * OIDCProviderName.
             */
            public Builder OIDCProviderName(String OIDCProviderName) {
                this.OIDCProviderName = OIDCProviderName;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public OIDCProvider build() {
                return new OIDCProvider(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOIDCProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOIDCProvidersResponseBody</p>
     */
    public static class OIDCProviders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OIDCProvider")
        private java.util.List<OIDCProvider> OIDCProvider;

        private OIDCProviders(Builder builder) {
            this.OIDCProvider = builder.OIDCProvider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OIDCProviders create() {
            return builder().build();
        }

        /**
         * @return OIDCProvider
         */
        public java.util.List<OIDCProvider> getOIDCProvider() {
            return this.OIDCProvider;
        }

        public static final class Builder {
            private java.util.List<OIDCProvider> OIDCProvider; 

            private Builder() {
            } 

            private Builder(OIDCProviders model) {
                this.OIDCProvider = model.OIDCProvider;
            } 

            /**
             * OIDCProvider.
             */
            public Builder OIDCProvider(java.util.List<OIDCProvider> OIDCProvider) {
                this.OIDCProvider = OIDCProvider;
                return this;
            }

            public OIDCProviders build() {
                return new OIDCProviders(this);
            } 

        } 

    }
}
