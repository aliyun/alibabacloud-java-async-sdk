// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListDomainsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public ListDomainsResponseBody build() {
            return new ListDomainsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Applied")
        private Boolean applied;

        @NameInMap("Checked")
        private Boolean checked;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("DomainType")
        private String domainType;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("Path")
        private String path;

        @NameInMap("WithCertificate")
        private Boolean withCertificate;

        private Items(Builder builder) {
            this.appId = builder.appId;
            this.applied = builder.applied;
            this.checked = builder.checked;
            this.cname = builder.cname;
            this.deleted = builder.deleted;
            this.domain = builder.domain;
            this.domainType = builder.domainType;
            this.envId = builder.envId;
            this.path = builder.path;
            this.withCertificate = builder.withCertificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return applied
         */
        public Boolean getApplied() {
            return this.applied;
        }

        /**
         * @return checked
         */
        public Boolean getChecked() {
            return this.checked;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return withCertificate
         */
        public Boolean getWithCertificate() {
            return this.withCertificate;
        }

        public static final class Builder {
            private String appId; 
            private Boolean applied; 
            private Boolean checked; 
            private String cname; 
            private Boolean deleted; 
            private String domain; 
            private String domainType; 
            private String envId; 
            private String path; 
            private Boolean withCertificate; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Applied.
             */
            public Builder applied(Boolean applied) {
                this.applied = applied;
                return this;
            }

            /**
             * Checked.
             */
            public Builder checked(Boolean checked) {
                this.checked = checked;
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
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
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
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * WithCertificate.
             */
            public Builder withCertificate(Boolean withCertificate) {
                this.withCertificate = withCertificate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < Items> items; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
