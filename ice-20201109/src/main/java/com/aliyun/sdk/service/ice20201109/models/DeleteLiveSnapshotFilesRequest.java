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
 * {@link DeleteLiveSnapshotFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveSnapshotFilesRequest</p>
 */
public class DeleteLiveSnapshotFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimestampList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> createTimestampList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteOriginalFile")
    private Boolean deleteOriginalFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private DeleteLiveSnapshotFilesRequest(Builder builder) {
        super(builder);
        this.createTimestampList = builder.createTimestampList;
        this.deleteOriginalFile = builder.deleteOriginalFile;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveSnapshotFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimestampList
     */
    public java.util.List<Long> getCreateTimestampList() {
        return this.createTimestampList;
    }

    /**
     * @return deleteOriginalFile
     */
    public Boolean getDeleteOriginalFile() {
        return this.deleteOriginalFile;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DeleteLiveSnapshotFilesRequest, Builder> {
        private java.util.List<Long> createTimestampList; 
        private Boolean deleteOriginalFile; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveSnapshotFilesRequest request) {
            super(request);
            this.createTimestampList = request.createTimestampList;
            this.deleteOriginalFile = request.deleteOriginalFile;
            this.jobId = request.jobId;
        } 

        /**
         * <p>The list of timestamps when the jobs were created. The values are UNIX timestamps representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. A maximum of 200 jobs can be deleted at a time.</p>
         * <p>This parameter is required.</p>
         */
        public Builder createTimestampList(java.util.List<Long> createTimestampList) {
            String createTimestampListShrink = shrink(createTimestampList, "CreateTimestampList", "json");
            this.putQueryParameter("CreateTimestampList", createTimestampListShrink);
            this.createTimestampList = createTimestampList;
            return this;
        }

        /**
         * <p>Specifies whether to delete the original files at the same time. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteOriginalFile(Boolean deleteOriginalFile) {
            this.putQueryParameter("DeleteOriginalFile", deleteOriginalFile);
            this.deleteOriginalFile = deleteOriginalFile;
            return this;
        }

        /**
         * <p>The ID of the snapshot job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DeleteLiveSnapshotFilesRequest build() {
            return new DeleteLiveSnapshotFilesRequest(this);
        } 

    } 

}
