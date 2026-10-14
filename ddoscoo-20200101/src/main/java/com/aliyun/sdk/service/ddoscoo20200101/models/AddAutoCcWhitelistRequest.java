// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link AddAutoCcWhitelistRequest} extends {@link RequestModel}
 *
 * <p>AddAutoCcWhitelistRequest</p>
 */
public class AddAutoCcWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whitelist;

    private AddAutoCcWhitelistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAutoCcWhitelistRequest create() {
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
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<AddAutoCcWhitelistRequest, Builder> {
        private String regionId; 
        private Integer expireTime; 
        private String instanceId; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(AddAutoCcWhitelistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.expireTime = request.expireTime;
            this.instanceId = request.instanceId;
            this.whitelist = request.whitelist;
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
         * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
         * <blockquote>
         * <p>This parameter specifies the validity period of blacklist IP addresses. Whitelist IP addresses are permanently valid by default. You do not need to set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance for which you want to add whitelist IP addresses.</p>
         * <blockquote>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configuration of the whitelist IP addresses to add. This parameter is a string that is converted from a JSON array. Each element in the JSON array is a whitelist IP struct that contains the following field:</p>
         * <ul>
         * <li><strong>src</strong>: String | Required | The IP address to add to the whitelist.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;src&quot;:&quot;192.XX.XX.1&quot;},{&quot;src&quot;:&quot;192.XX.XX.2&quot;}]</p>
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public AddAutoCcWhitelistRequest build() {
            return new AddAutoCcWhitelistRequest(this);
        } 

    } 

}
