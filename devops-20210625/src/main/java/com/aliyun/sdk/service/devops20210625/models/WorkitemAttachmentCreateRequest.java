// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WorkitemAttachmentCreateRequest} extends {@link RequestModel}
 *
 * <p>WorkitemAttachmentCreateRequest</p>
 */
public class WorkitemAttachmentCreateRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("workitemIdentifier")
    @Validation(required = true)
    private String workitemIdentifier;

    @Body
    @NameInMap("fileKey")
    @Validation(required = true)
    private String fileKey;

    @Body
    @NameInMap("originalFilename")
    @Validation(required = true)
    private String originalFilename;

    private WorkitemAttachmentCreateRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemIdentifier = builder.workitemIdentifier;
        this.fileKey = builder.fileKey;
        this.originalFilename = builder.originalFilename;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkitemAttachmentCreateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return originalFilename
     */
    public String getOriginalFilename() {
        return this.originalFilename;
    }

    public static final class Builder extends Request.Builder<WorkitemAttachmentCreateRequest, Builder> {
        private String organizationId; 
        private String workitemIdentifier; 
        private String fileKey; 
        private String originalFilename; 

        private Builder() {
            super();
        } 

        private Builder(WorkitemAttachmentCreateRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemIdentifier = request.workitemIdentifier;
            this.fileKey = request.fileKey;
            this.originalFilename = request.originalFilename;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * workitemIdentifier.
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putPathParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        /**
         * fileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("fileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * originalFilename.
         */
        public Builder originalFilename(String originalFilename) {
            this.putBodyParameter("originalFilename", originalFilename);
            this.originalFilename = originalFilename;
            return this;
        }

        @Override
        public WorkitemAttachmentCreateRequest build() {
            return new WorkitemAttachmentCreateRequest(this);
        } 

    } 

}
