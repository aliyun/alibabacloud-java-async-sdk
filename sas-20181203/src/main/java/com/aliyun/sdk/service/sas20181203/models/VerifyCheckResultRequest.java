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
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskSource")
    private String taskSource;

    private VerifyCheckResultRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.force = builder.force;
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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
        private Boolean force; 
        private java.util.List<String> instanceIds; 
        private String taskSource; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCheckResultRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.force = request.force;
            this.instanceIds = request.instanceIds;
            this.taskSource = request.taskSource;
        } 

        /**
         * <p>The list of check item IDs.</p>
         */
        public Builder checkIds(java.util.List<Long> checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly run the specified check items. Default value: false.</p>
         * <ul>
         * <li>true: Forcibly runs the specified check items. Forced execution bypasses frequency and quantity limits and initiates the check directly, which may cause duplicate checks to run multiple times within a short period.</li>
         * <li>false (default): Does not forcibly run the specified check items. This ensures that the same check item is executed only once within a short period.</li>
         * </ul>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The list of instance IDs of the assets associated with the check items.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The task source. Valid values:</p>
         * <ul>
         * <li><strong>YAO_CHI</strong>: ApsaraDB console.</li>
         * </ul>
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
