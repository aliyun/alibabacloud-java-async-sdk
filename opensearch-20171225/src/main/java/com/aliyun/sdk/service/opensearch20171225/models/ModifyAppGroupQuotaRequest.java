// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppGroupQuotaRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppGroupQuotaRequest</p>
 */
public class ModifyAppGroupQuotaRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Body
    @NameInMap("body")
    private Quota body;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private ModifyAppGroupQuotaRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppGroupQuotaRequest create() {
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
     * @return body
     */
    public Quota getBody() {
        return this.body;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<ModifyAppGroupQuotaRequest, Builder> {
        private String appGroupIdentity; 
        private Quota body; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppGroupQuotaRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
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
         * body.
         */
        public Builder body(Quota body) {
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
        public ModifyAppGroupQuotaRequest build() {
            return new ModifyAppGroupQuotaRequest(this);
        } 

    } 

}
