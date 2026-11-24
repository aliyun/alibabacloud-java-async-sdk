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
    @com.aliyun.core.annotation.NameInMap("ReferenceIds")
    private String referenceIds;

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
        this.referenceIds = builder.referenceIds;
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
     * @return referenceIds
     */
    public String getReferenceIds() {
        return this.referenceIds;
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
        private String referenceIds; 
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
            this.referenceIds = request.referenceIds;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
            this.storageLocation = request.storageLocation;
        } 

        /**
         * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Configuration</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/56401.html">Create a category</a> operation to create a category. The category ID is the value of the CateId response parameter.</li>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/56406.html">Get categories and subcategories</a> operation to query categories. The category ID is the value of the CateId response parameter.</li>
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
         * <p>The end time of the creation time, which must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
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
         * <p>The current page number. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
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
         * <p>The list of custom IDs. You can specify one or more custom IDs separated by commas (,). You can specify up to 20 custom IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123,1234-1234</p>
         */
        public Builder referenceIds(String referenceIds) {
            this.putQueryParameter("ReferenceIds", referenceIds);
            this.referenceIds = referenceIds;
            return this;
        }

        /**
         * <p>The sorting method of the query results. Valid values:</p>
         * <ul>
         * <li><strong>CreationTime:Desc</strong> (default): Sort by creation time in descending order.</li>
         * <li><strong>CreationTime:Asc</strong>: Sort by creation time in ascending order.</li>
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
         * <p>The start time of the creation time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
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
         * <p>The video status. You can specify multiple statuses separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The video is being uploaded.</li>
         * <li><strong>UploadFail</strong>: The video failed to be uploaded.</li>
         * <li><strong>UploadSucc</strong>: The video is uploaded.</li>
         * <li><strong>Transcoding</strong>: The video is being transcoded.</li>
         * <li><strong>TranscodeFail</strong>: The video failed to be transcoded.</li>
         * <li><strong>Checking</strong>: The video is being reviewed.</li>
         * <li><strong>Blocked</strong>: The video is blocked.</li>
         * <li><strong>Normal</strong>: The video is normal.</li>
         * <li><strong>ProduceFail</strong>: The video failed to be produced.</li>
         * </ul>
         * <p>For more information about the definitions and limits of video statuses, refer to <a href="~~52839#section-p7c-jgy-070~~">Status: video status</a>.</p>
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
         * <p>The storage address of the audio or video file.</p>
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
