// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneEventPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneEventPageListRequest</p>
 */
public class DescribeSceneEventPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameOrCode")
    private String nameOrCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeSceneEventPageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.nameOrCode = builder.nameOrCode;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneEventPageListRequest create() {
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
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return nameOrCode
     */
    public String getNameOrCode() {
        return this.nameOrCode;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeSceneEventPageListRequest, Builder> {
        private String lang; 
        private String currentPage; 
        private String nameOrCode; 
        private String pageSize; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneEventPageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.nameOrCode = request.nameOrCode;
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
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * nameOrCode.
         */
        public Builder nameOrCode(String nameOrCode) {
            this.putQueryParameter("nameOrCode", nameOrCode);
            this.nameOrCode = nameOrCode;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
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
        public DescribeSceneEventPageListRequest build() {
            return new DescribeSceneEventPageListRequest(this);
        } 

    } 

}
