// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimilarImageClusterTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSimilarImageClusterTaskRequest</p>
 */
public class CreateSimilarImageClusterTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    private CreateSimilarImageClusterTaskRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimilarImageClusterTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    public static final class Builder extends Request.Builder<CreateSimilarImageClusterTaskRequest, Builder> {
        private String domainId; 
        private String driveId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimilarImageClusterTaskRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        @Override
        public CreateSimilarImageClusterTaskRequest build() {
            return new CreateSimilarImageClusterTaskRequest(this);
        } 

    } 

}
