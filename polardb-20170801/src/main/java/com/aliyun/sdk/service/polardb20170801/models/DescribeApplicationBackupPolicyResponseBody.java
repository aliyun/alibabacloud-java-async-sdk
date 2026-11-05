// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationBackupPolicyResponseBody</p>
 */
public class DescribeApplicationBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupRetentionPeriod")
    private Integer preferredBackupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationBackupPolicyResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupRetentionPeriod = builder.preferredBackupRetentionPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupRetentionPeriod
     */
    public Integer getPreferredBackupRetentionPeriod() {
        return this.preferredBackupRetentionPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private String applicationType; 
        private String preferredBackupPeriod; 
        private Integer preferredBackupRetentionPeriod; 
        private String preferredBackupTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationBackupPolicyResponseBody model) {
            this.applicationId = model.applicationId;
            this.applicationType = model.applicationType;
            this.preferredBackupPeriod = model.preferredBackupPeriod;
            this.preferredBackupRetentionPeriod = model.preferredBackupRetentionPeriod;
            this.preferredBackupTime = model.preferredBackupTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The application type, such as polarclaw.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclaw</p>
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>The days of the week when automatic backups are performed. Separate multiple values with commas. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The retention period of level-1 backups, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder preferredBackupRetentionPeriod(Integer preferredBackupRetentionPeriod) {
            this.preferredBackupRetentionPeriod = preferredBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The time window when automatic backups are performed. The time follows the HH:mmZ-HH:mmZ format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00Z-08:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationBackupPolicyResponseBody build() {
            return new DescribeApplicationBackupPolicyResponseBody(this);
        } 

    } 

}
