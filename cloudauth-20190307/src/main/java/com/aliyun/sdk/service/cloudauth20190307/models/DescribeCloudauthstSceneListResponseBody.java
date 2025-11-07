// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeCloudauthstSceneListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudauthstSceneListResponseBody</p>
 */
public class DescribeCloudauthstSceneListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudauthstSceneListResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudauthstSceneListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCloudauthstSceneListResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Scene list</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEC88747-2F3E-539E-91A6-84E321CAA12B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudauthstSceneListResponseBody build() {
            return new DescribeCloudauthstSceneListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudauthstSceneListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudauthstSceneListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("StoreImage")
        private String storeImage;

        private Items(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.storeImage = builder.storeImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return storeImage
         */
        public String getStoreImage() {
            return this.storeImage;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private String productCode; 
            private String productName; 
            private String sceneId; 
            private String sceneName; 
            private String storeImage; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.storeImage = model.storeImage;
            } 

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-04 19:56:04</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-04 19:56:04</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Cloud marketplace product code.</p>
             * 
             * <strong>example:</strong>
             * <p>SMART_VERIFY</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>Product name</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>Scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20**40</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>Scene name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试场景</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>Whether to deliver the files generated by the authentication to the customer&quot;s OSS:</p>
             * <ul>
             * <li><strong>Y</strong>: Enabled</li>
             * <li><strong>N</strong>: Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder storeImage(String storeImage) {
                this.storeImage = storeImage;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
