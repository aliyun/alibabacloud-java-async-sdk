// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link PreviewTaskParametersRequest} extends {@link RequestModel}
 *
 * <p>PreviewTaskParametersRequest</p>
 */
public class PreviewTaskParametersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cron")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cron;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreviewCount")
    private Integer previewCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private PreviewTaskParametersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdate = builder.bizdate;
        this.cron = builder.cron;
        this.parameters = builder.parameters;
        this.previewCount = builder.previewCount;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewTaskParametersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizdate
     */
    public Long getBizdate() {
        return this.bizdate;
    }

    /**
     * @return cron
     */
    public String getCron() {
        return this.cron;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return previewCount
     */
    public Integer getPreviewCount() {
        return this.previewCount;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<PreviewTaskParametersRequest, Builder> {
        private String regionId; 
        private Long bizdate; 
        private String cron; 
        private String parameters; 
        private Integer previewCount; 
        private String projectEnv; 
        private Long projectId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(PreviewTaskParametersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdate = request.bizdate;
            this.cron = request.cron;
            this.parameters = request.parameters;
            this.previewCount = request.previewCount;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business date. The value is a 13-digit UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1792425600000</p>
         */
        public Builder bizdate(Long bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * <p>The scheduling CRON expression.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        public Builder cron(String cron) {
            this.putBodyParameter("Cron", cron);
            this.cron = cron;
            return this;
        }

        /**
         * <p>The list of script parameters. The length cannot exceed 65,535 characters. Separate multiple parameters with spaces, such as para1=$bizdate para2=$[hh24]. An empty string is allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate para2=$[hh24]</p>
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The number of scheduling cycles to preview. Valid values: 1 to 10. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder previewCount(Integer previewCount) {
            this.putBodyParameter("PreviewCount", previewCount);
            this.previewCount = previewCount;
            return this;
        }

        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: production</li>
         * <li>Dev: development
         * Default value: Prod.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The workspace ID. The workspace must belong to the current tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The preview start time for the first scheduling day. The format is HH:mm:ss. Default value: 00:00:00. This parameter takes effect only for non-daily schedules and is used to filter out cycles that occur before this time on the first scheduling day.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public PreviewTaskParametersRequest build() {
            return new PreviewTaskParametersRequest(this);
        } 

    } 

}
