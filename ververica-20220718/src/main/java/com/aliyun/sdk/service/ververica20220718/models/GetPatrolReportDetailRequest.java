// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link GetPatrolReportDetailRequest} extends {@link RequestModel}
 *
 * <p>GetPatrolReportDetailRequest</p>
 */
public class GetPatrolReportDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reportId")
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timezone")
    private String timezone;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetPatrolReportDetailRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.date = builder.date;
        this.reportId = builder.reportId;
        this.timezone = builder.timezone;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPatrolReportDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetPatrolReportDetailRequest, Builder> {
        private String namespace; 
        private String date; 
        private String reportId; 
        private String timezone; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetPatrolReportDetailRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.date = request.date;
            this.reportId = request.reportId;
            this.timezone = request.timezone;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * date.
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * reportId.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("reportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * timezone.
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetPatrolReportDetailRequest build() {
            return new GetPatrolReportDetailRequest(this);
        } 

    } 

}
