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
 * {@link UpdateRepoTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoTriggerRequest</p>
 */
public class UpdateRepoTriggerRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TriggerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerName")
    private String triggerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerTag")
    private String triggerTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    private String triggerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerUrl")
    private String triggerUrl;

    private UpdateRepoTriggerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.repoId = builder.repoId;
        this.triggerId = builder.triggerId;
        this.triggerName = builder.triggerName;
        this.triggerTag = builder.triggerTag;
        this.triggerType = builder.triggerType;
        this.triggerUrl = builder.triggerUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoTriggerRequest create() {
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
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
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

    public static final class Builder extends Request.Builder<UpdateRepoTriggerRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String repoId; 
        private String triggerId; 
        private String triggerName; 
        private String triggerTag; 
        private String triggerType; 
        private String triggerUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepoTriggerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.repoId = request.repoId;
            this.triggerId = request.triggerId;
            this.triggerName = request.triggerName;
            this.triggerTag = request.triggerTag;
            this.triggerType = request.triggerType;
            this.triggerUrl = request.triggerUrl;
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
         * <p>The ID of the instance.</p>
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
         * <p>The ID of the image repository.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the trigger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crw-k7bdx4kt52ty****</p>
         */
        public Builder triggerId(String triggerId) {
            this.putQueryParameter("TriggerId", triggerId);
            this.triggerId = triggerId;
            return this;
        }

        /**
         * <p>The name of the trigger.</p>
         * <p>You can specify the TriggerName or TriggerUrl parameter. The TriggerName parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>test_trigger</p>
         */
        public Builder triggerName(String triggerName) {
            this.putQueryParameter("TriggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>The image tag based on which the trigger is set.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
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
         * <li><code>TAG_LISTTAG</code>: a tag-based trigger.</li>
         * <li><code>TAG_REG_EXP</code>: a regular expression-based trigger.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TAG_LIST</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * <p>The URL of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.test.com">https://www.test.com</a></p>
         */
        public Builder triggerUrl(String triggerUrl) {
            this.putQueryParameter("TriggerUrl", triggerUrl);
            this.triggerUrl = triggerUrl;
            return this;
        }

        @Override
        public UpdateRepoTriggerRequest build() {
            return new UpdateRepoTriggerRequest(this);
        } 

    } 

}
