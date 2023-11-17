// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentAssetsResponseBody</p>
 */
public class DescribeComponentAssetsResponseBody extends TeaModel {
    @NameInMap("ComponentAssets")
    private java.util.List < ComponentAssets> componentAssets;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeComponentAssetsResponseBody(Builder builder) {
        this.componentAssets = builder.componentAssets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentAssetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentAssets
     */
    public java.util.List < ComponentAssets> getComponentAssets() {
        return this.componentAssets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ComponentAssets> componentAssets; 
        private String requestId; 

        /**
         * ComponentAssets.
         */
        public Builder componentAssets(java.util.List < ComponentAssets> componentAssets) {
            this.componentAssets = componentAssets;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentAssetsResponseBody build() {
            return new DescribeComponentAssetsResponseBody(this);
        } 

    } 

    public static class ComponentAssets extends TeaModel {
        @NameInMap("AssetUuid")
        private String assetUuid;

        @NameInMap("Componentname")
        private String componentname;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Params")
        private String params;

        private ComponentAssets(Builder builder) {
            this.assetUuid = builder.assetUuid;
            this.componentname = builder.componentname;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.params = builder.params;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentAssets create() {
            return builder().build();
        }

        /**
         * @return assetUuid
         */
        public String getAssetUuid() {
            return this.assetUuid;
        }

        /**
         * @return componentname
         */
        public String getComponentname() {
            return this.componentname;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
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
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        public static final class Builder {
            private String assetUuid; 
            private String componentname; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private String params; 

            /**
             * AssetUuid.
             */
            public Builder assetUuid(String assetUuid) {
                this.assetUuid = assetUuid;
                return this;
            }

            /**
             * Componentname.
             */
            public Builder componentname(String componentname) {
                this.componentname = componentname;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            public ComponentAssets build() {
                return new ComponentAssets(this);
            } 

        } 

    }
}
