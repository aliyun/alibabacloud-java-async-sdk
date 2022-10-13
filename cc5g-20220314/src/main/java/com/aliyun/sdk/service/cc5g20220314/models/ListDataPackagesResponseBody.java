// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataPackagesResponseBody</p>
 */
public class ListDataPackagesResponseBody extends TeaModel {
    @NameInMap("DataPackages")
    private java.util.List < DataPackages> dataPackages;

    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListDataPackagesResponseBody(Builder builder) {
        this.dataPackages = builder.dataPackages;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataPackages
     */
    public java.util.List < DataPackages> getDataPackages() {
        return this.dataPackages;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
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
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DataPackages> dataPackages; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * 数组，返回示例目录。
         */
        public Builder dataPackages(java.util.List < DataPackages> dataPackages) {
            this.dataPackages = dataPackages;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataPackagesResponseBody build() {
            return new ListDataPackagesResponseBody(this);
        } 

    } 

    public static class DataPackages extends TeaModel {
        @NameInMap("CardCount")
        private String cardCount;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataPackageId")
        private String dataPackageId;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("Name")
        private String name;

        @NameInMap("Size")
        private String size;

        @NameInMap("Status")
        private String status;

        private DataPackages(Builder builder) {
            this.cardCount = builder.cardCount;
            this.createTime = builder.createTime;
            this.dataPackageId = builder.dataPackageId;
            this.expiredTime = builder.expiredTime;
            this.ISP = builder.ISP;
            this.name = builder.name;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPackages create() {
            return builder().build();
        }

        /**
         * @return cardCount
         */
        public String getCardCount() {
            return this.cardCount;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataPackageId
         */
        public String getDataPackageId() {
            return this.dataPackageId;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cardCount; 
            private String createTime; 
            private String dataPackageId; 
            private String expiredTime; 
            private String ISP; 
            private String name; 
            private String size; 
            private String status; 

            /**
             * CardCount.
             */
            public Builder cardCount(String cardCount) {
                this.cardCount = cardCount;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataPackageId.
             */
            public Builder dataPackageId(String dataPackageId) {
                this.dataPackageId = dataPackageId;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataPackages build() {
                return new DataPackages(this);
            } 

        } 

    }
}
