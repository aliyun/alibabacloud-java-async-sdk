// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenarioRequest} extends {@link RequestModel}
 *
 * <p>ListScenarioRequest</p>
 */
public class ListScenarioRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Scenario")
    private String scenario;

    @Query
    @NameInMap("Sign")
    private String sign;

    private ListScenarioRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.scenario = builder.scenario;
        this.sign = builder.sign;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScenarioRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    public static final class Builder extends Request.Builder<ListScenarioRequest, Builder> {
        private String appId; 
        private String name; 
        private String regionId; 
        private String scenario; 
        private String sign; 

        private Builder() {
            super();
        } 

        private Builder(ListScenarioRequest request) {
            super(request);
            this.appId = request.appId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.scenario = request.scenario;
            this.sign = request.sign;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * Scenario.
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * Sign.
         */
        public Builder sign(String sign) {
            this.putQueryParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        @Override
        public ListScenarioRequest build() {
            return new ListScenarioRequest(this);
        } 

    } 

}
