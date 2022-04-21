// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWebHostingCustomDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWebHostingCustomDomainsResponseBody</p>
 */
public class ListWebHostingCustomDomainsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListWebHostingCustomDomainsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebHostingCustomDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListWebHostingCustomDomainsResponseBody build() {
            return new ListWebHostingCustomDomainsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessControlAllowOrigin")
        private String accessControlAllowOrigin;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("EnableCors")
        private Boolean enableCors;

        @NameInMap("ForceRedirectType")
        private String forceRedirectType;

        @NameInMap("SslProtocol")
        private String sslProtocol;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.accessControlAllowOrigin = builder.accessControlAllowOrigin;
            this.cname = builder.cname;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.domain = builder.domain;
            this.enableCors = builder.enableCors;
            this.forceRedirectType = builder.forceRedirectType;
            this.sslProtocol = builder.sslProtocol;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessControlAllowOrigin
         */
        public String getAccessControlAllowOrigin() {
            return this.accessControlAllowOrigin;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enableCors
         */
        public Boolean getEnableCors() {
            return this.enableCors;
        }

        /**
         * @return forceRedirectType
         */
        public String getForceRedirectType() {
            return this.forceRedirectType;
        }

        /**
         * @return sslProtocol
         */
        public String getSslProtocol() {
            return this.sslProtocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String accessControlAllowOrigin; 
            private String cname; 
            private Long createTime; 
            private String description; 
            private String domain; 
            private Boolean enableCors; 
            private String forceRedirectType; 
            private String sslProtocol; 
            private String status; 
            private Long updateTime; 

            /**
             * AccessControlAllowOrigin.
             */
            public Builder accessControlAllowOrigin(String accessControlAllowOrigin) {
                this.accessControlAllowOrigin = accessControlAllowOrigin;
                return this;
            }

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * EnableCors.
             */
            public Builder enableCors(Boolean enableCors) {
                this.enableCors = enableCors;
                return this;
            }

            /**
             * ForceRedirectType.
             */
            public Builder forceRedirectType(String forceRedirectType) {
                this.forceRedirectType = forceRedirectType;
                return this;
            }

            /**
             * SslProtocol.
             */
            public Builder sslProtocol(String sslProtocol) {
                this.sslProtocol = sslProtocol;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
