// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link PolarFsConfig} extends {@link TeaModel}
 *
 * <p>PolarFsConfig</p>
 */
public class PolarFsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupId")
    private Integer groupId;

    @com.aliyun.core.annotation.NameInMap("mountPoints")
    private java.util.List<PolarFsMountConfig> mountPoints;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Integer userId;

    private PolarFsConfig(Builder builder) {
        this.groupId = builder.groupId;
        this.mountPoints = builder.mountPoints;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolarFsConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * @return mountPoints
     */
    public java.util.List<PolarFsMountConfig> getMountPoints() {
        return this.mountPoints;
    }

    /**
     * @return userId
     */
    public Integer getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Integer groupId; 
        private java.util.List<PolarFsMountConfig> mountPoints; 
        private Integer userId; 

        private Builder() {
        } 

        private Builder(PolarFsConfig model) {
            this.groupId = model.groupId;
            this.mountPoints = model.mountPoints;
            this.userId = model.userId;
        } 

        /**
         * groupId.
         */
        public Builder groupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * mountPoints.
         */
        public Builder mountPoints(java.util.List<PolarFsMountConfig> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public PolarFsConfig build() {
            return new PolarFsConfig(this);
        } 

    } 

}
