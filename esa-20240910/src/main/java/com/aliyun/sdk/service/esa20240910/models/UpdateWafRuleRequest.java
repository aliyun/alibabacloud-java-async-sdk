// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWafRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateWafRuleRequest</p>
 */
public class UpdateWafRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private WafRuleConfig config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Position")
    private Long position;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateWafRuleRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.id = builder.id;
        this.position = builder.position;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWafRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public WafRuleConfig getConfig() {
        return this.config;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return position
     */
    public Long getPosition() {
        return this.position;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateWafRuleRequest, Builder> {
        private WafRuleConfig config; 
        private Long id; 
        private Long position; 
        private Long siteId; 
        private Integer siteVersion; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWafRuleRequest request) {
            super(request);
            this.config = request.config;
            this.id = request.id;
            this.position = request.position;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
            this.status = request.status;
        } 

        /**
         * Config.
         */
        public Builder config(WafRuleConfig config) {
            String configShrink = shrink(config, "Config", "json");
            this.putBodyParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(Long position) {
            this.putBodyParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateWafRuleRequest build() {
            return new UpdateWafRuleRequest(this);
        } 

    } 

}
