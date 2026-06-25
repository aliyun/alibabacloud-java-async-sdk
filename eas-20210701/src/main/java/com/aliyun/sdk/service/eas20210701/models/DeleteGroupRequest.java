// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DeleteGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupRequest</p>
 */
public class DeleteGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CascadeDelete")
    private String cascadeDelete;

    private DeleteGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.cascadeDelete = builder.cascadeDelete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return cascadeDelete
     */
    public String getCascadeDelete() {
        return this.cascadeDelete;
    }

    public static final class Builder extends Request.Builder<DeleteGroupRequest, Builder> {
        private String clusterId; 
        private String groupName; 
        private String cascadeDelete; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
            this.cascadeDelete = request.cascadeDelete;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putPathParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * CascadeDelete.
         */
        public Builder cascadeDelete(String cascadeDelete) {
            this.putQueryParameter("CascadeDelete", cascadeDelete);
            this.cascadeDelete = cascadeDelete;
            return this;
        }

        @Override
        public DeleteGroupRequest build() {
            return new DeleteGroupRequest(this);
        } 

    } 

}
