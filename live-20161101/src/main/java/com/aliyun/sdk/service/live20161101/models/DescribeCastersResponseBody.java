// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCastersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCastersResponseBody</p>
 */
public class DescribeCastersResponseBody extends TeaModel {
    @NameInMap("CasterList")
    private CasterList casterList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeCastersResponseBody(Builder builder) {
        this.casterList = builder.casterList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCastersResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterList
     */
    public CasterList getCasterList() {
        return this.casterList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private CasterList casterList; 
        private String requestId; 
        private Integer total; 

        /**
         * CasterList.
         */
        public Builder casterList(CasterList casterList) {
            this.casterList = casterList;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCastersResponseBody build() {
            return new DescribeCastersResponseBody(this);
        } 

    } 

    public static class Caster extends TeaModel {
        @NameInMap("CasterId")
        private String casterId;

        @NameInMap("CasterName")
        private String casterName;

        @NameInMap("CasterTemplate")
        private String casterTemplate;

        @NameInMap("ChannelEnable")
        private Integer channelEnable;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("LastModified")
        private String lastModified;

        @NameInMap("NormType")
        private Integer normType;

        @NameInMap("PurchaseTime")
        private String purchaseTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        private Caster(Builder builder) {
            this.casterId = builder.casterId;
            this.casterName = builder.casterName;
            this.casterTemplate = builder.casterTemplate;
            this.channelEnable = builder.channelEnable;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.expireTime = builder.expireTime;
            this.lastModified = builder.lastModified;
            this.normType = builder.normType;
            this.purchaseTime = builder.purchaseTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Caster create() {
            return builder().build();
        }

        /**
         * @return casterId
         */
        public String getCasterId() {
            return this.casterId;
        }

        /**
         * @return casterName
         */
        public String getCasterName() {
            return this.casterName;
        }

        /**
         * @return casterTemplate
         */
        public String getCasterTemplate() {
            return this.casterTemplate;
        }

        /**
         * @return channelEnable
         */
        public Integer getChannelEnable() {
            return this.channelEnable;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return normType
         */
        public Integer getNormType() {
            return this.normType;
        }

        /**
         * @return purchaseTime
         */
        public String getPurchaseTime() {
            return this.purchaseTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String casterId; 
            private String casterName; 
            private String casterTemplate; 
            private Integer channelEnable; 
            private String chargeType; 
            private String createTime; 
            private String duration; 
            private String expireTime; 
            private String lastModified; 
            private Integer normType; 
            private String purchaseTime; 
            private String startTime; 
            private Integer status; 

            /**
             * CasterId.
             */
            public Builder casterId(String casterId) {
                this.casterId = casterId;
                return this;
            }

            /**
             * CasterName.
             */
            public Builder casterName(String casterName) {
                this.casterName = casterName;
                return this;
            }

            /**
             * CasterTemplate.
             */
            public Builder casterTemplate(String casterTemplate) {
                this.casterTemplate = casterTemplate;
                return this;
            }

            /**
             * ChannelEnable.
             */
            public Builder channelEnable(Integer channelEnable) {
                this.channelEnable = channelEnable;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * NormType.
             */
            public Builder normType(Integer normType) {
                this.normType = normType;
                return this;
            }

            /**
             * PurchaseTime.
             */
            public Builder purchaseTime(String purchaseTime) {
                this.purchaseTime = purchaseTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Caster build() {
                return new Caster(this);
            } 

        } 

    }
    public static class CasterList extends TeaModel {
        @NameInMap("Caster")
        private java.util.List < Caster> caster;

        private CasterList(Builder builder) {
            this.caster = builder.caster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CasterList create() {
            return builder().build();
        }

        /**
         * @return caster
         */
        public java.util.List < Caster> getCaster() {
            return this.caster;
        }

        public static final class Builder {
            private java.util.List < Caster> caster; 

            /**
             * Caster.
             */
            public Builder caster(java.util.List < Caster> caster) {
                this.caster = caster;
                return this;
            }

            public CasterList build() {
                return new CasterList(this);
            } 

        } 

    }
}
