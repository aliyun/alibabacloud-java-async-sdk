// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link UpdatePerspectiveRequest} extends {@link RequestModel}
 *
 * <p>UpdatePerspectiveRequest</p>
 */
public class UpdatePerspectiveRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerspectiveId")
    private String perspectiveId;

    private UpdatePerspectiveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.name = builder.name;
        this.perspectiveId = builder.perspectiveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePerspectiveRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return perspectiveId
     */
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    public static final class Builder extends Request.Builder<UpdatePerspectiveRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String name; 
        private String perspectiveId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePerspectiveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.name = request.name;
            this.perspectiveId = request.perspectiveId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business space key. If not specified, the default business space is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The perspective name. The name can be up to 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Client perspective</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The perspective ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        public Builder perspectiveId(String perspectiveId) {
            this.putQueryParameter("PerspectiveId", perspectiveId);
            this.perspectiveId = perspectiveId;
            return this;
        }

        @Override
        public UpdatePerspectiveRequest build() {
            return new UpdatePerspectiveRequest(this);
        } 

    } 

}
