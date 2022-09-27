// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WhiteIpGroup} extends {@link TeaModel}
 *
 * <p>WhiteIpGroup</p>
 */
public class WhiteIpGroup extends TeaModel {
    @NameInMap("WhiteIpType")
    private String whiteIpType;

    @NameInMap("groupName")
    private String groupName;

    @NameInMap("ips")
    private java.util.List < String > ips;

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
    public java.util.List < String > getIps() {
        return this.ips;
    }

    public static final class Builder {
        private String whiteIpType; 
        private String groupName; 
        private java.util.List < String > ips; 

        /**
         * IP白名单分组类型
         */
        public Builder whiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }

        /**
         * IP白名单分组名称
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * IP白名单列表
         */
        public Builder ips(java.util.List < String > ips) {
            this.ips = ips;
            return this;
        }

        public WhiteIpGroup build() {
            return new WhiteIpGroup(this);
        } 

    } 

}
