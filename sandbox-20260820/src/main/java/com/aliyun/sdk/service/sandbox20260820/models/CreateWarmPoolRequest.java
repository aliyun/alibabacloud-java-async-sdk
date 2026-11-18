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
 * {@link CreateWarmPoolRequest} extends {@link RequestModel}
 *
 * <p>CreateWarmPoolRequest</p>
 */
public class CreateWarmPoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateWarmPoolInput body;

    private CreateWarmPoolRequest(Builder builder) {
        super(builder);
        this.teamID = builder.teamID;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWarmPoolRequest create() {
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
     * @return body
     */
    public CreateWarmPoolInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateWarmPoolRequest, Builder> {
        private String teamID; 
        private CreateWarmPoolInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateWarmPoolRequest request) {
            super(request);
            this.teamID = request.teamID;
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
         * <p>The request body, which contains the warm pool configuration.</p>
         */
        public Builder body(CreateWarmPoolInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateWarmPoolRequest build() {
            return new CreateWarmPoolRequest(this);
        } 

    } 

}
