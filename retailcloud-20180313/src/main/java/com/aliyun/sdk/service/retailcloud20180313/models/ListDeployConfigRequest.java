// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployConfigRequest} extends {@link RequestModel}
 *
 * <p>ListDeployConfigRequest</p>
 */
public class ListDeployConfigRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("EnvType")
    private String envType;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Name")
    private String name;

    private ListDeployConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envType = builder.envType;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ListDeployConfigRequest, Builder> {
        private Long appId; 
        private String envType; 
        private Long id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListDeployConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.envType = request.envType;
            this.id = request.id;
            this.name = request.name;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ListDeployConfigRequest build() {
            return new ListDeployConfigRequest(this);
        } 

    } 

}
