// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ConfigSetListResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigSetListResponseBody</p>
 */
public class ConfigSetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigSets")
    private java.util.List<ConfigSets> configSets;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
    private Integer totalCounts;

    private ConfigSetListResponseBody(Builder builder) {
        this.configSets = builder.configSets;
        this.currentPage = builder.currentPage;
        this.hasMore = builder.hasMore;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSetListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configSets
     */
    public java.util.List<ConfigSets> getConfigSets() {
        return this.configSets;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List<ConfigSets> configSets; 
        private Integer currentPage; 
        private Boolean hasMore; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCounts; 

        private Builder() {
        } 

        private Builder(ConfigSetListResponseBody model) {
            this.configSets = model.configSets;
            this.currentPage = model.currentPage;
            this.hasMore = model.hasMore;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCounts = model.totalCounts;
        } 

        /**
         * ConfigSets.
         */
        public Builder configSets(java.util.List<ConfigSets> configSets) {
            this.configSets = configSets;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * HasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCounts.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ConfigSetListResponseBody build() {
            return new ConfigSetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ConfigSetListResponseBody} extends {@link TeaModel}
     *
     * <p>ConfigSetListResponseBody</p>
     */
    public static class IpPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpPoolId")
        private String ipPoolId;

        @com.aliyun.core.annotation.NameInMap("IpPoolName")
        private String ipPoolName;

        private IpPool(Builder builder) {
            this.ipPoolId = builder.ipPoolId;
            this.ipPoolName = builder.ipPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpPool create() {
            return builder().build();
        }

        /**
         * @return ipPoolId
         */
        public String getIpPoolId() {
            return this.ipPoolId;
        }

        /**
         * @return ipPoolName
         */
        public String getIpPoolName() {
            return this.ipPoolName;
        }

        public static final class Builder {
            private String ipPoolId; 
            private String ipPoolName; 

            private Builder() {
            } 

            private Builder(IpPool model) {
                this.ipPoolId = model.ipPoolId;
                this.ipPoolName = model.ipPoolName;
            } 

            /**
             * IpPoolId.
             */
            public Builder ipPoolId(String ipPoolId) {
                this.ipPoolId = ipPoolId;
                return this;
            }

            /**
             * IpPoolName.
             */
            public Builder ipPoolName(String ipPoolName) {
                this.ipPoolName = ipPoolName;
                return this;
            }

            public IpPool build() {
                return new IpPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigSetListResponseBody} extends {@link TeaModel}
     *
     * <p>ConfigSetListResponseBody</p>
     */
    public static class ConfigSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FromAddresses")
        private java.util.List<String> fromAddresses;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IpPool")
        private IpPool ipPool;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ConfigSets(Builder builder) {
            this.description = builder.description;
            this.fromAddresses = builder.fromAddresses;
            this.id = builder.id;
            this.ipPool = builder.ipPool;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSets create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fromAddresses
         */
        public java.util.List<String> getFromAddresses() {
            return this.fromAddresses;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ipPool
         */
        public IpPool getIpPool() {
            return this.ipPool;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<String> fromAddresses; 
            private String id; 
            private IpPool ipPool; 
            private String name; 

            private Builder() {
            } 

            private Builder(ConfigSets model) {
                this.description = model.description;
                this.fromAddresses = model.fromAddresses;
                this.id = model.id;
                this.ipPool = model.ipPool;
                this.name = model.name;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FromAddresses.
             */
            public Builder fromAddresses(java.util.List<String> fromAddresses) {
                this.fromAddresses = fromAddresses;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IpPool.
             */
            public Builder ipPool(IpPool ipPool) {
                this.ipPool = ipPool;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ConfigSets build() {
                return new ConfigSets(this);
            } 

        } 

    }
}
