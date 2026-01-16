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
 * {@link ConfigSetDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigSetDetailResponseBody</p>
 */
public class ConfigSetDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private Detail detail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ConfigSetDetailResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSetDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public Detail getDetail() {
        return this.detail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Detail detail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ConfigSetDetailResponseBody model) {
            this.detail = model.detail;
            this.requestId = model.requestId;
        } 

        /**
         * Detail.
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ConfigSetDetailResponseBody build() {
            return new ConfigSetDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ConfigSetDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ConfigSetDetailResponseBody</p>
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
     * {@link ConfigSetDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ConfigSetDetailResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IpPool")
        private IpPool ipPool;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Detail(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.ipPool = builder.ipPool;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String id; 
            private IpPool ipPool; 
            private String name; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.description = model.description;
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

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
}
