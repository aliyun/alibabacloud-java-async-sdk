// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateAccessPageRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessPageRequest</p>
 */
public class CreateAccessPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudEnvId")
    private String cloudEnvId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectTime")
    private Integer effectTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    private CreateAccessPageRequest(Builder builder) {
        super(builder);
        this.accessPageName = builder.accessPageName;
        this.cloudEnvId = builder.cloudEnvId;
        this.effectTime = builder.effectTime;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPageName
     */
    public String getAccessPageName() {
        return this.accessPageName;
    }

    /**
     * @return cloudEnvId
     */
    public String getCloudEnvId() {
        return this.cloudEnvId;
    }

    /**
     * @return effectTime
     */
    public Integer getEffectTime() {
        return this.effectTime;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder extends Request.Builder<CreateAccessPageRequest, Builder> {
        private String accessPageName; 
        private String cloudEnvId; 
        private Integer effectTime; 
        private String projectId; 
        private String projectName; 
        private String unit; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessPageRequest request) {
            super(request);
            this.accessPageName = request.accessPageName;
            this.cloudEnvId = request.cloudEnvId;
            this.effectTime = request.effectTime;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.unit = request.unit;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accessPageName(String accessPageName) {
            this.putQueryParameter("AccessPageName", accessPageName);
            this.accessPageName = accessPageName;
            return this;
        }

        /**
         * CloudEnvId.
         */
        public Builder cloudEnvId(String cloudEnvId) {
            this.putQueryParameter("CloudEnvId", cloudEnvId);
            this.cloudEnvId = cloudEnvId;
            return this;
        }

        /**
         * EffectTime.
         */
        public Builder effectTime(Integer effectTime) {
            this.putQueryParameter("EffectTime", effectTime);
            this.effectTime = effectTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-065zdecaer07h****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Unit.
         */
        public Builder unit(String unit) {
            this.putQueryParameter("Unit", unit);
            this.unit = unit;
            return this;
        }

        @Override
        public CreateAccessPageRequest build() {
            return new CreateAccessPageRequest(this);
        } 

    } 

}
