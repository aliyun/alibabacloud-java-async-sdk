// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceActiveOpsTask} extends {@link TeaModel}
 *
 * <p>InstanceActiveOpsTask</p>
 */
public class InstanceActiveOpsTask extends TeaModel {
    @NameInMap("InstanceActiveOpsTaskId")
    private String instanceActiveOpsTaskId;

    @NameInMap("InstanceActiveOpsTaskStatus")
    private String instanceActiveOpsTaskStatus;

    private InstanceActiveOpsTask(Builder builder) {
        this.instanceActiveOpsTaskId = builder.instanceActiveOpsTaskId;
        this.instanceActiveOpsTaskStatus = builder.instanceActiveOpsTaskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceActiveOpsTask create() {
        return builder().build();
    }

    /**
     * @return instanceActiveOpsTaskId
     */
    public String getInstanceActiveOpsTaskId() {
        return this.instanceActiveOpsTaskId;
    }

    /**
     * @return instanceActiveOpsTaskStatus
     */
    public String getInstanceActiveOpsTaskStatus() {
        return this.instanceActiveOpsTaskStatus;
    }

    public static final class Builder {
        private String instanceActiveOpsTaskId; 
        private String instanceActiveOpsTaskStatus; 

        /**
         * InstanceActiveOpsTaskId.
         */
        public Builder instanceActiveOpsTaskId(String instanceActiveOpsTaskId) {
            this.instanceActiveOpsTaskId = instanceActiveOpsTaskId;
            return this;
        }

        /**
         * InstanceActiveOpsTaskStatus.
         */
        public Builder instanceActiveOpsTaskStatus(String instanceActiveOpsTaskStatus) {
            this.instanceActiveOpsTaskStatus = instanceActiveOpsTaskStatus;
            return this;
        }

        public InstanceActiveOpsTask build() {
            return new InstanceActiveOpsTask(this);
        } 

    } 

}
