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
 * {@link CreateBranchRequest} extends {@link RequestModel}
 *
 * <p>CreateBranchRequest</p>
 */
public class CreateBranchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitSource")
    private String initSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentBranchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentBranchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentLsn")
    private String parentLsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTimestamp")
    private String parentTimestamp;

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

    private CreateBranchRequest(Builder builder) {
        super(builder);
        this.branchName = builder.branchName;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.expiresAt = builder.expiresAt;
        this.initSource = builder.initSource;
        this.parentBranchId = builder.parentBranchId;
        this.parentLsn = builder.parentLsn;
        this.parentTimestamp = builder.parentTimestamp;
        this.projectId = builder.projectId;
        this._protected = builder._protected;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBranchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return initSource
     */
    public String getInitSource() {
        return this.initSource;
    }

    /**
     * @return parentBranchId
     */
    public String getParentBranchId() {
        return this.parentBranchId;
    }

    /**
     * @return parentLsn
     */
    public String getParentLsn() {
        return this.parentLsn;
    }

    /**
     * @return parentTimestamp
     */
    public String getParentTimestamp() {
        return this.parentTimestamp;
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

    public static final class Builder extends Request.Builder<CreateBranchRequest, Builder> {
        private String branchName; 
        private String clientToken; 
        private String description; 
        private String expiresAt; 
        private String initSource; 
        private String parentBranchId; 
        private String parentLsn; 
        private String parentTimestamp; 
        private String projectId; 
        private Boolean _protected; 
        private String regionId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateBranchRequest request) {
            super(request);
            this.branchName = request.branchName;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.expiresAt = request.expiresAt;
            this.initSource = request.initSource;
            this.parentBranchId = request.parentBranchId;
            this.parentLsn = request.parentLsn;
            this.parentTimestamp = request.parentTimestamp;
            this.projectId = request.projectId;
            this._protected = request._protected;
            this.regionId = request.regionId;
            this.tag = request.tag;
        } 

        /**
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExpiresAt.
         */
        public Builder expiresAt(String expiresAt) {
            this.putQueryParameter("ExpiresAt", expiresAt);
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * InitSource.
         */
        public Builder initSource(String initSource) {
            this.putQueryParameter("InitSource", initSource);
            this.initSource = initSource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>br-main</p>
         */
        public Builder parentBranchId(String parentBranchId) {
            this.putQueryParameter("ParentBranchId", parentBranchId);
            this.parentBranchId = parentBranchId;
            return this;
        }

        /**
         * ParentLsn.
         */
        public Builder parentLsn(String parentLsn) {
            this.putQueryParameter("ParentLsn", parentLsn);
            this.parentLsn = parentLsn;
            return this;
        }

        /**
         * ParentTimestamp.
         */
        public Builder parentTimestamp(String parentTimestamp) {
            this.putQueryParameter("ParentTimestamp", parentTimestamp);
            this.parentTimestamp = parentTimestamp;
            return this;
        }

        /**
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
         * Protected.
         */
        public Builder _protected(Boolean _protected) {
            this.putQueryParameter("Protected", _protected);
            this._protected = _protected;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateBranchRequest build() {
            return new CreateBranchRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBranchRequest} extends {@link TeaModel}
     *
     * <p>CreateBranchRequest</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
