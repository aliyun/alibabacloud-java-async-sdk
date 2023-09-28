// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPortfolioResponseBody} extends {@link TeaModel}
 *
 * <p>GetPortfolioResponseBody</p>
 */
public class GetPortfolioResponseBody extends TeaModel {
    @NameInMap("PortfolioDetail")
    private PortfolioDetail portfolioDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagOptions")
    private java.util.List < TagOptions> tagOptions;

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
    public java.util.List < TagOptions> getTagOptions() {
        return this.tagOptions;
    }

    public static final class Builder {
        private PortfolioDetail portfolioDetail; 
        private String requestId; 
        private java.util.List < TagOptions> tagOptions; 

        /**
         * The details of the product portfolio.
         */
        public Builder portfolioDetail(PortfolioDetail portfolioDetail) {
            this.portfolioDetail = portfolioDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag options associated with the service portfolio.
         */
        public Builder tagOptions(java.util.List < TagOptions> tagOptions) {
            this.tagOptions = tagOptions;
            return this;
        }

        public GetPortfolioResponseBody build() {
            return new GetPortfolioResponseBody(this);
        } 

    } 

    public static class PortfolioDetail extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("PortfolioArn")
        private String portfolioArn;

        @NameInMap("PortfolioId")
        private String portfolioId;

        @NameInMap("PortfolioName")
        private String portfolioName;

        @NameInMap("ProviderName")
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

            /**
             * The time when the product portfolio was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the product portfolio.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the product portfolio.
             */
            public Builder portfolioArn(String portfolioArn) {
                this.portfolioArn = portfolioArn;
                return this;
            }

            /**
             * The ID of the product portfolio.
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * The name of the product portfolio.
             */
            public Builder portfolioName(String portfolioName) {
                this.portfolioName = portfolioName;
                return this;
            }

            /**
             * The provider of the product portfolio.
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
    public static class TagOptions extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Key")
        private String key;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("TagOptionId")
        private String tagOptionId;

        @NameInMap("Value")
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

            /**
             * Indicates whether the tag option is enabled. Valid values:
             * <p>
             * 
             * - true (default)
             * - false
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The key of the tag option.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The ID of the owner of the tag option.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the tag option.
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * The value of the tag option.
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
