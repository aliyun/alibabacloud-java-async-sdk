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
 * {@link DecreaseNodeGroupParam} extends {@link TeaModel}
 *
 * <p>DecreaseNodeGroupParam</p>
 */
public class DecreaseNodeGroupParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("ReleaseInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> releaseInstanceIds;

    private DecreaseNodeGroupParam(Builder builder) {
        this.nodeGroupId = builder.nodeGroupId;
        this.releaseInstanceIds = builder.releaseInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecreaseNodeGroupParam create() {
        return builder().build();
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return releaseInstanceIds
     */
    public java.util.List<String> getReleaseInstanceIds() {
        return this.releaseInstanceIds;
    }

    public static final class Builder {
        private String nodeGroupId; 
        private java.util.List<String> releaseInstanceIds; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>G-21E39B11837E****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder releaseInstanceIds(java.util.List<String> releaseInstanceIds) {
            this.releaseInstanceIds = releaseInstanceIds;
            return this;
        }

        public DecreaseNodeGroupParam build() {
            return new DecreaseNodeGroupParam(this);
        } 

    } 

}
