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
            this.fileCategory = request.fileCategory;
            this.fileFrom = request.fileFrom;
            this.fileId = request.fileId;
            this.sessionId = request.sessionId;
            this.sortColumn = request.sortColumn;
            this.sortDirection = request.sortDirection;
        } 

        /**
         * CallFrom.
         */
        public Builder callFrom(String callFrom) {
            this.putQueryParameter("CallFrom", callFrom);
            this.callFrom = callFrom;
            return this;
        }

        /**
         * DmsUnit.
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
            return this;
        }

        /**
         * FileCategory.
         */
        public Builder fileCategory(String fileCategory) {
            this.putQueryParameter("FileCategory", fileCategory);
            this.fileCategory = fileCategory;
            return this;
        }

        /**
         * FileFrom.
         */
        public Builder fileFrom(String fileFrom) {
            this.putQueryParameter("FileFrom", fileFrom);
            this.fileFrom = fileFrom;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SortColumn.
         */
        public Builder sortColumn(String sortColumn) {
            this.putQueryParameter("SortColumn", sortColumn);
            this.sortColumn = sortColumn;
            return this;
        }

        /**
         * SortDirection.
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
