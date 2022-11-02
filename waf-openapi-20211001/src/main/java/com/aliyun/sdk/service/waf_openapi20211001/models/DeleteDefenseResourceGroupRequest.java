// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDefenseResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDefenseResourceGroupRequest</p>
 */
public class DeleteDefenseResourceGroupRequest extends Request {
    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDefenseResourceGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDefenseResourceGroupRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDefenseResourceGroupRequest, Builder> {
        private String groupName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDefenseResourceGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
        } 

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteDefenseResourceGroupRequest build() {
            return new DeleteDefenseResourceGroupRequest(this);
        } 

    } 

}
