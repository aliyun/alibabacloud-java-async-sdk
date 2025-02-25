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
 * {@link DetachNasFileSystemRequest} extends {@link RequestModel}
 *
 * <p>DetachNasFileSystemRequest</p>
 */
public class DetachNasFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private DetachNasFileSystemRequest(Builder builder) {
        super(builder);
        this.createTime = builder.createTime;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
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
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<DetachNasFileSystemRequest, Builder> {
        private String createTime; 
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DetachNasFileSystemRequest request) {
            super(request);
            this.createTime = request.createTime;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * <p>The time when the file system was created. The value must be a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1607436917</p>
         */
        public Builder createTime(String createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupRole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</li>
         * <li>CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELF_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>158975xxxxx4625</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>005494</p>
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
