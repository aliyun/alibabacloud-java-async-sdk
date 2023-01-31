// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTagRequest} extends {@link RequestModel}
 *
 * <p>CreateTagRequest</p>
 */
public class CreateTagRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    @Query
    @NameInMap("TagGroup")
    @Validation(required = true)
    private String tagGroup;

    @Query
    @NameInMap("TagName")
    @Validation(required = true)
    private String tagName;

    private CreateTagRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.tagGroup = builder.tagGroup;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTagRequest create() {
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
     * @return tagGroup
     */
    public String getTagGroup() {
        return this.tagGroup;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<CreateTagRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private String tagGroup; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTagRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.tagGroup = request.tagGroup;
            this.tagName = request.tagName;
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
         * TagGroup.
         */
        public Builder tagGroup(String tagGroup) {
            this.putQueryParameter("TagGroup", tagGroup);
            this.tagGroup = tagGroup;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public CreateTagRequest build() {
            return new CreateTagRequest(this);
        } 

    } 

}
