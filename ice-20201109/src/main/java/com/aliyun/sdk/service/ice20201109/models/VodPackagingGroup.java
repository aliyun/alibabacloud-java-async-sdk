// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link VodPackagingGroup} extends {@link TeaModel}
 *
 * <p>VodPackagingGroup</p>
 */
public class VodPackagingGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApproximateAssetCount")
    private Long approximateAssetCount;

    @com.aliyun.core.annotation.NameInMap("ConfigurationCount")
    private Long configurationCount;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private VodPackagingGroup(Builder builder) {
        this.approximateAssetCount = builder.approximateAssetCount;
        this.configurationCount = builder.configurationCount;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VodPackagingGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approximateAssetCount
     */
    public Long getApproximateAssetCount() {
        return this.approximateAssetCount;
    }

    /**
     * @return configurationCount
     */
    public Long getConfigurationCount() {
        return this.configurationCount;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder {
        private Long approximateAssetCount; 
        private Long configurationCount; 
        private String createTime; 
        private String description; 
        private String domainName; 
        private String groupName; 

        private Builder() {
        } 

        private Builder(VodPackagingGroup model) {
            this.approximateAssetCount = model.approximateAssetCount;
            this.configurationCount = model.configurationCount;
            this.createTime = model.createTime;
            this.description = model.description;
            this.domainName = model.domainName;
            this.groupName = model.groupName;
        } 

        /**
         * <p>The approximate number of packaging assets in the packaging group.</p>
         */
        public Builder approximateAssetCount(Long approximateAssetCount) {
            this.approximateAssetCount = approximateAssetCount;
            return this;
        }

        /**
         * <p>The number of packaging configurations in the packaging group.</p>
         */
        public Builder configurationCount(Long configurationCount) {
            this.configurationCount = configurationCount;
            return this;
        }

        /**
         * <p>The creation time of the packaging group.</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the packaging group.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The playback domain name of the packaging group. All VOD packaging assets in the same packaging group share the same domain name.</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The name of the packaging group. The name must be unique per user, up to 128 characters in length, and match the format [A-Za-z0-9_-]+.</p>
         * 
         * <strong>example:</strong>
         * <p>example-group</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        public VodPackagingGroup build() {
            return new VodPackagingGroup(this);
        } 

    } 

}
