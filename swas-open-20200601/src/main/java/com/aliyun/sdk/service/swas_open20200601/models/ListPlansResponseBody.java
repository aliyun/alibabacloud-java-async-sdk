// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ListPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListPlansResponseBody</p>
 */
public class ListPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Plans")
    private java.util.List<Plans> plans;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPlansResponseBody(Builder builder) {
        this.plans = builder.plans;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return plans
     */
    public java.util.List<Plans> getPlans() {
        return this.plans;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Plans> plans; 
        private String requestId; 

        /**
         * <p>Details about the plans.</p>
         */
        public Builder plans(java.util.List<Plans> plans) {
            this.plans = plans;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPlansResponseBody build() {
            return new ListPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlansResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnTitle")
        private String cnTitle;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("EnTitle")
        private String enTitle;

        private Tags(Builder builder) {
            this.cnTitle = builder.cnTitle;
            this.color = builder.color;
            this.enTitle = builder.enTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return cnTitle
         */
        public String getCnTitle() {
            return this.cnTitle;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return enTitle
         */
        public String getEnTitle() {
            return this.enTitle;
        }

        public static final class Builder {
            private String cnTitle; 
            private String color; 
            private String enTitle; 

            /**
             * CnTitle.
             */
            public Builder cnTitle(String cnTitle) {
                this.cnTitle = cnTitle;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * EnTitle.
             */
            public Builder enTitle(String enTitle) {
                this.enTitle = enTitle;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListPlansResponseBody</p>
     */
    public static class Plans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("Core")
        private Integer core;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Flow")
        private Integer flow;

        @com.aliyun.core.annotation.NameInMap("IspType")
        private String ispType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("OriginPrice")
        private String originPrice;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("PublicIpNum")
        private String publicIpNum;

        @com.aliyun.core.annotation.NameInMap("SupportPlatform")
        private String supportPlatform;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Plans(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.core = builder.core;
            this.currency = builder.currency;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.flow = builder.flow;
            this.ispType = builder.ispType;
            this.memory = builder.memory;
            this.originPrice = builder.originPrice;
            this.planId = builder.planId;
            this.planType = builder.planType;
            this.publicIpNum = builder.publicIpNum;
            this.supportPlatform = builder.supportPlatform;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plans create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return core
         */
        public Integer getCore() {
            return this.core;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return flow
         */
        public Integer getFlow() {
            return this.flow;
        }

        /**
         * @return ispType
         */
        public String getIspType() {
            return this.ispType;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return originPrice
         */
        public String getOriginPrice() {
            return this.originPrice;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return publicIpNum
         */
        public String getPublicIpNum() {
            return this.publicIpNum;
        }

        /**
         * @return supportPlatform
         */
        public String getSupportPlatform() {
            return this.supportPlatform;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Integer core; 
            private String currency; 
            private Integer diskSize; 
            private String diskType; 
            private Integer flow; 
            private String ispType; 
            private Float memory; 
            private String originPrice; 
            private String planId; 
            private String planType; 
            private String publicIpNum; 
            private String supportPlatform; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The peak bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * <p>The unit of the plan price. Valid values:</p>
             * <ul>
             * <li>CNY</li>
             * <li>USD</li>
             * </ul>
             * <blockquote>
             * <p> CNY is for the China site (aliyun.com). USD is for the international site (alibabacloud.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The category of the disk. Valid values:</p>
             * <ul>
             * <li>SSD: standard SSDs</li>
             * <li>ESSD: enhanced SSDs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ESSD</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The monthly data transfer quota. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder flow(Integer flow) {
                this.flow = flow;
                return this;
            }

            /**
             * IspType.
             */
            public Builder ispType(String ispType) {
                this.ispType = ispType;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The monthly price of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder originPrice(String originPrice) {
                this.originPrice = originPrice;
                return this;
            }

            /**
             * <p>The ID of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>swas.s2.c2m1s40b3t04</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PlanType.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * PublicIpNum.
             */
            public Builder publicIpNum(String publicIpNum) {
                this.publicIpNum = publicIpNum;
                return this;
            }

            /**
             * <p>The operating system types supported by the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Linux&quot;,&quot;Windows&quot;]</p>
             */
            public Builder supportPlatform(String supportPlatform) {
                this.supportPlatform = supportPlatform;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Plans build() {
                return new Plans(this);
            } 

        } 

    }
}
