// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DescribeExportProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeExportProgressRequest</p>
 */
public class DescribeExportProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DescribeExportProgressRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportProgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeExportProgressRequest, Builder> {
        private String exportTaskId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExportProgressRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0de8e5ccc2b645039ae6fbda443da73f</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putQueryParameter("ExportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>868eef14-7515-4856-8a50-5c9a22abdbcc</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeExportProgressRequest build() {
            return new DescribeExportProgressRequest(this);
        } 

    } 

}
