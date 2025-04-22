// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetVideoListRequest} extends {@link RequestModel}
 *
 * <p>GetVideoListRequest</p>
 */
public class GetVideoListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
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
         * <p>The ID of the category. You can use one of the following methods to obtain the category ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong> to view the category ID.</li>
         * <li>Obtain the value of CateId from the response to the <a href="https://help.aliyun.com/document_detail/56401.html">AddCategory</a> operation.</li>
         * <li>Obtain the value of CateId from the response to the <a href="https://help.aliyun.com/document_detail/56406.html">GetCategories</a> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>781111</p>
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:59:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sorting method of the results. Valid values:</p>
         * <ul>
         * <li><strong>CreationTime:Desc</strong> (default): The results are sorted in reverse chronological order based on the creation time.</li>
         * <li><strong>CreationTime:Asc</strong>: The results are sorted in chronological order based on the creation time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreationTime:Asc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the video. You can specify multiple video statuses and separate them with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The video is being uploaded.</li>
         * <li><strong>UploadFail</strong>: The video failed to be uploaded.</li>
         * <li><strong>UploadSucc</strong>: The video has been uploaded.</li>
         * <li><strong>Transcoding</strong>: The video is being transcoded.</li>
         * <li><strong>TranscodeFail</strong>: The video failed to be transcoded.</li>
         * <li><strong>checking</strong>: The video is being reviewed.</li>
         * <li><strong>Blocked</strong>: The video is blocked.</li>
         * <li><strong>Normal</strong>: The video is normal.</li>
         * <li><strong>ProduceFail</strong>: The video failed to be produced.</li>
         * </ul>
         * <p>For more information about each video status, see the &quot;Status: the status of a video&quot; section of the <a href="~~52839#section-p7c-jgy-070~~">Basic data types</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Uploading,Normal</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The storage address of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
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
