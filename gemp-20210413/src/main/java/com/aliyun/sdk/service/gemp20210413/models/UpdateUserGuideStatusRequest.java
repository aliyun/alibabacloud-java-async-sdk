// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserGuideStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserGuideStatusRequest</p>
 */
public class UpdateUserGuideStatusRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("guideAction")
    private String guideAction;

    private UpdateUserGuideStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.guideAction = builder.guideAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserGuideStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return guideAction
     */
    public String getGuideAction() {
        return this.guideAction;
    }

    public static final class Builder extends Request.Builder<UpdateUserGuideStatusRequest, Builder> {
        private String clientToken; 
        private String guideAction; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserGuideStatusRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.guideAction = response.guideAction;
        } 

        /**
         * 幂等校验
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * INCIDENT_GUIDE	事件线 INCIDENT_GUIDE配置人员 USER_GUIDE 服务组 SERVICE_GROUP_GUIDE 服务 SERVICE_GUIDE 集成配置 MONITOR_GUIDE 流转规则 ROUTE_RULE_GUIDE 通知订阅 NOTICE_GUIDE
         */
        public Builder guideAction(String guideAction) {
            this.putBodyParameter("guideAction", guideAction);
            this.guideAction = guideAction;
            return this;
        }

        @Override
        public UpdateUserGuideStatusRequest build() {
            return new UpdateUserGuideStatusRequest(this);
        } 

    } 

}
