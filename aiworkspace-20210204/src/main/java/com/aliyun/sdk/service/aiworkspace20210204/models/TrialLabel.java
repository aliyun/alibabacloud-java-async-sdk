// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrialLabel} extends {@link TeaModel}
 *
 * <p>TrialLabel</p>
 */
public class TrialLabel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("TrialId")
    private String trialId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private TrialLabel(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.key = builder.key;
        this.trialId = builder.trialId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrialLabel create() {
        return builder().build();
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return trialId
     */
    public String getTrialId() {
        return this.trialId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String key; 
        private String trialId; 
        private String value; 

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * TrialId.
         */
        public Builder trialId(String trialId) {
            this.trialId = trialId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public TrialLabel build() {
            return new TrialLabel(this);
        } 

    } 

}
