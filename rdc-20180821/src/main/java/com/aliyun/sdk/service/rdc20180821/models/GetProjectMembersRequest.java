// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectMembersRequest} extends {@link RequestModel}
 *
 * <p>GetProjectMembersRequest</p>
 */
public class GetProjectMembersRequest extends Request {
    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Integer projectId;

    @Query
    @NameInMap("StaffId")
    private String staffId;

    private GetProjectMembersRequest(Builder builder) {
        super(builder);
        this.corpIdentifier = builder.corpIdentifier;
        this.projectId = builder.projectId;
        this.staffId = builder.staffId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return projectId
     */
    public Integer getProjectId() {
        return this.projectId;
    }

    /**
     * @return staffId
     */
    public String getStaffId() {
        return this.staffId;
    }

    public static final class Builder extends Request.Builder<GetProjectMembersRequest, Builder> {
        private String corpIdentifier; 
        private Integer projectId; 
        private String staffId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectMembersRequest response) {
            super(response);
            this.corpIdentifier = response.corpIdentifier;
            this.projectId = response.projectId;
            this.staffId = response.staffId;
        } 

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Integer projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * StaffId.
         */
        public Builder staffId(String staffId) {
            this.putQueryParameter("StaffId", staffId);
            this.staffId = staffId;
            return this;
        }

        @Override
        public GetProjectMembersRequest build() {
            return new GetProjectMembersRequest(this);
        } 

    } 

}
