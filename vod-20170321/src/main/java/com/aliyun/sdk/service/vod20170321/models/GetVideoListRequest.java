// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoListRequest} extends {@link RequestModel}
 *
 * <p>GetVideoListRequest</p>
 */
public class GetVideoListRequest extends Request {
    @Query
    @NameInMap("CateId")
    private Long cateId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("StorageLocation")
    private String storageLocation;

    private GetVideoListRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.endTime = builder.endTime;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.storageLocation = builder.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public static final class Builder extends Request.Builder<GetVideoListRequest, Builder> {
        private Long cateId; 
        private String endTime; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sortBy; 
        private String startTime; 
        private String status; 
        private String storageLocation; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoListRequest request) {
            super(request);
            this.cateId = request.cateId;
            this.endTime = request.endTime;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
            this.storageLocation = request.storageLocation;
        } 

        /**
         * The ID of the category. You can use one of the following methods to obtain the category ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories** to view the category ID.
         * *   Obtain the value of CateId from the response to the [AddCategory](~~56401~~) operation.
         * *   Obtain the value of CateId from the response to the [GetCategories](~~56406~~) operation.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**. Maximum value: **100**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The sorting method of the results. Valid values:
         * <p>
         * 
         * *   **CreationTime:Desc** (default): The results are sorted in reverse chronological order based on the creation time.
         * *   **CreationTime:Asc**: The results are sorted in chronological order based on the creation time.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the video. You can specify multiple video statuses and separate them with commas (,). Valid values:
         * <p>
         * 
         * *   **Uploading**: The video is being uploaded.
         * *   **UploadFail**: The video failed to be uploaded.
         * *   **UploadSucc**: The video has been uploaded.
         * *   **Transcoding**: The video is being transcoded.
         * *   **TranscodeFail**: The video failed to be transcoded.
         * *   **checking**: The video is being reviewed.
         * *   **Blocked**: The video is blocked.
         * *   **Normal**: The video is normal.
         * *   **ProduceFail**: The video failed to be produced.
         * 
         * For more information about each video status, see the "Status: the status of a video" section of the [Basic data types](~~52839#section-p7c-jgy-070~~) topic.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The storage address of the media file.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        @Override
        public GetVideoListRequest build() {
            return new GetVideoListRequest(this);
        } 

    } 

}
