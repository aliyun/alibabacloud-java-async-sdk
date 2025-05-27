// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link PageListLabSessionsRequest} extends {@link RequestModel}
 *
 * <p>PageListLabSessionsRequest</p>
 */
public class PageListLabSessionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Finished")
    private Boolean finished;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabId")
    private Long labId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamAccountId")
    private Long ramAccountId;

    private PageListLabSessionsRequest(Builder builder) {
        super(builder);
        this.finished = builder.finished;
        this.labId = builder.labId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.ramAccountId = builder.ramAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageListLabSessionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return finished
     */
    public Boolean getFinished() {
        return this.finished;
    }

    /**
     * @return labId
     */
    public Long getLabId() {
        return this.labId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ramAccountId
     */
    public Long getRamAccountId() {
        return this.ramAccountId;
    }

    public static final class Builder extends Request.Builder<PageListLabSessionsRequest, Builder> {
        private Boolean finished; 
        private Long labId; 
        private Long page; 
        private Long pageSize; 
        private Long ramAccountId; 

        private Builder() {
            super();
        } 

        private Builder(PageListLabSessionsRequest request) {
            super(request);
            this.finished = request.finished;
            this.labId = request.labId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.ramAccountId = request.ramAccountId;
        } 

        /**
         * Finished.
         */
        public Builder finished(Boolean finished) {
            this.putQueryParameter("Finished", finished);
            this.finished = finished;
            return this;
        }

        /**
         * LabId.
         */
        public Builder labId(Long labId) {
            this.putQueryParameter("LabId", labId);
            this.labId = labId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * RamAccountId.
         */
        public Builder ramAccountId(Long ramAccountId) {
            this.putQueryParameter("RamAccountId", ramAccountId);
            this.ramAccountId = ramAccountId;
            return this;
        }

        @Override
        public PageListLabSessionsRequest build() {
            return new PageListLabSessionsRequest(this);
        } 

    } 

}
