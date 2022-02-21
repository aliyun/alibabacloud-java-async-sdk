// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsOperateLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsOperateLogsRequest</p>
 */
public class DescribePdnsOperateLogsRequest extends Request {
    @Query
    @NameInMap("ActionType")
    private String actionType;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private DescribePdnsOperateLogsRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.endDate = builder.endDate;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsOperateLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribePdnsOperateLogsRequest, Builder> {
        private String actionType; 
        private String endDate; 
        private String keyword; 
        private String lang; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribePdnsOperateLogsRequest response) {
            super(response);
            this.actionType = response.actionType;
            this.endDate = response.endDate;
            this.keyword = response.keyword;
            this.lang = response.lang;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startDate = response.startDate;
        } 

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribePdnsOperateLogsRequest build() {
            return new DescribePdnsOperateLogsRequest(this);
        } 

    } 

}
