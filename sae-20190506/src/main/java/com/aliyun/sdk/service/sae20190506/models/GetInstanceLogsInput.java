// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceLogsInput} extends {@link TeaModel}
 *
 * <p>GetInstanceLogsInput</p>
 */
public class GetInstanceLogsInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backwardLine")
    private Long backwardLine;

    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("forwardLine")
    private Long forwardLine;

    @com.aliyun.core.annotation.NameInMap("isTail")
    private Boolean isTail;

    @com.aliyun.core.annotation.NameInMap("match")
    private String match;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.NameInMap("packID")
    private String packID;

    @com.aliyun.core.annotation.NameInMap("packMeta")
    private String packMeta;

    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("versionID")
    private String versionID;

    private GetInstanceLogsInput(Builder builder) {
        this.backwardLine = builder.backwardLine;
        this.endTime = builder.endTime;
        this.forwardLine = builder.forwardLine;
        this.isTail = builder.isTail;
        this.match = builder.match;
        this.message = builder.message;
        this.offset = builder.offset;
        this.packID = builder.packID;
        this.packMeta = builder.packMeta;
        this.startTime = builder.startTime;
        this.timestamp = builder.timestamp;
        this.versionID = builder.versionID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLogsInput create() {
        return builder().build();
    }

    /**
     * @return backwardLine
     */
    public Long getBackwardLine() {
        return this.backwardLine;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return forwardLine
     */
    public Long getForwardLine() {
        return this.forwardLine;
    }

    /**
     * @return isTail
     */
    public Boolean getIsTail() {
        return this.isTail;
    }

    /**
     * @return match
     */
    public String getMatch() {
        return this.match;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return packID
     */
    public String getPackID() {
        return this.packID;
    }

    /**
     * @return packMeta
     */
    public String getPackMeta() {
        return this.packMeta;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return versionID
     */
    public String getVersionID() {
        return this.versionID;
    }

    public static final class Builder {
        private Long backwardLine; 
        private Long endTime; 
        private Long forwardLine; 
        private Boolean isTail; 
        private String match; 
        private String message; 
        private Long offset; 
        private String packID; 
        private String packMeta; 
        private Long startTime; 
        private String timestamp; 
        private String versionID; 

        /**
         * backwardLine.
         */
        public Builder backwardLine(Long backwardLine) {
            this.backwardLine = backwardLine;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * forwardLine.
         */
        public Builder forwardLine(Long forwardLine) {
            this.forwardLine = forwardLine;
            return this;
        }

        /**
         * isTail.
         */
        public Builder isTail(Boolean isTail) {
            this.isTail = isTail;
            return this;
        }

        /**
         * match.
         */
        public Builder match(String match) {
            this.match = match;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        /**
         * packID.
         */
        public Builder packID(String packID) {
            this.packID = packID;
            return this;
        }

        /**
         * packMeta.
         */
        public Builder packMeta(String packMeta) {
            this.packMeta = packMeta;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * versionID.
         */
        public Builder versionID(String versionID) {
            this.versionID = versionID;
            return this;
        }

        public GetInstanceLogsInput build() {
            return new GetInstanceLogsInput(this);
        } 

    } 

}
