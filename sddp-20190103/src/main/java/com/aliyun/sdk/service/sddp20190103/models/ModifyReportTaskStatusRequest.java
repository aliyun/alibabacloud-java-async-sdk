// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReportTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyReportTaskStatusRequest</p>
 */
public class ModifyReportTaskStatusRequest extends Request {
    @Query
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ReportTaskStatus")
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
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies the status of the report task. Valid values:
         * <p>
         * 
         * *   **0**: disabled
         * *   **1**: enabled
         * 
         * > This parameter is required.
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
