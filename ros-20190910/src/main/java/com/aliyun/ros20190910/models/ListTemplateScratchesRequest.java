// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListTemplateScratchesRequest} extends {@link RequestModel}
 *
 * <p>ListTemplateScratchesRequest</p>
 */
public class ListTemplateScratchesRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TemplateScratchId")
    private String templateScratchId;

    @Query
    @NameInMap("TemplateScratchType")
    private String templateScratchType;


    private ListTemplateScratchesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.templateScratchId = builder.templateScratchId;
        this.templateScratchType = builder.templateScratchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateScratchesRequest create() {
        return builder().build();
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    /**
     * @return templateScratchType
     */
    public String getTemplateScratchType() {
        return this.templateScratchType;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 
        private String templateScratchId; 
        private String templateScratchType; 

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>TemplateScratchId.</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * <p>TemplateScratchType.</p>
         */
        public Builder templateScratchType(String templateScratchType) {
            this.putQueryParameter("TemplateScratchType", templateScratchType);
            this.templateScratchType = templateScratchType;
            return this;
        }

        public ListTemplateScratchesRequest build() {
            return new ListTemplateScratchesRequest(this);
        } 

    } 

}
