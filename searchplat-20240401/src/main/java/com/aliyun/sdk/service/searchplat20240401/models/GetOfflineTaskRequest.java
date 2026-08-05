// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link GetOfflineTaskRequest} extends {@link RequestModel}
 *
 * <p>GetOfflineTaskRequest</p>
 */
public class GetOfflineTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetOfflineTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.type = builder.type;
        this.taskName = builder.taskName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfflineTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetOfflineTaskRequest, Builder> {
        private String workspaceName; 
        private String type; 
        private String taskName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOfflineTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.type = request.type;
            this.taskName = request.taskName;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putPathParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetOfflineTaskRequest build() {
            return new GetOfflineTaskRequest(this);
        } 

    } 

}
