// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link DescribeSecurityEventMarkMissListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityEventMarkMissListRequest</p>
 */
public class DescribeSecurityEventMarkMissListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisposalWay")
    private String disposalWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private DescribeSecurityEventMarkMissListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.disposalWay = builder.disposalWay;
        this.eventName = builder.eventName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventMarkMissListRequest create() {
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
     * @return disposalWay
     */
    public String getDisposalWay() {
        return this.disposalWay;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityEventMarkMissListRequest, Builder> {
        private Integer currentPage; 
        private String disposalWay; 
        private String eventName; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageSize; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventMarkMissListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.disposalWay = request.disposalWay;
            this.eventName = request.eventName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
        } 

        /**
         * <p>Specifies the page number of the returned page. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
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
         * <p>The disposal method of the rule. The current query does not filter by this field, and you do not need to set it. Valid values:</p>
         * <ul>
         * <li><strong>auto_add_white</strong>: Automatic whitelisting.</li>
         * <li><strong>defense_not_notification</strong>: Defense only without notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto_add_white</p>
         */
        public Builder disposalWay(String disposalWay) {
            this.putQueryParameter("DisposalWay", disposalWay);
            this.disposalWay = disposalWay;
            return this;
        }

        /**
         * <p>The name of the alert event (subtype).</p>
         * 
         * <strong>example:</strong>
         * <p>Untrusted process startup</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The maximum number of records to return in a single query. This field is reserved for compatibility. The backend currently uses CurrentPage and PageSize for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>****==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of whitelist rules to return on each page in a paging query. Default value: <strong>20</strong>.</p>
         * <p>This parameter is required.</p>
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
         * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public DescribeSecurityEventMarkMissListRequest build() {
            return new DescribeSecurityEventMarkMissListRequest(this);
        } 

    } 

}
