// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetGroupResponseBody</p>
 */
public class DescribeAssetGroupResponseBody extends TeaModel {
    @NameInMap("AssetGroupList")
    private java.util.List < AssetGroupList> assetGroupList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * The information about the asset.
         */
        public Builder assetGroupList(java.util.List < AssetGroupList> assetGroupList) {
            this.assetGroupList = assetGroupList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeAssetGroupResponseBody build() {
            return new DescribeAssetGroupResponseBody(this);
        } 

    } 

    public static class AssetGroupList extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Region")
        private String region;

        @NameInMap("Type")
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
             * The ID of the asset.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The region to which the asset belongs.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The type of the asset.
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
