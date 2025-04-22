// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListFileRequest} extends {@link RequestModel}
 *
 * <p>ListFileRequest</p>
 */
public class ListFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private String fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_by")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_direction")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parent_file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentFileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thumbnail_processes")
    private java.util.Map<String, ImageProcess> thumbnailProcesses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.category = builder.category;
        this.driveId = builder.driveId;
        this.fields = builder.fields;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.parentFileId = builder.parentFileId;
        this.shareId = builder.shareId;
        this.status = builder.status;
        this.thumbnailProcesses = builder.thumbnailProcesses;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return parentFileId
     */
    public String getParentFileId() {
        return this.parentFileId;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return thumbnailProcesses
     */
    public java.util.Map<String, ImageProcess> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListFileRequest, Builder> {
        private String domainId; 
        private String category; 
        private String driveId; 
        private String fields; 
        private Integer limit; 
        private String marker; 
        private String orderBy; 
        private String orderDirection; 
        private String parentFileId; 
        private String shareId; 
        private String status; 
        private java.util.Map<String, ImageProcess> thumbnailProcesses; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.category = request.category;
            this.driveId = request.driveId;
            this.fields = request.fields;
            this.limit = request.limit;
            this.marker = request.marker;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.parentFileId = request.parentFileId;
            this.shareId = request.shareId;
            this.status = request.status;
            this.thumbnailProcesses = request.thumbnailProcesses;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The file category. Valid values:</p>
         * <p>app: installation package zip: compressed package image doc: document video audio others</p>
         * <p>By default, files of all categories are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The field that is used to return additional information about a child subject. Valid values:</p>
         * <ul>
         * <li>url: returns the URL of the thumbnail of a file in the response.</li>
         * <li>exif: returns the Exchangeable Image File Format (EXIF) data of a file in the response.</li>
         * <li>cropping_suggestion: returns the cropping suggestion on a file in the response.</li>
         * <li>characteristic_hash: returns the characteristic hash value of a file in the response.</li>
         * <li>video_metadata: returns the metadata of a video file, such as the video duration, bitrate, height, and width, in the response.</li>
         * <li>video_preview_metadata: returns the transcoding information of a video file, such as the transcoding specification for each definition, in the response.</li>
         * <li>investigation_info: returns the investigation information in the response.</li>
         * <li>dir_size: returns the statistics on each subfolder in the response.</li>
         * <li>user_tags: returns the user tags of each child subject in the response.</li>
         * </ul>
         * <p>You can specify multiple fields by separating them with commas (,). Example: &quot;url,dir_size,user_tags&quot;.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder fields(String fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
         * <p>The number of returned entries must be less than or equal to the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The name of the entry after which the list begins. Entries whose names are alphabetically after the value of this parameter are returned. If you do not specify this parameter, all entries are returned.<br>This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The sorting field. Valid values:</p>
         * <p>created_at: sorts the entries by creation time. updated_at: sorts the entries by update time. size: sorts the entries by file size. name: sorts the entries by file name.</p>
         * <p>Default value: created_at.</p>
         * <p>Enumeration:</p>
         * <ul>
         * <li>updated_at: update time</li>
         * <li>size: file size</li>
         * <li>name: file name</li>
         * <li>created_at: creation time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>updated_at</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sorting direction. Valid values:</p>
         * <p>ASC: ascending order DESC: descending order</p>
         * <p>Default value: ASC.</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("order_direction", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The ID of the parent folder. If the parent folder is a root directory, set this parameter to root.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder parentFileId(String parentFileId) {
            this.putBodyParameter("parent_file_id", parentFileId);
            this.parentFileId = parentFileId;
            return this;
        }

        /**
         * <p>The share ID. If you want to share a file, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1FswpQ8</p>
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The state of the files to return. Valid values:</p>
         * <p>available: returns only normal files. uploading: returns only files that are being uploaded.</p>
         * <p>By default, only files in the available state are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The thumbnail configurations. Up to five thumbnails can be returned at a time. The value contains key-value pairs. You can customize the keys. The URL of a thumbnail is returned based on the key.</p>
         */
        public Builder thumbnailProcesses(java.util.Map<String, ImageProcess> thumbnailProcesses) {
            this.putBodyParameter("thumbnail_processes", thumbnailProcesses);
            this.thumbnailProcesses = thumbnailProcesses;
            return this;
        }

        /**
         * <p>The file type. Valid values:</p>
         * <p>file: returns only files. folder: returns only folders.</p>
         * <p>By default, files of all types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListFileRequest build() {
            return new ListFileRequest(this);
        } 

    } 

}
