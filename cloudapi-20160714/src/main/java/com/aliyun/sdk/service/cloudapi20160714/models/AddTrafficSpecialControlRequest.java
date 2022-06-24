// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTrafficSpecialControlRequest} extends {@link RequestModel}
 *
 * <p>AddTrafficSpecialControlRequest</p>
 */
public class AddTrafficSpecialControlRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SpecialKey")
    @Validation(required = true)
    private String specialKey;

    @Query
    @NameInMap("SpecialType")
    @Validation(required = true)
    private String specialType;

    @Query
    @NameInMap("TrafficControlId")
    @Validation(required = true)
    private String trafficControlId;

    @Query
    @NameInMap("TrafficValue")
    @Validation(required = true)
    private Integer trafficValue;

    private AddTrafficSpecialControlRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.specialKey = builder.specialKey;
        this.specialType = builder.specialType;
        this.trafficControlId = builder.trafficControlId;
        this.trafficValue = builder.trafficValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTrafficSpecialControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return specialKey
     */
    public String getSpecialKey() {
        return this.specialKey;
    }

    /**
     * @return specialType
     */
    public String getSpecialType() {
        return this.specialType;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    /**
     * @return trafficValue
     */
    public Integer getTrafficValue() {
        return this.trafficValue;
    }

    public static final class Builder extends Request.Builder<AddTrafficSpecialControlRequest, Builder> {
        private String securityToken; 
        private String specialKey; 
        private String specialType; 
        private String trafficControlId; 
        private Integer trafficValue; 

        private Builder() {
            super();
        } 

        private Builder(AddTrafficSpecialControlRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.specialKey = request.specialKey;
            this.specialType = request.specialType;
            this.trafficControlId = request.trafficControlId;
            this.trafficValue = request.trafficValue;
        } 

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SpecialKey.
         */
        public Builder specialKey(String specialKey) {
            this.putQueryParameter("SpecialKey", specialKey);
            this.specialKey = specialKey;
            return this;
        }

        /**
         * SpecialType.
         */
        public Builder specialType(String specialType) {
            this.putQueryParameter("SpecialType", specialType);
            this.specialType = specialType;
            return this;
        }

        /**
         * TrafficControlId.
         */
        public Builder trafficControlId(String trafficControlId) {
            this.putQueryParameter("TrafficControlId", trafficControlId);
            this.trafficControlId = trafficControlId;
            return this;
        }

        /**
         * TrafficValue.
         */
        public Builder trafficValue(Integer trafficValue) {
            this.putQueryParameter("TrafficValue", trafficValue);
            this.trafficValue = trafficValue;
            return this;
        }

        @Override
        public AddTrafficSpecialControlRequest build() {
            return new AddTrafficSpecialControlRequest(this);
        } 

    } 

}
