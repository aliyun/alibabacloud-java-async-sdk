// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSAMLProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListSAMLProvidersResponseBody</p>
 */
public class ListSAMLProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLProviders")
    private SAMLProviders SAMLProviders;

    private ListSAMLProvidersResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
        this.SAMLProviders = builder.SAMLProviders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSAMLProvidersResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SAMLProviders
     */
    public SAMLProviders getSAMLProviders() {
        return this.SAMLProviders;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 
        private SAMLProviders SAMLProviders; 

        /**
         * Indicates whether the response is truncated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The `marker`. This parameter is returned only if the value of `IsTruncated` is `true`. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the IdP.
         */
        public Builder SAMLProviders(SAMLProviders SAMLProviders) {
            this.SAMLProviders = SAMLProviders;
            return this;
        }

        public ListSAMLProvidersResponseBody build() {
            return new ListSAMLProvidersResponseBody(this);
        } 

    } 

    public static class SAMLProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("SAMLProviderName")
        private String SAMLProviderName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private SAMLProvider(Builder builder) {
            this.arn = builder.arn;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.SAMLProviderName = builder.SAMLProviderName;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLProvider create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
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
         * @return SAMLProviderName
         */
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String arn; 
            private String createDate; 
            private String description; 
            private String SAMLProviderName; 
            private String updateDate; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the IdP.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the IdP.
             */
            public Builder SAMLProviderName(String SAMLProviderName) {
                this.SAMLProviderName = SAMLProviderName;
                return this;
            }

            /**
             * The update time.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public SAMLProvider build() {
                return new SAMLProvider(this);
            } 

        } 

    }
    public static class SAMLProviders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SAMLProvider")
        private java.util.List < SAMLProvider> SAMLProvider;

        private SAMLProviders(Builder builder) {
            this.SAMLProvider = builder.SAMLProvider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLProviders create() {
            return builder().build();
        }

        /**
         * @return SAMLProvider
         */
        public java.util.List < SAMLProvider> getSAMLProvider() {
            return this.SAMLProvider;
        }

        public static final class Builder {
            private java.util.List < SAMLProvider> SAMLProvider; 

            /**
             * SAMLProvider.
             */
            public Builder SAMLProvider(java.util.List < SAMLProvider> SAMLProvider) {
                this.SAMLProvider = SAMLProvider;
                return this;
            }

            public SAMLProviders build() {
                return new SAMLProviders(this);
            } 

        } 

    }
}
