// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link WhiteIpGroup} extends {@link TeaModel}
 *
 * <p>WhiteIpGroup</p>
 */
public class WhiteIpGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("WhiteIpType")
    private String whiteIpType;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("ips")
    private java.util.List<String> ips;

    private WhiteIpGroup(Builder builder) {
        this.whiteIpType = builder.whiteIpType;
        this.groupName = builder.groupName;
        this.ips = builder.ips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WhiteIpGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return whiteIpType
     */
    public String getWhiteIpType() {
        return this.whiteIpType;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return ips
     */
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public static final class Builder {
        private String whiteIpType; 
        private String groupName; 
        private java.util.List<String> ips; 

        private Builder() {
        } 

        private Builder(WhiteIpGroup model) {
            this.whiteIpType = model.whiteIpType;
            this.groupName = model.groupName;
            this.ips = model.ips;
        } 

        /**
         * WhiteIpType.
         */
        public Builder whiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }

        /**
         * groupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * ips.
         */
        public Builder ips(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }

        public WhiteIpGroup build() {
            return new WhiteIpGroup(this);
        } 

    } 

}
