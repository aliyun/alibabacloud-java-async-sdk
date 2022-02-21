// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsUdpIpSegmentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsUdpIpSegmentsResponseBody</p>
 */
public class DescribePdnsUdpIpSegmentsResponseBody extends TeaModel {
    @NameInMap("IpSegments")
    private java.util.List < IpSegments> ipSegments;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribePdnsUdpIpSegmentsResponseBody(Builder builder) {
        this.ipSegments = builder.ipSegments;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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

    public static final class Builder {
        private java.util.List < IpSegments> ipSegments; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

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

        public DescribePdnsUdpIpSegmentsResponseBody build() {
            return new DescribePdnsUdpIpSegmentsResponseBody(this);
        } 

    } 

    public static class IpSegments extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Mask")
        private Long mask;

        @NameInMap("Name")
        private String name;

        @NameInMap("State")
        private String state;

        @NameInMap("UpdateDate")
        private String updateDate;

        private IpSegments(Builder builder) {
            this.createDate = builder.createDate;
            this.ip = builder.ip;
            this.mask = builder.mask;
            this.name = builder.name;
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
            private String ip; 
            private Long mask; 
            private String name; 
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
