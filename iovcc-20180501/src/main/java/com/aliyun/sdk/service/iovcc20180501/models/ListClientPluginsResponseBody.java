// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientPluginsResponseBody</p>
 */
public class ListClientPluginsResponseBody extends TeaModel {
    @NameInMap("ClientPlugins")
    private java.util.List < ClientPlugins> clientPlugins;

    @NameInMap("RequestId")
    private String requestId;

    private ListClientPluginsResponseBody(Builder builder) {
        this.clientPlugins = builder.clientPlugins;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientPluginsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientPlugins
     */
    public java.util.List < ClientPlugins> getClientPlugins() {
        return this.clientPlugins;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClientPlugins> clientPlugins; 
        private String requestId; 

        /**
         * ClientPlugins.
         */
        public Builder clientPlugins(java.util.List < ClientPlugins> clientPlugins) {
            this.clientPlugins = clientPlugins;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientPluginsResponseBody build() {
            return new ListClientPluginsResponseBody(this);
        } 

    } 

    public static class ClientPlugins extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("PkgName")
        private String pkgName;

        private ClientPlugins(Builder builder) {
            this.name = builder.name;
            this.pkgName = builder.pkgName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientPlugins create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pkgName
         */
        public String getPkgName() {
            return this.pkgName;
        }

        public static final class Builder {
            private String name; 
            private String pkgName; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PkgName.
             */
            public Builder pkgName(String pkgName) {
                this.pkgName = pkgName;
                return this;
            }

            public ClientPlugins build() {
                return new ClientPlugins(this);
            } 

        } 

    }
}
