// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListModelVersionsRequest</p>
 */
public class ListModelVersionsRequest extends Request {
    @Path
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Query
    @NameInMap("ApprovalStatus")
    private String approvalStatus;

    @Query
    @NameInMap("FormatType")
    private String formatType;

    @Query
    @NameInMap("FrameworkType")
    private String frameworkType;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SourceId")
    private String sourceId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("VersionName")
    private String versionName;

    private ListModelVersionsRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.approvalStatus = builder.approvalStatus;
        this.formatType = builder.formatType;
        this.frameworkType = builder.frameworkType;
        this.label = builder.label;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return frameworkType
     */
    public String getFrameworkType() {
        return this.frameworkType;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<ListModelVersionsRequest, Builder> {
        private String modelId; 
        private String approvalStatus; 
        private String formatType; 
        private String frameworkType; 
        private String label; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String sourceId; 
        private String sourceType; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(ListModelVersionsRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.approvalStatus = request.approvalStatus;
            this.formatType = request.formatType;
            this.frameworkType = request.frameworkType;
            this.label = request.label;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.versionName = request.versionName;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * ApprovalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.putQueryParameter("ApprovalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * FormatType.
         */
        public Builder formatType(String formatType) {
            this.putQueryParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * FrameworkType.
         */
        public Builder frameworkType(String frameworkType) {
            this.putQueryParameter("FrameworkType", frameworkType);
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public ListModelVersionsRequest build() {
            return new ListModelVersionsRequest(this);
        } 

    } 

}
