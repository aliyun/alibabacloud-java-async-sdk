// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebCCRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebCCRuleRequest</p>
 */
public class ModifyWebCCRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Act")
    @Validation(required = true)
    private String act;

    @Query
    @NameInMap("Count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Interval")
    @Validation(required = true)
    private Integer interval;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Ttl")
    @Validation(required = true)
    private Integer ttl;

    @Query
    @NameInMap("Uri")
    @Validation(required = true)
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
         * The blocking type. Valid values:
         * <p>
         * 
         * *   **close**: blocks the request.
         * *   **captcha**: enables captcha verification.
         */
        public Builder act(String act) {
            this.putQueryParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * The number of requests that are allowed from an individual IP address. Valid values: **2** to **2000**.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The detection interval. Valid values: **5** to **10800**. Unit: seconds.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The match mode. Valid values:
         * <p>
         * 
         * *   **prefix**: prefix match
         * *   **match**: exact match
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The blocking duration. Valid values: **1** to **1440**. Unit: minutes.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * The check path.
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
