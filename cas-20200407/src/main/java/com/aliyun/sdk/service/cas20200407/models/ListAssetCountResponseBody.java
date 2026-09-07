// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListAssetCountResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetCountResponseBody</p>
 */
public class ListAssetCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetCountList")
    private java.util.List<AssetCountList> assetCountList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAssetCountResponseBody(Builder builder) {
        this.assetCountList = builder.assetCountList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetCountList
     */
    public java.util.List<AssetCountList> getAssetCountList() {
        return this.assetCountList;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AssetCountList> assetCountList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAssetCountResponseBody model) {
            this.assetCountList = model.assetCountList;
            this.currentPage = model.currentPage;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The resource statistics list.</p>
         */
        public Builder assetCountList(java.util.List<AssetCountList> assetCountList) {
            this.assetCountList = assetCountList;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries displayed on each page for paging. This parameter is not returned if ShowSize is not specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAssetCountResponseBody build() {
            return new ListAssetCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetCountResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetCountResponseBody</p>
     */
    public static class AssetCountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunAssetCount")
        private Long aliyunAssetCount;

        @com.aliyun.core.annotation.NameInMap("CertificateCount")
        private Integer certificateCount;

        @com.aliyun.core.annotation.NameInMap("CountDate")
        private Long countDate;

        @com.aliyun.core.annotation.NameInMap("DomainAssetCount")
        private Integer domainAssetCount;

        @com.aliyun.core.annotation.NameInMap("MultiCloudAssetCount")
        private Long multiCloudAssetCount;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Long points;

        private AssetCountList(Builder builder) {
            this.aliyunAssetCount = builder.aliyunAssetCount;
            this.certificateCount = builder.certificateCount;
            this.countDate = builder.countDate;
            this.domainAssetCount = builder.domainAssetCount;
            this.multiCloudAssetCount = builder.multiCloudAssetCount;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetCountList create() {
            return builder().build();
        }

        /**
         * @return aliyunAssetCount
         */
        public Long getAliyunAssetCount() {
            return this.aliyunAssetCount;
        }

        /**
         * @return certificateCount
         */
        public Integer getCertificateCount() {
            return this.certificateCount;
        }

        /**
         * @return countDate
         */
        public Long getCountDate() {
            return this.countDate;
        }

        /**
         * @return domainAssetCount
         */
        public Integer getDomainAssetCount() {
            return this.domainAssetCount;
        }

        /**
         * @return multiCloudAssetCount
         */
        public Long getMultiCloudAssetCount() {
            return this.multiCloudAssetCount;
        }

        /**
         * @return points
         */
        public Long getPoints() {
            return this.points;
        }

        public static final class Builder {
            private Long aliyunAssetCount; 
            private Integer certificateCount; 
            private Long countDate; 
            private Integer domainAssetCount; 
            private Long multiCloudAssetCount; 
            private Long points; 

            private Builder() {
            } 

            private Builder(AssetCountList model) {
                this.aliyunAssetCount = model.aliyunAssetCount;
                this.certificateCount = model.certificateCount;
                this.countDate = model.countDate;
                this.domainAssetCount = model.domainAssetCount;
                this.multiCloudAssetCount = model.multiCloudAssetCount;
                this.points = model.points;
            } 

            /**
             * <p>The total number of Alibaba Cloud resources.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder aliyunAssetCount(Long aliyunAssetCount) {
                this.aliyunAssetCount = aliyunAssetCount;
                return this;
            }

            /**
             * <p>The total number of certificate resources.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder certificateCount(Integer certificateCount) {
                this.certificateCount = certificateCount;
                return this;
            }

            /**
             * <p>The statistics date. The value is a UNIX timestamp accurate to seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1767680115423</p>
             */
            public Builder countDate(Long countDate) {
                this.countDate = countDate;
                return this;
            }

            /**
             * <p>The total number of domain name resources.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder domainAssetCount(Integer domainAssetCount) {
                this.domainAssetCount = domainAssetCount;
                return this;
            }

            /**
             * <p>The total number of resources from other cloud providers.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder multiCloudAssetCount(Long multiCloudAssetCount) {
                this.multiCloudAssetCount = multiCloudAssetCount;
                return this;
            }

            /**
             * <p>The number of points.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder points(Long points) {
                this.points = points;
                return this;
            }

            public AssetCountList build() {
                return new AssetCountList(this);
            } 

        } 

    }
}
