// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link UpdateRunRequest} extends {@link RequestModel}
 *
 * <p>UpdateRunRequest</p>
 */
public class UpdateRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<RunParam> params;

    private UpdateRunRequest(Builder builder) {
        super(builder);
        this.runId = builder.runId;
        this.labels = builder.labels;
        this.name = builder.name;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return params
     */
    public java.util.List<RunParam> getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<UpdateRunRequest, Builder> {
        private String runId; 
        private java.util.List<Label> labels; 
        private String name; 
        private java.util.List<RunParam> params; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRunRequest request) {
            super(request);
            this.runId = request.runId;
            this.labels = request.labels;
            this.name = request.name;
            this.params = request.params;
        } 

        /**
         * <p>The run ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>run-1qJhzJ2YXgX****</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("RunId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The labels.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The run name. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must start with a letter.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must be 1 to 63 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The parameters.</p>
         */
        public Builder params(java.util.List<RunParam> params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public UpdateRunRequest build() {
            return new UpdateRunRequest(this);
        } 

    } 

}
