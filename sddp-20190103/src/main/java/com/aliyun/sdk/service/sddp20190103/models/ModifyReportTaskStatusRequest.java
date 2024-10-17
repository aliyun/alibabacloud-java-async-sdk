// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyReportTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyReportTaskStatusRequest</p>
 */
public class ModifyReportTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportTaskStatus")
    private Integer reportTaskStatus;

    private ModifyReportTaskStatusRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.reportTaskStatus = builder.reportTaskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReportTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return reportTaskStatus
     */
    public Integer getReportTaskStatus() {
        return this.reportTaskStatus;
    }

    public static final class Builder extends Request.Builder<ModifyReportTaskStatusRequest, Builder> {
        private Integer featureType; 
        private String lang; 
        private Integer reportTaskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReportTaskStatusRequest request) {
            super(request);
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.reportTaskStatus = request.reportTaskStatus;
        } 

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Simplified Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies the status of the report task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder reportTaskStatus(Integer reportTaskStatus) {
            this.putQueryParameter("ReportTaskStatus", reportTaskStatus);
            this.reportTaskStatus = reportTaskStatus;
            return this;
        }

        @Override
        public ModifyReportTaskStatusRequest build() {
            return new ModifyReportTaskStatusRequest(this);
        } 

    } 

}
