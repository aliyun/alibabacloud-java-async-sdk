// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConfigInstanceWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceWhiteListRequest</p>
 */
public class ConfigInstanceWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteList")
    private java.util.List < String > whiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteListPolicies")
    private java.util.List < WhiteListPolicies> whiteListPolicies;

    private ConfigInstanceWhiteListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.whiteList = builder.whiteList;
        this.whiteListPolicies = builder.whiteListPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return whiteList
     */
    public java.util.List < String > getWhiteList() {
        return this.whiteList;
    }

    /**
     * @return whiteListPolicies
     */
    public java.util.List < WhiteListPolicies> getWhiteListPolicies() {
        return this.whiteListPolicies;
    }

    public static final class Builder extends Request.Builder<ConfigInstanceWhiteListRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > whiteList; 
        private java.util.List < WhiteListPolicies> whiteListPolicies; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceWhiteListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.whiteList = request.whiteList;
            this.whiteListPolicies = request.whiteListPolicies;
        } 

        /**
         * <p>The ID of the bastion host for which you want to configure a whitelist of public IP addresses.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1gh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IP address whitelist that you want to configure.</p>
         * 
         * <strong>example:</strong>
         * <p>10.162.XX.XX</p>
         */
        public Builder whiteList(java.util.List < String > whiteList) {
            this.putQueryParameter("WhiteList", whiteList);
            this.whiteList = whiteList;
            return this;
        }

        /**
         * WhiteListPolicies.
         */
        public Builder whiteListPolicies(java.util.List < WhiteListPolicies> whiteListPolicies) {
            this.putQueryParameter("WhiteListPolicies", whiteListPolicies);
            this.whiteListPolicies = whiteListPolicies;
            return this;
        }

        @Override
        public ConfigInstanceWhiteListRequest build() {
            return new ConfigInstanceWhiteListRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigInstanceWhiteListRequest} extends {@link TeaModel}
     *
     * <p>ConfigInstanceWhiteListRequest</p>
     */
    public static class WhiteListPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private WhiteListPolicies(Builder builder) {
            this.description = builder.description;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteListPolicies create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String description; 
            private String entry; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Entry.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public WhiteListPolicies build() {
                return new WhiteListPolicies(this);
            } 

        } 

    }
}
