// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCommandAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateCommandAttributeRequest</p>
 */
public class UpdateCommandAttributeRequest extends Request {
    @Query
    @NameInMap("CommandId")
    @Validation(required = true)
    private String commandId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    private UpdateCommandAttributeRequest(Builder builder) {
        super(builder);
        this.commandId = builder.commandId;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.timeout = builder.timeout;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCommandAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
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
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<UpdateCommandAttributeRequest, Builder> {
        private String commandId; 
        private String description; 
        private String name; 
        private String regionId; 
        private Long timeout; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCommandAttributeRequest request) {
            super(request);
            this.commandId = request.commandId;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.timeout = request.timeout;
            this.workingDir = request.workingDir;
        } 

        /**
         * CommandId.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
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
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
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

        @Override
        public UpdateCommandAttributeRequest build() {
            return new UpdateCommandAttributeRequest(this);
        } 

    } 

}
