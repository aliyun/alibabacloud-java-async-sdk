// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigurationSpecificationsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigurationSpecificationsRequest</p>
 */
public class ListConfigurationSpecificationsRequest extends Request {
    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100)
    private Integer maxResults;

    @Query
    @NameInMap("Model")
    private String model;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("SpecificationName")
    private String specificationName;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private ListConfigurationSpecificationsRequest(Builder builder) {
        super(builder);
        this.architecture = builder.architecture;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.nextToken = builder.nextToken;
        this.role = builder.role;
        this.specificationName = builder.specificationName;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigurationSpecificationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return specificationName
     */
    public String getSpecificationName() {
        return this.specificationName;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListConfigurationSpecificationsRequest, Builder> {
        private String architecture; 
        private String instanceId; 
        private Integer maxResults; 
        private String model; 
        private String nextToken; 
        private String role; 
        private String specificationName; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigurationSpecificationsRequest request) {
            super(request);
            this.architecture = request.architecture;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.nextToken = request.nextToken;
            this.role = request.role;
            this.specificationName = request.specificationName;
            this.vendor = request.vendor;
        } 

        /**
         * Architecture.
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * SpecificationName.
         */
        public Builder specificationName(String specificationName) {
            this.putQueryParameter("SpecificationName", specificationName);
            this.specificationName = specificationName;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListConfigurationSpecificationsRequest build() {
            return new ListConfigurationSpecificationsRequest(this);
        } 

    } 

}
