// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsUdpIpSegmentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsUdpIpSegmentsResponseBody</p>
 */
public class DescribePdnsUdpIpSegmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpSegments")
    private java.util.List < IpSegments> ipSegments;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private String totalPages;

    private DescribePdnsUdpIpSegmentsResponseBody(Builder builder) {
        this.ipSegments = builder.ipSegments;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsUdpIpSegmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipSegments
     */
    public java.util.List < IpSegments> getIpSegments() {
        return this.ipSegments;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPages
     */
    public String getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List < IpSegments> ipSegments; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 
        private String totalPages; 

        /**
         * IpSegments.
         */
        public Builder ipSegments(java.util.List < IpSegments> ipSegments) {
            this.ipSegments = ipSegments;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(String totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribePdnsUdpIpSegmentsResponseBody build() {
            return new DescribePdnsUdpIpSegmentsResponseBody(this);
        } 

    } 

    public static class IpSegments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private Long mask;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private IpSegments(Builder builder) {
            this.createDate = builder.createDate;
            this.createTimestamp = builder.createTimestamp;
            this.id = builder.id;
            this.ip = builder.ip;
            this.mask = builder.mask;
            this.name = builder.name;
            this.secretKey = builder.secretKey;
            this.state = builder.state;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSegments create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return mask
         */
        public Long getMask() {
            return this.mask;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String createDate; 
            private Long createTimestamp; 
            private String id; 
            private String ip; 
            private Long mask; 
            private String name; 
            private String secretKey; 
            private String state; 
            private String updateDate; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Mask.
             */
            public Builder mask(Long mask) {
                this.mask = mask;
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
             * SecretKey.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public IpSegments build() {
                return new IpSegments(this);
            } 

        } 

    }
}
