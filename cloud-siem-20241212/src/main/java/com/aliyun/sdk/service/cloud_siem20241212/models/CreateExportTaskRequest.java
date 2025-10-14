// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateExportTaskRequest</p>
 */
public class CreateExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportTaskParameter")
    private String exportTaskParameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportTaskType")
    private String exportTaskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private CreateExportTaskRequest(Builder builder) {
        super(builder);
        this.exportTaskParameter = builder.exportTaskParameter;
        this.exportTaskType = builder.exportTaskType;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskParameter
     */
    public String getExportTaskParameter() {
        return this.exportTaskParameter;
    }

    /**
     * @return exportTaskType
     */
    public String getExportTaskType() {
        return this.exportTaskType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<CreateExportTaskRequest, Builder> {
        private String exportTaskParameter; 
        private String exportTaskType; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(CreateExportTaskRequest request) {
            super(request);
            this.exportTaskParameter = request.exportTaskParameter;
            this.exportTaskType = request.exportTaskType;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * ExportTaskParameter.
         */
        public Builder exportTaskParameter(String exportTaskParameter) {
            this.putBodyParameter("ExportTaskParameter", exportTaskParameter);
            this.exportTaskParameter = exportTaskParameter;
            return this;
        }

        /**
         * ExportTaskType.
         */
        public Builder exportTaskType(String exportTaskType) {
            this.putBodyParameter("ExportTaskType", exportTaskType);
            this.exportTaskType = exportTaskType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public CreateExportTaskRequest build() {
            return new CreateExportTaskRequest(this);
        } 

    } 

}
