// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link ListDistillationTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDistillationTemplatesResponseBody</p>
 */
public class ListDistillationTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DistillationTemplates")
    private java.util.List<DistillationTemplateSummary> distillationTemplates;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDistillationTemplatesResponseBody(Builder builder) {
        this.distillationTemplates = builder.distillationTemplates;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDistillationTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return distillationTemplates
     */
    public java.util.List<DistillationTemplateSummary> getDistillationTemplates() {
        return this.distillationTemplates;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DistillationTemplateSummary> distillationTemplates; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDistillationTemplatesResponseBody model) {
            this.distillationTemplates = model.distillationTemplates;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of distillation template summaries, sorted by OrderNumber in ascending order.</p>
         */
        public Builder distillationTemplates(java.util.List<DistillationTemplateSummary> distillationTemplates) {
            this.distillationTemplates = distillationTemplates;
            return this;
        }

        /**
         * <p>The page number, which echoes the PageNumber value in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page, which echoes the PageSize value in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of templates that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDistillationTemplatesResponseBody build() {
            return new ListDistillationTemplatesResponseBody(this);
        } 

    } 

}
