// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRecordVideoRequest} extends {@link RequestModel}
 *
 * <p>ListLiveRecordVideoRequest</p>
 */
public class ListLiveRecordVideoRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("DomainName")
    private String domainName;

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
    @NameInMap("StreamName")
    private String streamName;

    private ListLiveRecordVideoRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRecordVideoRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<ListLiveRecordVideoRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String endTime; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sortBy; 
        private String startTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveRecordVideoRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
        } 

        /**
         * The sorting rule of results. Valid values:
         * <p>
         * 
         * *   **CreationTime:Desc**: sorts the results based on the creation time in descending order. This is the default value.
         * *   **CreationTime:Asc**: sorts the results based on the creation time in ascending order.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **ListLiveRecordVideo**.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * CreationTime:Desc
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The name of the recorded live stream.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The ID of the transcoding template group.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The duration of the video. Unit: seconds.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The name of the video category.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the video. Valid values:
         * <p>
         * 
         * *   **Uploading:**: indicates that the video is being uploaded.
         * *   **UploadFail**: indicates that the video failed to be uploaded.
         * *   **UploadSucces**: indicates that the video was uploaded.
         * *   **Transcoding**: indicates that the video is being transcoded.
         * *   **TranscodeFail**: indicates that the video failed to be transcoded.
         * *   **Blocked**: indicates that the video is blocked.
         * *   **Normal**: indicates that the video is in a normal state.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public ListLiveRecordVideoRequest build() {
            return new ListLiveRecordVideoRequest(this);
        } 

    } 

}
