// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCapacityReservationRequest} extends {@link RequestModel}
 *
 * <p>CreateCapacityReservationRequest</p>
 */
public class CreateCapacityReservationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistrictId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String districtId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectResourceReadyTime")
    @Deprecated
    private String expectResourceReadyTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectSessionCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer expectSessionCapacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private CreateCapacityReservationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.clientToken = builder.clientToken;
        this.districtId = builder.districtId;
        this.expectResourceReadyTime = builder.expectResourceReadyTime;
        this.expectSessionCapacity = builder.expectSessionCapacity;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCapacityReservationRequest create() {
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
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return districtId
     */
    public String getDistrictId() {
        return this.districtId;
    }

    /**
     * @return expectResourceReadyTime
     */
    public String getExpectResourceReadyTime() {
        return this.expectResourceReadyTime;
    }

    /**
     * @return expectSessionCapacity
     */
    public Integer getExpectSessionCapacity() {
        return this.expectSessionCapacity;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateCapacityReservationRequest, Builder> {
        private String appId; 
        private String appVersion; 
        private String clientToken; 
        private String districtId; 
        private String expectResourceReadyTime; 
        private Integer expectSessionCapacity; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCapacityReservationRequest request) {
            super(request);
            this.appId = request.appId;
            this.appVersion = request.appVersion;
            this.clientToken = request.clientToken;
            this.districtId = request.districtId;
            this.expectResourceReadyTime = request.expectResourceReadyTime;
            this.expectSessionCapacity = request.expectSessionCapacity;
            this.projectId = request.projectId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DistrictId.
         */
        public Builder districtId(String districtId) {
            this.putBodyParameter("DistrictId", districtId);
            this.districtId = districtId;
            return this;
        }

        /**
         * ExpectResourceReadyTime.
         */
        public Builder expectResourceReadyTime(String expectResourceReadyTime) {
            this.putBodyParameter("ExpectResourceReadyTime", expectResourceReadyTime);
            this.expectResourceReadyTime = expectResourceReadyTime;
            return this;
        }

        /**
         * ExpectSessionCapacity.
         */
        public Builder expectSessionCapacity(Integer expectSessionCapacity) {
            this.putBodyParameter("ExpectSessionCapacity", expectSessionCapacity);
            this.expectSessionCapacity = expectSessionCapacity;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateCapacityReservationRequest build() {
            return new CreateCapacityReservationRequest(this);
        } 

    } 

}
