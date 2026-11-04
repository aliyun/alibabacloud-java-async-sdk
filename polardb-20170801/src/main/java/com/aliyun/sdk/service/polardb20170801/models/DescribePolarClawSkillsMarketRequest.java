// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawSkillsMarketRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawSkillsMarketRequest</p>
 */
public class DescribePolarClawSkillsMarketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchBySkillName")
    private String searchBySkillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchByTagName")
    private String searchByTagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private DescribePolarClawSkillsMarketRequest(Builder builder) {
        super(builder);
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.searchBySkillName = builder.searchBySkillName;
        this.searchByTagName = builder.searchByTagName;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillsMarketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchBySkillName
     */
    public String getSearchBySkillName() {
        return this.searchBySkillName;
    }

    /**
     * @return searchByTagName
     */
    public String getSearchByTagName() {
        return this.searchByTagName;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawSkillsMarketRequest, Builder> {
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String searchBySkillName; 
        private String searchByTagName; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawSkillsMarketRequest request) {
            super(request);
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.searchBySkillName = request.searchBySkillName;
            this.searchByTagName = request.searchByTagName;
            this.source = request.source;
        } 

        /**
         * <p>The sorting condition.</p>
         * 
         * <strong>example:</strong>
         * <p>NewSessionPerSecond</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions under the current account, including region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The skill name to search for.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclawhub</p>
         */
        public Builder searchBySkillName(String searchBySkillName) {
            this.putQueryParameter("SearchBySkillName", searchBySkillName);
            this.searchBySkillName = searchBySkillName;
            return this;
        }

        /**
         * <p>The tag name to search for.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDB</p>
         */
        public Builder searchByTagName(String searchByTagName) {
            this.putQueryParameter("SearchByTagName", searchByTagName);
            this.searchByTagName = searchByTagName;
            return this;
        }

        /**
         * <p>The source of the skill. Valid values:</p>
         * <ol>
         * <li><code>PUBLIC</code>: Public.</li>
         * <li><code>SELF</code>: Private.</li>
         * <li><code>OTHER</code>: Other.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>polardb-console</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DescribePolarClawSkillsMarketRequest build() {
            return new DescribePolarClawSkillsMarketRequest(this);
        } 

    } 

}
