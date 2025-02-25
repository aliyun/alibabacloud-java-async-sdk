// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVariableSceneListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVariableSceneListRequest</p>
 */
public class DescribeVariableSceneListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configKey")
    private String configKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paging")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean paging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeVariableSceneListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.bizType = builder.bizType;
        this.configKey = builder.configKey;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.paging = builder.paging;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableSceneListRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paging
     */
    public Boolean getPaging() {
        return this.paging;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeVariableSceneListRequest, Builder> {
        private String lang; 
        private String bizType; 
        private String configKey; 
        private String currentPage; 
        private String pageSize; 
        private Boolean paging; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVariableSceneListRequest request) {
            super(request);
            this.lang = request.lang;
            this.bizType = request.bizType;
            this.configKey = request.configKey;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.paging = request.paging;
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
         * bizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("bizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * configKey.
         */
        public Builder configKey(String configKey) {
            this.putQueryParameter("configKey", configKey);
            this.configKey = configKey;
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
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * paging.
         */
        public Builder paging(Boolean paging) {
            this.putQueryParameter("paging", paging);
            this.paging = paging;
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
        public DescribeVariableSceneListRequest build() {
            return new DescribeVariableSceneListRequest(this);
        } 

    } 

}
