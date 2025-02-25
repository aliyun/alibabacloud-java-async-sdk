// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestFixedFlowDividersRequest} extends {@link RequestModel}
 *
 * <p>UpdateABTestFixedFlowDividersRequest</p>
 */
public class UpdateABTestFixedFlowDividersRequest extends Request {
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

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("experimentId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999)
    private Integer experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < String > body;

    private UpdateABTestFixedFlowDividersRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.sceneId = builder.sceneId;
        this.groupId = builder.groupId;
        this.experimentId = builder.experimentId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateABTestFixedFlowDividersRequest create() {
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
     * @return experimentId
     */
    public Integer getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return body
     */
    public java.util.List < String > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateABTestFixedFlowDividersRequest, Builder> {
        private String appGroupIdentity; 
        private Integer sceneId; 
        private Integer groupId; 
        private Integer experimentId; 
        private java.util.List < String > body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateABTestFixedFlowDividersRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.sceneId = request.sceneId;
            this.groupId = request.groupId;
            this.experimentId = request.experimentId;
            this.body = request.body;
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
         * The test ID.
         */
        public Builder experimentId(Integer experimentId) {
            this.putPathParameter("experimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * The request body.
         */
        public Builder body(java.util.List < String > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateABTestFixedFlowDividersRequest build() {
            return new UpdateABTestFixedFlowDividersRequest(this);
        } 

    } 

}
