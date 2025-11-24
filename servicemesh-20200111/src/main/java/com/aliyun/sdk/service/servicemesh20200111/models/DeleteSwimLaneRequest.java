// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DeleteSwimLaneRequest} extends {@link RequestModel}
 *
 * <p>DeleteSwimLaneRequest</p>
 */
public class DeleteSwimLaneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwimLaneName")
    private String swimLaneName;

    private DeleteSwimLaneRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.serviceMeshId = builder.serviceMeshId;
        this.swimLaneName = builder.swimLaneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSwimLaneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return swimLaneName
     */
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

    public static final class Builder extends Request.Builder<DeleteSwimLaneRequest, Builder> {
        private String groupName; 
        private String serviceMeshId; 
        private String swimLaneName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSwimLaneRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.serviceMeshId = request.serviceMeshId;
            this.swimLaneName = request.swimLaneName;
        } 

        /**
         * <p>The name of the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The ID of the Service Mesh (ASM) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>The name of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>s1</p>
         */
        public Builder swimLaneName(String swimLaneName) {
            this.putBodyParameter("SwimLaneName", swimLaneName);
            this.swimLaneName = swimLaneName;
            return this;
        }

        @Override
        public DeleteSwimLaneRequest build() {
            return new DeleteSwimLaneRequest(this);
        } 

    } 

}
