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
         * <p>The unique identifier of the storage volume.</p>
         * 
         * <strong>example:</strong>
         * <p>82c8c42e-cf7a-46d0-8b58-9024409c1579</p>
         */
        public Builder volumeID(String volumeID) {
            this.putPathParameter("volumeID", volumeID);
            this.volumeID = volumeID;
            return this;
        }

        /**
         * <p>The request parameters for updating the storage volume.</p>
         */
        public Builder body(UpdateVolumeInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The ID of the team to which the storage volume belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>9f5a1fe9-****</p>
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
