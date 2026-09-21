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
 * {@link UpdateVolumeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVolumeRequest</p>
 */
public class UpdateVolumeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("volumeID")
    private String volumeID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateVolumeInput body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private UpdateVolumeRequest(Builder builder) {
        super(builder);
        this.volumeID = builder.volumeID;
        this.body = builder.body;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVolumeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return volumeID
     */
    public String getVolumeID() {
        return this.volumeID;
    }

    /**
     * @return body
     */
    public UpdateVolumeInput getBody() {
        return this.body;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder extends Request.Builder<UpdateVolumeRequest, Builder> {
        private String volumeID; 
        private UpdateVolumeInput body; 
        private String teamID; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVolumeRequest request) {
            super(request);
            this.volumeID = request.volumeID;
            this.body = request.body;
            this.teamID = request.teamID;
        } 

        /**
         * volumeID.
         */
        public Builder volumeID(String volumeID) {
            this.putPathParameter("volumeID", volumeID);
            this.volumeID = volumeID;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateVolumeInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        @Override
        public UpdateVolumeRequest build() {
            return new UpdateVolumeRequest(this);
        } 

    } 

}
