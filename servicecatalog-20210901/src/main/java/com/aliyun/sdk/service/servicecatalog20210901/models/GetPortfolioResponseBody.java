// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link GetPortfolioResponseBody} extends {@link TeaModel}
 *
 * <p>GetPortfolioResponseBody</p>
 */
public class GetPortfolioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortfolioDetail")
    private PortfolioDetail portfolioDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagOptions")
    private java.util.List<TagOptions> tagOptions;

    private GetPortfolioResponseBody(Builder builder) {
        this.portfolioDetail = builder.portfolioDetail;
        this.requestId = builder.requestId;
        this.tagOptions = builder.tagOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPortfolioResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portfolioDetail
     */
    public PortfolioDetail getPortfolioDetail() {
        return this.portfolioDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagOptions
     */
    public java.util.List<TagOptions> getTagOptions() {
        return this.tagOptions;
    }

    public static final class Builder {
        private PortfolioDetail portfolioDetail; 
        private String requestId; 
        private java.util.List<TagOptions> tagOptions; 

        private Builder() {
        } 

        private Builder(GetPortfolioResponseBody model) {
            this.portfolioDetail = model.portfolioDetail;
            this.requestId = model.requestId;
            this.tagOptions = model.tagOptions;
        } 

        /**
         * <p>The details of the product portfolio.</p>
         */
        public Builder portfolioDetail(PortfolioDetail portfolioDetail) {
            this.portfolioDetail = portfolioDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag options associated with the service portfolio.</p>
         */
        public Builder tagOptions(java.util.List<TagOptions> tagOptions) {
            this.tagOptions = tagOptions;
            return this;
        }

        public GetPortfolioResponseBody build() {
            return new GetPortfolioResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPortfolioResponseBody} extends {@link TeaModel}
     *
     * <p>GetPortfolioResponseBody</p>
     */
    public static class PortfolioDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PortfolioArn")
        private String portfolioArn;

        @com.aliyun.core.annotation.NameInMap("PortfolioId")
        private String portfolioId;

        @com.aliyun.core.annotation.NameInMap("PortfolioName")
        private String portfolioName;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        private PortfolioDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.portfolioArn = builder.portfolioArn;
            this.portfolioId = builder.portfolioId;
            this.portfolioName = builder.portfolioName;
            this.providerName = builder.providerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortfolioDetail create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return portfolioArn
         */
        public String getPortfolioArn() {
            return this.portfolioArn;
        }

        /**
         * @return portfolioId
         */
        public String getPortfolioId() {
            return this.portfolioId;
        }

        /**
         * @return portfolioName
         */
        public String getPortfolioName() {
            return this.portfolioName;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String portfolioArn; 
            private String portfolioId; 
            private String portfolioName; 
            private String providerName; 

            private Builder() {
            } 

            private Builder(PortfolioDetail model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.portfolioArn = model.portfolioArn;
                this.portfolioId = model.portfolioId;
                this.portfolioName = model.portfolioName;
                this.providerName = model.providerName;
            } 

            /**
             * <p>The time when the product portfolio was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:11:12Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the product portfolio.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:servicecatalog:cn-hangzhou:146611588617****:portfolio/port-bp1yt7582g****</p>
             */
            public Builder portfolioArn(String portfolioArn) {
                this.portfolioArn = portfolioArn;
                return this;
            }

            /**
             * <p>The ID of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp1yt7582g****</p>
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * <p>The name of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-IT services</p>
             */
            public Builder portfolioName(String portfolioName) {
                this.portfolioName = portfolioName;
                return this;
            }

            /**
             * <p>The provider of the product portfolio.</p>
             * 
             * <strong>example:</strong>
             * <p>IT team</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            public PortfolioDetail build() {
                return new PortfolioDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPortfolioResponseBody} extends {@link TeaModel}
     *
     * <p>GetPortfolioResponseBody</p>
     */
    public static class TagOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("TagOptionId")
        private String tagOptionId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagOptions(Builder builder) {
            this.active = builder.active;
            this.key = builder.key;
            this.owner = builder.owner;
            this.tagOptionId = builder.tagOptionId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagOptions create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return tagOptionId
         */
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean active; 
            private String key; 
            private String owner; 
            private String tagOptionId; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagOptions model) {
                this.active = model.active;
                this.key = model.key;
                this.owner = model.owner;
                this.tagOptionId = model.tagOptionId;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the tag option is enabled. Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The key of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the owner of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>133413081827****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-bp1q65xd3j****</p>
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * <p>The value of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagOptions build() {
                return new TagOptions(this);
            } 

        } 

    }
}
