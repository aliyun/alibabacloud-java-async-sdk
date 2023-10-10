// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleInApplicationRequest} extends {@link RequestModel}
 *
 * <p>ScaleInApplicationRequest</p>
 */
public class ScaleInApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EccInfo")
    @Validation(required = true)
    private String eccInfo;

    @Query
    @NameInMap("ForceStatus")
    private Boolean forceStatus;

    private ScaleInApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eccInfo = builder.eccInfo;
        this.forceStatus = builder.forceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleInApplicationRequest create() {
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
     * @return eccInfo
     */
    public String getEccInfo() {
        return this.eccInfo;
    }

    /**
     * @return forceStatus
     */
    public Boolean getForceStatus() {
        return this.forceStatus;
    }

    public static final class Builder extends Request.Builder<ScaleInApplicationRequest, Builder> {
        private String appId; 
        private String eccInfo; 
        private Boolean forceStatus; 

        private Builder() {
            super();
        } 

        private Builder(ScaleInApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.eccInfo = request.eccInfo;
            this.forceStatus = request.forceStatus;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the elastic compute container (ECC) that corresponds to the Elastic Compute Service (ECS) instance to be removed for the application. Separate multiple ECC IDs with commas (,). You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see [QueryApplicationStatus](~~149394~~).
         */
        public Builder eccInfo(String eccInfo) {
            this.putQueryParameter("EccInfo", eccInfo);
            this.eccInfo = eccInfo;
            return this;
        }

        /**
         * Specifies whether to forcibly unpublish the application from the ECS instance. You need to set this parameter to true only if the ECS instance expires. In normal cases, you do not need to set this parameter to true.
         */
        public Builder forceStatus(Boolean forceStatus) {
            this.putQueryParameter("ForceStatus", forceStatus);
            this.forceStatus = forceStatus;
            return this;
        }

        @Override
        public ScaleInApplicationRequest build() {
            return new ScaleInApplicationRequest(this);
        } 

    } 

}
