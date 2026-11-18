// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link BatchGetVideoCharacterReplaceJobsRequest} extends {@link RequestModel}
 *
 * <p>BatchGetVideoCharacterReplaceJobsRequest</p>
 */
public class BatchGetVideoCharacterReplaceJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private String jobIds;

    private BatchGetVideoCharacterReplaceJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetVideoCharacterReplaceJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return jobIds
     */
    public String getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<BatchGetVideoCharacterReplaceJobsRequest, Builder> {
        private String regionId; 
        private String jobIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetVideoCharacterReplaceJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobIds = request.jobIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of job IDs. Separate multiple IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>ag_83baeea38b534ee1937b8a4acd08****,ag_f7eeed5d5e294dfba4bb347177e1****</p>
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public BatchGetVideoCharacterReplaceJobsRequest build() {
            return new BatchGetVideoCharacterReplaceJobsRequest(this);
        } 

    } 

}
