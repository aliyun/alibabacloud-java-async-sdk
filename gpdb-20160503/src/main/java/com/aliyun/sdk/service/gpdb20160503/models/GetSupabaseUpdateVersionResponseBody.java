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
 * {@link GetSupabaseUpdateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupabaseUpdateVersionResponseBody</p>
 */
public class GetSupabaseUpdateVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private String latestVersion;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StableVersion")
    private String stableVersion;

    private GetSupabaseUpdateVersionResponseBody(Builder builder) {
        this.latestVersion = builder.latestVersion;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.stableVersion = builder.stableVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupabaseUpdateVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
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

    /**
     * @return stableVersion
     */
    public String getStableVersion() {
        return this.stableVersion;
    }

    public static final class Builder {
        private String latestVersion; 
        private String projectId; 
        private String requestId; 
        private String stableVersion; 

        private Builder() {
        } 

        private Builder(GetSupabaseUpdateVersionResponseBody model) {
            this.latestVersion = model.latestVersion;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.stableVersion = model.stableVersion;
        } 

        /**
         * <p>The latest upgradable version.</p>
         * 
         * <strong>example:</strong>
         * <p>20240731</p>
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The ID of the Supabase project.</p>
         * 
         * <strong>example:</strong>
         * <p>spb-xxxx</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The recommended stable version for upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>20240630</p>
         */
        public Builder stableVersion(String stableVersion) {
            this.stableVersion = stableVersion;
            return this;
        }

        public GetSupabaseUpdateVersionResponseBody build() {
            return new GetSupabaseUpdateVersionResponseBody(this);
        } 

    } 

}
