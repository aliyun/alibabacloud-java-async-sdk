// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateABTestSceneRequest</p>
 */
public class UpdateABTestSceneRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("sceneId")
    @Validation(required = true, maximum = 999999999)
    private Integer sceneId;

    private UpdateABTestSceneRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateABTestSceneRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateABTestSceneRequest, Builder> {
        private String appGroupIdentity; 
        private Integer sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateABTestSceneRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.sceneId = response.sceneId;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * sceneId.
         */
        public Builder sceneId(Integer sceneId) {
            this.putPathParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public UpdateABTestSceneRequest build() {
            return new UpdateABTestSceneRequest(this);
        } 

    } 

}
