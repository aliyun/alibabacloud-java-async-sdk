// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link ListSupportedPricingApisResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportedPricingApisResponseBody</p>
 */
public class ListSupportedPricingApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("supportedApis")
    private java.util.List<SupportedApis> supportedApis;

    private ListSupportedPricingApisResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.supportedApis = builder.supportedApis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportedPricingApisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportedApis
     */
    public java.util.List<SupportedApis> getSupportedApis() {
        return this.supportedApis;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SupportedApis> supportedApis; 

        private Builder() {
        } 

        private Builder(ListSupportedPricingApisResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.supportedApis = model.supportedApis;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * supportedApis.
         */
        public Builder supportedApis(java.util.List<SupportedApis> supportedApis) {
            this.supportedApis = supportedApis;
            return this;
        }

        public ListSupportedPricingApisResponseBody build() {
            return new ListSupportedPricingApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupportedPricingApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupportedPricingApisResponseBody</p>
     */
    public static class SupportedApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("popCode")
        private String popCode;

        @com.aliyun.core.annotation.NameInMap("popVersion")
        private String popVersion;

        private SupportedApis(Builder builder) {
            this.apiName = builder.apiName;
            this.popCode = builder.popCode;
            this.popVersion = builder.popVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedApis create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return popCode
         */
        public String getPopCode() {
            return this.popCode;
        }

        /**
         * @return popVersion
         */
        public String getPopVersion() {
            return this.popVersion;
        }

        public static final class Builder {
            private String apiName; 
            private String popCode; 
            private String popVersion; 

            private Builder() {
            } 

            private Builder(SupportedApis model) {
                this.apiName = model.apiName;
                this.popCode = model.popCode;
                this.popVersion = model.popVersion;
            } 

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * popCode.
             */
            public Builder popCode(String popCode) {
                this.popCode = popCode;
                return this;
            }

            /**
             * popVersion.
             */
            public Builder popVersion(String popVersion) {
                this.popVersion = popVersion;
                return this;
            }

            public SupportedApis build() {
                return new SupportedApis(this);
            } 

        } 

    }
}
