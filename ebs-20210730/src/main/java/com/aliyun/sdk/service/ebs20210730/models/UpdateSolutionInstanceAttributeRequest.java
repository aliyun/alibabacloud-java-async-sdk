// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSolutionInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSolutionInstanceAttributeRequest</p>
 */
public class UpdateSolutionInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region where the dedicated block storage cluster resides. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-***</p>
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
