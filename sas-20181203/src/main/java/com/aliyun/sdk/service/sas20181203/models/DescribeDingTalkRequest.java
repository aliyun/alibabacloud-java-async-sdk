// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDingTalkRequest} extends {@link RequestModel}
 *
 * <p>DescribeDingTalkRequest</p>
 */
public class DescribeDingTalkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleActionName")
    private String ruleActionName;

    private DescribeDingTalkRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.ruleActionName = builder.ruleActionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDingTalkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleActionName
     */
    public String getRuleActionName() {
        return this.ruleActionName;
    }

    public static final class Builder extends Request.Builder<DescribeDingTalkRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String ruleActionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDingTalkRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.ruleActionName = request.ruleActionName;
        } 

        /**
         * <p>The number of the page to return.Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Vulnerability notification</p>
         */
        public Builder ruleActionName(String ruleActionName) {
            this.putQueryParameter("RuleActionName", ruleActionName);
            this.ruleActionName = ruleActionName;
            return this;
        }

        @Override
        public DescribeDingTalkRequest build() {
            return new DescribeDingTalkRequest(this);
        } 

    } 

}
