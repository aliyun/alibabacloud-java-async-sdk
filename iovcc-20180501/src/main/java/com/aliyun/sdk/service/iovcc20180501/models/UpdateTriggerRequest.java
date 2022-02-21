// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateTriggerRequest</p>
 */
public class UpdateTriggerRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Production")
    private Integer production;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Sandbox")
    private Integer sandbox;

    private UpdateTriggerRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.production = builder.production;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.sandbox = builder.sandbox;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return production
     */
    public Integer getProduction() {
        return this.production;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sandbox
     */
    public Integer getSandbox() {
        return this.sandbox;
    }

    public static final class Builder extends Request.Builder<UpdateTriggerRequest, Builder> {
        private Long id; 
        private Integer production; 
        private String projectId; 
        private String regionId; 
        private Integer sandbox; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTriggerRequest response) {
            super(response);
            this.id = response.id;
            this.production = response.production;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.sandbox = response.sandbox;
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
         * Production.
         */
        public Builder production(Integer production) {
            this.putQueryParameter("Production", production);
            this.production = production;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * Sandbox.
         */
        public Builder sandbox(Integer sandbox) {
            this.putQueryParameter("Sandbox", sandbox);
            this.sandbox = sandbox;
            return this;
        }

        @Override
        public UpdateTriggerRequest build() {
            return new UpdateTriggerRequest(this);
        } 

    } 

}
