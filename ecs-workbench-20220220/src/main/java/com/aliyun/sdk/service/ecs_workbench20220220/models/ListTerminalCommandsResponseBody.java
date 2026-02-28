// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link ListTerminalCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTerminalCommandsResponseBody</p>
 */
public class ListTerminalCommandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TerminalCommandList")
    private java.util.List<TerminalCommandList> terminalCommandList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTerminalCommandsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.terminalCommandList = builder.terminalCommandList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTerminalCommandsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return terminalCommandList
     */
    public java.util.List<TerminalCommandList> getTerminalCommandList() {
        return this.terminalCommandList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<TerminalCommandList> terminalCommandList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTerminalCommandsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.terminalCommandList = model.terminalCommandList;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TerminalCommandList.
         */
        public Builder terminalCommandList(java.util.List<TerminalCommandList> terminalCommandList) {
            this.terminalCommandList = terminalCommandList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTerminalCommandsResponseBody build() {
            return new ListTerminalCommandsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTerminalCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTerminalCommandsResponseBody</p>
     */
    public static class TerminalCommandList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandLine")
        private String commandLine;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExecutePath")
        private String executePath;

        @com.aliyun.core.annotation.NameInMap("LoginUser")
        private String loginUser;

        private TerminalCommandList(Builder builder) {
            this.commandLine = builder.commandLine;
            this.createTime = builder.createTime;
            this.executePath = builder.executePath;
            this.loginUser = builder.loginUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerminalCommandList create() {
            return builder().build();
        }

        /**
         * @return commandLine
         */
        public String getCommandLine() {
            return this.commandLine;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return executePath
         */
        public String getExecutePath() {
            return this.executePath;
        }

        /**
         * @return loginUser
         */
        public String getLoginUser() {
            return this.loginUser;
        }

        public static final class Builder {
            private String commandLine; 
            private String createTime; 
            private String executePath; 
            private String loginUser; 

            private Builder() {
            } 

            private Builder(TerminalCommandList model) {
                this.commandLine = model.commandLine;
                this.createTime = model.createTime;
                this.executePath = model.executePath;
                this.loginUser = model.loginUser;
            } 

            /**
             * CommandLine.
             */
            public Builder commandLine(String commandLine) {
                this.commandLine = commandLine;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExecutePath.
             */
            public Builder executePath(String executePath) {
                this.executePath = executePath;
                return this;
            }

            /**
             * LoginUser.
             */
            public Builder loginUser(String loginUser) {
                this.loginUser = loginUser;
                return this;
            }

            public TerminalCommandList build() {
                return new TerminalCommandList(this);
            } 

        } 

    }
}
