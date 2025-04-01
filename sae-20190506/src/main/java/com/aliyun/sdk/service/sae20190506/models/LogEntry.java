// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link LogEntry} extends {@link TeaModel}
 *
 * <p>LogEntry</p>
 */
public class LogEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceID")
    private String instanceID;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.NameInMap("packID")
    private String packID;

    @com.aliyun.core.annotation.NameInMap("packMeta")
    private String packMeta;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Integer timestamp;

    @com.aliyun.core.annotation.NameInMap("versionID")
    private String versionID;

    private LogEntry(Builder builder) {
        this.instanceID = builder.instanceID;
        this.message = builder.message;
        this.offset = builder.offset;
        this.packID = builder.packID;
        this.packMeta = builder.packMeta;
        this.qualifier = builder.qualifier;
        this.timestamp = builder.timestamp;
        this.versionID = builder.versionID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return timestamp
     */
    public Integer getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return versionID
     */
    public String getVersionID() {
        return this.versionID;
    }

    public static final class Builder {
        private String instanceID; 
        private String message; 
        private Long offset; 
        private String packID; 
        private String packMeta; 
        private String qualifier; 
        private Integer timestamp; 
        private String versionID; 

        private Builder() {
        } 

        private Builder(LogEntry model) {
            this.instanceID = model.instanceID;
            this.message = model.message;
            this.offset = model.offset;
            this.packID = model.packID;
            this.packMeta = model.packMeta;
            this.qualifier = model.qualifier;
            this.timestamp = model.timestamp;
            this.versionID = model.versionID;
        } 

        /**
         * instanceID.
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
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
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(Integer timestamp) {
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

        public LogEntry build() {
            return new LogEntry(this);
        } 

    } 

}
