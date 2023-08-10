// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecondRankRequest} extends {@link RequestModel}
 *
 * <p>ModifySecondRankRequest</p>
 */
public class ModifySecondRankRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private Integer appId;

    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("body")
    private SecondRank body;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private ModifySecondRankRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.name = builder.name;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecondRankRequest create() {
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
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public SecondRank getBody() {
        return this.body;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<ModifySecondRankRequest, Builder> {
        private String appGroupIdentity; 
        private Integer appId; 
        private String name; 
        private SecondRank body; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecondRankRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
            this.name = request.name;
            this.body = request.body;
            this.dryRun = request.dryRun;
        } 

        /**
         * "my_app_group_name"
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 110157886
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * true
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * body.
         */
        public Builder body(SecondRank body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * true
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public ModifySecondRankRequest build() {
            return new ModifySecondRankRequest(this);
        } 

    } 

}
