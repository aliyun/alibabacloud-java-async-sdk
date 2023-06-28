// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCdsFilesRequest} extends {@link RequestModel}
 *
 * <p>ListCdsFilesRequest</p>
 */
public class ListCdsFilesRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Query
    @NameInMap("FileIds")
    private java.util.List < String > fileIds;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("ParentFileId")
    private String parentFileId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    private ListCdsFilesRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.fileIds = builder.fileIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderType = builder.orderType;
        this.parentFileId = builder.parentFileId;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCdsFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return fileIds
     */
    public java.util.List < String > getFileIds() {
        return this.fileIds;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return parentFileId
     */
    public String getParentFileId() {
        return this.parentFileId;
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

    public static final class Builder extends Request.Builder<ListCdsFilesRequest, Builder> {
        private String cdsId; 
        private String endUserId; 
        private java.util.List < String > fileIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderType; 
        private String parentFileId; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListCdsFilesRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileIds = request.fileIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderType = request.orderType;
            this.parentFileId = request.parentFileId;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * The ID of the cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The ID of the user to whom the cloud disk is allocated.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The IDs of the files to be queried.
         */
        public Builder fileIds(java.util.List < String > fileIds) {
            String fileIdsShrink = shrink(fileIds, "FileIds", "json");
            this.putQueryParameter("FileIds", fileIdsShrink);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token used for the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The sorting method of the files.
         * <p>
         * 
         * Valid values:
         * 
         * *   CreateTimeDesc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in descending order based on the time when they are created.
         * 
         *     <!-- -->
         * 
         * *   ModifiedTimeAsc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in ascending order based on the time when they are modified.
         * 
         *     <!-- -->
         * 
         * *   NameDesc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in descending order based on their names.
         * 
         *     <!-- -->
         * 
         * *   SizeAsc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in ascending order based on their sizes.
         * 
         *     <!-- -->
         * 
         * *   ModifiedTimeDesc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in descending order based on the time when they are modified.
         * 
         *     <!-- -->
         * 
         * *   CreateTimeAsc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in ascending order based on the time when they are created.
         * 
         *     <!-- -->
         * 
         * *   SizeDesc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in descending order based on their sizes.
         * 
         *     <!-- -->
         * 
         * *   NameAsc
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     sorts files in ascending order based on their names.
         * 
         *     <!-- -->
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The ID of the parent file.
         */
        public Builder parentFileId(String parentFileId) {
            this.putQueryParameter("ParentFileId", parentFileId);
            this.parentFileId = parentFileId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The file status.
         * <p>
         * 
         * Valid values:
         * 
         * *   available
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     returns only normal files.
         * 
         *     <!-- -->
         * 
         * *   uploading
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     returns only the files that are being uploaded.
         * 
         *     <!-- -->
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCdsFilesRequest build() {
            return new ListCdsFilesRequest(this);
        } 

    } 

}
