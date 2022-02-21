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

        private Builder(SetBackupLocalRequest response) {
            super(response);
            this.drdsInstanceId = response.drdsInstanceId;
            this.highSpaceUsageProtection = response.highSpaceUsageProtection;
            this.localLogRetentionHours = response.localLogRetentionHours;
            this.localLogRetentionSpace = response.localLogRetentionSpace;
        } 

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * HighSpaceUsageProtection.
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.putQueryParameter("HighSpaceUsageProtection", highSpaceUsageProtection);
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * LocalLogRetentionHours.
         */
        public Builder localLogRetentionHours(String localLogRetentionHours) {
            this.putQueryParameter("LocalLogRetentionHours", localLogRetentionHours);
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * LocalLogRetentionSpace.
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
