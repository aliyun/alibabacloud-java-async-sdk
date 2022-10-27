// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MountNFSRequest} extends {@link RequestModel}
 *
 * <p>MountNFSRequest</p>
 */
public class MountNFSRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MountDir")
    @Validation(required = true)
    private String mountDir;

    @Query
    @NameInMap("NfsDir")
    @Validation(required = true)
    private String nfsDir;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("RemoteDir")
    private String remoteDir;

    private MountNFSRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mountDir = builder.mountDir;
        this.nfsDir = builder.nfsDir;
        this.protocolType = builder.protocolType;
        this.remoteDir = builder.remoteDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MountNFSRequest create() {
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
     * @return mountDir
     */
    public String getMountDir() {
        return this.mountDir;
    }

    /**
     * @return nfsDir
     */
    public String getNfsDir() {
        return this.nfsDir;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return remoteDir
     */
    public String getRemoteDir() {
        return this.remoteDir;
    }

    public static final class Builder extends Request.Builder<MountNFSRequest, Builder> {
        private String instanceId; 
        private String mountDir; 
        private String nfsDir; 
        private String protocolType; 
        private String remoteDir; 

        private Builder() {
            super();
        } 

        private Builder(MountNFSRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mountDir = request.mountDir;
            this.nfsDir = request.nfsDir;
            this.protocolType = request.protocolType;
            this.remoteDir = request.remoteDir;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MountDir.
         */
        public Builder mountDir(String mountDir) {
            this.putQueryParameter("MountDir", mountDir);
            this.mountDir = mountDir;
            return this;
        }

        /**
         * NfsDir.
         */
        public Builder nfsDir(String nfsDir) {
            this.putQueryParameter("NfsDir", nfsDir);
            this.nfsDir = nfsDir;
            return this;
        }

        /**
         * ProtocolType.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * RemoteDir.
         */
        public Builder remoteDir(String remoteDir) {
            this.putQueryParameter("RemoteDir", remoteDir);
            this.remoteDir = remoteDir;
            return this;
        }

        @Override
        public MountNFSRequest build() {
            return new MountNFSRequest(this);
        } 

    } 

}
