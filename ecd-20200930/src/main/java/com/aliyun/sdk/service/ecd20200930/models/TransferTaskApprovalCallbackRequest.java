// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link TransferTaskApprovalCallbackRequest} extends {@link RequestModel}
 *
 * <p>TransferTaskApprovalCallbackRequest</p>
 */
public class TransferTaskApprovalCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketRegionId")
    private String ossBucketRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private TransferTaskApprovalCallbackRequest(Builder builder) {
        super(builder);
        this.ossBucketName = builder.ossBucketName;
        this.ossBucketRegionId = builder.ossBucketRegionId;
        this.result = builder.result;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferTaskApprovalCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossBucketRegionId
     */
    public String getOssBucketRegionId() {
        return this.ossBucketRegionId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<TransferTaskApprovalCallbackRequest, Builder> {
        private String ossBucketName; 
        private String ossBucketRegionId; 
        private String result; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(TransferTaskApprovalCallbackRequest request) {
            super(request);
            this.ossBucketName = request.ossBucketName;
            this.ossBucketRegionId = request.ossBucketRegionId;
            this.result = request.result;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The name of the OSS bucket where the file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>ed****-17337752804***</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>The region where the OSS bucket storing the file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder ossBucketRegionId(String ossBucketRegionId) {
            this.putQueryParameter("OssBucketRegionId", ossBucketRegionId);
            this.ossBucketRegionId = ossBucketRegionId;
            return this;
        }

        /**
         * <p>The approval result.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Approved</li>
         * <li>Rejected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        public Builder result(String result) {
            this.putQueryParameter("Result", result);
            this.result = result;
            return this;
        }

        /**
         * <p>The ID of the transmission task.</p>
         * 
         * <strong>example:</strong>
         * <p>trt-msndfksm18fs****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public TransferTaskApprovalCallbackRequest build() {
            return new TransferTaskApprovalCallbackRequest(this);
        } 

    } 

}
