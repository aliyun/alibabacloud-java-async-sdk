// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeCastersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCastersResponseBody</p>
 */
public class DescribeCastersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterList")
    private CasterList casterList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCastersResponseBody model) {
            this.casterList = model.casterList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The production studios.</p>
         */
        public Builder casterList(CasterList casterList) {
            this.casterList = casterList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of production studios.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCastersResponseBody build() {
            return new DescribeCastersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCastersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCastersResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCastersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCastersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCastersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCastersResponseBody</p>
     */
    public static class Caster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CasterId")
        private String casterId;

        @com.aliyun.core.annotation.NameInMap("CasterName")
        private String casterName;

        @com.aliyun.core.annotation.NameInMap("CasterTemplate")
        private String casterTemplate;

        @com.aliyun.core.annotation.NameInMap("ChannelEnable")
        private Integer channelEnable;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClientTokenId")
        private String clientTokenId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("NormType")
        private Integer normType;

        @com.aliyun.core.annotation.NameInMap("PurchaseTime")
        private String purchaseTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private Caster(Builder builder) {
            this.casterId = builder.casterId;
            this.casterName = builder.casterName;
            this.casterTemplate = builder.casterTemplate;
            this.channelEnable = builder.channelEnable;
            this.chargeType = builder.chargeType;
            this.clientTokenId = builder.clientTokenId;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.expireTime = builder.expireTime;
            this.lastModified = builder.lastModified;
            this.normType = builder.normType;
            this.purchaseTime = builder.purchaseTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return clientTokenId
         */
        public String getClientTokenId() {
            return this.clientTokenId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String casterId; 
            private String casterName; 
            private String casterTemplate; 
            private Integer channelEnable; 
            private String chargeType; 
            private String clientTokenId; 
            private String createTime; 
            private String duration; 
            private String expireTime; 
            private String lastModified; 
            private Integer normType; 
            private String purchaseTime; 
            private String resourceGroupId; 
            private String startTime; 
            private Integer status; 
            private Tags tags; 

            private Builder() {
            } 

            private Builder(Caster model) {
                this.casterId = model.casterId;
                this.casterName = model.casterName;
                this.casterTemplate = model.casterTemplate;
                this.channelEnable = model.channelEnable;
                this.chargeType = model.chargeType;
                this.clientTokenId = model.clientTokenId;
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.expireTime = model.expireTime;
                this.lastModified = model.lastModified;
                this.normType = model.normType;
                this.purchaseTime = model.purchaseTime;
                this.resourceGroupId = model.resourceGroupId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the production studio. You can specify the ID in a request to query the streaming URLs of the production studio, start the production studio, add a video resource, a layout, a component, or a playlist to the production studio, or query layouts of the production studio.</p>
             * 
             * <strong>example:</strong>
             * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
             */
            public Builder casterId(String casterId) {
                this.casterId = casterId;
                return this;
            }

            /**
             * <p>The name of the production studio.</p>
             * 
             * <strong>example:</strong>
             * <p>liveCaster****</p>
             */
            public Builder casterName(String casterName) {
                this.casterName = casterName;
                return this;
            }

            /**
             * <p>The resolution in which the production studio plays videos. This parameter is returned if the subscription billing method is used. Valid values:</p>
             * <ul>
             * <li>lp_ld: low definition</li>
             * <li>lp_sd: standard definition</li>
             * <li>lp_hd: high definition</li>
             * <li>lp_ud: ultra high definition.</li>
             * <li>lp_ld_v: low definition (portrait mode)</li>
             * <li>lp_sd_v: standard definition (portrait mode)</li>
             * <li>lp_hd_v: high definition (portrait mode)</li>
             * <li>lp_ud_v: ultra high definition (portrait mode)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lp_ld</p>
             */
            public Builder casterTemplate(String casterTemplate) {
                this.casterTemplate = casterTemplate;
                return this;
            }

            /**
             * <p>Indicates whether the channel is enabled for the production studio.</p>
             * <ul>
             * <li>0: The channel is disabled.</li>
             * <li>1: The channel is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder channelEnable(Integer channelEnable) {
                this.channelEnable = channelEnable;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PrePaid: the subscription billing method</li>
             * <li>PostPaid: the pay-as-you-go billing method</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The client token that is used to ensure the idempotence of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>53200b81-b761-4c10-842a-a0726d97****</p>
             */
            public Builder clientTokenId(String clientTokenId) {
                this.clientTokenId = clientTokenId;
                return this;
            }

            /**
             * <p>The time when the production studio was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-08-30 12:02:57.0</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The streaming duration. Format: hh:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>1:02:33</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The time when the production studio expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-30 12:02:57.0</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the production studio was last modified. For example, the time when the production studio was last started, stopped, or modified is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-01T05:08:45Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The type of the production studio. Valid values:</p>
             * <ul>
             * <li>0: playlist mode</li>
             * <li>1: general mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder normType(Integer normType) {
                this.normType = normType;
                return this;
            }

            /**
             * <p>The time when the production studio was purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-08-30 12:02:57.0</p>
             */
            public Builder purchaseTime(String purchaseTime) {
                this.purchaseTime = purchaseTime;
                return this;
            }

            /**
             * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">Resource groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzw******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The time when the production studio was started. This parameter is returned if the production studio is in the streaming status.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-08-30 18:02:57.0</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the production studio. Valid values:</p>
             * <ul>
             * <li>0: idle</li>
             * <li>1: streaming</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public Caster build() {
                return new Caster(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCastersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCastersResponseBody</p>
     */
    public static class CasterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Caster")
        private java.util.List<Caster> caster;

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
        public java.util.List<Caster> getCaster() {
            return this.caster;
        }

        public static final class Builder {
            private java.util.List<Caster> caster; 

            private Builder() {
            } 

            private Builder(CasterList model) {
                this.caster = model.caster;
            } 

            /**
             * Caster.
             */
            public Builder caster(java.util.List<Caster> caster) {
                this.caster = caster;
                return this;
            }

            public CasterList build() {
                return new CasterList(this);
            } 

        } 

    }
}
