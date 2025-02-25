// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslModelByTemplateVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeEslModelByTemplateVersionRequest</p>
 */
public class DescribeEslModelByTemplateVersionRequest extends Request {
    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private DescribeEslModelByTemplateVersionRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEslModelByTemplateVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<DescribeEslModelByTemplateVersionRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEslModelByTemplateVersionRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putBodyParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public DescribeEslModelByTemplateVersionRequest build() {
            return new DescribeEslModelByTemplateVersionRequest(this);
        } 

    } 

}
