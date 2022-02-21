// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDcdnProjectExistRequest} extends {@link RequestModel}
 *
 * <p>CheckDcdnProjectExistRequest</p>
 */
public class CheckDcdnProjectExistRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    private CheckDcdnProjectExistRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDcdnProjectExistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<CheckDcdnProjectExistRequest, Builder> {
        private Long ownerId; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(CheckDcdnProjectExistRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.projectName = response.projectName;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public CheckDcdnProjectExistRequest build() {
            return new CheckDcdnProjectExistRequest(this);
        } 

    } 

}
