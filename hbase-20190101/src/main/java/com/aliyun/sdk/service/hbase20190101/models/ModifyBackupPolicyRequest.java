// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupEndTimeUTC")
    private String preferredBackupEndTimeUTC;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupStartTimeUTC")
    private String preferredBackupStartTimeUTC;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preferredBackupTime;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.preferredBackupEndTimeUTC = builder.preferredBackupEndTimeUTC;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupStartTimeUTC = builder.preferredBackupStartTimeUTC;
        this.preferredBackupTime = builder.preferredBackupTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return preferredBackupEndTimeUTC
     */
    public String getPreferredBackupEndTimeUTC() {
        return this.preferredBackupEndTimeUTC;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupStartTimeUTC
     */
    public String getPreferredBackupStartTimeUTC() {
        return this.preferredBackupStartTimeUTC;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private String clusterId; 
        private String preferredBackupEndTimeUTC; 
        private String preferredBackupPeriod; 
        private String preferredBackupStartTimeUTC; 
        private String preferredBackupTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.preferredBackupEndTimeUTC = request.preferredBackupEndTimeUTC;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupStartTimeUTC = request.preferredBackupStartTimeUTC;
            this.preferredBackupTime = request.preferredBackupTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-t4naqsay5gn****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The UTC time when the backup ends.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z</p>
         */
        public Builder preferredBackupEndTimeUTC(String preferredBackupEndTimeUTC) {
            this.putQueryParameter("PreferredBackupEndTimeUTC", preferredBackupEndTimeUTC);
            this.preferredBackupEndTimeUTC = preferredBackupEndTimeUTC;
            return this;
        }

        /**
         * <p>The backup cycle. Valid values:</p>
         * <ul>
         * <li>Monday: performs backup every Monday.</li>
         * <li>Tuesday: performs backup every Tuesday.</li>
         * <li>Wednesday: performs backup every Wednesday.</li>
         * <li>Thursday: performs backup every Thursday.</li>
         * <li>Friday: performs backup every Friday.</li>
         * <li>Saturday: performs backup every Saturday.</li>
         * <li>Sunday: performs backup every Sunday.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Thursday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The UTC time when the backup starts.</p>
         * 
         * <strong>example:</strong>
         * <p>17:00Z</p>
         */
        public Builder preferredBackupStartTimeUTC(String preferredBackupStartTimeUTC) {
            this.putQueryParameter("PreferredBackupStartTimeUTC", preferredBackupStartTimeUTC);
            this.preferredBackupStartTimeUTC = preferredBackupStartTimeUTC;
            return this;
        }

        /**
         * <p>The backup time range in the current time zone. The interval is 1 hour.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00-02:00</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
