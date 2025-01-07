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
 * {@link ListCheckItemWarningSummaryRequest} extends {@link RequestModel}
 *
 * <p>ListCheckItemWarningSummaryRequest</p>
 */
public class ListCheckItemWarningSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckItemFuzzy")
    private String checkItemFuzzy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckLevel")
    private String checkLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckType")
    private String checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckWarningStatus")
    private Integer checkWarningStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckWarningStatusList")
    private java.util.List<Integer> checkWarningStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldName")
    private String containerFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskType")
    private String riskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private ListCheckItemWarningSummaryRequest(Builder builder) {
        super(builder);
        this.checkItemFuzzy = builder.checkItemFuzzy;
        this.checkLevel = builder.checkLevel;
        this.checkType = builder.checkType;
        this.checkWarningStatus = builder.checkWarningStatus;
        this.checkWarningStatusList = builder.checkWarningStatusList;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskType = builder.riskType;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckItemWarningSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkItemFuzzy
     */
    public String getCheckItemFuzzy() {
        return this.checkItemFuzzy;
    }

    /**
     * @return checkLevel
     */
    public String getCheckLevel() {
        return this.checkLevel;
    }

    /**
     * @return checkType
     */
    public String getCheckType() {
        return this.checkType;
    }

    /**
     * @return checkWarningStatus
     */
    public Integer getCheckWarningStatus() {
        return this.checkWarningStatus;
    }

    /**
     * @return checkWarningStatusList
     */
    public java.util.List<Integer> getCheckWarningStatusList() {
        return this.checkWarningStatusList;
    }

    /**
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    /**
     * @return containerFieldValue
     */
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
     * @return riskType
     */
    public String getRiskType() {
        return this.riskType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ListCheckItemWarningSummaryRequest, Builder> {
        private String checkItemFuzzy; 
        private String checkLevel; 
        private String checkType; 
        private Integer checkWarningStatus; 
        private java.util.List<Integer> checkWarningStatusList; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Integer currentPage; 
        private Long groupId; 
        private String lang; 
        private Integer pageSize; 
        private String riskType; 
        private String source; 
        private Long startTime; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckItemWarningSummaryRequest request) {
            super(request);
            this.checkItemFuzzy = request.checkItemFuzzy;
            this.checkLevel = request.checkLevel;
            this.checkType = request.checkType;
            this.checkWarningStatus = request.checkWarningStatus;
            this.checkWarningStatusList = request.checkWarningStatusList;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskType = request.riskType;
            this.source = request.source;
            this.startTime = request.startTime;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The name of the check item. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        public Builder checkItemFuzzy(String checkItemFuzzy) {
            this.putQueryParameter("CheckItemFuzzy", checkItemFuzzy);
            this.checkItemFuzzy = checkItemFuzzy;
            return this;
        }

        /**
         * <p>The risk level. Default value: null, which indicates that check items at all risk levels are queried.Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        public Builder checkLevel(String checkLevel) {
            this.putQueryParameter("CheckLevel", checkLevel);
            this.checkLevel = checkLevel;
            return this;
        }

        /**
         * <p>The type of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>hc.check.type.attack_defense</p>
         */
        public Builder checkType(String checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The risk status. Default value: null, which indicates that check items in all states are queried.Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: failed</li>
         * <li><strong>3</strong>: passed</li>
         * <li><strong>6</strong>: Added to Whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder checkWarningStatus(Integer checkWarningStatus) {
            this.putQueryParameter("CheckWarningStatus", checkWarningStatus);
            this.checkWarningStatus = checkWarningStatus;
            return this;
        }

        /**
         * CheckWarningStatusList.
         */
        public Builder checkWarningStatusList(java.util.List<Integer> checkWarningStatusList) {
            this.putQueryParameter("CheckWarningStatusList", checkWarningStatusList);
            this.checkWarningStatusList = checkWarningStatusList;
            return this;
        }

        /**
         * <p>The name of the field that is used to query containers.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterId</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the field that is used to query containers.</p>
         * 
         * <strong>example:</strong>
         * <p>c471f0f61b9c04f8380556e922cf1****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The ID of the asset group.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1161****</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
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
         * <p>The type of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>weak_password</p>
         */
        public Builder riskType(String riskType) {
            this.putQueryParameter("RiskType", riskType);
            this.riskType = riskType;
            return this;
        }

        /**
         * <p>The data source. Default value: <strong>default</strong>. Valid value:</p>
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The UUIDs of the servers.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of the servers.</p>
         * </blockquote>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ListCheckItemWarningSummaryRequest build() {
            return new ListCheckItemWarningSummaryRequest(this);
        } 

    } 

}
