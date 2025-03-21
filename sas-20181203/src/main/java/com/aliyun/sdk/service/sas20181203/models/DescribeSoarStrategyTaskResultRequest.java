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
 * {@link DescribeSoarStrategyTaskResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarStrategyTaskResultRequest</p>
 */
public class DescribeSoarStrategyTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskId")
    private Long strategyTaskId;

    private DescribeSoarStrategyTaskResultRequest(Builder builder) {
        super(builder);
        this.condition = builder.condition;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.strategyTaskId = builder.strategyTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyTaskResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
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
     * @return strategyTaskId
     */
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeSoarStrategyTaskResultRequest, Builder> {
        private String condition; 
        private Integer currentPage; 
        private Integer pageSize; 
        private Long strategyTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarStrategyTaskResultRequest request) {
            super(request);
            this.condition = request.condition;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.strategyTaskId = request.strategyTaskId;
        } 

        /**
         * <p>Condition parameters for task scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:1}</p>
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>The current page number during paginated queries.</p>
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
         * <p>The maximum number of entries to display per page during paginated queries.</p>
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
         * <p>Strategy task ID.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> interface.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder strategyTaskId(Long strategyTaskId) {
            this.putQueryParameter("StrategyTaskId", strategyTaskId);
            this.strategyTaskId = strategyTaskId;
            return this;
        }

        @Override
        public DescribeSoarStrategyTaskResultRequest build() {
            return new DescribeSoarStrategyTaskResultRequest(this);
        } 

    } 

}
