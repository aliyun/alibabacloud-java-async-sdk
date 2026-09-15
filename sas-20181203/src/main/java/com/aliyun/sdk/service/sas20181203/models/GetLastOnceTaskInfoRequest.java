// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetLastOnceTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLastOnceTaskInfoRequest</p>
 */
public class GetLastOnceTaskInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GetLastOnceTaskInfoRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLastOnceTaskInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetLastOnceTaskInfoRequest, Builder> {
        private String source; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetLastOnceTaskInfoRequest request) {
            super(request);
            this.source = request.source;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The source from which the task was added.</p>
         * 
         * <strong>example:</strong>
         * <p>console_batch</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The task name. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client problem troubleshooting task</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: cloud O&amp;M task</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: asset collection task</li>
         * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection task</li>
         * <li><strong>IMAGE_SCAN</strong>: container image scan task</li>
         * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization task</li>
         * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan task</li>
         * <li><strong>ATTACK_SURFACE_SCAN</strong>: attack surface boundary asset scan task</li>
         * <li><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan task</li>
         * <li><strong>VUL_CHECK_TASK</strong>: vulnerability scanning task</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSETS_COLLECTION</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client problem troubleshooting task</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: cloud O&amp;M task</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: asset collection task</li>
         * <li><strong>ASSETS_COLLECTION</strong>: Asset Fingerprints collection task</li>
         * <li><strong>IMAGE_SCAN</strong>: container image scan task</li>
         * <li><strong>AI_SECURITY_CHECK</strong>: AI asset synchronization task</li>
         * <li><strong>IDC_PROBE_SCAN</strong>: IDC probe scan task</li>
         * <li><strong>ATTACK_SURFACE_SCAN</strong>: attack surface boundary asset scan task</li>
         * <li><strong>ASSET_EXPOSURE_SCAN</strong>: asset exposure scan task</li>
         * <li><strong>VUL_CHECK_TASK</strong>: vulnerability scanning task</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSETS_COLLECTION</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetLastOnceTaskInfoRequest build() {
            return new GetLastOnceTaskInfoRequest(this);
        } 

    } 

}
