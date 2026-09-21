// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
    @com.aliyun.core.annotation.NameInMap("accessPointID")
    private String accessPointID;

    @com.aliyun.core.annotation.NameInMap("agenticSpaceID")
    private String agenticSpaceID;

    @com.aliyun.core.annotation.NameInMap("fileSystemID")
    private String fileSystemID;

    @com.aliyun.core.annotation.NameInMap("groupID")
    private Integer groupID;

    @com.aliyun.core.annotation.NameInMap("serverAddr")
    private String serverAddr;

    @com.aliyun.core.annotation.NameInMap("userID")
    private Integer userID;

    private AgenticFSVolumeConfig(Builder builder) {
        this.accessPointID = builder.accessPointID;
        this.agenticSpaceID = builder.agenticSpaceID;
        this.fileSystemID = builder.fileSystemID;
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
     * @return accessPointID
     */
    public String getAccessPointID() {
        return this.accessPointID;
    }

    /**
     * @return agenticSpaceID
     */
    public String getAgenticSpaceID() {
        return this.agenticSpaceID;
    }

    /**
     * @return fileSystemID
     */
    public String getFileSystemID() {
        return this.fileSystemID;
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
        private String accessPointID; 
        private String agenticSpaceID; 
        private String fileSystemID; 
        private Integer groupID; 
        private String serverAddr; 
        private Integer userID; 

        private Builder() {
        } 

        private Builder(AgenticFSVolumeConfig model) {
            this.accessPointID = model.accessPointID;
            this.agenticSpaceID = model.agenticSpaceID;
            this.fileSystemID = model.fileSystemID;
            this.groupID = model.groupID;
            this.serverAddr = model.serverAddr;
            this.userID = model.userID;
        } 

        /**
         * <p>The access point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-xxxx</p>
         */
        public Builder accessPointID(String accessPointID) {
            this.accessPointID = accessPointID;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentic-xxxx</p>
         */
        public Builder agenticSpaceID(String agenticSpaceID) {
            this.agenticSpaceID = agenticSpaceID;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>03204sl2qjiax4ocdt2</p>
         */
        public Builder fileSystemID(String fileSystemID) {
            this.fileSystemID = fileSystemID;
            return this;
        }

        /**
         * <p>The group ID for local mounting.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder groupID(Integer groupID) {
            this.groupID = groupID;
            return this;
        }

        /**
         * <p>The AgenticFS access point address.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-xxxx.03204sl2qjiax4ocdt2-ljs60.cn-shanghai.nas.aliyuncs.com</p>
         */
        public Builder serverAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }

        /**
         * <p>The user ID for local mounting.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
