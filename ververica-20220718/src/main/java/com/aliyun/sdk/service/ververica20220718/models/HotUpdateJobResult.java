// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotUpdateJobResult} extends {@link TeaModel}
 *
 * <p>HotUpdateJobResult</p>
 */
public class HotUpdateJobResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hotUpdateParams")
    private HotUpdateJobParams hotUpdateParams;

    @com.aliyun.core.annotation.NameInMap("jobHotUpdateId")
    private String jobHotUpdateId;

    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("status")
    private HotUpdateJobStatus status;

    @com.aliyun.core.annotation.NameInMap("targetResourceSetting")
    private BriefResourceSetting targetResourceSetting;

    private HotUpdateJobResult(Builder builder) {
        this.hotUpdateParams = builder.hotUpdateParams;
        this.jobHotUpdateId = builder.jobHotUpdateId;
        this.jobId = builder.jobId;
        this.status = builder.status;
        this.targetResourceSetting = builder.targetResourceSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotUpdateJobResult create() {
        return builder().build();
    }

    /**
     * @return hotUpdateParams
     */
    public HotUpdateJobParams getHotUpdateParams() {
        return this.hotUpdateParams;
    }

    /**
     * @return jobHotUpdateId
     */
    public String getJobHotUpdateId() {
        return this.jobHotUpdateId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return status
     */
    public HotUpdateJobStatus getStatus() {
        return this.status;
    }

    /**
     * @return targetResourceSetting
     */
    public BriefResourceSetting getTargetResourceSetting() {
        return this.targetResourceSetting;
    }

    public static final class Builder {
        private HotUpdateJobParams hotUpdateParams; 
        private String jobHotUpdateId; 
        private String jobId; 
        private HotUpdateJobStatus status; 
        private BriefResourceSetting targetResourceSetting; 

        /**
         * hotUpdateParams.
         */
        public Builder hotUpdateParams(HotUpdateJobParams hotUpdateParams) {
            this.hotUpdateParams = hotUpdateParams;
            return this;
        }

        /**
         * jobHotUpdateId.
         */
        public Builder jobHotUpdateId(String jobHotUpdateId) {
            this.jobHotUpdateId = jobHotUpdateId;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(HotUpdateJobStatus status) {
            this.status = status;
            return this;
        }

        /**
         * targetResourceSetting.
         */
        public Builder targetResourceSetting(BriefResourceSetting targetResourceSetting) {
            this.targetResourceSetting = targetResourceSetting;
            return this;
        }

        public HotUpdateJobResult build() {
            return new HotUpdateJobResult(this);
        } 

    } 

}
