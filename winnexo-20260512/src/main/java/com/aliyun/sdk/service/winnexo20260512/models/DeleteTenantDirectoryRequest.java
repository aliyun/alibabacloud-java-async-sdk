// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link DeleteTenantDirectoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteTenantDirectoryRequest</p>
 */
public class DeleteTenantDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deleteMode")
    private String deleteMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private DeleteTenantDirectoryRequest(Builder builder) {
        super(builder);
        this.deleteMode = builder.deleteMode;
        this.directoryId = builder.directoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTenantDirectoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteMode
     */
    public String getDeleteMode() {
        return this.deleteMode;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DeleteTenantDirectoryRequest, Builder> {
        private String deleteMode; 
        private String directoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTenantDirectoryRequest request) {
            super(request);
            this.deleteMode = request.deleteMode;
            this.directoryId = request.directoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>删除模式：reject / recursive / move_to_root</p>
         * 
         * <strong>example:</strong>
         * <p>reject</p>
         */
        public Builder deleteMode(String deleteMode) {
            this.putBodyParameter("deleteMode", deleteMode);
            this.deleteMode = deleteMode;
            return this;
        }

        /**
         * <p>目录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DeleteTenantDirectoryRequest build() {
            return new DeleteTenantDirectoryRequest(this);
        } 

    } 

}
