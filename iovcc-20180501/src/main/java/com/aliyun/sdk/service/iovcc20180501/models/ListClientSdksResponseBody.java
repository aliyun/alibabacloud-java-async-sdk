// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientSdksResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientSdksResponseBody</p>
 */
public class ListClientSdksResponseBody extends TeaModel {
    @NameInMap("ClientSdks")
    private java.util.List < ClientSdks> clientSdks;

    @NameInMap("RequestId")
    private String requestId;

    private ListClientSdksResponseBody(Builder builder) {
        this.clientSdks = builder.clientSdks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientSdksResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientSdks
     */
    public java.util.List < ClientSdks> getClientSdks() {
        return this.clientSdks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClientSdks> clientSdks; 
        private String requestId; 

        /**
         * ClientSdks.
         */
        public Builder clientSdks(java.util.List < ClientSdks> clientSdks) {
            this.clientSdks = clientSdks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientSdksResponseBody build() {
            return new ListClientSdksResponseBody(this);
        } 

    } 

    public static class ClientSdks extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("OsType")
        private Integer osType;

        @NameInMap("PkgName")
        private String pkgName;

        @NameInMap("PkgType")
        private Integer pkgType;

        private ClientSdks(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.osType = builder.osType;
            this.pkgName = builder.pkgName;
            this.pkgType = builder.pkgType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientSdks create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return osType
         */
        public Integer getOsType() {
            return this.osType;
        }

        /**
         * @return pkgName
         */
        public String getPkgName() {
            return this.pkgName;
        }

        /**
         * @return pkgType
         */
        public Integer getPkgType() {
            return this.pkgType;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String name; 
            private Integer osType; 
            private String pkgName; 
            private Integer pkgType; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(Integer osType) {
                this.osType = osType;
                return this;
            }

            /**
             * PkgName.
             */
            public Builder pkgName(String pkgName) {
                this.pkgName = pkgName;
                return this;
            }

            /**
             * PkgType.
             */
            public Builder pkgType(Integer pkgType) {
                this.pkgType = pkgType;
                return this;
            }

            public ClientSdks build() {
                return new ClientSdks(this);
            } 

        } 

    }
}
