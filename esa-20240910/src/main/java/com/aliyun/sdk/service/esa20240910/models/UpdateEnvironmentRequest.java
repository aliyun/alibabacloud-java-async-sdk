// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentRequest</p>
 */
public class UpdateEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewName")
    private String newName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnly")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean readOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private UpdateEnvironmentRequest(Builder builder) {
        super(builder);
        this.environmentName = builder.environmentName;
        this.newName = builder.newName;
        this.readOnly = builder.readOnly;
        this.rule = builder.rule;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentName
     */
    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * @return newName
     */
    public String getNewName() {
        return this.newName;
    }

    /**
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentRequest, Builder> {
        private String environmentName; 
        private String newName; 
        private Boolean readOnly; 
        private String rule; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentRequest request) {
            super(request);
            this.environmentName = request.environmentName;
            this.newName = request.newName;
            this.readOnly = request.readOnly;
            this.rule = request.rule;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder environmentName(String environmentName) {
            this.putQueryParameter("EnvironmentName", environmentName);
            this.environmentName = environmentName;
            return this;
        }

        /**
         * NewName.
         */
        public Builder newName(String newName) {
            this.putQueryParameter("NewName", newName);
            this.newName = newName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder readOnly(Boolean readOnly) {
            this.putQueryParameter("ReadOnly", readOnly);
            this.readOnly = readOnly;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public UpdateEnvironmentRequest build() {
            return new UpdateEnvironmentRequest(this);
        } 

    } 

}
