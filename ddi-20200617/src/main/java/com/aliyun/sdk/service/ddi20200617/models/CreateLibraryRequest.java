// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLibraryRequest} extends {@link RequestModel}
 *
 * <p>CreateLibraryRequest</p>
 */
public class CreateLibraryRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("LibraryVersion")
    private String libraryVersion;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Properties")
    private String properties;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("SourceLocation")
    private String sourceLocation;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("Type")
    private String type;

    private CreateLibraryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.libraryVersion = builder.libraryVersion;
        this.name = builder.name;
        this.properties = builder.properties;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scope = builder.scope;
        this.sourceLocation = builder.sourceLocation;
        this.sourceType = builder.sourceType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLibraryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return libraryVersion
     */
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return sourceLocation
     */
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateLibraryRequest, Builder> {
        private String clientToken; 
        private String libraryVersion; 
        private String name; 
        private String properties; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String scope; 
        private String sourceLocation; 
        private String sourceType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateLibraryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.libraryVersion = request.libraryVersion;
            this.name = request.name;
            this.properties = request.properties;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scope = request.scope;
            this.sourceLocation = request.sourceLocation;
            this.sourceType = request.sourceType;
            this.type = request.type;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * LibraryVersion.
         */
        public Builder libraryVersion(String libraryVersion) {
            this.putQueryParameter("LibraryVersion", libraryVersion);
            this.libraryVersion = libraryVersion;
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

        /**
         * Properties.
         */
        public Builder properties(String properties) {
            this.putQueryParameter("Properties", properties);
            this.properties = properties;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SourceLocation.
         */
        public Builder sourceLocation(String sourceLocation) {
            this.putQueryParameter("SourceLocation", sourceLocation);
            this.sourceLocation = sourceLocation;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateLibraryRequest build() {
            return new CreateLibraryRequest(this);
        } 

    } 

}
