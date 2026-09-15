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
 * {@link DescribeIdcProbeScanResultListRequest} extends {@link RequestModel}
 *
 * <p>DescribeIdcProbeScanResultListRequest</p>
 */
public class DescribeIdcProbeScanResultListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FoundEndTime")
    private Long foundEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FoundStartTime")
    private Long foundStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalExp")
    private String logicalExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeIdcProbeScanResultListRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.foundEndTime = builder.foundEndTime;
        this.foundStartTime = builder.foundStartTime;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIdcProbeScanResultListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return foundEndTime
     */
    public Long getFoundEndTime() {
        return this.foundEndTime;
    }

    /**
     * @return foundStartTime
     */
    public Long getFoundStartTime() {
        return this.foundStartTime;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeIdcProbeScanResultListRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private Long foundEndTime; 
        private Long foundStartTime; 
        private String logicalExp; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIdcProbeScanResultListRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.foundEndTime = request.foundEndTime;
            this.foundStartTime = request.foundStartTime;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The search conditions for assets. This parameter is in JSON format. The parameter names are case-sensitive.</p>
         * <blockquote>
         * <p>You can search for assets by instance ID, instance name, VPC ID, region, or public IP address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;scannedIp\&quot;,\&quot;value\&quot;:\&quot;192.168.2.11\&quot;}]</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The page number in a paging query.</p>
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
         * <p>The end time of the scan discovery. Specify a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1720006819000</p>
         */
        public Builder foundEndTime(Long foundEndTime) {
            this.putQueryParameter("FoundEndTime", foundEndTime);
            this.foundEndTime = foundEndTime;
            return this;
        }

        /**
         * <p>The start time of the scan discovery. Specify a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1720006818000</p>
         */
        public Builder foundStartTime(Long foundStartTime) {
            this.putQueryParameter("FoundStartTime", foundStartTime);
            this.foundStartTime = foundStartTime;
            return this;
        }

        /**
         * <p>The logical relationship among multiple search conditions. Valid values:</p>
         * <ul>
         * <li><strong>OR</strong>: The search conditions are in a logical <strong>OR</strong> relationship.</li>
         * <li><strong>AND</strong>: The search conditions are in a logical <strong>AND</strong> relationship.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * <p>The maximum number of entries per page in a paging query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
         * <blockquote>
         * <p>Specify a value for PageSize.</p>
         * </blockquote>
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
         * <p>The status list of the corresponding probes. Separate multiple values with commas. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: active</li>
         * <li><strong>1</strong>: ignored</li>
         * <li><strong>2</strong>: invalid</li>
         * <li><strong>3</strong>: expired</li>
         * <li><strong>4</strong>: probe does not exist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0,1</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeIdcProbeScanResultListRequest build() {
            return new DescribeIdcProbeScanResultListRequest(this);
        } 

    } 

}
