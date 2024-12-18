// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeIPv6TranslatorsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorsResponseBody</p>
 */
public class DescribeIPv6TranslatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6Translators")
    private Ipv6Translators ipv6Translators;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIPv6TranslatorsResponseBody(Builder builder) {
        this.ipv6Translators = builder.ipv6Translators;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPv6TranslatorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6Translators
     */
    public Ipv6Translators getIpv6Translators() {
        return this.ipv6Translators;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Ipv6Translators ipv6Translators; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The list of IPv6 Translation Service instances.</p>
         */
        public Builder ipv6Translators(Ipv6Translators ipv6Translators) {
            this.ipv6Translators = ipv6Translators;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIPv6TranslatorsResponseBody build() {
            return new DescribeIPv6TranslatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIPv6TranslatorsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIPv6TranslatorsResponseBody</p>
     */
    public static class Ipv6TranslatorEntryIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntryId")
        private java.util.List<String> ipv6TranslatorEntryId;

        private Ipv6TranslatorEntryIds(Builder builder) {
            this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6TranslatorEntryIds create() {
            return builder().build();
        }

        /**
         * @return ipv6TranslatorEntryId
         */
        public java.util.List<String> getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
        }

        public static final class Builder {
            private java.util.List<String> ipv6TranslatorEntryId; 

            /**
             * Ipv6TranslatorEntryId.
             */
            public Builder ipv6TranslatorEntryId(java.util.List<String> ipv6TranslatorEntryId) {
                this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
                return this;
            }

            public Ipv6TranslatorEntryIds build() {
                return new Ipv6TranslatorEntryIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIPv6TranslatorsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIPv6TranslatorsResponseBody</p>
     */
    public static class Ipv6Translator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocateIpv4Addr")
        private String allocateIpv4Addr;

        @com.aliyun.core.annotation.NameInMap("AllocateIpv6Addr")
        private String allocateIpv6Addr;

        @com.aliyun.core.annotation.NameInMap("AvailableBandwidth")
        private String availableBandwidth;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntryIds")
        private Ipv6TranslatorEntryIds ipv6TranslatorEntryIds;

        @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorId")
        private String ipv6TranslatorId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Ipv6Translator(Builder builder) {
            this.allocateIpv4Addr = builder.allocateIpv4Addr;
            this.allocateIpv6Addr = builder.allocateIpv6Addr;
            this.availableBandwidth = builder.availableBandwidth;
            this.bandwidth = builder.bandwidth;
            this.businessStatus = builder.businessStatus;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.ipv6TranslatorEntryIds = builder.ipv6TranslatorEntryIds;
            this.ipv6TranslatorId = builder.ipv6TranslatorId;
            this.name = builder.name;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.spec = builder.spec;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Translator create() {
            return builder().build();
        }

        /**
         * @return allocateIpv4Addr
         */
        public String getAllocateIpv4Addr() {
            return this.allocateIpv4Addr;
        }

        /**
         * @return allocateIpv6Addr
         */
        public String getAllocateIpv6Addr() {
            return this.allocateIpv6Addr;
        }

        /**
         * @return availableBandwidth
         */
        public String getAvailableBandwidth() {
            return this.availableBandwidth;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ipv6TranslatorEntryIds
         */
        public Ipv6TranslatorEntryIds getIpv6TranslatorEntryIds() {
            return this.ipv6TranslatorEntryIds;
        }

        /**
         * @return ipv6TranslatorId
         */
        public String getIpv6TranslatorId() {
            return this.ipv6TranslatorId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String allocateIpv4Addr; 
            private String allocateIpv6Addr; 
            private String availableBandwidth; 
            private Integer bandwidth; 
            private String businessStatus; 
            private Long createTime; 
            private String description; 
            private Long endTime; 
            private Ipv6TranslatorEntryIds ipv6TranslatorEntryIds; 
            private String ipv6TranslatorId; 
            private String name; 
            private String payType; 
            private String regionId; 
            private String spec; 
            private String status; 

            /**
             * <p>The IPv4 address allocated to the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47.99.XX.XX</p>
             */
            public Builder allocateIpv4Addr(String allocateIpv4Addr) {
                this.allocateIpv4Addr = allocateIpv4Addr;
                return this;
            }

            /**
             * <p>The IPv6 address allocated to the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2400:3200:1600::XXXX</p>
             */
            public Builder allocateIpv6Addr(String allocateIpv6Addr) {
                this.allocateIpv6Addr = allocateIpv6Addr;
                return this;
            }

            /**
             * <p>The bandwidth of the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder availableBandwidth(String availableBandwidth) {
                this.availableBandwidth = availableBandwidth;
                return this;
            }

            /**
             * <p>The bandwidth of the IPv6 Translation Service instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The business status of the IPv6 Translation Service instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The timestamp when the IPv6 Translation Service instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1537151540000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>descriptionforinstance</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The timestamp when IPv6 Translation Service instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1539792000000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The IDs of IPv6 mapping entries of the IPv6 Translation Service instance.</p>
             */
            public Builder ipv6TranslatorEntryIds(Ipv6TranslatorEntryIds ipv6TranslatorEntryIds) {
                this.ipv6TranslatorEntryIds = ipv6TranslatorEntryIds;
                return this;
            }

            /**
             * <p>The ID of the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6trans-bp1858ys*****</p>
             */
            public Builder ipv6TranslatorId(String ipv6TranslatorId) {
                this.ipv6TranslatorId = ipv6TranslatorId;
                return this;
            }

            /**
             * <p>The name of the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The billing method of the IPv6 Translation Service instance.</p>
             * <ul>
             * <li><strong>Prepay</strong>: subscription</li>
             * <li><strong>Postpay</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepay</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The region of the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The specification of the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the IPv6 Translation Service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Ipv6Translator build() {
                return new Ipv6Translator(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIPv6TranslatorsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIPv6TranslatorsResponseBody</p>
     */
    public static class Ipv6Translators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Translator")
        private java.util.List<Ipv6Translator> ipv6Translator;

        private Ipv6Translators(Builder builder) {
            this.ipv6Translator = builder.ipv6Translator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Translators create() {
            return builder().build();
        }

        /**
         * @return ipv6Translator
         */
        public java.util.List<Ipv6Translator> getIpv6Translator() {
            return this.ipv6Translator;
        }

        public static final class Builder {
            private java.util.List<Ipv6Translator> ipv6Translator; 

            /**
             * Ipv6Translator.
             */
            public Builder ipv6Translator(java.util.List<Ipv6Translator> ipv6Translator) {
                this.ipv6Translator = ipv6Translator;
                return this;
            }

            public Ipv6Translators build() {
                return new Ipv6Translators(this);
            } 

        } 

    }
}
