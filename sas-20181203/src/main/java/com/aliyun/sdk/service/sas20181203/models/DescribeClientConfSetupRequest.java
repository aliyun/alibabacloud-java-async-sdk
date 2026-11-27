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
 * {@link DescribeClientConfSetupRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientConfSetupRequest</p>
 */
public class DescribeClientConfSetupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTagValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyTagValue;

    private DescribeClientConfSetupRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.strategyTag = builder.strategyTag;
        this.strategyTagValue = builder.strategyTagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientConfSetupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return strategyTag
     */
    public String getStrategyTag() {
        return this.strategyTag;
    }

    /**
     * @return strategyTagValue
     */
    public String getStrategyTagValue() {
        return this.strategyTagValue;
    }

    public static final class Builder extends Request.Builder<DescribeClientConfSetupRequest, Builder> {
        private Long resourceDirectoryAccountId; 
        private String strategyTag; 
        private String strategyTagValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientConfSetupRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.strategyTag = request.strategyTag;
            this.strategyTagValue = request.strategyTagValue;
        } 

        /**
         * <p>The ID of the member accounts (Alibaba Cloud account) in the resource folder.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Specifies the client resource tag to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>machineResource</p>
         */
        public Builder strategyTag(String strategyTag) {
            this.putQueryParameter("StrategyTag", strategyTag);
            this.strategyTag = strategyTag;
            return this;
        }

        /**
         * <p>The policy value. Valid values:</p>
         * <ul>
         * <li>major</li>
         * <li>advanced</li>
         * <li>basic</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>major</p>
         */
        public Builder strategyTagValue(String strategyTagValue) {
            this.putQueryParameter("StrategyTagValue", strategyTagValue);
            this.strategyTagValue = strategyTagValue;
            return this;
        }

        @Override
        public DescribeClientConfSetupRequest build() {
            return new DescribeClientConfSetupRequest(this);
        } 

    } 

}
