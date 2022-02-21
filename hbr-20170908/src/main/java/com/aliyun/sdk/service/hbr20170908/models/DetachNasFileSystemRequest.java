// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachNasFileSystemRequest} extends {@link RequestModel}
 *
 * <p>DetachNasFileSystemRequest</p>
 */
public class DetachNasFileSystemRequest extends Request {
    @Query
    @NameInMap("CreateTime")
    @Validation(required = true)
    private String createTime;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    private DetachNasFileSystemRequest(Builder builder) {
        super(builder);
        this.createTime = builder.createTime;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachNasFileSystemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<DetachNasFileSystemRequest, Builder> {
        private String createTime; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DetachNasFileSystemRequest response) {
            super(response);
            this.createTime = response.createTime;
            this.fileSystemId = response.fileSystemId;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public DetachNasFileSystemRequest build() {
            return new DetachNasFileSystemRequest(this);
        } 

    } 

}
