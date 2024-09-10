// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWhiteListAssetRequest} extends {@link RequestModel}
 *
 * <p>DescribeWhiteListAssetRequest</p>
 */
public class DescribeWhiteListAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastMaxId")
    private Long lastMaxId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private DescribeWhiteListAssetRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.lastMaxId = builder.lastMaxId;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
        this.strategyId = builder.strategyId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lastMaxId
     */
    public Long getLastMaxId() {
        return this.lastMaxId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeWhiteListAssetRequest, Builder> {
        private String lang; 
        private Long lastMaxId; 
        private Integer pageSize; 
        private String sourceIp; 
        private Long strategyId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWhiteListAssetRequest request) {
            super(request);
            this.lang = request.lang;
            this.lastMaxId = request.lastMaxId;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
            this.strategyId = request.strategyId;
            this.type = request.type;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The maximum asset ID of the most recent query.
         */
        public Builder lastMaxId(Long lastMaxId) {
            this.putQueryParameter("LastMaxId", lastMaxId);
            this.lastMaxId = lastMaxId;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: **500**. Default value: **500**. This value indicates that 500 entries are displayed on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The ID of the policy.
         * <p>
         * 
         * >  You can call the [DescribeWhiteListStrategyList](~~DescribeWhiteListStrategyList~~) operation to obtain the ID.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The policy type of the asset that you want to query. Valid values:
         * <p>
         * 
         * *   **1**: learning policy
         * *   **2**: application policy
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeWhiteListAssetRequest build() {
            return new DescribeWhiteListAssetRequest(this);
        } 

    } 

}
