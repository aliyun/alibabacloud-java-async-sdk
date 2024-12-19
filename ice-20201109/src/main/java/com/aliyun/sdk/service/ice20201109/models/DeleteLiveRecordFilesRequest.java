// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteLiveRecordFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveRecordFilesRequest</p>
 */
public class DeleteLiveRecordFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> recordIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveFile")
    private Boolean removeFile;

    private DeleteLiveRecordFilesRequest(Builder builder) {
        super(builder);
        this.recordIds = builder.recordIds;
        this.removeFile = builder.removeFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveRecordFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordIds
     */
    public java.util.List<String> getRecordIds() {
        return this.recordIds;
    }

    /**
     * @return removeFile
     */
    public Boolean getRemoveFile() {
        return this.removeFile;
    }

    public static final class Builder extends Request.Builder<DeleteLiveRecordFilesRequest, Builder> {
        private java.util.List<String> recordIds; 
        private Boolean removeFile; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveRecordFilesRequest request) {
            super(request);
            this.recordIds = request.recordIds;
            this.removeFile = request.removeFile;
        } 

        /**
         * <p>The collection of IDs of recording files.</p>
         * <p>This parameter is required.</p>
         */
        public Builder recordIds(java.util.List<String> recordIds) {
            this.putQueryParameter("RecordIds", recordIds);
            this.recordIds = recordIds;
            return this;
        }

        /**
         * <p>Specifies whether to delete the original files in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder removeFile(Boolean removeFile) {
            this.putQueryParameter("RemoveFile", removeFile);
            this.removeFile = removeFile;
            return this;
        }

        @Override
        public DeleteLiveRecordFilesRequest build() {
            return new DeleteLiveRecordFilesRequest(this);
        } 

    } 

}
