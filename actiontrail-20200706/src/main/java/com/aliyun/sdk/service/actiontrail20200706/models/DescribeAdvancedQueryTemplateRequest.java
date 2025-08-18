// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeAdvancedQueryTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdvancedQueryTemplateRequest</p>
 */
public class DescribeAdvancedQueryTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private DescribeAdvancedQueryTemplateRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvancedQueryTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<DescribeAdvancedQueryTemplateRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAdvancedQueryTemplateRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.templateName = request.templateName;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public DescribeAdvancedQueryTemplateRequest build() {
            return new DescribeAdvancedQueryTemplateRequest(this);
        } 

    } 

}
