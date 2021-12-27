// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link StartVirusScanTaskRequest} extends {@link RequestModel}
 *
 * <p>StartVirusScanTaskRequest</p>
 */
public class StartVirusScanTaskRequest extends Request {
    @Query
    @NameInMap("TargetInfo")
    private String targetInfo;


    private StartVirusScanTaskRequest(Builder builder) {
        super(builder);
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartVirusScanTaskRequest create() {
        return builder().build();
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String targetInfo; 

        /**
         * <p>TargetInfo.</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        public StartVirusScanTaskRequest build() {
            return new StartVirusScanTaskRequest(this);
        } 

    } 

}
