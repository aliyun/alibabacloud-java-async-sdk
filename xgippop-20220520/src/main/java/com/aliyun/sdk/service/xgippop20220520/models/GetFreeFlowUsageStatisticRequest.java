// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowUsageStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetFreeFlowUsageStatisticRequest</p>
 */
public class GetFreeFlowUsageStatisticRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Month")
    @Validation(required = true)
    private Long month;

    private GetFreeFlowUsageStatisticRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.instanceId = builder.instanceId;
        this.month = builder.month;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFreeFlowUsageStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return month
     */
    public Long getMonth() {
        return this.month;
    }

    public static final class Builder extends Request.Builder<GetFreeFlowUsageStatisticRequest, Builder> {
        private Long aliUid; 
        private String appId; 
        private String appName; 
        private String instanceId; 
        private Long month; 

        private Builder() {
            super();
        } 

        private Builder(GetFreeFlowUsageStatisticRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appId = request.appId;
            this.appName = request.appName;
            this.instanceId = request.instanceId;
            this.month = request.month;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
         * Month.
         */
        public Builder month(Long month) {
            this.putQueryParameter("Month", month);
            this.month = month;
            return this;
        }

        @Override
        public GetFreeFlowUsageStatisticRequest build() {
            return new GetFreeFlowUsageStatisticRequest(this);
        } 

    } 

}
