// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetClusterInspectReportDetailRequest} extends {@link RequestModel}
 *
 * <p>GetClusterInspectReportDetailRequest</p>
 */
public class GetClusterInspectReportDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("reportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enableFilter")
    private Boolean enableFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    private GetClusterInspectReportDetailRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.reportId = builder.reportId;
        this.category = builder.category;
        this.enableFilter = builder.enableFilter;
        this.language = builder.language;
        this.level = builder.level;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterInspectReportDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return enableFilter
     */
    public Boolean getEnableFilter() {
        return this.enableFilter;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
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
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<GetClusterInspectReportDetailRequest, Builder> {
        private String clusterId; 
        private String reportId; 
        private String category; 
        private Boolean enableFilter; 
        private String language; 
        private String level; 
        private Integer maxResults; 
        private String nextToken; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterInspectReportDetailRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.reportId = request.reportId;
            this.category = request.category;
            this.enableFilter = request.enableFilter;
            this.language = request.language;
            this.level = request.level;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the inspection report.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>782df89346054a0000562063a****</p>
         */
        public Builder reportId(String reportId) {
            this.putPathParameter("reportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The category of the inspection item. Valid values:</p>
         * <ul>
         * <li>security: Security compliance</li>
         * <li>performance: Performance efficiency</li>
         * <li>stability: Business stability</li>
         * <li>limitation: Service limits</li>
         * <li>cost: Cost optimization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cost</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Inspection results filtering. If this parameter is set to true, only abnormal inspection items are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableFilter(Boolean enableFilter) {
            this.putQueryParameter("enableFilter", enableFilter);
            this.enableFilter = enableFilter;
            return this;
        }

        /**
         * <p>The query language.</p>
         * <ul>
         * <li>zh_CN</li>
         * <li>en_US</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The level of the inspection item. Valid values:</p>
         * <ul>
         * <li>advice: Suggestions</li>
         * <li>warning: Low severity</li>
         * <li>error: Medium severity</li>
         * <li>critical: High severity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to display the returned tags on multiple pages.</p>
         * 
         * <strong>example:</strong>
         * <p>bb41e2bcb47b747389dce6c0d2</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The type of the inspection object. Only items that meet the targetType parameter are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>NodePool</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public GetClusterInspectReportDetailRequest build() {
            return new GetClusterInspectReportDetailRequest(this);
        } 

    } 

}
