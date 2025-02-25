// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVariableMarketListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVariableMarketListRequest</p>
 */
public class DescribeVariableMarketListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("chargingMode")
    private String chargingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paging")
    private String paging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryContent")
    private String queryContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scenesStr")
    private String scenesStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private DescribeVariableMarketListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.chargingMode = builder.chargingMode;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.paging = builder.paging;
        this.queryContent = builder.queryContent;
        this.regId = builder.regId;
        this.scenesStr = builder.scenesStr;
        this.source = builder.source;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableMarketListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return chargingMode
     */
    public String getChargingMode() {
        return this.chargingMode;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paging
     */
    public String getPaging() {
        return this.paging;
    }

    /**
     * @return queryContent
     */
    public String getQueryContent() {
        return this.queryContent;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return scenesStr
     */
    public String getScenesStr() {
        return this.scenesStr;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<DescribeVariableMarketListRequest, Builder> {
        private String lang; 
        private String chargingMode; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String paging; 
        private String queryContent; 
        private String regId; 
        private String scenesStr; 
        private String source; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVariableMarketListRequest request) {
            super(request);
            this.lang = request.lang;
            this.chargingMode = request.chargingMode;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.paging = request.paging;
            this.queryContent = request.queryContent;
            this.regId = request.regId;
            this.scenesStr = request.scenesStr;
            this.source = request.source;
            this.title = request.title;
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
         * chargingMode.
         */
        public Builder chargingMode(String chargingMode) {
            this.putQueryParameter("chargingMode", chargingMode);
            this.chargingMode = chargingMode;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * paging.
         */
        public Builder paging(String paging) {
            this.putQueryParameter("paging", paging);
            this.paging = paging;
            return this;
        }

        /**
         * queryContent.
         */
        public Builder queryContent(String queryContent) {
            this.putQueryParameter("queryContent", queryContent);
            this.queryContent = queryContent;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * scenesStr.
         */
        public Builder scenesStr(String scenesStr) {
            this.putQueryParameter("scenesStr", scenesStr);
            this.scenesStr = scenesStr;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public DescribeVariableMarketListRequest build() {
            return new DescribeVariableMarketListRequest(this);
        } 

    } 

}
