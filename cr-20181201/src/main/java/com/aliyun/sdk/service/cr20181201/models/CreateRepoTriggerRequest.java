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
 * {@link CreateRepoTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTriggerRequest</p>
 */
public class CreateRepoTriggerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerTag")
    private String triggerTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerUrl;

    private CreateRepoTriggerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.triggerName = builder.triggerName;
        this.triggerTag = builder.triggerTag;
        this.triggerType = builder.triggerType;
        this.triggerUrl = builder.triggerUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTriggerRequest create() {
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
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerTag
     */
    public String getTriggerTag() {
        return this.triggerTag;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return triggerUrl
     */
    public String getTriggerUrl() {
        return this.triggerUrl;
    }

    public static final class Builder extends Request.Builder<CreateRepoTriggerRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String repoId; 
        private String triggerName; 
        private String triggerTag; 
        private String triggerType; 
        private String triggerUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoTriggerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.triggerName = request.triggerName;
            this.triggerTag = request.triggerTag;
            this.triggerType = request.triggerType;
            this.triggerUrl = request.triggerUrl;
        } 

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-xwvi3osiy4ff****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The name of the trigger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger1</p>
         */
        public Builder triggerName(String triggerName) {
            this.putQueryParameter("TriggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>The image tag based on which the trigger is set.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If <code>TriggerType</code> is set to <code>ALL</code>, <code>TriggerTag</code> can be set to a string or an array, for example, <code>*</code>.</p>
         * </li>
         * <li><p>If <code>TriggerType</code> is set to <code>TAG_LIST</code>, <code>TriggerTag</code> must be set to an array, for example, <code>[1]</code>.</p>
         * </li>
         * <li><p>If <code>TriggerType</code> is set to <code>TAG_REG_EXP</code>, <code>TriggerTag</code> must be set to a string, for example, <code>*</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[1]</p>
         */
        public Builder triggerTag(String triggerTag) {
            this.putQueryParameter("TriggerTag", triggerTag);
            this.triggerTag = triggerTag;
            return this;
        }

        /**
         * <p>The type of the trigger. Valid values:</p>
         * <ul>
         * <li><code>ALL</code>: a trigger that supports both tags and regular expressions.</li>
         * <li><code>TAG_LIST</code>: a tag-based trigger.</li>
         * <li><code>TAG_REG_EXP</code>: a regular expression-based trigger.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * <p>The URL of the trigger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.mysite.com">http://www.mysite.com</a></p>
         */
        public Builder triggerUrl(String triggerUrl) {
            this.putQueryParameter("TriggerUrl", triggerUrl);
            this.triggerUrl = triggerUrl;
            return this;
        }

        @Override
        public CreateRepoTriggerRequest build() {
            return new CreateRepoTriggerRequest(this);
        } 

    } 

}
