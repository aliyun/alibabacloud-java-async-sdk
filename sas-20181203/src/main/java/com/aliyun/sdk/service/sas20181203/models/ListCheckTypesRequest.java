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
 * {@link ListCheckTypesRequest} extends {@link RequestModel}
 *
 * <p>ListCheckTypesRequest</p>
 */
public class ListCheckTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private Long riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowChecks")
    private Boolean showChecks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListCheckTypesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskId = builder.riskId;
        this.showChecks = builder.showChecks;
        this.source = builder.source;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckTypesRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskId
     */
    public Long getRiskId() {
        return this.riskId;
    }

    /**
     * @return showChecks
     */
    public Boolean getShowChecks() {
        return this.showChecks;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListCheckTypesRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private Long riskId; 
        private Boolean showChecks; 
        private String source; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckTypesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskId = request.riskId;
            this.showChecks = request.showChecks;
            this.source = request.source;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
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
         * <p>The ID of the baseline.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/116179.html">DescribeCheckWarningSummary</a> operation to query the IDs of baselines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>Whether to query the check item list. The default value is false. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not Query</li>
         * <li><strong>true</strong>: Query</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showChecks(Boolean showChecks) {
            this.putQueryParameter("ShowChecks", showChecks);
            this.showChecks = showChecks;
            return this;
        }

        /**
         * <p>The data source. Default value: <strong>default</strong>. Valid values:</p>
         * <ul>
         * <li><strong>agentless</strong>: The check items of baselines for agentless detection.</li>
         * <li><strong>default</strong>: The check items of baselines for hosts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>293b07cb-db2d-4f39-941f-b2e4abb8****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListCheckTypesRequest build() {
            return new ListCheckTypesRequest(this);
        } 

    } 

}
