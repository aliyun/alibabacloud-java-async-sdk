// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetSanityCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>GetSanityCheckTaskRequest</p>
 */
public class GetSanityCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CheckType")
    private String checkType;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetSanityCheckTaskRequest(Builder builder) {
        super(builder);
        this.checkType = builder.checkType;
        this.taskId = builder.taskId;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSanityCheckTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkType
     */
    public String getCheckType() {
        return this.checkType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetSanityCheckTaskRequest, Builder> {
        private String checkType; 
        private String taskId; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetSanityCheckTaskRequest request) {
            super(request);
            this.checkType = request.checkType;
            this.taskId = request.taskId;
            this.verbose = request.verbose;
        } 

        /**
         * CheckType.
         */
        public Builder checkType(String checkType) {
            this.putPathParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetSanityCheckTaskRequest build() {
            return new GetSanityCheckTaskRequest(this);
        } 

    } 

}
