// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link WorkspaceIdName} extends {@link TeaModel}
 *
 * <p>WorkspaceIdName</p>
 */
public class WorkspaceIdName extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private WorkspaceIdName(Builder builder) {
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkspaceIdName create() {
        return builder().build();
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String workspaceId; 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public WorkspaceIdName build() {
            return new WorkspaceIdName(this);
        } 

    } 

}
