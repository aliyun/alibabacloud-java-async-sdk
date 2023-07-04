// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorsResponseBody</p>
 */
public class DescribeIPv6TranslatorsResponseBody extends TeaModel {
    @NameInMap("Ipv6Translators")
    private Ipv6Translators ipv6Translators;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The list of IPv6 Translation Service instances.
         */
        public Builder ipv6Translators(Ipv6Translators ipv6Translators) {
            this.ipv6Translators = ipv6Translators;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIPv6TranslatorsResponseBody build() {
            return new DescribeIPv6TranslatorsResponseBody(this);
        } 

    } 

    public static class Ipv6TranslatorEntryIds extends TeaModel {
        @NameInMap("Ipv6TranslatorEntryId")
        private java.util.List < String > ipv6TranslatorEntryId;

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
        public java.util.List < String > getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
        }

        public static final class Builder {
            private java.util.List < String > ipv6TranslatorEntryId; 

            /**
             * Ipv6TranslatorEntryId.
             */
            public Builder ipv6TranslatorEntryId(java.util.List < String > ipv6TranslatorEntryId) {
                this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
                return this;
            }

            public Ipv6TranslatorEntryIds build() {
                return new Ipv6TranslatorEntryIds(this);
            } 

        } 

    }
    public static class Ipv6Translator extends TeaModel {
        @NameInMap("AllocateIpv4Addr")
        private String allocateIpv4Addr;

        @NameInMap("AllocateIpv6Addr")
        private String allocateIpv6Addr;

        @NameInMap("AvailableBandwidth")
        private String availableBandwidth;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Ipv6TranslatorEntryIds")
        private Ipv6TranslatorEntryIds ipv6TranslatorEntryIds;

        @NameInMap("Ipv6TranslatorId")
        private String ipv6TranslatorId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
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
             * The IPv4 address allocated to the IPv6 Translation Service instance.
             */
            public Builder allocateIpv4Addr(String allocateIpv4Addr) {
                this.allocateIpv4Addr = allocateIpv4Addr;
                return this;
            }

            /**
             * The IPv6 address allocated to the IPv6 Translation Service instance.
             */
            public Builder allocateIpv6Addr(String allocateIpv6Addr) {
                this.allocateIpv6Addr = allocateIpv6Addr;
                return this;
            }

            /**
             * The bandwidth of the IPv6 Translation Service instance.
             */
            public Builder availableBandwidth(String availableBandwidth) {
                this.availableBandwidth = availableBandwidth;
                return this;
            }

            /**
             * The bandwidth of the IPv6 Translation Service instance. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The business status of the IPv6 Translation Service instance. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **FinancialLocked**
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The timestamp when the IPv6 Translation Service instance was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the IPv6 Translation Service instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The timestamp when IPv6 Translation Service instance expires.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The IDs of IPv6 mapping entries of the IPv6 Translation Service instance.
             */
            public Builder ipv6TranslatorEntryIds(Ipv6TranslatorEntryIds ipv6TranslatorEntryIds) {
                this.ipv6TranslatorEntryIds = ipv6TranslatorEntryIds;
                return this;
            }

            /**
             * The ID of the IPv6 Translation Service instance.
             */
            public Builder ipv6TranslatorId(String ipv6TranslatorId) {
                this.ipv6TranslatorId = ipv6TranslatorId;
                return this;
            }

            /**
             * The name of the IPv6 Translation Service instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The billing method of the IPv6 Translation Service instance.
             * <p>
             * 
             * *   **Prepay**: subscription
             * *   **Postpay**: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The region of the IPv6 Translation Service instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The specification of the IPv6 Translation Service instance.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The status of the IPv6 Translation Service instance.
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
    public static class Ipv6Translators extends TeaModel {
        @NameInMap("Ipv6Translator")
        private java.util.List < Ipv6Translator> ipv6Translator;

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
        public java.util.List < Ipv6Translator> getIpv6Translator() {
            return this.ipv6Translator;
        }

        public static final class Builder {
            private java.util.List < Ipv6Translator> ipv6Translator; 

            /**
             * Ipv6Translator.
             */
            public Builder ipv6Translator(java.util.List < Ipv6Translator> ipv6Translator) {
                this.ipv6Translator = ipv6Translator;
                return this;
            }

            public Ipv6Translators build() {
                return new Ipv6Translators(this);
            } 

        } 

    }
}
