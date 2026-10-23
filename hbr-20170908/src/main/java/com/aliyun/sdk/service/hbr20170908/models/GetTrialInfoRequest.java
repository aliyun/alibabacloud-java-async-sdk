// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link GetTrialInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTrialInfoRequest</p>
 */
public class GetTrialInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private GetTrialInfoRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.createTime = builder.createTime;
        this.fileSystemId = builder.fileSystemId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrialInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<GetTrialInfoRequest, Builder> {
        private String bucket; 
        private Long createTime; 
        private String fileSystemId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetTrialInfoRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.createTime = request.createTime;
            this.fileSystemId = request.fileSystemId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr-backup-oss</p>
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The time when the file system was created. UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1607436917</p>
         */
        public Builder createTime(Long createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>005494</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The data source type. Only free trial information of OSS backup and NAS backup can be queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public GetTrialInfoRequest build() {
            return new GetTrialInfoRequest(this);
        } 

    } 

}
