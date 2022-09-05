// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDispatchRuleRequest} extends {@link RequestModel}
 *
 * <p>ListDispatchRuleRequest</p>
 */
public class ListDispatchRuleRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("System")
    private Boolean system;

    private ListDispatchRuleRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.system = builder.system;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDispatchRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return system
     */
    public Boolean getSystem() {
        return this.system;
    }

    public static final class Builder extends Request.Builder<ListDispatchRuleRequest, Builder> {
        private String name; 
        private String regionId; 
        private Boolean system; 

        private Builder() {
            super();
        } 

        private Builder(ListDispatchRuleRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
            this.system = request.system;
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
         * System.
         */
        public Builder system(Boolean system) {
            this.putQueryParameter("System", system);
            this.system = system;
            return this;
        }

        @Override
        public ListDispatchRuleRequest build() {
            return new ListDispatchRuleRequest(this);
        } 

    } 

}
