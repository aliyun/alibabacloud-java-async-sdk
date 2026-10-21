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
         * <p>The export task parameters, which are concatenated based on query conditions in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;IncidentName&quot;: &quot;name&quot;,
         *     &quot;IncidentStatus&quot;: &quot;1&quot;,
         *     &quot;ThreatLevel&quot;:[&quot;1&quot;,&quot;2&quot;],
         *     &quot;IncidentUuids&quot;:&quot;315EE627-39DC-560A-8DFD-CBF66AD9****&quot;
         * }</p>
         */
        public Builder exportTaskParameter(String exportTaskParameter) {
            this.putBodyParameter("ExportTaskParameter", exportTaskParameter);
            this.exportTaskParameter = exportTaskParameter;
            return this;
        }

        /**
         * <p>The export type. Valid values:</p>
         * <ul>
         * <li>incident_list: Event list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>incident_list</p>
         */
        public Builder exportTaskType(String exportTaskType) {
            this.putBodyParameter("ExportTaskType", exportTaskType);
            this.exportTaskType = exportTaskType;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.<blockquote>
         * <p>Note: This parameter is required. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center resides. Specify the management center region based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets reside outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
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
