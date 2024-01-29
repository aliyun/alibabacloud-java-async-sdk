// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubmissionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSubmissionResponseBody</p>
 */
public class CreateSubmissionResponseBody extends TeaModel {
    @NameInMap("HostId")
    private String hostId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubmissionId")
    private String submissionId;

    @NameInMap("Workspace")
    private String workspace;

    private CreateSubmissionResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.submissionId = builder.submissionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubmissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return submissionId
     */
    public String getSubmissionId() {
        return this.submissionId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String hostId; 
        private String requestId; 
        private String submissionId; 
        private String workspace; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubmissionId.
         */
        public Builder submissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public CreateSubmissionResponseBody build() {
            return new CreateSubmissionResponseBody(this);
        } 

    } 

}
