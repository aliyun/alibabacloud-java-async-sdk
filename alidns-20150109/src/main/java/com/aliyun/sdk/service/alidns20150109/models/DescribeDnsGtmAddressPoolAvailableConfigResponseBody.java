// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAddressPoolAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAddressPoolAvailableConfigResponseBody</p>
 */
public class DescribeDnsGtmAddressPoolAvailableConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttributeInfos")
    private AttributeInfos attributeInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDnsGtmAddressPoolAvailableConfigResponseBody(Builder builder) {
        this.attributeInfos = builder.attributeInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAddressPoolAvailableConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributeInfos
     */
    public AttributeInfos getAttributeInfos() {
        return this.attributeInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AttributeInfos attributeInfos; 
        private String requestId; 

        /**
         * The supported source regions.
         */
        public Builder attributeInfos(AttributeInfos attributeInfos) {
            this.attributeInfos = attributeInfos;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDnsGtmAddressPoolAvailableConfigResponseBody build() {
            return new DescribeDnsGtmAddressPoolAvailableConfigResponseBody(this);
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
             * The name of the request source group.
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
    public static class AttributeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeInfo")
        private java.util.List < AttributeInfo> attributeInfo;

        private AttributeInfos(Builder builder) {
            this.attributeInfo = builder.attributeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeInfos create() {
            return builder().build();
        }

        /**
         * @return attributeInfo
         */
        public java.util.List < AttributeInfo> getAttributeInfo() {
            return this.attributeInfo;
        }

        public static final class Builder {
            private java.util.List < AttributeInfo> attributeInfo; 

            /**
             * AttributeInfo.
             */
            public Builder attributeInfo(java.util.List < AttributeInfo> attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            public AttributeInfos build() {
                return new AttributeInfos(this);
            } 

        } 

    }
}
