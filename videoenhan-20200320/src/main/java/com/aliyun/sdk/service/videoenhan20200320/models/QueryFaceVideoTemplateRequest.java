// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.videoenhan20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceVideoTemplateRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceVideoTemplateRequest</p>
 */
public class QueryFaceVideoTemplateRequest extends Request {
    @Query
    @NameInMap("PageNo")
    @Validation(maximum = 5000, minimum = 1)
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    private QueryFaceVideoTemplateRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceVideoTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<QueryFaceVideoTemplateRequest, Builder> {
        private Long pageNo; 
        private Long pageSize; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceVideoTemplateRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.templateId = request.templateId;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public QueryFaceVideoTemplateRequest build() {
            return new QueryFaceVideoTemplateRequest(this);
        } 

    } 

}
