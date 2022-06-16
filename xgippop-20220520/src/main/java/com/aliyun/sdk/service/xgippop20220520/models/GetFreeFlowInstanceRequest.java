// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetFreeFlowInstanceRequest</p>
 */
public class GetFreeFlowInstanceRequest extends Request {
    @Query
    @NameInMap("Aliuid")
    private Long aliuid;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ItemCode")
    @Validation(required = true)
    private String itemCode;

    private GetFreeFlowInstanceRequest(Builder builder) {
        super(builder);
        this.aliuid = builder.aliuid;
        this.appId = builder.appId;
        this.instanceId = builder.instanceId;
        this.itemCode = builder.itemCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFreeFlowInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliuid
     */
    public Long getAliuid() {
        return this.aliuid;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemCode
     */
    public String getItemCode() {
        return this.itemCode;
    }

    public static final class Builder extends Request.Builder<GetFreeFlowInstanceRequest, Builder> {
        private Long aliuid; 
        private String appId; 
        private String instanceId; 
        private String itemCode; 

        private Builder() {
            super();
        } 

        private Builder(GetFreeFlowInstanceRequest request) {
            super(request);
            this.aliuid = request.aliuid;
            this.appId = request.appId;
            this.instanceId = request.instanceId;
            this.itemCode = request.itemCode;
        } 

        /**
         * Aliuid.
         */
        public Builder aliuid(Long aliuid) {
            this.putQueryParameter("Aliuid", aliuid);
            this.aliuid = aliuid;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ItemCode.
         */
        public Builder itemCode(String itemCode) {
            this.putQueryParameter("ItemCode", itemCode);
            this.itemCode = itemCode;
            return this;
        }

        @Override
        public GetFreeFlowInstanceRequest build() {
            return new GetFreeFlowInstanceRequest(this);
        } 

    } 

}
