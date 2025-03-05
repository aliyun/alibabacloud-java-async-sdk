// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListResellersResponseBody} extends {@link TeaModel}
 *
 * <p>ListResellersResponseBody</p>
 */
public class ListResellersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupplierInformation")
    private java.util.List<SupplierInformation> supplierInformation;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListResellersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.supplierInformation = builder.supplierInformation;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResellersResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supplierInformation
     */
    public java.util.List<SupplierInformation> getSupplierInformation() {
        return this.supplierInformation;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SupplierInformation> supplierInformation; 
        private Integer totalCount; 

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A361BA9E-xxxx-xxxx-xxxx-C26E5180456E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>distributor informations</p>
         */
        public Builder supplierInformation(java.util.List<SupplierInformation> supplierInformation) {
            this.supplierInformation = supplierInformation;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResellersResponseBody build() {
            return new ListResellersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResellersResponseBody} extends {@link TeaModel}
     *
     * <p>ListResellersResponseBody</p>
     */
    public static class SupplierInformation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupplierDesc")
        private String supplierDesc;

        @com.aliyun.core.annotation.NameInMap("SupplierLogo")
        private String supplierLogo;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("SupplierUid")
        private Long supplierUid;

        @com.aliyun.core.annotation.NameInMap("SupplierUrl")
        private String supplierUrl;

        private SupplierInformation(Builder builder) {
            this.supplierDesc = builder.supplierDesc;
            this.supplierLogo = builder.supplierLogo;
            this.supplierName = builder.supplierName;
            this.supplierUid = builder.supplierUid;
            this.supplierUrl = builder.supplierUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplierInformation create() {
            return builder().build();
        }

        /**
         * @return supplierDesc
         */
        public String getSupplierDesc() {
            return this.supplierDesc;
        }

        /**
         * @return supplierLogo
         */
        public String getSupplierLogo() {
            return this.supplierLogo;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return supplierUid
         */
        public Long getSupplierUid() {
            return this.supplierUid;
        }

        /**
         * @return supplierUrl
         */
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public static final class Builder {
            private String supplierDesc; 
            private String supplierLogo; 
            private String supplierName; 
            private Long supplierUid; 
            private String supplierUrl; 

            /**
             * <p>The description of distributor.</p>
             * 
             * <strong>example:</strong>
             * <p>It is a XXXX  company</p>
             */
            public Builder supplierDesc(String supplierDesc) {
                this.supplierDesc = supplierDesc;
                return this;
            }

            /**
             * <p>The Logo of distributor</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/31978070/service-image/d5c3b585-ff6b-4e4e-8885-xxxx.png">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/31978070/service-image/d5c3b585-ff6b-4e4e-8885-xxxx.png</a></p>
             */
            public Builder supplierLogo(String supplierLogo) {
                this.supplierLogo = supplierLogo;
                return this;
            }

            /**
             * <p>The name of the distributor</p>
             * 
             * <strong>example:</strong>
             * <p>Distributor A</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the distributor.</p>
             * 
             * <strong>example:</strong>
             * <p>152xxxxxxxxxxx</p>
             */
            public Builder supplierUid(Long supplierUid) {
                this.supplierUid = supplierUid;
                return this;
            }

            /**
             * <p>The URL of the distributor.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
             */
            public Builder supplierUrl(String supplierUrl) {
                this.supplierUrl = supplierUrl;
                return this;
            }

            public SupplierInformation build() {
                return new SupplierInformation(this);
            } 

        } 

    }
}
