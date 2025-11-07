// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link ModifyBlackListStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBlackListStrategyRequest</p>
 */
public class ModifyBlackListStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlackListStrategy")
    private BlackListStrategy blackListStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyBlackListStrategyRequest(Builder builder) {
        super(builder);
        this.blackListStrategy = builder.blackListStrategy;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBlackListStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackListStrategy
     */
    public BlackListStrategy getBlackListStrategy() {
        return this.blackListStrategy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyBlackListStrategyRequest, Builder> {
        private BlackListStrategy blackListStrategy; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBlackListStrategyRequest request) {
            super(request);
            this.blackListStrategy = request.blackListStrategy;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Blacklist rule.</p>
         */
        public Builder blackListStrategy(BlackListStrategy blackListStrategy) {
            String blackListStrategyShrink = shrink(blackListStrategy, "BlackListStrategy", "json");
            this.putQueryParameter("BlackListStrategy", blackListStrategyShrink);
            this.blackListStrategy = blackListStrategy;
            return this;
        }

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyBlackListStrategyRequest build() {
            return new ModifyBlackListStrategyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBlackListStrategyRequest} extends {@link TeaModel}
     *
     * <p>ModifyBlackListStrategyRequest</p>
     */
    public static class BlackListStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizContent")
        private String bizContent;

        @com.aliyun.core.annotation.NameInMap("BizKey")
        private String bizKey;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private BlackListStrategy(Builder builder) {
            this.bizContent = builder.bizContent;
            this.bizKey = builder.bizKey;
            this.id = builder.id;
            this.productName = builder.productName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackListStrategy create() {
            return builder().build();
        }

        /**
         * @return bizContent
         */
        public String getBizContent() {
            return this.bizContent;
        }

        /**
         * @return bizKey
         */
        public String getBizKey() {
            return this.bizKey;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizContent; 
            private String bizKey; 
            private Long id; 
            private String productName; 
            private String status; 

            private Builder() {
            } 

            private Builder(BlackListStrategy model) {
                this.bizContent = model.bizContent;
                this.bizKey = model.bizKey;
                this.id = model.id;
                this.productName = model.productName;
                this.status = model.status;
            } 

            /**
             * <p>Blacklist string, with each blacklist entry separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1,127.0.0.2</p>
             */
            public Builder bizContent(String bizContent) {
                this.bizContent = bizContent;
                return this;
            }

            /**
             * <p>List Type:</p>
             * <ul>
             * <li><strong>mobile</strong>: Mobile number blacklist</li>
             * <li><strong>ip</strong>: IP blacklist</li>
             * <li><strong>identifyNum</strong>: ID number blacklist</li>
             * <li><strong>bankCard</strong>: Bank card blacklist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder bizKey(String bizKey) {
                this.bizKey = bizKey;
                return this;
            }

            /**
             * <p>Rule ID:</p>
             * <ul>
             * <li><strong>Empty</strong>: Add a new rule</li>
             * <li><strong>Non-empty</strong>: Modify an existing rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Product Name:</p>
             * <ul>
             * <li><strong>id2meta</strong>: ID card two-factor verification</li>
             * <li><strong>mobile3Meta</strong>: Mobile number factor verification</li>
             * <li><strong>bankcardMeta</strong>: Bank card factor verification</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>id2meta</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>Verification Status:</p>
             * <ul>
             * <li><strong>1</strong>: Verification passed</li>
             * <li><strong>2</strong>: Verification failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BlackListStrategy build() {
                return new BlackListStrategy(this);
            } 

        } 

    }
}
