// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentAssetsResponseBody</p>
 */
public class DescribeComponentAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentAssets")
    private java.util.List < ComponentAssets> componentAssets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The information about the assets.
         */
        public Builder componentAssets(java.util.List < ComponentAssets> componentAssets) {
            this.componentAssets = componentAssets;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("AssetUuid")
        private String assetUuid;

        @com.aliyun.core.annotation.NameInMap("Componentname")
        private String componentname;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
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
             * The UUID of the asset.
             */
            public Builder assetUuid(String assetUuid) {
                this.assetUuid = assetUuid;
                return this;
            }

            /**
             * The name of the component to which the asset belongs.
             */
            public Builder componentname(String componentname) {
                this.componentname = componentname;
                return this;
            }

            /**
             * The time when the asset was created. The time is in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the asset was modified. The time is in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The configurations of the asset in the JSON string format. DescribeComponentAssetForm
             * <p>
             * 
             * >  For more information, see [DescribeComponentAssetForm](~~DescribeComponentAssetForm~~).
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
