// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link AgenticFSVolumeConfig} extends {@link TeaModel}
 *
 * <p>AgenticFSVolumeConfig</p>
 */
public class AgenticFSVolumeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupID")
    private Integer groupID;

    @com.aliyun.core.annotation.NameInMap("serverAddr")
    private String serverAddr;

    @com.aliyun.core.annotation.NameInMap("userID")
    private Integer userID;

    private AgenticFSVolumeConfig(Builder builder) {
        this.groupID = builder.groupID;
        this.serverAddr = builder.serverAddr;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticFSVolumeConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupID
     */
    public Integer getGroupID() {
        return this.groupID;
    }

    /**
     * @return serverAddr
     */
    public String getServerAddr() {
        return this.serverAddr;
    }

    /**
     * @return userID
     */
    public Integer getUserID() {
        return this.userID;
    }

    public static final class Builder {
        private Integer groupID; 
        private String serverAddr; 
        private Integer userID; 

        private Builder() {
        } 

        private Builder(AgenticFSVolumeConfig model) {
            this.groupID = model.groupID;
            this.serverAddr = model.serverAddr;
            this.userID = model.userID;
        } 

        /**
         * groupID.
         */
        public Builder groupID(Integer groupID) {
            this.groupID = groupID;
            return this;
        }

        /**
         * serverAddr.
         */
        public Builder serverAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }

        /**
         * userID.
         */
        public Builder userID(Integer userID) {
            this.userID = userID;
            return this;
        }

        public AgenticFSVolumeConfig build() {
            return new AgenticFSVolumeConfig(this);
        } 

    } 

}
