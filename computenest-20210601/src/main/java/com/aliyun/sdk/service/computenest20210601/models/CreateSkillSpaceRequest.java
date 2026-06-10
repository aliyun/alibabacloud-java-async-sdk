// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateSkillSpaceRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillSpaceRequest</p>
 */
public class CreateSkillSpaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillSpaceDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillSpaceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillSpaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillSpaceName;

    private CreateSkillSpaceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.skillSpaceDescription = builder.skillSpaceDescription;
        this.skillSpaceName = builder.skillSpaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillSpaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return skillSpaceDescription
     */
    public String getSkillSpaceDescription() {
        return this.skillSpaceDescription;
    }

    /**
     * @return skillSpaceName
     */
    public String getSkillSpaceName() {
        return this.skillSpaceName;
    }

    public static final class Builder extends Request.Builder<CreateSkillSpaceRequest, Builder> {
        private String clientToken; 
        private String skillSpaceDescription; 
        private String skillSpaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillSpaceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.skillSpaceDescription = request.skillSpaceDescription;
            this.skillSpaceName = request.skillSpaceName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder skillSpaceDescription(String skillSpaceDescription) {
            this.putQueryParameter("SkillSpaceDescription", skillSpaceDescription);
            this.skillSpaceDescription = skillSpaceDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder skillSpaceName(String skillSpaceName) {
            this.putQueryParameter("SkillSpaceName", skillSpaceName);
            this.skillSpaceName = skillSpaceName;
            return this;
        }

        @Override
        public CreateSkillSpaceRequest build() {
            return new CreateSkillSpaceRequest(this);
        } 

    } 

}
