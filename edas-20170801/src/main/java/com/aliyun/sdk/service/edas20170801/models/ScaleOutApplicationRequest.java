// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleOutApplicationRequest} extends {@link RequestModel}
 *
 * <p>ScaleOutApplicationRequest</p>
 */
public class ScaleOutApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("DeployGroup")
    @Validation(required = true)
    private String deployGroup;

    @Query
    @NameInMap("EcuInfo")
    @Validation(required = true)
    private String ecuInfo;

    private ScaleOutApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deployGroup = builder.deployGroup;
        this.ecuInfo = builder.ecuInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleOutApplicationRequest create() {
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
     * @return deployGroup
     */
    public String getDeployGroup() {
        return this.deployGroup;
    }

    /**
     * @return ecuInfo
     */
    public String getEcuInfo() {
        return this.ecuInfo;
    }

    public static final class Builder extends Request.Builder<ScaleOutApplicationRequest, Builder> {
        private String appId; 
        private String deployGroup; 
        private String ecuInfo; 

        private Builder() {
            super();
        } 

        private Builder(ScaleOutApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.deployGroup = request.deployGroup;
            this.ecuInfo = request.ecuInfo;
        } 

        /**
         * The ID of the application that you want to scale out. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the instance group where the application you want to scale out is deployed. You can call the QueryApplicationStatus operation to query the group ID. For more information, see [QueryApplicationStatus](~~149394~~).
         */
        public Builder deployGroup(String deployGroup) {
            this.putQueryParameter("DeployGroup", deployGroup);
            this.deployGroup = deployGroup;
            return this;
        }

        /**
         * The ID of the elastic compute unit (ECU) that corresponds to the Elastic Compute Service (ECS) instance to be added to the instance group for scale-out. You can call the ListScaleOutEcu operation to query the ECU ID. For more information, see [ListScaleOutEcu](~~149371~~). Separate multiple ECU IDs with commas (,).
         */
        public Builder ecuInfo(String ecuInfo) {
            this.putQueryParameter("EcuInfo", ecuInfo);
            this.ecuInfo = ecuInfo;
            return this;
        }

        @Override
        public ScaleOutApplicationRequest build() {
            return new ScaleOutApplicationRequest(this);
        } 

    } 

}
