// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PrometheusManagedInstance} extends {@link TeaModel}
 *
 * <p>PrometheusManagedInstance</p>
 */
public class PrometheusManagedInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    private String prometheusInstanceId;

    @com.aliyun.core.annotation.NameInMap("prometheusInstanceName")
    private String prometheusInstanceName;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private PrometheusManagedInstance(Builder builder) {
        this.createTime = builder.createTime;
        this.instanceType = builder.instanceType;
        this.prometheusInstanceId = builder.prometheusInstanceId;
        this.prometheusInstanceName = builder.prometheusInstanceName;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrometheusManagedInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return prometheusInstanceId
     */
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    /**
     * @return prometheusInstanceName
     */
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private String instanceType; 
        private String prometheusInstanceId; 
        private String prometheusInstanceName; 
        private String regionId; 
        private String status; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(PrometheusManagedInstance model) {
            this.createTime = model.createTime;
            this.instanceType = model.instanceType;
            this.prometheusInstanceId = model.prometheusInstanceId;
            this.prometheusInstanceName = model.prometheusInstanceName;
            this.regionId = model.regionId;
            this.status = model.status;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The ID of the Prometheus instance that is associated with Real User Monitoring (RUM).</p>
         * 
         * <strong>example:</strong>
         * <p>rum-xxx</p>
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }

        /**
         * <p>The name of the Prometheus instance that is associated with RUM.</p>
         * 
         * <strong>example:</strong>
         * <p>rum-xxx</p>
         */
        public Builder prometheusInstanceName(String prometheusInstanceName) {
            this.prometheusInstanceName = prometheusInstanceName;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The Cloud Monitor 2.0 workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public PrometheusManagedInstance build() {
            return new PrometheusManagedInstance(this);
        } 

    } 

}
