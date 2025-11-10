// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateNotifyStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateNotifyStrategyRequest</p>
 */
public class UpdateNotifyStrategyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyStrategyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private NotifyStrategyForModify body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private UpdateNotifyStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNotifyStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return notifyStrategyId
     */
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    /**
     * @return body
     */
    public NotifyStrategyForModify getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdateNotifyStrategyRequest, Builder> {
        private String regionId; 
        private String notifyStrategyId; 
        private NotifyStrategyForModify body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNotifyStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.notifyStrategyId = request.notifyStrategyId;
            this.body = request.body;
            this.workspace = request.workspace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12312-31-23-123-1-23123</p>
         */
        public Builder notifyStrategyId(String notifyStrategyId) {
            this.putPathParameter("notifyStrategyId", notifyStrategyId);
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(NotifyStrategyForModify body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public UpdateNotifyStrategyRequest build() {
            return new UpdateNotifyStrategyRequest(this);
        } 

    } 

}
