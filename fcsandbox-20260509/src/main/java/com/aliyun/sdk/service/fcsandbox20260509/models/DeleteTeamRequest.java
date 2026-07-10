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
 * {@link DeleteTeamRequest} extends {@link RequestModel}
 *
 * <p>DeleteTeamRequest</p>
 */
public class DeleteTeamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private DeleteTeamRequest(Builder builder) {
        super(builder);
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTeamRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTeamRequest, Builder> {
        private String teamID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTeamRequest request) {
            super(request);
            this.teamID = request.teamID;
        } 

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.putPathParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        @Override
        public DeleteTeamRequest build() {
            return new DeleteTeamRequest(this);
        } 

    } 

}
