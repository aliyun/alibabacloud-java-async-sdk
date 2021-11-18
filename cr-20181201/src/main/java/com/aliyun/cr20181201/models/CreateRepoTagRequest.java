// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoTagRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTagRequest</p>
 */
public class CreateRepoTagRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("FromTag")
    private String fromTag;

    @Query
    @NameInMap("ToTag")
    private String toTag;


    private CreateRepoTagRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.namespaceName = builder.namespaceName;
        this.repoName = builder.repoName;
        this.fromTag = builder.fromTag;
        this.toTag = builder.toTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTagRequest create() {
        return builder().build();
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
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return fromTag
     */
    public String getFromTag() {
        return this.fromTag;
    }

    /**
     * @return toTag
     */
    public String getToTag() {
        return this.toTag;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String regionId; 
        private String namespaceName; 
        private String repoName; 
        private String fromTag; 
        private String toTag; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Geographical</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Namespace name</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>Image repository name</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>SOURCE image version</p>
         */
        public Builder fromTag(String fromTag) {
            this.putQueryParameter("FromTag", fromTag);
            this.fromTag = fromTag;
            return this;
        }

        /**
         * <p>Target image version</p>
         */
        public Builder toTag(String toTag) {
            this.putQueryParameter("ToTag", toTag);
            this.toTag = toTag;
            return this;
        }

        public CreateRepoTagRequest build() {
            return new CreateRepoTagRequest(this);
        } 

    } 

}
