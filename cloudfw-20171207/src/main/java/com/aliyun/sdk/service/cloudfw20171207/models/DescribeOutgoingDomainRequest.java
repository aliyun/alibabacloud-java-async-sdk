// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeOutgoingDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDomainRequest</p>
 */
public class DescribeOutgoingDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAITraffic")
    private String isAITraffic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIP")
    private String publicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagIdNew")
    private String tagIdNew;

    private DescribeOutgoingDomainRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.currentPage = builder.currentPage;
        this.dataType = builder.dataType;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.isAITraffic = builder.isAITraffic;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.publicIP = builder.publicIP;
        this.sort = builder.sort;
        this.startTime = builder.startTime;
        this.tagIdNew = builder.tagIdNew;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDomainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isAITraffic
     */
    public String getIsAITraffic() {
        return this.isAITraffic;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publicIP
     */
    public String getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagIdNew
     */
    public String getTagIdNew() {
        return this.tagIdNew;
    }

    public static final class Builder extends Request.Builder<DescribeOutgoingDomainRequest, Builder> {
        private String categoryId; 
        private String currentPage; 
        private String dataType; 
        private String domain; 
        private String endTime; 
        private String isAITraffic; 
        private String lang; 
        private String order; 
        private String pageSize; 
        private String publicIP; 
        private String sort; 
        private String startTime; 
        private String tagIdNew; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutgoingDomainRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.currentPage = request.currentPage;
            this.dataType = request.dataType;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.isAITraffic = request.isAITraffic;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.publicIP = request.publicIP;
            this.sort = request.sort;
            this.startTime = request.startTime;
            this.tagIdNew = request.tagIdNew;
        } 

        /**
         * <p>The product category. Default value: empty. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The page number to return in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The source of the traffic statistics. Default value: Internet firewall. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>nat</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The domain name of the outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656750960</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to collect statistics only on traffic that accesses AI services. Default value: no. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAITraffic(String isAITraffic) {
            this.putQueryParameter("IsAITraffic", isAITraffic);
            this.isAITraffic = isAITraffic;
            return this;
        }

        /**
         * <p>The language type of the request message. Valid values:</p>
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
         * <p>The sort method. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The public IP address of the ECS instance that initiates the outbound connection.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * <p>The sort order based on the specified field. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>SessionCount</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656664560</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The intelligence tag ID. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        public Builder tagIdNew(String tagIdNew) {
            this.putQueryParameter("TagIdNew", tagIdNew);
            this.tagIdNew = tagIdNew;
            return this;
        }

        @Override
        public DescribeOutgoingDomainRequest build() {
            return new DescribeOutgoingDomainRequest(this);
        } 

    } 

}
