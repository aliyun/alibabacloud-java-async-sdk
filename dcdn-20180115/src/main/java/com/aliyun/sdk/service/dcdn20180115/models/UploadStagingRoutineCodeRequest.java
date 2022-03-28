// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadStagingRoutineCodeRequest} extends {@link RequestModel}
 *
 * <p>UploadStagingRoutineCodeRequest</p>
 */
public class UploadStagingRoutineCodeRequest extends Request {
    @Body
    @NameInMap("CodeDescription")
    private String codeDescription;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UploadStagingRoutineCodeRequest(Builder builder) {
        super(builder);
        this.codeDescription = builder.codeDescription;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadStagingRoutineCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeDescription
     */
    public String getCodeDescription() {
        return this.codeDescription;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UploadStagingRoutineCodeRequest, Builder> {
        private String codeDescription; 
        private String name; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UploadStagingRoutineCodeRequest request) {
            super(request);
            this.codeDescription = request.codeDescription;
            this.name = request.name;
            this.ownerId = request.ownerId;
        } 

        /**
         * CodeDescription.
         */
        public Builder codeDescription(String codeDescription) {
            this.putBodyParameter("CodeDescription", codeDescription);
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public UploadStagingRoutineCodeRequest build() {
            return new UploadStagingRoutineCodeRequest(this);
        } 

    } 

}
