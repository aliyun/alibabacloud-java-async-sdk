// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListRemediationsRequest} extends {@link RequestModel}
 *
 * <p>ListRemediationsRequest</p>
 */
public class ListRemediationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    private String configRuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Long pageSize;

    private ListRemediationsRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListRemediationsRequest, Builder> {
        private String configRuleIds; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListRemediationsRequest request) {
            super(request);
            this.configRuleIds = request.configRuleIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-6b7c626622af00b4****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListRemediationsRequest build() {
            return new ListRemediationsRequest(this);
        } 

    } 

}
