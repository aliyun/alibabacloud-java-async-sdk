// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAssetGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetGroupResponseBody</p>
 */
public class DescribeAssetGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetGroupList")
    private java.util.List < AssetGroupList> assetGroupList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeAssetGroupResponseBody(Builder builder) {
        this.assetGroupList = builder.assetGroupList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return assetGroupList
     */
    public java.util.List < AssetGroupList> getAssetGroupList() {
        return this.assetGroupList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < AssetGroupList> assetGroupList; 
        private String requestId; 
        private Long total; 

        /**
         * <p>The information about the asset.</p>
         */
        public Builder assetGroupList(java.util.List < AssetGroupList> assetGroupList) {
            this.assetGroupList = assetGroupList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>487EC0F7-8D14-504E-914E-3A1BC314B581</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeAssetGroupResponseBody build() {
            return new DescribeAssetGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetGroupResponseBody</p>
     */
    public static class AssetGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AssetGroupList(Builder builder) {
            this.name = builder.name;
            this.region = builder.region;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetGroupList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String region; 
            private String type; 

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_v2_public_cn-lbj382l****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The type of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>waf</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AssetGroupList build() {
                return new AssetGroupList(this);
            } 

        } 

    }
}
