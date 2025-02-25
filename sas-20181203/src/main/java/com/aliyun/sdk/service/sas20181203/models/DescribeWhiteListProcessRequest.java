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
 * {@link DescribeWhiteListProcessRequest} extends {@link RequestModel}
 *
 * <p>DescribeWhiteListProcessRequest</p>
 */
public class DescribeWhiteListProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private Integer desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private Integer orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessType")
    private Integer processType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    private DescribeWhiteListProcessRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.desc = builder.desc;
        this.lang = builder.lang;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.processName = builder.processName;
        this.processType = builder.processType;
        this.sourceIp = builder.sourceIp;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListProcessRequest create() {
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
     * @return desc
     */
    public Integer getDesc() {
        return this.desc;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return orderBy
     */
    public Integer getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return processType
     */
    public Integer getProcessType() {
        return this.processType;
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

    public static final class Builder extends Request.Builder<DescribeWhiteListProcessRequest, Builder> {
        private Integer currentPage; 
        private Integer desc; 
        private String lang; 
        private Integer orderBy; 
        private Integer pageSize; 
        private String processName; 
        private Integer processType; 
        private String sourceIp; 
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWhiteListProcessRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.desc = request.desc;
            this.lang = request.lang;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.processName = request.processName;
            this.processType = request.processType;
            this.sourceIp = request.sourceIp;
            this.strategyId = request.strategyId;
        } 

        /**
         * <p>The page number. Default value: <strong>1</strong>. Pages start from page 1.</p>
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
         * <p>The sort order. Default value: descending order. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: ascending order</li>
         * <li><strong>2</strong>: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder desc(Integer desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
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
         * <p>The item based on which you want to sort the returned results. Default value: <strong>process type</strong>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: process type</li>
         * <li><strong>2</strong>: degree of trustability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderBy(Integer orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 1000. Default value: 20. If you leave this parameter empty, 20 data entries are returned per page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
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
         * <p>The name of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>sys_creat</p>
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * <p>The type of the process. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: trusted</li>
         * <li><strong>2</strong>: suspicious</li>
         * <li><strong>3</strong>: malicious</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder processType(Integer processType) {
            this.putQueryParameter("ProcessType", processType);
            this.processType = processType;
            return this;
        }

        /**
         * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>27.223.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8562</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public DescribeWhiteListProcessRequest build() {
            return new DescribeWhiteListProcessRequest(this);
        } 

    } 

}
