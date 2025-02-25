// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFromLibRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageFromLibRequest</p>
 */
public class DescribeImageFromLibRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("ImageLibId")
    @Validation(required = true)
    private Integer imageLibId;

    @Query
    @NameInMap("ModelId")
    private Long modelId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageFromLibRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.id = builder.id;
        this.imageLibId = builder.imageLibId;
        this.modelId = builder.modelId;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
        this.startDate = builder.startDate;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFromLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return imageLibId
     */
    public Integer getImageLibId() {
        return this.imageLibId;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder extends Request.Builder<DescribeImageFromLibRequest, Builder> {
        private Integer currentPage; 
        private String endDate; 
        private Long id; 
        private Integer imageLibId; 
        private Long modelId; 
        private Integer pageSize; 
        private String sourceIp; 
        private String startDate; 
        private Integer totalCount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageFromLibRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.id = request.id;
            this.imageLibId = request.imageLibId;
            this.modelId = request.modelId;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
            this.startDate = request.startDate;
            this.totalCount = request.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * ImageLibId.
         */
        public Builder imageLibId(Integer imageLibId) {
            this.putQueryParameter("ImageLibId", imageLibId);
            this.imageLibId = imageLibId;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.putQueryParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        @Override
        public DescribeImageFromLibRequest build() {
            return new DescribeImageFromLibRequest(this);
        } 

    } 

}
