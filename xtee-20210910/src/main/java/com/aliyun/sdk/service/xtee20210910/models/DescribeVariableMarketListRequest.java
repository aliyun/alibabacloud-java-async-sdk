// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
         * <p>Charging mode</p>
         * 
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        public Builder chargingMode(String chargingMode) {
            this.putQueryParameter("chargingMode", chargingMode);
            this.chargingMode = chargingMode;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, with a default value of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Paging indicator, default is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paging(String paging) {
            this.putQueryParameter("paging", paging);
            this.paging = paging;
            return this;
        }

        /**
         * <p>Query content, supports fuzzy search.</p>
         * <p> Title/Description</p>
         * 
         * <strong>example:</strong>
         * <p>手机号</p>
         */
        public Builder queryContent(String queryContent) {
            this.putQueryParameter("queryContent", queryContent);
            this.queryContent = queryContent;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Scenario</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;coupon_abuse_detection&quot;]</p>
         */
        public Builder scenesStr(String scenesStr) {
            this.putQueryParameter("scenesStr", scenesStr);
            this.scenesStr = scenesStr;
            return this;
        }

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>设备风险识别_标签</p>
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
