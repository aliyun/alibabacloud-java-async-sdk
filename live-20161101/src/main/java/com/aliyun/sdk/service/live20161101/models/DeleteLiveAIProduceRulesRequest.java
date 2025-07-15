// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteLiveAIProduceRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveAIProduceRulesRequest</p>
 */
public class DeleteLiveAIProduceRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RulesId")
    private String rulesId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuffixName")
    private String suffixName;

    private DeleteLiveAIProduceRulesRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.rulesId = builder.rulesId;
        this.suffixName = builder.suffixName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveAIProduceRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rulesId
     */
    public String getRulesId() {
        return this.rulesId;
    }

    /**
     * @return suffixName
     */
    public String getSuffixName() {
        return this.suffixName;
    }

    public static final class Builder extends Request.Builder<DeleteLiveAIProduceRulesRequest, Builder> {
        private String app; 
        private String domain; 
        private Long ownerId; 
        private String regionId; 
        private String rulesId; 
        private String suffixName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveAIProduceRulesRequest request) {
            super(request);
            this.app = request.app;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.rulesId = request.rulesId;
            this.suffixName = request.suffixName;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AppName</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the subtitle rule.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
         */
        public Builder rulesId(String rulesId) {
            this.putQueryParameter("RulesId", rulesId);
            this.rulesId = rulesId;
            return this;
        }

        /**
         * <p>The suffix of the subtitle rule.</p>
         * <blockquote>
         * <p> Set the value to the name of the subtitle template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>et</p>
         */
        public Builder suffixName(String suffixName) {
            this.putQueryParameter("SuffixName", suffixName);
            this.suffixName = suffixName;
            return this;
        }

        @Override
        public DeleteLiveAIProduceRulesRequest build() {
            return new DeleteLiveAIProduceRulesRequest(this);
        } 

    } 

}
