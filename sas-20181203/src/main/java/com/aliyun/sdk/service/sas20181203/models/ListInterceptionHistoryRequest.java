// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInterceptionHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListInterceptionHistoryRequest</p>
 */
public class ListInterceptionHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HistoryName")
    private String historyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterceptionTypes")
    private java.util.List < Integer > interceptionTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListInterceptionHistoryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.historyName = builder.historyName;
        this.interceptionTypes = builder.interceptionTypes;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionHistoryRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return historyName
     */
    public String getHistoryName() {
        return this.historyName;
    }

    /**
     * @return interceptionTypes
     */
    public java.util.List < Integer > getInterceptionTypes() {
        return this.interceptionTypes;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListInterceptionHistoryRequest, Builder> {
        private String clusterId; 
        private Integer currentPage; 
        private Long endTime; 
        private String historyName; 
        private java.util.List < Integer > interceptionTypes; 
        private String lang; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListInterceptionHistoryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.historyName = request.historyName;
            this.interceptionTypes = request.interceptionTypes;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the container cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c7c190a82d9a048be9038d352840f****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The end of the time range to query. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1635575219000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Abnormal access</p>
         */
        public Builder historyName(String historyName) {
            this.putQueryParameter("HistoryName", historyName);
            this.historyName = historyName;
            return this;
        }

        /**
         * <p>The types of exceptions.</p>
         */
        public Builder interceptionTypes(java.util.List < Integer > interceptionTypes) {
            this.putQueryParameter("InterceptionTypes", interceptionTypes);
            this.interceptionTypes = interceptionTypes;
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The start of the time range to query. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1651290987000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListInterceptionHistoryRequest build() {
            return new ListInterceptionHistoryRequest(this);
        } 

    } 

}
