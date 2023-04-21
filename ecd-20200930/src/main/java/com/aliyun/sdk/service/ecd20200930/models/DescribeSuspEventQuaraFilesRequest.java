// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventQuaraFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventQuaraFilesRequest</p>
 */
public class DescribeSuspEventQuaraFilesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeSuspEventQuaraFilesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.officeSiteId = builder.officeSiteId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventQuaraFilesRequest create() {
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
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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

    public static final class Builder extends Request.Builder<DescribeSuspEventQuaraFilesRequest, Builder> {
        private Integer currentPage; 
        private String officeSiteId; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventQuaraFilesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.officeSiteId = request.officeSiteId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         * <p>
         * 
         * Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The status of the quarantined file. Valid values:
         * <p>
         * 
         * *   quaraFailed: The file failed to be quarantined.
         * *   quaraDone: The file is quarantined.
         * *   quaraing: The file is being quarantined.
         * *   rollbackFailed: Quarantine for the file failed to be canceled.
         * *   rollbackDone: Quarantine for the file is canceled.
         * *   rollbacking: Quarantine for the file is being canceled.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSuspEventQuaraFilesRequest build() {
            return new DescribeSuspEventQuaraFilesRequest(this);
        } 

    } 

}
