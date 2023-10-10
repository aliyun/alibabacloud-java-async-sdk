// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartApplicationRequest} extends {@link RequestModel}
 *
 * <p>RestartApplicationRequest</p>
 */
public class RestartApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EccInfo")
    private String eccInfo;

    private RestartApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eccInfo = builder.eccInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<RestartApplicationRequest, Builder> {
        private String appId; 
        private String eccInfo; 

        private Builder() {
            super();
        } 

        private Builder(RestartApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.eccInfo = request.eccInfo;
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
         * The ID of the elastic compute container (ECC) that corresponds to the ECS instance on which you want to restart the application. You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see [QueryApplicationStatus](~~149394~~).
         * <p>
         * 
         * *   Separate multiple ECC IDs with commas (,).
         * *   If you leave this parameter empty, the application will be restarted on all the ECS instances deployed with the application.
         */
        public Builder eccInfo(String eccInfo) {
            this.putQueryParameter("EccInfo", eccInfo);
            this.eccInfo = eccInfo;
            return this;
        }

        @Override
        public RestartApplicationRequest build() {
            return new RestartApplicationRequest(this);
        } 

    } 

}
