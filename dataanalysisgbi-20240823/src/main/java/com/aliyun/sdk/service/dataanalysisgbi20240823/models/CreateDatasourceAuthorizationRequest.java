// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link CreateDatasourceAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasourceAuthorizationRequest</p>
 */
public class CreateDatasourceAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vdbId")
    private String vdbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDatasourceAuthorizationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.password = builder.password;
        this.type = builder.type;
        this.url = builder.url;
        this.userName = builder.userName;
        this.vdbId = builder.vdbId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasourceAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vdbId
     */
    public String getVdbId() {
        return this.vdbId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDatasourceAuthorizationRequest, Builder> {
        private String regionId; 
        private String password; 
        private Integer type; 
        private String url; 
        private String userName; 
        private String vdbId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasourceAuthorizationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.password = request.password;
            this.type = request.type;
            this.url = request.url;
            this.userName = request.userName;
            this.vdbId = request.vdbId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * vdbId.
         */
        public Builder vdbId(String vdbId) {
            this.putBodyParameter("vdbId", vdbId);
            this.vdbId = vdbId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDatasourceAuthorizationRequest build() {
            return new CreateDatasourceAuthorizationRequest(this);
        } 

    } 

}
