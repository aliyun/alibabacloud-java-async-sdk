// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAddrAttributeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAddrAttributeInfoResponseBody</p>
 */
public class DescribeDnsGtmAddrAttributeInfoResponseBody extends TeaModel {
    @NameInMap("Addr")
    private Addr addr;

    @NameInMap("RequestId")
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
         * Addr.
         */
        public Builder addr(Addr addr) {
            this.addr = addr;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("FatherCode")
        private String fatherCode;

        @NameInMap("GroupCode")
        private String groupCode;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("LineCode")
        private String lineCode;

        @NameInMap("LineName")
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
             * FatherCode.
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * GroupCode.
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * LineCode.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * LineName.
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
        @NameInMap("Addr")
        private String addr;

        @NameInMap("AttributeInfo")
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
             * Addr.
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * AttributeInfo.
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
        @NameInMap("Addr")
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
             * Addr.
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
