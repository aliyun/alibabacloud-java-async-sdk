// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DeleteReportDefinitionRequest} extends {@link RequestModel}
 *
 * <p>DeleteReportDefinitionRequest</p>
 */
public class DeleteReportDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reportTaskId;

    private DeleteReportDefinitionRequest(Builder builder) {
        super(builder);
        this.nbid = builder.nbid;
        this.reportTaskId = builder.reportTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteReportDefinitionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return reportTaskId
     */
    public Long getReportTaskId() {
        return this.reportTaskId;
    }

    public static final class Builder extends Request.Builder<DeleteReportDefinitionRequest, Builder> {
        private String nbid; 
        private Long reportTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteReportDefinitionRequest request) {
            super(request);
            this.nbid = request.nbid;
            this.reportTaskId = request.reportTaskId;
        } 

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        public Builder reportTaskId(Long reportTaskId) {
            this.putQueryParameter("ReportTaskId", reportTaskId);
            this.reportTaskId = reportTaskId;
            return this;
        }

        @Override
        public DeleteReportDefinitionRequest build() {
            return new DeleteReportDefinitionRequest(this);
        } 

    } 

}
