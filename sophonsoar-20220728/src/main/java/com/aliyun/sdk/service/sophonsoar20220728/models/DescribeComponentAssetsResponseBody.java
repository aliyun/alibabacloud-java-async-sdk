// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the assets.</p>
         */
        public Builder componentAssets(java.util.List < ComponentAssets> componentAssets) {
            this.componentAssets = componentAssets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BFEFB76D-DD0E-5529-BD57-0DAC10B9B30F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentAssetsResponseBody build() {
            return new DescribeComponentAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeComponentAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComponentAssetsResponseBody</p>
     */
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
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>ff6fe161-93e2-464c-a326-fxxxxxx</p>
             */
            public Builder assetUuid(String assetUuid) {
                this.assetUuid = assetUuid;
                return this;
            }

            /**
             * <p>The name of the component to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pyhton3</p>
             */
            public Builder componentname(String componentname) {
                this.componentname = componentname;
                return this;
            }

            /**
             * <p>The time when the asset was created. The time is in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-23T14:38Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the asset was modified. The time is in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-23T14:38Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>7xx</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>test asset</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The configurations of the asset in the JSON string format. DescribeComponentAssetForm</p>
             * <blockquote>
             * <p> For more information, see <a href="~~DescribeComponentAssetForm~~">DescribeComponentAssetForm</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;name&quot;: &quot;authMethod&quot;,
             *         &quot;value&quot;: &quot;ak&quot;
             *     },
             *     {
             *         &quot;name&quot;: &quot;accessKeyId&quot;,
             *         &quot;value&quot;: &quot;xxxxxxx&quot;
             *     },
             *     {
             *         &quot;name&quot;: &quot;accessKeySecret&quot;,
             *         &quot;value&quot;: &quot;xxxxx&quot;
             *     },
             *     {
             *         &quot;name&quot;: &quot;roleArn&quot;,
             *         &quot;value&quot;: &quot;&quot;
             *     }
             * ]</p>
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
