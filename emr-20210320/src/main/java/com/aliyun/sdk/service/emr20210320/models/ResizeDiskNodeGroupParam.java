// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDiskNodeGroupParam} extends {@link TeaModel}
 *
 * <p>ResizeDiskNodeGroupParam</p>
 */
public class ResizeDiskNodeGroupParam extends TeaModel {
    @NameInMap("DataDiskCapacity")
    private Long dataDiskCapacity;

    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @NameInMap("RollingRestart")
    private Boolean rollingRestart;

    private ResizeDiskNodeGroupParam(Builder builder) {
        this.dataDiskCapacity = builder.dataDiskCapacity;
        this.nodeGroupId = builder.nodeGroupId;
        this.rollingRestart = builder.rollingRestart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDiskNodeGroupParam create() {
        return builder().build();
    }

    /**
     * @return dataDiskCapacity
     */
    public Long getDataDiskCapacity() {
        return this.dataDiskCapacity;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return rollingRestart
     */
    public Boolean getRollingRestart() {
        return this.rollingRestart;
    }

    public static final class Builder {
        private Long dataDiskCapacity; 
        private String nodeGroupId; 
        private Boolean rollingRestart; 

        /**
         * DataDiskCapacity.
         */
        public Builder dataDiskCapacity(Long dataDiskCapacity) {
            this.dataDiskCapacity = dataDiskCapacity;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * RollingRestart.
         */
        public Builder rollingRestart(Boolean rollingRestart) {
            this.rollingRestart = rollingRestart;
            return this;
        }

        public ResizeDiskNodeGroupParam build() {
            return new ResizeDiskNodeGroupParam(this);
        } 

    } 

}
