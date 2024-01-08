// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSolutionInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSolutionInstanceAttributeRequest</p>
 */
public class UpdateSolutionInstanceAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

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
    @NameInMap("SolutionInstanceId")
    @Validation(required = true)
    private String solutionInstanceId;

    private UpdateSolutionInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.solutionInstanceId = builder.solutionInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSolutionInstanceAttributeRequest create() {
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
     * @return solutionInstanceId
     */
    public String getSolutionInstanceId() {
        return this.solutionInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateSolutionInstanceAttributeRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String name; 
        private String regionId; 
        private String solutionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSolutionInstanceAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.solutionInstanceId = request.solutionInstanceId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where the dedicated block storage cluster resides. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder solutionInstanceId(String solutionInstanceId) {
            this.putQueryParameter("SolutionInstanceId", solutionInstanceId);
            this.solutionInstanceId = solutionInstanceId;
            return this;
        }

        @Override
        public UpdateSolutionInstanceAttributeRequest build() {
            return new UpdateSolutionInstanceAttributeRequest(this);
        } 

    } 

}
