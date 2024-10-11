// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SparkSession} extends {@link TeaModel}
 *
 * <p>SparkSession</p>
 */
public class SparkSession extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Active")
    private String active;

    @com.aliyun.core.annotation.NameInMap("AliyunUid")
    private Long aliyunUid;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private Long sessionId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private SparkSession(Builder builder) {
        this.active = builder.active;
        this.aliyunUid = builder.aliyunUid;
        this.sessionId = builder.sessionId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkSession create() {
        return builder().build();
    }

    /**
     * @return active
     */
    public String getActive() {
        return this.active;
    }

    /**
     * @return aliyunUid
     */
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    /**
     * @return sessionId
     */
    public Long getSessionId() {
        return this.sessionId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String active; 
        private Long aliyunUid; 
        private Long sessionId; 
        private String state; 

        /**
         * Active.
         */
        public Builder active(String active) {
            this.active = active;
            return this;
        }

        /**
         * AliyunUid.
         */
        public Builder aliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public SparkSession build() {
            return new SparkSession(this);
        } 

    } 

}
