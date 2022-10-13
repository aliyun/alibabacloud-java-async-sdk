// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeExportProgressRequest</p>
 */
public class DescribeExportProgressRequest extends Request {
    @Query
    @NameInMap("ExportTaskId")
    @Validation(required = true)
    private String exportTaskId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
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
         * ExportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putQueryParameter("ExportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * InstanceId.
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
