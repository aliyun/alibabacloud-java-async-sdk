// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link SaveSuspEventUserSettingRequest} extends {@link RequestModel}
 *
 * <p>SaveSuspEventUserSettingRequest</p>
 */
public class SaveSuspEventUserSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LevelsOn")
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
         * <p>The data source of the exception. Set the value to sas.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The severities of alert notifications. Valid values:</p>
         * <ul>
         * <li><strong>remind</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>serious</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>suspicious,serious,remind</p>
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
