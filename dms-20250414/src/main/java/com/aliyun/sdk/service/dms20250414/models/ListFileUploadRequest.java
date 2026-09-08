// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListFileUploadRequest} extends {@link RequestModel}
 *
 * <p>ListFileUploadRequest</p>
 */
public class ListFileUploadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallFrom")
    private String callFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUnit")
    private String dmsUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadLinkExpire")
    private Integer downloadLinkExpire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCategory")
    private String fileCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileFrom")
    private String fileFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortColumn")
    private String sortColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortDirection")
    private String sortDirection;

    private ListFileUploadRequest(Builder builder) {
        super(builder);
        this.callFrom = builder.callFrom;
        this.dmsUnit = builder.dmsUnit;
        this.downloadLinkExpire = builder.downloadLinkExpire;
        this.fileCategory = builder.fileCategory;
        this.fileFrom = builder.fileFrom;
        this.fileId = builder.fileId;
        this.sessionId = builder.sessionId;
        this.sortColumn = builder.sortColumn;
        this.sortDirection = builder.sortDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileUploadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callFrom
     */
    public String getCallFrom() {
        return this.callFrom;
    }

    /**
     * @return dmsUnit
     */
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    /**
     * @return downloadLinkExpire
     */
    public Integer getDownloadLinkExpire() {
        return this.downloadLinkExpire;
    }

    /**
     * @return fileCategory
     */
    public String getFileCategory() {
        return this.fileCategory;
    }

    /**
     * @return fileFrom
     */
    public String getFileFrom() {
        return this.fileFrom;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sortColumn
     */
    public String getSortColumn() {
        return this.sortColumn;
    }

    /**
     * @return sortDirection
     */
    public String getSortDirection() {
        return this.sortDirection;
    }

    public static final class Builder extends Request.Builder<ListFileUploadRequest, Builder> {
        private String callFrom; 
        private String dmsUnit; 
        private Integer downloadLinkExpire; 
        private String fileCategory; 
        private String fileFrom; 
        private String fileId; 
        private String sessionId; 
        private String sortColumn; 
        private String sortDirection; 

        private Builder() {
            super();
        } 

        private Builder(ListFileUploadRequest request) {
            super(request);
            this.callFrom = request.callFrom;
            this.dmsUnit = request.dmsUnit;
            this.downloadLinkExpire = request.downloadLinkExpire;
            this.fileCategory = request.fileCategory;
            this.fileFrom = request.fileFrom;
            this.fileId = request.fileId;
            this.sessionId = request.sessionId;
            this.sortColumn = request.sortColumn;
            this.sortDirection = request.sortDirection;
        } 

        /**
         * <p>For front-end use only.</p>
         * 
         * <strong>example:</strong>
         * <p>仅前端使用</p>
         */
        public Builder callFrom(String callFrom) {
            this.putQueryParameter("CallFrom", callFrom);
            this.callFrom = callFrom;
            return this;
        }

        /**
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
            return this;
        }

        /**
         * <p>The validity period of the download link, in seconds. This parameter applies only to files in user-owned Object Storage Service (OSS) buckets. The default is 3600.</p>
         * <ul>
         * <li><p>Minimum value: 3600 (1 hour)</p>
         * </li>
         * <li><p>Maximum value: 129600 (36 hours)</p>
         * </li>
         * </ul>
         * <p>Notes:</p>
         * <ul>
         * <li><p>Download links for files in the built-in OSS are valid for 1 hour.</p>
         * </li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder downloadLinkExpire(Integer downloadLinkExpire) {
            this.putQueryParameter("DownloadLinkExpire", downloadLinkExpire);
            this.downloadLinkExpire = downloadLinkExpire;
            return this;
        }

        /**
         * <p>The file category.</p>
         * 
         * <strong>example:</strong>
         * <p>TextReport</p>
         */
        public Builder fileCategory(String fileCategory) {
            this.putQueryParameter("FileCategory", fileCategory);
            this.fileCategory = fileCategory;
            return this;
        }

        /**
         * <p>The file source.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent</p>
         */
        public Builder fileFrom(String fileFrom) {
            this.putQueryParameter("FileFrom", fileFrom);
            this.fileFrom = fileFrom;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>h8r********4fch</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The sort column.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtCreated</p>
         */
        public Builder sortColumn(String sortColumn) {
            this.putQueryParameter("SortColumn", sortColumn);
            this.sortColumn = sortColumn;
            return this;
        }

        /**
         * <p>The sort direction.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortDirection(String sortDirection) {
            this.putQueryParameter("SortDirection", sortDirection);
            this.sortDirection = sortDirection;
            return this;
        }

        @Override
        public ListFileUploadRequest build() {
            return new ListFileUploadRequest(this);
        } 

    } 

}
