// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBaselineCheckWhiteRecordRequest} extends {@link RequestModel}
 *
 * <p>ListBaselineCheckWhiteRecordRequest</p>
 */
public class ListBaselineCheckWhiteRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List < Long > checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckItemFuzzy")
    private String checkItemFuzzy;

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
    @com.aliyun.core.annotation.NameInMap("RecordIds")
    private java.util.List < Long > recordIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private ListBaselineCheckWhiteRecordRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.checkItemFuzzy = builder.checkItemFuzzy;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.recordIds = builder.recordIds;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaselineCheckWhiteRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public java.util.List < Long > getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return checkItemFuzzy
     */
    public String getCheckItemFuzzy() {
        return this.checkItemFuzzy;
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
     * @return recordIds
     */
    public java.util.List < Long > getRecordIds() {
        return this.recordIds;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListBaselineCheckWhiteRecordRequest, Builder> {
        private java.util.List < Long > checkIds; 
        private String checkItemFuzzy; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List < Long > recordIds; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListBaselineCheckWhiteRecordRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.checkItemFuzzy = request.checkItemFuzzy;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.recordIds = request.recordIds;
            this.source = request.source;
        } 

        /**
         * The IDs of check items.
         */
        public Builder checkIds(java.util.List < Long > checkIds) {
            String checkIdsShrink = shrink(checkIds, "CheckIds", "json");
            this.putQueryParameter("CheckIds", checkIdsShrink);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * The name of the check item. Fuzzy match is supported.
         */
        public Builder checkItemFuzzy(String checkItemFuzzy) {
            this.putQueryParameter("CheckItemFuzzy", checkItemFuzzy);
            this.checkItemFuzzy = checkItemFuzzy;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The IDs of the whitelist rules.
         */
        public Builder recordIds(java.util.List < Long > recordIds) {
            String recordIdsShrink = shrink(recordIds, "RecordIds", "json");
            this.putQueryParameter("RecordIds", recordIdsShrink);
            this.recordIds = recordIds;
            return this;
        }

        /**
         * The data source. If you leave this parameter empty, the default value is used. Valid values:
         * <p>
         * 
         * *   **default**: server
         * *   **agentless**: agentless detection
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListBaselineCheckWhiteRecordRequest build() {
            return new ListBaselineCheckWhiteRecordRequest(this);
        } 

    } 

}
