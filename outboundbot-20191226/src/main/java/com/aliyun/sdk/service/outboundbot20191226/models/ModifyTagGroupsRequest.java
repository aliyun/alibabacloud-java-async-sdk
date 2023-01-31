// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTagGroupsRequest} extends {@link RequestModel}
 *
 * <p>ModifyTagGroupsRequest</p>
 */
public class ModifyTagGroupsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    @Query
    @NameInMap("TagGroups")
    @Validation(required = true)
    private String tagGroups;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private String tags;

    private ModifyTagGroupsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.tagGroups = builder.tagGroups;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTagGroupsRequest create() {
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return tagGroups
     */
    public String getTagGroups() {
        return this.tagGroups;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ModifyTagGroupsRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private String tagGroups; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTagGroupsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.tagGroups = request.tagGroups;
            this.tags = request.tags;
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
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * TagGroups.
         */
        public Builder tagGroups(String tagGroups) {
            this.putQueryParameter("TagGroups", tagGroups);
            this.tagGroups = tagGroups;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ModifyTagGroupsRequest build() {
            return new ModifyTagGroupsRequest(this);
        } 

    } 

}
