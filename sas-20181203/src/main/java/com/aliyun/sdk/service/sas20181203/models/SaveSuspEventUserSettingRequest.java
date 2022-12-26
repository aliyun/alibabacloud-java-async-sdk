// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSuspEventUserSettingRequest} extends {@link RequestModel}
 *
 * <p>SaveSuspEventUserSettingRequest</p>
 */
public class SaveSuspEventUserSettingRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("LevelsOn")
    private String levelsOn;

    private SaveSuspEventUserSettingRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.levelsOn = builder.levelsOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSuspEventUserSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return levelsOn
     */
    public String getLevelsOn() {
        return this.levelsOn;
    }

    public static final class Builder extends Request.Builder<SaveSuspEventUserSettingRequest, Builder> {
        private String from; 
        private String levelsOn; 

        private Builder() {
            super();
        } 

        private Builder(SaveSuspEventUserSettingRequest request) {
            super(request);
            this.from = request.from;
            this.levelsOn = request.levelsOn;
        } 

        /**
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * LevelsOn.
         */
        public Builder levelsOn(String levelsOn) {
            this.putQueryParameter("LevelsOn", levelsOn);
            this.levelsOn = levelsOn;
            return this;
        }

        @Override
        public SaveSuspEventUserSettingRequest build() {
            return new SaveSuspEventUserSettingRequest(this);
        } 

    } 

}
