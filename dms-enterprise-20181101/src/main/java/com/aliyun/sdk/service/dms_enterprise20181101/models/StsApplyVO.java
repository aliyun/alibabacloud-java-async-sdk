// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StsApplyVO} extends {@link TeaModel}
 *
 * <p>StsApplyVO</p>
 */
public class StsApplyVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunId")
    private String aliyunId;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    private StsApplyVO(Builder builder) {
        this.aliyunId = builder.aliyunId;
        this.duration = builder.duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StsApplyVO create() {
        return builder().build();
    }

    /**
     * @return aliyunId
     */
    public String getAliyunId() {
        return this.aliyunId;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    public static final class Builder {
        private String aliyunId; 
        private Long duration; 

        /**
         * AliyunId.
         */
        public Builder aliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        public StsApplyVO build() {
            return new StsApplyVO(this);
        } 

    } 

}
