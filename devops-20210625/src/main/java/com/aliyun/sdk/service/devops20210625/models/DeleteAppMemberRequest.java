// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppMemberRequest</p>
 */
public class DeleteAppMemberRequest extends Request {
    @Path
    @NameInMap("appName")
    private String appName;

    @Query
    @NameInMap("organizationId")
    private String organizationId;

    @Query
    @NameInMap("subjectId")
    private String subjectId;

    @Query
    @NameInMap("subjectType")
    private String subjectType;

    private DeleteAppMemberRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.organizationId = builder.organizationId;
        this.subjectId = builder.subjectId;
        this.subjectType = builder.subjectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return subjectId
     */
    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * @return subjectType
     */
    public String getSubjectType() {
        return this.subjectType;
    }

    public static final class Builder extends Request.Builder<DeleteAppMemberRequest, Builder> {
        private String appName; 
        private String organizationId; 
        private String subjectId; 
        private String subjectType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppMemberRequest request) {
            super(request);
            this.appName = request.appName;
            this.organizationId = request.organizationId;
            this.subjectId = request.subjectId;
            this.subjectType = request.subjectType;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
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

        /**
         * subjectId.
         */
        public Builder subjectId(String subjectId) {
            this.putQueryParameter("subjectId", subjectId);
            this.subjectId = subjectId;
            return this;
        }

        /**
         * subjectType.
         */
        public Builder subjectType(String subjectType) {
            this.putQueryParameter("subjectType", subjectType);
            this.subjectType = subjectType;
            return this;
        }

        @Override
        public DeleteAppMemberRequest build() {
            return new DeleteAppMemberRequest(this);
        } 

    } 

}
