// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallGlobalAppResponseBody} extends {@link TeaModel}
 *
 * <p>InstallGlobalAppResponseBody</p>
 */
public class InstallGlobalAppResponseBody extends TeaModel {
    @NameInMap("HostId")
    private String hostId;

    @NameInMap("InstalledAppName")
    private String installedAppName;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Workspace")
    private String workspace;

    private InstallGlobalAppResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.installedAppName = builder.installedAppName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallGlobalAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return installedAppName
     */
    public String getInstalledAppName() {
        return this.installedAppName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String hostId; 
        private String installedAppName; 
        private String regionId; 
        private String requestId; 
        private String workspace; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * InstalledAppName.
         */
        public Builder installedAppName(String installedAppName) {
            this.installedAppName = installedAppName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public InstallGlobalAppResponseBody build() {
            return new InstallGlobalAppResponseBody(this);
        } 

    } 

}
