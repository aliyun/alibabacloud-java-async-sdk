// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplatesRequest</p>
 */
public class DescribeTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_num")
    private Long pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("template_type")
    private String templateType;

    private DescribeTemplatesRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<DescribeTemplatesRequest, Builder> {
        private Long pageNum; 
        private Long pageSize; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplatesRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.templateType = request.templateType;
        } 

        /**
         * The page number.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("page_num", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of template. This parameter can be set to a custom value.
         * <p>
         * 
         * *   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.
         * *   If you set the parameter to `compose`, the template is not displayed on the Templates page in the console.
         * 
         * Default value: `kubernetes`.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("template_type", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public DescribeTemplatesRequest build() {
            return new DescribeTemplatesRequest(this);
        } 

    } 

}
