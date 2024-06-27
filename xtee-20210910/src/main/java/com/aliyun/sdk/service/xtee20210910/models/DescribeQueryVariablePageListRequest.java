// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQueryVariablePageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeQueryVariablePageListRequest</p>
 */
public class DescribeQueryVariablePageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceCode")
    private String dataSourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private DescribeQueryVariablePageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.dataSourceCode = builder.dataSourceCode;
        this.eventCode = builder.eventCode;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryVariablePageListRequest create() {
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
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataSourceCode
     */
    public String getDataSourceCode() {
        return this.dataSourceCode;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeQueryVariablePageListRequest, Builder> {
        private String lang; 
        private Long currentPage; 
        private String dataSourceCode; 
        private String eventCode; 
        private String name; 
        private Long pageSize; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQueryVariablePageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.dataSourceCode = request.dataSourceCode;
            this.eventCode = request.eventCode;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
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
         * currentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * dataSourceCode.
         */
        public Builder dataSourceCode(String dataSourceCode) {
            this.putQueryParameter("dataSourceCode", dataSourceCode);
            this.dataSourceCode = dataSourceCode;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public DescribeQueryVariablePageListRequest build() {
            return new DescribeQueryVariablePageListRequest(this);
        } 

    } 

}
