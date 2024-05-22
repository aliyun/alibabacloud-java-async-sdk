// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomLineResponseBody</p>
 */
public class DescribeCustomLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("IpSegmentList")
    private java.util.List < IpSegmentList> ipSegmentList;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustomLineResponseBody(Builder builder) {
        this.code = builder.code;
        this.domainName = builder.domainName;
        this.id = builder.id;
        this.ipSegmentList = builder.ipSegmentList;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return ipSegmentList
     */
    public java.util.List < IpSegmentList> getIpSegmentList() {
        return this.ipSegmentList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String domainName; 
        private Long id; 
        private java.util.List < IpSegmentList> ipSegmentList; 
        private String name; 
        private String requestId; 

        /**
         * The code of the custom line.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the custom line.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * The CIDR blocks. Separate IP addresses with a hyphen (-). Enter a CIDR block in each row. You can enter 1 to 50 CIDR blocks at a time. If a CIDR block contains only one IP address, enter the IP address in the format of IP1-IP1. Different CIDR blocks cannot be overlapped.
         */
        public Builder ipSegmentList(java.util.List < IpSegmentList> ipSegmentList) {
            this.ipSegmentList = ipSegmentList;
            return this;
        }

        /**
         * The name of the custom line.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomLineResponseBody build() {
            return new DescribeCustomLineResponseBody(this);
        } 

    } 

    public static class IpSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndIp")
        private String endIp;

        @com.aliyun.core.annotation.NameInMap("StartIp")
        private String startIp;

        private IpSegmentList(Builder builder) {
            this.endIp = builder.endIp;
            this.startIp = builder.startIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSegmentList create() {
            return builder().build();
        }

        /**
         * @return endIp
         */
        public String getEndIp() {
            return this.endIp;
        }

        /**
         * @return startIp
         */
        public String getStartIp() {
            return this.startIp;
        }

        public static final class Builder {
            private String endIp; 
            private String startIp; 

            /**
             * The end IP address of the CIDR block.
             */
            public Builder endIp(String endIp) {
                this.endIp = endIp;
                return this;
            }

            /**
             * The start IP address of the CIDR block.
             */
            public Builder startIp(String startIp) {
                this.startIp = startIp;
                return this;
            }

            public IpSegmentList build() {
                return new IpSegmentList(this);
            } 

        } 

    }
}
