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
 * {@link VerifyCheckResultRequest} extends {@link RequestModel}
 *
 * <p>VerifyCheckResultRequest</p>
 */
public class VerifyCheckResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List<Long> checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskSource")
    private String taskSource;

    private VerifyCheckResultRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.instanceIds = builder.instanceIds;
        this.taskSource = builder.taskSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return taskSource
     */
    public String getTaskSource() {
        return this.taskSource;
    }

    public static final class Builder extends Request.Builder<VerifyCheckResultRequest, Builder> {
        private java.util.List<Long> checkIds; 
        private java.util.List<String> instanceIds; 
        private String taskSource; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCheckResultRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.instanceIds = request.instanceIds;
            this.taskSource = request.taskSource;
        } 

        /**
         * <p>The IDs of the check items.</p>
         */
        public Builder checkIds(java.util.List<Long> checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The source of task.</p>
         * 
         * <strong>example:</strong>
         * <p>YAO_CHI</p>
         */
        public Builder taskSource(String taskSource) {
            this.putQueryParameter("TaskSource", taskSource);
            this.taskSource = taskSource;
            return this;
        }

        @Override
        public VerifyCheckResultRequest build() {
            return new VerifyCheckResultRequest(this);
        } 

    } 

}
