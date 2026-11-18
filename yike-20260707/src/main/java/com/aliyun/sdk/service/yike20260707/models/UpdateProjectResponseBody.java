// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link UpdateProjectResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProjectResponseBody</p>
 */
public class UpdateProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateProjectResponseBody(Builder builder) {
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String projectId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateProjectResponseBody model) {
            this.projectId = model.projectId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_061716****</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateProjectResponseBody build() {
            return new UpdateProjectResponseBody(this);
        } 

    } 

}
