// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link UpdateTeamRequest} extends {@link RequestModel}
 *
 * <p>UpdateTeamRequest</p>
 */
public class UpdateTeamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateTeamInput body;

    private UpdateTeamRequest(Builder builder) {
        super(builder);
        this.teamID = builder.teamID;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTeamRequest create() {
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
    public UpdateTeamInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateTeamRequest, Builder> {
        private String teamID; 
        private UpdateTeamInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTeamRequest request) {
            super(request);
            this.teamID = request.teamID;
            this.body = request.body;
        } 

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.putPathParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateTeamInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateTeamRequest build() {
            return new UpdateTeamRequest(this);
        } 

    } 

}
