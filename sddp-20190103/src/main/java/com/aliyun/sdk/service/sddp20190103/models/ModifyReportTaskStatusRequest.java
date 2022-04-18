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
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ReportTaskStatus")
    private Integer reportTaskStatus;

    private ModifyReportTaskStatusRequest(Builder builder) {
        super(builder);
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
        private String lang; 
        private Integer reportTaskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReportTaskStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.reportTaskStatus = request.reportTaskStatus;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ReportTaskStatus.
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
