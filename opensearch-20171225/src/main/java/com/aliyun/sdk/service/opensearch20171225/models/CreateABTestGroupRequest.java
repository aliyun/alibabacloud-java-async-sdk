// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateABTestGroupRequest</p>
 */
public class CreateABTestGroupRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("sceneId")
    @Validation(maximum = 999999999)
    private Integer sceneId;

    @Body
    @NameInMap("body")
    private ABTestGroup body;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private CreateABTestGroupRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.sceneId = builder.sceneId;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABTestGroupRequest create() {
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

    public static final class Builder extends Request.Builder<CreateABTestGroupRequest, Builder> {
        private String appGroupIdentity; 
        private Integer sceneId; 
        private ABTestGroup body; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateABTestGroupRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.sceneId = request.sceneId;
            this.body = request.body;
            this.dryRun = request.dryRun;
        } 

        /**
         * my_app_group_name
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 20404
         */
        public Builder sceneId(Integer sceneId) {
            this.putPathParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(ABTestGroup body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateABTestGroupRequest build() {
            return new CreateABTestGroupRequest(this);
        } 

    } 

}
