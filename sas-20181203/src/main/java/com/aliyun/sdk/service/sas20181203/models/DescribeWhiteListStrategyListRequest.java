// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeWhiteListStrategyListRequest} extends {@link RequestModel}
 *
 * <p>DescribeWhiteListStrategyListRequest</p>
 */
public class DescribeWhiteListStrategyListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyIds")
    private String strategyIds;

    private DescribeWhiteListStrategyListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.strategyIds = builder.strategyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListStrategyListRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return strategyIds
     */
    public String getStrategyIds() {
        return this.strategyIds;
    }

    public static final class Builder extends Request.Builder<DescribeWhiteListStrategyListRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private String strategyIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWhiteListStrategyListRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.strategyIds = request.strategyIds;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>116.88.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the policy. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder strategyIds(String strategyIds) {
            this.putQueryParameter("StrategyIds", strategyIds);
            this.strategyIds = strategyIds;
            return this;
        }

        @Override
        public DescribeWhiteListStrategyListRequest build() {
            return new DescribeWhiteListStrategyListRequest(this);
        } 

    } 

}
