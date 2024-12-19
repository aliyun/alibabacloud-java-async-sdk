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
 * {@link UpdateSAMLProviderResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSAMLProviderResponseBody</p>
 */
public class UpdateSAMLProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLProvider")
    private SAMLProvider SAMLProvider;

    private UpdateSAMLProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLProvider = builder.SAMLProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSAMLProviderResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SAMLProvider
     */
    public SAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static final class Builder {
        private String requestId; 
        private SAMLProvider SAMLProvider; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E5EDDFD2-3654-4F9F-9780-4AE7D81823EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the IdP.</p>
         */
        public Builder SAMLProvider(SAMLProvider SAMLProvider) {
            this.SAMLProvider = SAMLProvider;
            return this;
        }

        public UpdateSAMLProviderResponseBody build() {
            return new UpdateSAMLProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSAMLProviderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSAMLProviderResponseBody</p>
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
             * <p>The point in time at which the IdP was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-22T02:37:05Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The description of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a new provider.</p>
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
             * <p>The point in time at which the information about the IdP was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-22T02:51:20Z</p>
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
}
