// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link UpdateSpecNodeGroup} extends {@link TeaModel}
 *
 * <p>UpdateSpecNodeGroup</p>
 */
public class UpdateSpecNodeGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.NameInMap("NewInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newInstanceType;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    private UpdateSpecNodeGroup(Builder builder) {
        this.modifyType = builder.modifyType;
        this.newInstanceType = builder.newInstanceType;
        this.nodeGroupId = builder.nodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSpecNodeGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return newInstanceType
     */
    public String getNewInstanceType() {
        return this.newInstanceType;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public static final class Builder {
        private String modifyType; 
        private String newInstanceType; 
        private String nodeGroupId; 

        private Builder() {
        } 

        private Builder(UpdateSpecNodeGroup model) {
            this.modifyType = model.modifyType;
            this.newInstanceType = model.newInstanceType;
            this.nodeGroupId = model.nodeGroupId;
        } 

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>新实例类型。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g7.xlarge</p>
         */
        public Builder newInstanceType(String newInstanceType) {
            this.newInstanceType = newInstanceType;
            return this;
        }

        /**
         * <p>节点组ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        public UpdateSpecNodeGroup build() {
            return new UpdateSpecNodeGroup(this);
        } 

    } 

}
