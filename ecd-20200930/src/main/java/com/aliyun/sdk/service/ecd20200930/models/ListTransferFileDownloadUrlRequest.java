// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ListTransferFileDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>ListTransferFileDownloadUrlRequest</p>
 */
public class ListTransferFileDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    private java.util.List<String> fileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ListTransferFileDownloadUrlRequest(Builder builder) {
        super(builder);
        this.fileIds = builder.fileIds;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransferFileDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileIds
     */
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListTransferFileDownloadUrlRequest, Builder> {
        private java.util.List<String> fileIds; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransferFileDownloadUrlRequest request) {
            super(request);
            this.fileIds = request.fileIds;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The list of file IDs to query.</p>
         */
        public Builder fileIds(java.util.List<String> fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>trt-hffhi4nmqoi4****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListTransferFileDownloadUrlRequest build() {
            return new ListTransferFileDownloadUrlRequest(this);
        } 

    } 

}
