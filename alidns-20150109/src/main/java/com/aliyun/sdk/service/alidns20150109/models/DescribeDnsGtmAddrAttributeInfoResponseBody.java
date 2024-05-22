// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAddrAttributeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAddrAttributeInfoResponseBody</p>
 */
public class DescribeDnsGtmAddrAttributeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addr")
    private Addr addr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDnsGtmAddrAttributeInfoResponseBody(Builder builder) {
        this.addr = builder.addr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAddrAttributeInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return addr
     */
    public Addr getAddr() {
        return this.addr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Addr addr; 
        private String requestId; 

        /**
         * The addresses that were queried.
         */
        public Builder addr(Addr addr) {
            this.addr = addr;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDnsGtmAddrAttributeInfoResponseBody build() {
            return new DescribeDnsGtmAddrAttributeInfoResponseBody(this);
        } 

    } 

    public static class AttributeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FatherCode")
        private String fatherCode;

        @com.aliyun.core.annotation.NameInMap("GroupCode")
        private String groupCode;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LineCode")
        private String lineCode;

        @com.aliyun.core.annotation.NameInMap("LineName")
        private String lineName;

        private AttributeInfo(Builder builder) {
            this.fatherCode = builder.fatherCode;
            this.groupCode = builder.groupCode;
            this.groupName = builder.groupName;
            this.lineCode = builder.lineCode;
            this.lineName = builder.lineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeInfo create() {
            return builder().build();
        }

        /**
         * @return fatherCode
         */
        public String getFatherCode() {
            return this.fatherCode;
        }

        /**
         * @return groupCode
         */
        public String getGroupCode() {
            return this.groupCode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lineCode
         */
        public String getLineCode() {
            return this.lineCode;
        }

        /**
         * @return lineName
         */
        public String getLineName() {
            return this.lineName;
        }

        public static final class Builder {
            private String fatherCode; 
            private String groupCode; 
            private String groupName; 
            private String lineCode; 
            private String lineName; 

            /**
             * The parent line code of the source region.
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * The code of the source region group.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * The name of the source region group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The line code of the source region.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * The line name of the source region.
             */
            public Builder lineName(String lineName) {
                this.lineName = lineName;
                return this;
            }

            public AttributeInfo build() {
                return new AttributeInfo(this);
            } 

        } 

    }
    public static class AddrAddr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        private String addr;

        @com.aliyun.core.annotation.NameInMap("AttributeInfo")
        private AttributeInfo attributeInfo;

        private AddrAddr(Builder builder) {
            this.addr = builder.addr;
            this.attributeInfo = builder.attributeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrAddr create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public String getAddr() {
            return this.addr;
        }

        /**
         * @return attributeInfo
         */
        public AttributeInfo getAttributeInfo() {
            return this.attributeInfo;
        }

        public static final class Builder {
            private String addr; 
            private AttributeInfo attributeInfo; 

            /**
             * The address that was queried.
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * The source region of the address.
             */
            public Builder attributeInfo(AttributeInfo attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            public AddrAddr build() {
                return new AddrAddr(this);
            } 

        } 

    }
    public static class Addr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        private java.util.List < AddrAddr> addr;

        private Addr(Builder builder) {
            this.addr = builder.addr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public java.util.List < AddrAddr> getAddr() {
            return this.addr;
        }

        public static final class Builder {
            private java.util.List < AddrAddr> addr; 

            /**
             * The address that was queried.
             */
            public Builder addr(java.util.List < AddrAddr> addr) {
                this.addr = addr;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

        } 

    }
}
