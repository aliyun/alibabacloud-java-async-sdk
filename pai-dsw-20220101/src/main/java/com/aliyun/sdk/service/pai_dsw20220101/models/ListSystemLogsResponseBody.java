// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link ListSystemLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemLogsResponseBody</p>
 */
public class ListSystemLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("SystemLogs")
    private java.util.List<SystemLogs> systemLogs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSystemLogsResponseBody(Builder builder) {
        this.systemLogs = builder.systemLogs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemLogs
     */
    public java.util.List<SystemLogs> getSystemLogs() {
        return this.systemLogs;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<SystemLogs> systemLogs; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSystemLogsResponseBody model) {
            this.systemLogs = model.systemLogs;
            this.totalCount = model.totalCount;
        } 

        /**
         * SystemLogs.
         */
        public Builder systemLogs(java.util.List<SystemLogs> systemLogs) {
            this.systemLogs = systemLogs;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSystemLogsResponseBody build() {
            return new ListSystemLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemLogsResponseBody</p>
     */
    public static class SystemLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private SystemLogs(Builder builder) {
            this.content = builder.content;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemLogs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String content; 
            private String gmtCreateTime; 
            private String level; 

            private Builder() {
            } 

            private Builder(SystemLogs model) {
                this.content = model.content;
                this.gmtCreateTime = model.gmtCreateTime;
                this.level = model.level;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-08T16:00:00Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public SystemLogs build() {
                return new SystemLogs(this);
            } 

        } 

    }
}
