// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommandRequest} extends {@link RequestModel}
 *
 * <p>CreateCommandRequest</p>
 */
public class CreateCommandRequest extends Request {
    @Query
    @NameInMap("CommandContent")
    private String commandContent;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    @Query
    @NameInMap("timeout")
    private Long timeout;

    private CreateCommandRequest(Builder builder) {
        super(builder);
        this.commandContent = builder.commandContent;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.workingDir = builder.workingDir;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateCommandRequest, Builder> {
        private String commandContent; 
        private String description; 
        private String name; 
        private String regionId; 
        private String type; 
        private String workingDir; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommandRequest request) {
            super(request);
            this.commandContent = request.commandContent;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.type = request.type;
            this.workingDir = request.workingDir;
            this.timeout = request.timeout;
        } 

        /**
         * CommandContent.
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * WorkingDir.
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateCommandRequest build() {
            return new CreateCommandRequest(this);
        } 

    } 

}
