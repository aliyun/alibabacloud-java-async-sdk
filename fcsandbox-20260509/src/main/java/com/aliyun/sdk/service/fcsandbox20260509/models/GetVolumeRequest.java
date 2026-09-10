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
 * {@link GetVolumeRequest} extends {@link RequestModel}
 *
 * <p>GetVolumeRequest</p>
 */
public class GetVolumeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("volumeID")
    private String volumeID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private GetVolumeRequest(Builder builder) {
        super(builder);
        this.volumeID = builder.volumeID;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVolumeRequest create() {
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
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder extends Request.Builder<GetVolumeRequest, Builder> {
        private String volumeID; 
        private String teamID; 

        private Builder() {
            super();
        } 

        private Builder(GetVolumeRequest request) {
            super(request);
            this.volumeID = request.volumeID;
            this.teamID = request.teamID;
        } 

        /**
         * <p>The unique identifier of the volume.</p>
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
         * <p>The unique identifier of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        @Override
        public GetVolumeRequest build() {
            return new GetVolumeRequest(this);
        } 

    } 

}
