// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateSupabaseProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSupabaseProjectResponseBody</p>
 */
public class CreateSupabaseProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSupabaseProjectResponseBody(Builder builder) {
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSupabaseProjectResponseBody create() {
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

        private Builder(CreateSupabaseProjectResponseBody model) {
            this.projectId = model.projectId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Supabase project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-180****</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSupabaseProjectResponseBody build() {
            return new CreateSupabaseProjectResponseBody(this);
        } 

    } 

}
