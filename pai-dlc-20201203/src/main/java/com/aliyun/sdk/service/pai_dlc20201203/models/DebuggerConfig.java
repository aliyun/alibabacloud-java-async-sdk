// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link DebuggerConfig} extends {@link TeaModel}
 *
 * <p>DebuggerConfig</p>
 */
public class DebuggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("DebuggerConfigId")
    private String debuggerConfigId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    private DebuggerConfig(Builder builder) {
        this.content = builder.content;
        this.debuggerConfigId = builder.debuggerConfigId;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebuggerConfig create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return debuggerConfigId
     */
    public String getDebuggerConfigId() {
        return this.debuggerConfigId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public static final class Builder {
        private String content; 
        private String debuggerConfigId; 
        private String description; 
        private String displayName; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * DebuggerConfigId.
         */
        public Builder debuggerConfigId(String debuggerConfigId) {
            this.debuggerConfigId = debuggerConfigId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifyTime.
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        public DebuggerConfig build() {
            return new DebuggerConfig(this);
        } 

    } 

}
