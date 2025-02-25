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
 * {@link UpdateDriveRequest} extends {@link RequestModel}
 *
 * <p>UpdateDriveRequest</p>
 */
public class UpdateDriveRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_name")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String driveName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_size")
    private Long totalSize;

    private UpdateDriveRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.description = builder.description;
        this.driveId = builder.driveId;
        this.driveName = builder.driveName;
        this.owner = builder.owner;
        this.status = builder.status;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDriveRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return driveName
     */
    public String getDriveName() {
        return this.driveName;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder extends Request.Builder<UpdateDriveRequest, Builder> {
        private String domainId; 
        private String description; 
        private String driveId; 
        private String driveName; 
        private String owner; 
        private String status; 
        private Long totalSize; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDriveRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.description = request.description;
            this.driveId = request.driveId;
            this.driveName = request.driveName;
            this.owner = request.owner;
            this.status = request.status;
            this.totalSize = request.totalSize;
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
         * <p>The description of the drive. The description can be up to 1,024 characters in length.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the drive. The name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my_drive</p>
         */
        public Builder driveName(String driveName) {
            this.putBodyParameter("drive_name", driveName);
            this.driveName = driveName;
            return this;
        }

        /**
         * <p>The owner of the drive. Note: You can modify the owner of a personal drive only by using an AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The state of the drive. Valid values:</p>
         * <p>enabled and disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The total size of the drive. Unit: bytes. A value of -1 specifies that the size is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder totalSize(Long totalSize) {
            this.putBodyParameter("total_size", totalSize);
            this.totalSize = totalSize;
            return this;
        }

        @Override
        public UpdateDriveRequest build() {
            return new UpdateDriveRequest(this);
        } 

    } 

}
