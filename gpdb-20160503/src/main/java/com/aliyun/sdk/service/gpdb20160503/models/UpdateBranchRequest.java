// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link UpdateBranchRequest} extends {@link RequestModel}
 *
 * <p>UpdateBranchRequest</p>
 */
public class UpdateBranchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClearExpiresAt")
    private Boolean clearExpiresAt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protected")
    private Boolean _protected;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private UpdateBranchRequest(Builder builder) {
        super(builder);
        this.branchId = builder.branchId;
        this.branchName = builder.branchName;
        this.clearExpiresAt = builder.clearExpiresAt;
        this.description = builder.description;
        this.expiresAt = builder.expiresAt;
        this.projectId = builder.projectId;
        this._protected = builder._protected;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBranchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchId
     */
    public String getBranchId() {
        return this.branchId;
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return clearExpiresAt
     */
    public Boolean getClearExpiresAt() {
        return this.clearExpiresAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expiresAt
     */
    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return _protected
     */
    public Boolean get_protected() {
        return this._protected;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<UpdateBranchRequest, Builder> {
        private String branchId; 
        private String branchName; 
        private Boolean clearExpiresAt; 
        private String description; 
        private String expiresAt; 
        private String projectId; 
        private Boolean _protected; 
        private String regionId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBranchRequest request) {
            super(request);
            this.branchId = request.branchId;
            this.branchName = request.branchName;
            this.clearExpiresAt = request.clearExpiresAt;
            this.description = request.description;
            this.expiresAt = request.expiresAt;
            this.projectId = request.projectId;
            this._protected = request._protected;
            this.regionId = request.regionId;
            this.tag = request.tag;
        } 

        /**
         * <p>The branch ID that uniquely identifies a Supabase branch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>br-xxxx</p>
         */
        public Builder branchId(String branchId) {
            this.putQueryParameter("BranchId", branchId);
            this.branchId = branchId;
            return this;
        }

        /**
         * <p>The branch name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder branchName(String branchName) {
            this.putQueryParameter("BranchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>Specifies whether to clear the branch expiration time.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Clears ExpiresAt.</li>
         * <li>false: Does not clear ExpiresAt.</li>
         * </ul>
         * <p>If this parameter is not specified, the existing expiration time remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder clearExpiresAt(Boolean clearExpiresAt) {
            this.putQueryParameter("ClearExpiresAt", clearExpiresAt);
            this.clearExpiresAt = clearExpiresAt;
            return this;
        }

        /**
         * <p>The branch description.</p>
         * 
         * <strong>example:</strong>
         * <p>test branch</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the branch automatically expires and is deleted. The value is in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-08T09:11:12Z</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.putQueryParameter("ExpiresAt", expiresAt);
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The Supabase project ID that corresponds to the primary branch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spb-xxxx</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Specifies whether to enable branch protection.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Branch protection is enabled.</li>
         * <li>false: Branch protection is disabled. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder _protected(Boolean _protected) {
            this.putQueryParameter("Protected", _protected);
            this._protected = _protected;
            return this;
        }

        /**
         * <p>The region ID. This parameter is required when you create a primary branch. When you create a sub-branch, the region of the primary branch is inherited by default.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of branch tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public UpdateBranchRequest build() {
            return new UpdateBranchRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBranchRequest} extends {@link TeaModel}
     *
     * <p>UpdateBranchRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
