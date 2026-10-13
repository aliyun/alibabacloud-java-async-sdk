// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetPortalResponseBody} extends {@link TeaModel}
 *
 * <p>GetPortalResponseBody</p>
 */
public class GetPortalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPortalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPortalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPortalResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPortalResponseBody build() {
            return new GetPortalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPortalResponseBody} extends {@link TeaModel}
     *
     * <p>GetPortalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("portalDomainConfig")
        private java.util.List<HiMarketPortalDomainConfig> portalDomainConfig;

        @com.aliyun.core.annotation.NameInMap("portalId")
        private String portalId;

        @com.aliyun.core.annotation.NameInMap("portalSettingConfig")
        private HiMarketPortalSettingConfig portalSettingConfig;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.name = builder.name;
            this.portalDomainConfig = builder.portalDomainConfig;
            this.portalId = builder.portalId;
            this.portalSettingConfig = builder.portalSettingConfig;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return portalDomainConfig
         */
        public java.util.List<HiMarketPortalDomainConfig> getPortalDomainConfig() {
            return this.portalDomainConfig;
        }

        /**
         * @return portalId
         */
        public String getPortalId() {
            return this.portalId;
        }

        /**
         * @return portalSettingConfig
         */
        public HiMarketPortalSettingConfig getPortalSettingConfig() {
            return this.portalSettingConfig;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private String name; 
            private java.util.List<HiMarketPortalDomainConfig> portalDomainConfig; 
            private String portalId; 
            private HiMarketPortalSettingConfig portalSettingConfig; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.name = model.name;
                this.portalDomainConfig = model.portalDomainConfig;
                this.portalId = model.portalId;
                this.portalSettingConfig = model.portalSettingConfig;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The creation time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-15T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The portal description, which is the Description property of the portal resource.</p>
             * 
             * <strong>example:</strong>
             * <p>HiMarket portal for internal developers</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The portal name, which is the Name property of the portal resource.</p>
             * 
             * <strong>example:</strong>
             * <p>developer-portal</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of portal domain name configurations. The list element is named domainConfig.</p>
             */
            public Builder portalDomainConfig(java.util.List<HiMarketPortalDomainConfig> portalDomainConfig) {
                this.portalDomainConfig = portalDomainConfig;
                return this;
            }

            /**
             * <p>The portal ID, which is the primary ID of the portal resource and points to the same portal as the portalId request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>portal-xxxxxxxx</p>
             */
            public Builder portalId(String portalId) {
                this.portalId = portalId;
                return this;
            }

            /**
             * <p>The portal settings, including whether to enable username and password authentication, whether to automatically approve developer registrations, and whether to automatically approve subscription requests.</p>
             */
            public Builder portalSettingConfig(HiMarketPortalSettingConfig portalSettingConfig) {
                this.portalSettingConfig = portalSettingConfig;
                return this;
            }

            /**
             * <p>The region ID, which is the RegionId property of the portal resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
