// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsRequest} extends {@link RequestModel}
 *
 * <p>ListJobsRequest</p>
 */
public class ListJobsRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("FieldType")
    private String fieldType;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Workload")
    private String workload;

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.currentPage = builder.currentPage;
        this.fieldType = builder.fieldType;
        this.fieldValue = builder.fieldValue;
        this.namespaceId = builder.namespaceId;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
        this.tags = builder.tags;
        this.workload = builder.workload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldType
     */
    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return workload
     */
    public String getWorkload() {
        return this.workload;
    }

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private String appName; 
        private Integer currentPage; 
        private String fieldType; 
        private String fieldValue; 
        private String namespaceId; 
        private String orderBy; 
        private Integer pageSize; 
        private Boolean reverse; 
        private String tags; 
        private String workload; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.appName = request.appName;
            this.currentPage = request.currentPage;
            this.fieldType = request.fieldType;
            this.fieldValue = request.fieldValue;
            this.namespaceId = request.namespaceId;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
            this.tags = request.tags;
            this.workload = request.workload;
        } 

        /**
         * The name of the job template.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The number of the page to return. The parameter value is a positive integer that is greater than or equal to 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The dimension by which applications are filtered. Valid values:
         * <p>
         * 
         * *   **appName**: Applications are filtered by job template name.
         * *   **appIds**: Applications are filtered by job template ID.
         */
        public Builder fieldType(String fieldType) {
            this.putQueryParameter("FieldType", fieldType);
            this.fieldType = fieldType;
            return this;
        }

        /**
         * Enter the name and ID of the job template.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * The namespace ID.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Specifies how applications are sorted. Valid values:
         * <p>
         * 
         * *   **running**: The applications are sorted based on the number of running instances.
         * *   **instances**: The applications are sorted based on the number of destination instances.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid value: 0 to 200.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether to sort the field names that are passed by **OrderBy** in ascending order. Valid values:
         * <p>
         * 
         * *   **true**: in ascending order
         * *   **false**: in descending order
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * The tags that are displayed in a JSON string. Valid values:
         * <p>
         * 
         * *   **key**: the tag key
         * *   **value**: the tag value
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Set the value to `job`.
         */
        public Builder workload(String workload) {
            this.putQueryParameter("Workload", workload);
            this.workload = workload;
            return this;
        }

        @Override
        public ListJobsRequest build() {
            return new ListJobsRequest(this);
        } 

    } 

}
