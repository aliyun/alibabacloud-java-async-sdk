// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateSessionPackageRequest} extends {@link RequestModel}
 *
 * <p>MigrateSessionPackageRequest</p>
 */
public class MigrateSessionPackageRequest extends Request {
    @Body
    @NameInMap("DestProjectId")
    private String destProjectId;

    @Body
    @NameInMap("SessionPackageId")
    @Validation(required = true)
    private String sessionPackageId;

    @Body
    @NameInMap("SourceProjectId")
    private String sourceProjectId;

    private MigrateSessionPackageRequest(Builder builder) {
        super(builder);
        this.destProjectId = builder.destProjectId;
        this.sessionPackageId = builder.sessionPackageId;
        this.sourceProjectId = builder.sourceProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateSessionPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destProjectId
     */
    public String getDestProjectId() {
        return this.destProjectId;
    }

    /**
     * @return sessionPackageId
     */
    public String getSessionPackageId() {
        return this.sessionPackageId;
    }

    /**
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return this.sourceProjectId;
    }

    public static final class Builder extends Request.Builder<MigrateSessionPackageRequest, Builder> {
        private String destProjectId; 
        private String sessionPackageId; 
        private String sourceProjectId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateSessionPackageRequest request) {
            super(request);
            this.destProjectId = request.destProjectId;
            this.sessionPackageId = request.sessionPackageId;
            this.sourceProjectId = request.sourceProjectId;
        } 

        /**
         * DestProjectId.
         */
        public Builder destProjectId(String destProjectId) {
            this.putBodyParameter("DestProjectId", destProjectId);
            this.destProjectId = destProjectId;
            return this;
        }

        /**
         * SessionPackageId.
         */
        public Builder sessionPackageId(String sessionPackageId) {
            this.putBodyParameter("SessionPackageId", sessionPackageId);
            this.sessionPackageId = sessionPackageId;
            return this;
        }

        /**
         * SourceProjectId.
         */
        public Builder sourceProjectId(String sourceProjectId) {
            this.putBodyParameter("SourceProjectId", sourceProjectId);
            this.sourceProjectId = sourceProjectId;
            return this;
        }

        @Override
        public MigrateSessionPackageRequest build() {
            return new MigrateSessionPackageRequest(this);
        } 

    } 

}
