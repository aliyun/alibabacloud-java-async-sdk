// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePublicIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePublicIpAddressResponseBody</p>
 */
public class DescribePublicIpAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IpRange")
    private IpRange ipRange;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PublicIpAddress")
    private String publicIpAddress;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePublicIpAddressResponseBody(Builder builder) {
        this.code = builder.code;
        this.ipRange = builder.ipRange;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicIpAddress = builder.publicIpAddress;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePublicIpAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return ipRange
     */
    public IpRange getIpRange() {
        return this.ipRange;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private IpRange ipRange; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String publicIpAddress; 
        private String regionId; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IpRange.
         */
        public Builder ipRange(IpRange ipRange) {
            this.ipRange = ipRange;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PublicIpAddress.
         */
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePublicIpAddressResponseBody build() {
            return new DescribePublicIpAddressResponseBody(this);
        } 

    } 

    public static class IpRange extends TeaModel {
        @NameInMap("IpRange")
        private java.util.List < String > ipRange;

        private IpRange(Builder builder) {
            this.ipRange = builder.ipRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpRange create() {
            return builder().build();
        }

        /**
         * @return ipRange
         */
        public java.util.List < String > getIpRange() {
            return this.ipRange;
        }

        public static final class Builder {
            private java.util.List < String > ipRange; 

            /**
             * IpRange.
             */
            public Builder ipRange(java.util.List < String > ipRange) {
                this.ipRange = ipRange;
                return this;
            }

            public IpRange build() {
                return new IpRange(this);
            } 

        } 

    }
}
