// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link UpdateWarmPoolRequest} extends {@link RequestModel}
 *
 * <p>UpdateWarmPoolRequest</p>
 */
public class UpdateWarmPoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateWarmPoolInput body;

    private UpdateWarmPoolRequest(Builder builder) {
        super(builder);
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWarmPoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return body
     */
    public UpdateWarmPoolInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateWarmPoolRequest, Builder> {
        private String teamID; 
        private String templateID; 
        private UpdateWarmPoolInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWarmPoolRequest request) {
            super(request);
            this.teamID = request.teamID;
            this.templateID = request.templateID;
            this.body = request.body;
        } 

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-example1234567890</p>
         */
        public Builder teamID(String teamID) {
            this.putPathParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The ID of the template associated with the warm pool.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-example1234567890</p>
         */
        public Builder templateID(String templateID) {
            this.putPathParameter("templateID", templateID);
            this.templateID = templateID;
            return this;
        }

        /**
         * <p>The request body, which contains the warm pool configuration.</p>
         */
        public Builder body(UpdateWarmPoolInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateWarmPoolRequest build() {
            return new UpdateWarmPoolRequest(this);
        } 

    } 

}
