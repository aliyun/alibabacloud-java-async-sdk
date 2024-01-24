// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetBackupLocalRequest} extends {@link RequestModel}
 *
 * <p>SetBackupLocalRequest</p>
 */
public class SetBackupLocalRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("HighSpaceUsageProtection")
    private String highSpaceUsageProtection;

    @Query
    @NameInMap("LocalLogRetentionHours")
    private String localLogRetentionHours;

    @Query
    @NameInMap("LocalLogRetentionSpace")
    private String localLogRetentionSpace;

    private SetBackupLocalRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
        this.localLogRetentionHours = builder.localLogRetentionHours;
        this.localLogRetentionSpace = builder.localLogRetentionSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetBackupLocalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return highSpaceUsageProtection
     */
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    /**
     * @return localLogRetentionHours
     */
    public String getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    /**
     * @return localLogRetentionSpace
     */
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    public static final class Builder extends Request.Builder<SetBackupLocalRequest, Builder> {
        private String drdsInstanceId; 
        private String highSpaceUsageProtection; 
        private String localLogRetentionHours; 
        private String localLogRetentionSpace; 

        private Builder() {
            super();
        } 

        private Builder(SetBackupLocalRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.highSpaceUsageProtection = request.highSpaceUsageProtection;
            this.localLogRetentionHours = request.localLogRetentionHours;
            this.localLogRetentionSpace = request.localLogRetentionSpace;
        } 

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * Specifies whether to enable the feature to forcibly delete binary log files if the used storage space reaches 90% of the total storage space or the remaining storage space is less than 5 GB. Valid values: 1 and 0. A value of 1 specifies to enable this feature. A value of 0 specifies not to enable this feature.
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.putQueryParameter("HighSpaceUsageProtection", highSpaceUsageProtection);
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * The number of hours for which log backup files are retained on the instance. Valid values: 0 to 168. Default value: 18. A value of 0 indicates that log backup files are not retained.
         */
        public Builder localLogRetentionHours(String localLogRetentionHours) {
            this.putQueryParameter("LocalLogRetentionHours", localLogRetentionHours);
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * The maximum storage space usage that is allowed for log files on the instance. Valid values: 0 to 50. Default value: 30.
         */
        public Builder localLogRetentionSpace(String localLogRetentionSpace) {
            this.putQueryParameter("LocalLogRetentionSpace", localLogRetentionSpace);
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }

        @Override
        public SetBackupLocalRequest build() {
            return new SetBackupLocalRequest(this);
        } 

    } 

}
