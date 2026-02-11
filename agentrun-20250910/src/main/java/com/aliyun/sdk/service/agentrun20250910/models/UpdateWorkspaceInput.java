// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateWorkspaceInput} extends {@link TeaModel}
 *
 * <p>UpdateWorkspaceInput</p>
 */
public class UpdateWorkspaceInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private UpdateWorkspaceInput(Builder builder) {
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder {
        private String description; 

        private Builder() {
        } 

        private Builder(UpdateWorkspaceInput model) {
            this.description = model.description;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public UpdateWorkspaceInput build() {
            return new UpdateWorkspaceInput(this);
        } 

    } 

}
