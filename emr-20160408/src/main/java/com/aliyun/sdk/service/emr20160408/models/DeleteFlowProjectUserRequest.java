// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowProjectUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteFlowProjectUserRequest</p>
 */
public class DeleteFlowProjectUserRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private DeleteFlowProjectUserRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlowProjectUserRequest create() {
        return builder().build();
    }

    @Override
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DeleteFlowProjectUserRequest, Builder> {
        private String projectId; 
        private String regionId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFlowProjectUserRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.userName = request.userName;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DeleteFlowProjectUserRequest build() {
            return new DeleteFlowProjectUserRequest(this);
        } 

    } 

}
