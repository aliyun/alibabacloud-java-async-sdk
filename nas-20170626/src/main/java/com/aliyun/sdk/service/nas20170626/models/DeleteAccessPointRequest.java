// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DeleteAccessPointRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessPointRequest</p>
 */
public class DeleteAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 3)
    private String fileSystemId;

    private DeleteAccessPointRequest(Builder builder) {
        super(builder);
        this.accessPointId = builder.accessPointId;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<DeleteAccessPointRequest, Builder> {
        private String accessPointId; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessPointRequest request) {
            super(request);
            this.accessPointId = request.accessPointId;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * <p>The ID of the access point.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-ie15yd****</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public DeleteAccessPointRequest build() {
            return new DeleteAccessPointRequest(this);
        } 

    } 

}
