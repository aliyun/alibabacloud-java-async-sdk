// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverClusterRequest} extends {@link RequestModel}
 *
 * <p>RecoverClusterRequest</p>
 */
public class RecoverClusterRequest extends Request {
    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("ClientVersion")
    private String clientVersion;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("OsTag")
    private String osTag;

    @Query
    @NameInMap("SchedulerType")
    private String schedulerType;

    private RecoverClusterRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.clientVersion = builder.clientVersion;
        this.clusterId = builder.clusterId;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.osTag = builder.osTag;
        this.schedulerType = builder.schedulerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return osTag
     */
    public String getOsTag() {
        return this.osTag;
    }

    /**
     * @return schedulerType
     */
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public static final class Builder extends Request.Builder<RecoverClusterRequest, Builder> {
        private String accountType; 
        private String clientVersion; 
        private String clusterId; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String osTag; 
        private String schedulerType; 

        private Builder() {
            super();
        } 

        private Builder(RecoverClusterRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.clientVersion = request.clientVersion;
            this.clusterId = request.clusterId;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.osTag = request.osTag;
            this.schedulerType = request.schedulerType;
        } 

        /**
         * The service type of the domain account. Valid values:
         * <p>
         * 
         * *   nis
         * *   ldap
         * 
         * Default value: nis
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * The version of the E-HPC client. The default value is the latest version of the client.
         * <p>
         * 
         * You can call the [ListCurrentClientVersion](~~87223~~) operation to query the current version of the E-HPC client.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * The ID of the cluster. The cluster must be in the Exception state.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID and status.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the image.
         * <p>
         * 
         * You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the images that are supported by E-HPC.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   system: public image
         * *   self: custom image
         * *   others: shared image
         * 
         * Default value: system
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * The image tag of the operating system.
         * <p>
         * 
         * You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image tags supported by Elastic High Performance Computing (E-HPC).
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * The type of the scheduler. Valid values:
         * <p>
         * 
         * *   pbs
         * *   slurm
         * *   opengridscheduler
         * *   deadline
         * 
         * Default value: pbs
         */
        public Builder schedulerType(String schedulerType) {
            this.putQueryParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        @Override
        public RecoverClusterRequest build() {
            return new RecoverClusterRequest(this);
        } 

    } 

}
