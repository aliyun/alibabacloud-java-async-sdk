// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebCCRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebCCRuleRequest</p>
 */
public class ModifyWebCCRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Act")
    @com.aliyun.core.annotation.Validation(required = true)
    private String act;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ttl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    private ModifyWebCCRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.act = builder.act;
        this.count = builder.count;
        this.domain = builder.domain;
        this.interval = builder.interval;
        this.mode = builder.mode;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.ttl = builder.ttl;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebCCRuleRequest create() {
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
     * @return act
     */
    public String getAct() {
        return this.act;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<ModifyWebCCRuleRequest, Builder> {
        private String regionId; 
        private String act; 
        private Integer count; 
        private String domain; 
        private Integer interval; 
        private String mode; 
        private String name; 
        private String resourceGroupId; 
        private Integer ttl; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebCCRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.act = request.act;
            this.count = request.count;
            this.domain = request.domain;
            this.interval = request.interval;
            this.mode = request.mode;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
            this.ttl = request.ttl;
            this.uri = request.uri;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Act.
         */
        public Builder act(String act) {
            this.putQueryParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The blocking duration. Valid values: **60** to **86400**. Unit: seconds.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * The check path.
         * <p>
         * 
         * >  You cannot modify the Uniform Resource Identifier (URI). The domain name of the website, the check path, and the rule name uniquely identify a rule.
         */
        public Builder uri(String uri) {
            this.putQueryParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public ModifyWebCCRuleRequest build() {
            return new ModifyWebCCRuleRequest(this);
        } 

    } 

}
