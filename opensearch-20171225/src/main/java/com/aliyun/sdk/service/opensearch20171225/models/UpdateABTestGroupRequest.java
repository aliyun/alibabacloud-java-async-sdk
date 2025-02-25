// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateABTestGroupRequest</p>
 */
public class UpdateABTestGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999)
    private Integer sceneId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999)
    private Integer groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ABTestGroup body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private UpdateABTestGroupRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.sceneId = builder.sceneId;
        this.groupId = builder.groupId;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateABTestGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return sceneId
     */
    public Integer getSceneId() {
        return this.sceneId;
    }

    /**
     * @return groupId
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * @return body
     */
    public ABTestGroup getBody() {
        return this.body;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<UpdateABTestGroupRequest, Builder> {
        private String appGroupIdentity; 
        private Integer sceneId; 
        private Integer groupId; 
        private ABTestGroup body; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(UpdateABTestGroupRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.sceneId = request.sceneId;
            this.groupId = request.groupId;
            this.body = request.body;
            this.dryRun = request.dryRun;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The scenario ID.
         */
        public Builder sceneId(Integer sceneId) {
            this.putPathParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * The ID of the test group.
         */
        public Builder groupId(Integer groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The request body. For more information, see [ABTestGroup](~~178935~~).
         */
        public Builder body(ABTestGroup body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   true: performs only a dry run. No endpoint is created. The system checks whether your AccessKey is valid, whether Resource Access Management (RAM) users are authorized, and whether the required parameters are set.
         * *   false (default): creates an endpoint immediately.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public UpdateABTestGroupRequest build() {
            return new UpdateABTestGroupRequest(this);
        } 

    } 

}
