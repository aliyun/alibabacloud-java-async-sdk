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
         * <p>The category of the file. Valid values:</p>
         * <p>app: installation package. zip: compressed package. image: image. doc: document. video: video. audio: audio. others: other files.</p>
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
         * <p>The fields to return.</p>
         * <ol>
         * <li>If this parameter is set to *, all fields of the file except the fields that must be specified are returned.</li>
         * <li>If only specific fields are required, you can specify the following fields: url, exif, cropping_suggestion, characteristic_hash, video_metadata, and video_preview_metadata. If multiple fields are required, separate them with commas (,). Example: url,exif.</li>
         * <li>The investigation_info field is returned only if you specify this field.</li>
         * </ol>
         * <p>By default, all fields except the fields that must be specified are returned.</p>
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
         * <p>The number of returned results must be less than or equal to the specified number.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.<br>By default, this parameter is empty.</p>
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
         * <p>The sorting field.</p>
         * <p>Default value: created_at.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>updated_at</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>sorts the results based on the time when the file was last modified</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>size</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>sorts the results based on the size of the file</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>name</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>sorts the results based on the name of the file</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
         * <li><p>created_at</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>sorts the results based on the time when the file was created</p>
         * <!-- -->
         * 
         * <p>.</p>
         * </li>
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
         * <p>ASC: ascending order. DESC: descending order.</p>
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
         * <p>The share ID. If you want to manage a file by using a share link, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
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
         * <p>The state of the file. Valid values:</p>
         * <p>available: Only normal files are returned. uploading: Only files that are being uploaded are returned.</p>
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
         * <p>The type of the file. Valid values:</p>
         * <p>file: Only files are returned. folder: Only folders are returned.</p>
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
