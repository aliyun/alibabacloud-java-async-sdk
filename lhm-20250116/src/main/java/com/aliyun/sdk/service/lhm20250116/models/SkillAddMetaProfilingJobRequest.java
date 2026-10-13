// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link SkillAddMetaProfilingJobRequest} extends {@link RequestModel}
 *
 * <p>SkillAddMetaProfilingJobRequest</p>
 */
public class SkillAddMetaProfilingJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentId")
    private Long componentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobDesc")
    private String jobDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobId")
    private Long jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobName")
    private String jobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metaIds")
    private java.util.List<String> metaIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profilingFlag")
    private Integer profilingFlag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profilingPermission")
    private Integer profilingPermission;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profilingRule")
    private String profilingRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profilingSchemaList")
    private java.util.List<String> profilingSchemaList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profilingType")
    private Integer profilingType;

    private SkillAddMetaProfilingJobRequest(Builder builder) {
        super(builder);
        this.componentId = builder.componentId;
        this.jobDesc = builder.jobDesc;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.metaIds = builder.metaIds;
        this.pluginId = builder.pluginId;
        this.profilingFlag = builder.profilingFlag;
        this.profilingPermission = builder.profilingPermission;
        this.profilingRule = builder.profilingRule;
        this.profilingSchemaList = builder.profilingSchemaList;
        this.profilingType = builder.profilingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkillAddMetaProfilingJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentId
     */
    public Long getComponentId() {
        return this.componentId;
    }

    /**
     * @return jobDesc
     */
    public String getJobDesc() {
        return this.jobDesc;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return metaIds
     */
    public java.util.List<String> getMetaIds() {
        return this.metaIds;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return profilingFlag
     */
    public Integer getProfilingFlag() {
        return this.profilingFlag;
    }

    /**
     * @return profilingPermission
     */
    public Integer getProfilingPermission() {
        return this.profilingPermission;
    }

    /**
     * @return profilingRule
     */
    public String getProfilingRule() {
        return this.profilingRule;
    }

    /**
     * @return profilingSchemaList
     */
    public java.util.List<String> getProfilingSchemaList() {
        return this.profilingSchemaList;
    }

    /**
     * @return profilingType
     */
    public Integer getProfilingType() {
        return this.profilingType;
    }

    public static final class Builder extends Request.Builder<SkillAddMetaProfilingJobRequest, Builder> {
        private Long componentId; 
        private String jobDesc; 
        private Long jobId; 
        private String jobName; 
        private java.util.List<String> metaIds; 
        private String pluginId; 
        private Integer profilingFlag; 
        private Integer profilingPermission; 
        private String profilingRule; 
        private java.util.List<String> profilingSchemaList; 
        private Integer profilingType; 

        private Builder() {
            super();
        } 

        private Builder(SkillAddMetaProfilingJobRequest request) {
            super(request);
            this.componentId = request.componentId;
            this.jobDesc = request.jobDesc;
            this.jobId = request.jobId;
            this.jobName = request.jobName;
            this.metaIds = request.metaIds;
            this.pluginId = request.pluginId;
            this.profilingFlag = request.profilingFlag;
            this.profilingPermission = request.profilingPermission;
            this.profilingRule = request.profilingRule;
            this.profilingSchemaList = request.profilingSchemaList;
            this.profilingType = request.profilingType;
        } 

        /**
         * <p>The component ID, which is the primary key identifier of the data source component.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        public Builder componentId(Long componentId) {
            this.putBodyParameter("componentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The description of the profiling task.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily full metadata profiling task</p>
         */
        public Builder jobDesc(String jobDesc) {
            this.putBodyParameter("jobDesc", jobDesc);
            this.jobDesc = jobDesc;
            return this;
        }

        /**
         * <p>The profiling task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100256</p>
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name of the profiling task.</p>
         * 
         * <strong>example:</strong>
         * <p>profiling_daily</p>
         */
        public Builder jobName(String jobName) {
            this.putBodyParameter("jobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The list of metadata object IDs to be profiled or operated on.</p>
         */
        public Builder metaIds(java.util.List<String> metaIds) {
            this.putBodyParameter("metaIds", metaIds);
            this.metaIds = metaIds;
            return this;
        }

        /**
         * <p>The profiling plugin ID, which specifies the plugin used to perform the profiling.</p>
         * 
         * <strong>example:</strong>
         * <p>profiling-plugin-001</p>
         */
        public Builder pluginId(String pluginId) {
            this.putBodyParameter("pluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>Specifies whether to enable data profiling.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder profilingFlag(Integer profilingFlag) {
            this.putBodyParameter("profilingFlag", profilingFlag);
            this.profilingFlag = profilingFlag;
            return this;
        }

        /**
         * <p>The profiling permission configuration identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder profilingPermission(Integer profilingPermission) {
            this.putBodyParameter("profilingPermission", profilingPermission);
            this.profilingPermission = profilingPermission;
            return this;
        }

        /**
         * <p>The profiling rule configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder profilingRule(String profilingRule) {
            this.putBodyParameter("profilingRule", profilingRule);
            this.profilingRule = profilingRule;
            return this;
        }

        /**
         * <p>The list of schemas to be profiled.</p>
         */
        public Builder profilingSchemaList(java.util.List<String> profilingSchemaList) {
            this.putBodyParameter("profilingSchemaList", profilingSchemaList);
            this.profilingSchemaList = profilingSchemaList;
            return this;
        }

        /**
         * <p>The profiling type identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder profilingType(Integer profilingType) {
            this.putBodyParameter("profilingType", profilingType);
            this.profilingType = profilingType;
            return this;
        }

        @Override
        public SkillAddMetaProfilingJobRequest build() {
            return new SkillAddMetaProfilingJobRequest(this);
        } 

    } 

}
