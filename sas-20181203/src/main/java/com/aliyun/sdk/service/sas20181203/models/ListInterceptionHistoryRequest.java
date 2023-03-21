// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListInterceptionHistoryRequest</p>
 */
public class ListInterceptionHistoryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("HistoryName")
    private String historyName;

    @Query
    @NameInMap("InterceptionTypes")
    private java.util.List < Integer > interceptionTypes;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * HistoryName.
         */
        public Builder historyName(String historyName) {
            this.putQueryParameter("HistoryName", historyName);
            this.historyName = historyName;
            return this;
        }

        /**
         * InterceptionTypes.
         */
        public Builder interceptionTypes(java.util.List < Integer > interceptionTypes) {
            this.putQueryParameter("InterceptionTypes", interceptionTypes);
            this.interceptionTypes = interceptionTypes;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public ListInterceptionHistoryRequest build() {
            return new ListInterceptionHistoryRequest(this);
        } 

    } 

}
