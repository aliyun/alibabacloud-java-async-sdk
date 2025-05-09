// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link InstanceActiveOpsTask} extends {@link TeaModel}
 *
 * <p>InstanceActiveOpsTask</p>
 */
public class InstanceActiveOpsTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceActiveOpsTaskId")
    private String instanceActiveOpsTaskId;

    @com.aliyun.core.annotation.NameInMap("InstanceActiveOpsTaskStatus")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InstanceActiveOpsTask model) {
            this.instanceActiveOpsTaskId = model.instanceActiveOpsTaskId;
            this.instanceActiveOpsTaskStatus = model.instanceActiveOpsTaskStatus;
        } 

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
