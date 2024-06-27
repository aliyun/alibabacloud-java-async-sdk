// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourcePageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSourcePageListRequest</p>
 */
public class DescribeDataSourcePageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DescribeDataSourcePageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourcePageListRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDataSourcePageListRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private Long currentPage; 
        private String name; 
        private Long pageSize; 
        private String regId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSourcePageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.type = request.type;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
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

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDataSourcePageListRequest build() {
            return new DescribeDataSourcePageListRequest(this);
        } 

    } 

}
