// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveSourceRequest} extends {@link RequestModel}
 *
 * <p>SaveSourceRequest</p>
 */
public class SaveSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeStatus")
    private Boolean changeStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedCheck")
    private Boolean needCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    private SaveSourceRequest(Builder builder) {
        super(builder);
        this.changeStatus = builder.changeStatus;
        this.jwtToken = builder.jwtToken;
        this.needCheck = builder.needCheck;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeStatus
     */
    public Boolean getChangeStatus() {
        return this.changeStatus;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return needCheck
     */
    public Boolean getNeedCheck() {
        return this.needCheck;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<SaveSourceRequest, Builder> {
        private Boolean changeStatus; 
        private String jwtToken; 
        private Boolean needCheck; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(SaveSourceRequest request) {
            super(request);
            this.changeStatus = request.changeStatus;
            this.jwtToken = request.jwtToken;
            this.needCheck = request.needCheck;
            this.projectId = request.projectId;
        } 

        /**
         * ChangeStatus.
         */
        public Builder changeStatus(Boolean changeStatus) {
            this.putQueryParameter("ChangeStatus", changeStatus);
            this.changeStatus = changeStatus;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * NeedCheck.
         */
        public Builder needCheck(Boolean needCheck) {
            this.putQueryParameter("NeedCheck", needCheck);
            this.needCheck = needCheck;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public SaveSourceRequest build() {
            return new SaveSourceRequest(this);
        } 

    } 

}
