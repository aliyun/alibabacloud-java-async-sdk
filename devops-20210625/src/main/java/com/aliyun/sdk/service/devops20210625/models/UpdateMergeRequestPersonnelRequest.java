// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMergeRequestPersonnelRequest} extends {@link RequestModel}
 *
 * <p>UpdateMergeRequestPersonnelRequest</p>
 */
public class UpdateMergeRequestPersonnelRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("localId")
    @Validation(required = true)
    private Long localId;

    @Path
    @NameInMap("personType")
    @Validation(required = true)
    private String personType;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("newUserIdList")
    private java.util.List < String > newUserIdList;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private UpdateMergeRequestPersonnelRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.localId = builder.localId;
        this.personType = builder.personType;
        this.accessToken = builder.accessToken;
        this.newUserIdList = builder.newUserIdList;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMergeRequestPersonnelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return localId
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @return personType
     */
    public String getPersonType() {
        return this.personType;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return newUserIdList
     */
    public java.util.List < String > getNewUserIdList() {
        return this.newUserIdList;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<UpdateMergeRequestPersonnelRequest, Builder> {
        private Long repositoryId; 
        private Long localId; 
        private String personType; 
        private String accessToken; 
        private java.util.List < String > newUserIdList; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMergeRequestPersonnelRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.localId = request.localId;
            this.personType = request.personType;
            this.accessToken = request.accessToken;
            this.newUserIdList = request.newUserIdList;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * localId.
         */
        public Builder localId(Long localId) {
            this.putPathParameter("localId", localId);
            this.localId = localId;
            return this;
        }

        /**
         * personType.
         */
        public Builder personType(String personType) {
            this.putPathParameter("personType", personType);
            this.personType = personType;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * newUserIdList.
         */
        public Builder newUserIdList(java.util.List < String > newUserIdList) {
            this.putBodyParameter("newUserIdList", newUserIdList);
            this.newUserIdList = newUserIdList;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public UpdateMergeRequestPersonnelRequest build() {
            return new UpdateMergeRequestPersonnelRequest(this);
        } 

    } 

}
