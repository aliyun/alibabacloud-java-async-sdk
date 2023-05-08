// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemWarningSummaryRequest} extends {@link RequestModel}
 *
 * <p>ListCheckItemWarningSummaryRequest</p>
 */
public class ListCheckItemWarningSummaryRequest extends Request {
    @Query
    @NameInMap("CheckItemFuzzy")
    private String checkItemFuzzy;

    @Query
    @NameInMap("CheckLevel")
    private String checkLevel;

    @Query
    @NameInMap("CheckType")
    private String checkType;

    @Query
    @NameInMap("CheckWarningStatus")
    private Integer checkWarningStatus;

    @Query
    @NameInMap("ContainerFieldName")
    private String containerFieldName;

    @Query
    @NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RiskType")
    private String riskType;

    private ListCheckItemWarningSummaryRequest(Builder builder) {
        super(builder);
        this.checkItemFuzzy = builder.checkItemFuzzy;
        this.checkLevel = builder.checkLevel;
        this.checkType = builder.checkType;
        this.checkWarningStatus = builder.checkWarningStatus;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskType = builder.riskType;
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

    public static final class Builder extends Request.Builder<ListCheckItemWarningSummaryRequest, Builder> {
        private String checkItemFuzzy; 
        private String checkLevel; 
        private String checkType; 
        private Integer checkWarningStatus; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Integer currentPage; 
        private Long groupId; 
        private String lang; 
        private Integer pageSize; 
        private String riskType; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckItemWarningSummaryRequest request) {
            super(request);
            this.checkItemFuzzy = request.checkItemFuzzy;
            this.checkLevel = request.checkLevel;
            this.checkType = request.checkType;
            this.checkWarningStatus = request.checkWarningStatus;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskType = request.riskType;
        } 

        /**
         * The risk level. Default value: null, which indicates that check items at all risk levels are queried.Valid values:
         * <p>
         * *   **high**
         * *   **medium**
         * *   **low**
         */
        public Builder checkItemFuzzy(String checkItemFuzzy) {
            this.putQueryParameter("CheckItemFuzzy", checkItemFuzzy);
            this.checkItemFuzzy = checkItemFuzzy;
            return this;
        }

        /**
         * The risk status. Default value: null, which indicates that check items in all states are queried.Valid values:
         * <p>
         * *   **1**: failed
         * *   **3**: passed
         */
        public Builder checkLevel(String checkLevel) {
            this.putQueryParameter("CheckLevel", checkLevel);
            this.checkLevel = checkLevel;
            return this;
        }

        /**
         * The type of the baseline.
         */
        public Builder checkType(String checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * The type of the check item.
         */
        public Builder checkWarningStatus(Integer checkWarningStatus) {
            this.putQueryParameter("CheckWarningStatus", checkWarningStatus);
            this.checkWarningStatus = checkWarningStatus;
            return this;
        }

        /**
         * The name of the check item. Fuzzy match is supported.
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The name of the field that is used to query containers.
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The value of the field that is used to query containers.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Queries the risk statistics of check items by page.
         */
        public Builder riskType(String riskType) {
            this.putQueryParameter("RiskType", riskType);
            this.riskType = riskType;
            return this;
        }

        @Override
        public ListCheckItemWarningSummaryRequest build() {
            return new ListCheckItemWarningSummaryRequest(this);
        } 

    } 

}
