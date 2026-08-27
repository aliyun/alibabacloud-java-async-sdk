// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetScheduledTaskPushOptionsRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledTaskPushOptionsRequest</p>
 */
public class GetScheduledTaskPushOptionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetScheduledTaskPushOptionsRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskPushOptionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetScheduledTaskPushOptionsRequest, Builder> {
        private String collaborationGroupId; 
        private String digitalEmployeeName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledTaskPushOptionsRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>协作群组 ID；传入时返回该群可选的 IM 群绑定</p>
         * 
         * <strong>example:</strong>
         * <p>cg_401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>个人任务查询时使用的数字员工名称；查询群任务推送选项时无需传入</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDigitalEmployeeName</p>
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.putBodyParameter("digitalEmployeeName", digitalEmployeeName);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetScheduledTaskPushOptionsRequest build() {
            return new GetScheduledTaskPushOptionsRequest(this);
        } 

    } 

}
