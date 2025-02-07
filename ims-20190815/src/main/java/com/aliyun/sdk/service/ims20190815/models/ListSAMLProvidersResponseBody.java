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
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The <code>marker</code>. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.``</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D8B70D3-E194-41C9-93C5-F6A10D716D24</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about IdPs.</p>
         */
        public Builder SAMLProviders(SAMLProviders SAMLProviders) {
            this.SAMLProviders = SAMLProviders;
            return this;
        }

        public ListSAMLProvidersResponseBody build() {
            return new ListSAMLProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSAMLProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSAMLProvidersResponseBody</p>
     */
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::177242285274****:saml-provider/test-provider</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-22T06:26:15Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a provider.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>test-provider</p>
             */
            public Builder SAMLProviderName(String SAMLProviderName) {
                this.SAMLProviderName = SAMLProviderName;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-22T06:26:15Z</p>
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
    /**
     * 
     * {@link ListSAMLProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListSAMLProvidersResponseBody</p>
     */
    public static class SAMLProviders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SAMLProvider")
        private java.util.List<SAMLProvider> SAMLProvider;

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
        public java.util.List<SAMLProvider> getSAMLProvider() {
            return this.SAMLProvider;
        }

        public static final class Builder {
            private java.util.List<SAMLProvider> SAMLProvider; 

            /**
             * SAMLProvider.
             */
            public Builder SAMLProvider(java.util.List<SAMLProvider> SAMLProvider) {
                this.SAMLProvider = SAMLProvider;
                return this;
            }

            public SAMLProviders build() {
                return new SAMLProviders(this);
            } 

        } 

    }
}
