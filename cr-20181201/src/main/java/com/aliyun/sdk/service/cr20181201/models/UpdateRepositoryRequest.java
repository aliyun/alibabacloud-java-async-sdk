// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link UpdateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepositoryRequest</p>
 */
public class UpdateRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Summary")
    @com.aliyun.core.annotation.Validation(required = true)
    private String summary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagImmutability")
    private Boolean tagImmutability;

    private UpdateRepositoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.detail = builder.detail;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.repoType = builder.repoType;
        this.summary = builder.summary;
        this.tagImmutability = builder.tagImmutability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepositoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return repoType
     */
    public String getRepoType() {
        return this.repoType;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return tagImmutability
     */
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

    public static final class Builder extends Request.Builder<UpdateRepositoryRequest, Builder> {
        private String regionId; 
        private String detail; 
        private String instanceId; 
        private String repoId; 
        private String repoName; 
        private String repoNamespaceName; 
        private String repoType; 
        private String summary; 
        private Boolean tagImmutability; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepositoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.detail = request.detail;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.repoName = request.repoName;
            this.repoNamespaceName = request.repoNamespaceName;
            this.repoType = request.repoType;
            this.summary = request.summary;
            this.tagImmutability = request.tagImmutability;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The repository description.</p>
         * 
         * <strong>example:</strong>
         * <p>repo-for-test</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The repository ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-tquyps22md8p****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>dsp/domain-microapp</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The name of the repository namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>ejiayou-other</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>The repository type. Valid values:</p>
         * <ul>
         * <li><p><code>PUBLIC</code>: public repository</p>
         * </li>
         * <li><p><code>PRIVATE</code>: private repository.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder repoType(String repoType) {
            this.putQueryParameter("RepoType", repoType);
            this.repoType = repoType;
            return this;
        }

        /**
         * <p>The summary.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test repo</p>
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        /**
         * <p>Specifies whether image tag immutability is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder tagImmutability(Boolean tagImmutability) {
            this.putQueryParameter("TagImmutability", tagImmutability);
            this.tagImmutability = tagImmutability;
            return this;
        }

        @Override
        public UpdateRepositoryRequest build() {
            return new UpdateRepositoryRequest(this);
        } 

    } 

}
