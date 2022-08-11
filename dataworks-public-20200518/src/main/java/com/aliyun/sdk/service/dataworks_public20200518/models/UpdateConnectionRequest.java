// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnectionRequest</p>
 */
public class UpdateConnectionRequest extends Request {
    @Query
    @NameInMap("ConnectionId")
    @Validation(required = true)
    private Long connectionId;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnvType")
    private Integer envType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    private UpdateConnectionRequest(Builder builder) {
        super(builder);
        this.connectionId = builder.connectionId;
        this.content = builder.content;
        this.description = builder.description;
        this.envType = builder.envType;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionId
     */
    public Long getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateConnectionRequest, Builder> {
        private Long connectionId; 
        private String content; 
        private String description; 
        private Integer envType; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnectionRequest request) {
            super(request);
            this.connectionId = request.connectionId;
            this.content = request.content;
            this.description = request.description;
            this.envType = request.envType;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * ConnectionId.
         */
        public Builder connectionId(Long connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateConnectionRequest build() {
            return new UpdateConnectionRequest(this);
        } 

    } 

}
