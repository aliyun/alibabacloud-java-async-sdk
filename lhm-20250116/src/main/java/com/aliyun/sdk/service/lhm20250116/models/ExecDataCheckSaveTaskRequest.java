// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecDataCheckSaveTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecDataCheckSaveTaskRequest</p>
 */
public class ExecDataCheckSaveTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkGlobalParams")
    private String checkGlobalParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fullTableCount")
    private Integer fullTableCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceGlobalParams")
    private String sourceGlobalParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startImmediately")
    private Integer startImmediately;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetGlobalParams")
    private String targetGlobalParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("totalCountThreshold")
    private Float totalCountThreshold;

    private ExecDataCheckSaveTaskRequest(Builder builder) {
        super(builder);
        this.checkGlobalParams = builder.checkGlobalParams;
        this.fullTableCount = builder.fullTableCount;
        this.sourceGlobalParams = builder.sourceGlobalParams;
        this.startImmediately = builder.startImmediately;
        this.targetGlobalParams = builder.targetGlobalParams;
        this.taskId = builder.taskId;
        this.totalCountThreshold = builder.totalCountThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDataCheckSaveTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkGlobalParams
     */
    public String getCheckGlobalParams() {
        return this.checkGlobalParams;
    }

    /**
     * @return fullTableCount
     */
    public Integer getFullTableCount() {
        return this.fullTableCount;
    }

    /**
     * @return sourceGlobalParams
     */
    public String getSourceGlobalParams() {
        return this.sourceGlobalParams;
    }

    /**
     * @return startImmediately
     */
    public Integer getStartImmediately() {
        return this.startImmediately;
    }

    /**
     * @return targetGlobalParams
     */
    public String getTargetGlobalParams() {
        return this.targetGlobalParams;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalCountThreshold
     */
    public Float getTotalCountThreshold() {
        return this.totalCountThreshold;
    }

    public static final class Builder extends Request.Builder<ExecDataCheckSaveTaskRequest, Builder> {
        private String checkGlobalParams; 
        private Integer fullTableCount; 
        private String sourceGlobalParams; 
        private Integer startImmediately; 
        private String targetGlobalParams; 
        private Long taskId; 
        private Float totalCountThreshold; 

        private Builder() {
            super();
        } 

        private Builder(ExecDataCheckSaveTaskRequest request) {
            super(request);
            this.checkGlobalParams = request.checkGlobalParams;
            this.fullTableCount = request.fullTableCount;
            this.sourceGlobalParams = request.sourceGlobalParams;
            this.startImmediately = request.startImmediately;
            this.targetGlobalParams = request.targetGlobalParams;
            this.taskId = request.taskId;
            this.totalCountThreshold = request.totalCountThreshold;
        } 

        /**
         * <p>The global parameters for the validation phase. Separate multiple parameters with a line feed (<code> </code>).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder checkGlobalParams(String checkGlobalParams) {
            this.putBodyParameter("checkGlobalParams", checkGlobalParams);
            this.checkGlobalParams = checkGlobalParams;
            return this;
        }

        /**
         * <p>Specifies whether to perform full-table validation. Valid values:</p>
         * <ul>
         * <li>0: Partition-level validation. This is the default value.</li>
         * <li>1: Full-table validation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder fullTableCount(Integer fullTableCount) {
            this.putBodyParameter("fullTableCount", fullTableCount);
            this.fullTableCount = fullTableCount;
            return this;
        }

        /**
         * <p>The global parameters for the source. Separate multiple parameters with a line feed (<code> </code>).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder sourceGlobalParams(String sourceGlobalParams) {
            this.putBodyParameter("sourceGlobalParams", sourceGlobalParams);
            this.sourceGlobalParams = sourceGlobalParams;
            return this;
        }

        /**
         * <p>Specifies whether to execute immediately after saving. Valid values:</p>
         * <ul>
         * <li>0: No. This is the default value.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startImmediately(Integer startImmediately) {
            this.putBodyParameter("startImmediately", startImmediately);
            this.startImmediately = startImmediately;
            return this;
        }

        /**
         * <p>The global parameters for the target. Separate multiple parameters with a line feed (<code> </code>).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder targetGlobalParams(String targetGlobalParams) {
            this.putBodyParameter("targetGlobalParams", targetGlobalParams);
            this.targetGlobalParams = targetGlobalParams;
            return this;
        }

        /**
         * <p>The ID of the validation task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The total data volume comparison threshold, used to determine whether the data volume difference between the source and target is within an acceptable range.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder totalCountThreshold(Float totalCountThreshold) {
            this.putBodyParameter("totalCountThreshold", totalCountThreshold);
            this.totalCountThreshold = totalCountThreshold;
            return this;
        }

        @Override
        public ExecDataCheckSaveTaskRequest build() {
            return new ExecDataCheckSaveTaskRequest(this);
        } 

    } 

}
