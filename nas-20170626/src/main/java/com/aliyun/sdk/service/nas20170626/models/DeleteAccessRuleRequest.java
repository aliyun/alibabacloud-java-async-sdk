// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessRuleRequest</p>
 */
public class DeleteAccessRuleRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    private String accessGroupName;

    @Query
    @NameInMap("AccessRuleId")
    @Validation(required = true)
    private String accessRuleId;

    @Query
    @NameInMap("FileSystemType")
    private String fileSystemType;

    private DeleteAccessRuleRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.accessRuleId = builder.accessRuleId;
        this.fileSystemType = builder.fileSystemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return accessRuleId
     */
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public static final class Builder extends Request.Builder<DeleteAccessRuleRequest, Builder> {
        private String accessGroupName; 
        private String accessRuleId; 
        private String fileSystemType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessRuleRequest response) {
            super(response);
            this.accessGroupName = response.accessGroupName;
            this.accessRuleId = response.accessRuleId;
            this.fileSystemType = response.fileSystemType;
        } 

        /**
         * AccessGroupName.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * AccessRuleId.
         */
        public Builder accessRuleId(String accessRuleId) {
            this.putQueryParameter("AccessRuleId", accessRuleId);
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * FileSystemType.
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        @Override
        public DeleteAccessRuleRequest build() {
            return new DeleteAccessRuleRequest(this);
        } 

    } 

}
