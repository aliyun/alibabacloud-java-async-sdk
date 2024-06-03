// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSpecNodeGroupParam} extends {@link TeaModel}
 *
 * <p>UpdateSpecNodeGroupParam</p>
 */
public class UpdateSpecNodeGroupParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewInstanceType")
    private String newInstanceType;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    private UpdateSpecNodeGroupParam(Builder builder) {
        this.newInstanceType = builder.newInstanceType;
        this.nodeGroupId = builder.nodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSpecNodeGroupParam create() {
        return builder().build();
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
        private String newInstanceType; 
        private String nodeGroupId; 

        /**
         * NewInstanceType.
         */
        public Builder newInstanceType(String newInstanceType) {
            this.newInstanceType = newInstanceType;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        public UpdateSpecNodeGroupParam build() {
            return new UpdateSpecNodeGroupParam(this);
        } 

    } 

}
