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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private SaveSuspEventUserSettingRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.levelsOn = builder.levelsOn;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<SaveSuspEventUserSettingRequest, Builder> {
        private String from; 
        private String levelsOn; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(SaveSuspEventUserSettingRequest request) {
            super(request);
            this.from = request.from;
            this.levelsOn = request.levelsOn;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The source of the exception event data. Set the value to sas.</p>
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
         * <p>The alert level for alert notifications. Valid values:</p>
         * <ul>
         * <li><strong>remind</strong>: Reminder.</li>
         * <li><strong>suspicious</strong>: Suspicious.</li>
         * <li><strong>serious</strong>: Urgent.</li>
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

        /**
         * <p>The ID of the member account in the resource directory.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public SaveSuspEventUserSettingRequest build() {
            return new SaveSuspEventUserSettingRequest(this);
        } 

    } 

}
