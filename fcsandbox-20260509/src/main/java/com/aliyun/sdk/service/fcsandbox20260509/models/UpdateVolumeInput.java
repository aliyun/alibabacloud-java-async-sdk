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
 * {@link UpdateVolumeInput} extends {@link TeaModel}
 *
 * <p>UpdateVolumeInput</p>
 */
public class UpdateVolumeInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private UpdateVolumeInput(Builder builder) {
        this.status = builder.status;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVolumeInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder {
        private String status; 
        private String teamID; 

        private Builder() {
        } 

        private Builder(UpdateVolumeInput model) {
            this.status = model.status;
            this.teamID = model.teamID;
        } 

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public UpdateVolumeInput build() {
            return new UpdateVolumeInput(this);
        } 

    } 

}
