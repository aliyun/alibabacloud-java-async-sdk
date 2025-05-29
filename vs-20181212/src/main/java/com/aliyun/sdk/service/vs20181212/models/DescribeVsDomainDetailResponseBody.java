// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainDetailResponseBody</p>
 */
public class DescribeVsDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfig")
    private DomainConfig domainConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVsDomainDetailResponseBody(Builder builder) {
        this.domainConfig = builder.domainConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainConfig
     */
    public DomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainConfig domainConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVsDomainDetailResponseBody model) {
            this.domainConfig = model.domainConfig;
            this.requestId = model.requestId;
        } 

        /**
         * DomainConfig.
         */
        public Builder domainConfig(DomainConfig domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsDomainDetailResponseBody build() {
            return new DescribeVsDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainDetailResponseBody</p>
     */
    public static class DomainConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SSLProtocol")
        private String SSLProtocol;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        private DomainConfig(Builder builder) {
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.domainType = builder.domainType;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.region = builder.region;
            this.SSLProtocol = builder.SSLProtocol;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfig create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return SSLProtocol
         */
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String domainType; 
            private String gmtCreated; 
            private String gmtModified; 
            private String region; 
            private String SSLProtocol; 
            private String scope; 

            private Builder() {
            } 

            private Builder(DomainConfig model) {
                this.cname = model.cname;
                this.description = model.description;
                this.domainName = model.domainName;
                this.domainStatus = model.domainStatus;
                this.domainType = model.domainType;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.region = model.region;
                this.SSLProtocol = model.SSLProtocol;
                this.scope = model.scope;
            } 

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SSLProtocol.
             */
            public Builder SSLProtocol(String SSLProtocol) {
                this.SSLProtocol = SSLProtocol;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public DomainConfig build() {
                return new DomainConfig(this);
            } 

        } 

    }
}
