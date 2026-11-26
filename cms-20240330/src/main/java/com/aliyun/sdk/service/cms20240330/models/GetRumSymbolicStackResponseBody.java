// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetRumSymbolicStackResponseBody} extends {@link TeaModel}
 *
 * <p>GetRumSymbolicStackResponseBody</p>
 */
public class GetRumSymbolicStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("column")
    private Long column;

    @com.aliyun.core.annotation.NameInMap("line")
    private Long line;

    @com.aliyun.core.annotation.NameInMap("lines")
    private java.util.List<String> lines;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.NameInMap("traceInfo")
    private java.util.List<String> traceInfo;

    @com.aliyun.core.annotation.NameInMap("traceMarkLine")
    private Long traceMarkLine;

    private GetRumSymbolicStackResponseBody(Builder builder) {
        this.column = builder.column;
        this.line = builder.line;
        this.lines = builder.lines;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.threadId = builder.threadId;
        this.traceInfo = builder.traceInfo;
        this.traceMarkLine = builder.traceMarkLine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumSymbolicStackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return column
     */
    public Long getColumn() {
        return this.column;
    }

    /**
     * @return line
     */
    public Long getLine() {
        return this.line;
    }

    /**
     * @return lines
     */
    public java.util.List<String> getLines() {
        return this.lines;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return traceInfo
     */
    public java.util.List<String> getTraceInfo() {
        return this.traceInfo;
    }

    /**
     * @return traceMarkLine
     */
    public Long getTraceMarkLine() {
        return this.traceMarkLine;
    }

    public static final class Builder {
        private Long column; 
        private Long line; 
        private java.util.List<String> lines; 
        private String name; 
        private String requestId; 
        private String source; 
        private String threadId; 
        private java.util.List<String> traceInfo; 
        private Long traceMarkLine; 

        private Builder() {
        } 

        private Builder(GetRumSymbolicStackResponseBody model) {
            this.column = model.column;
            this.line = model.line;
            this.lines = model.lines;
            this.name = model.name;
            this.requestId = model.requestId;
            this.source = model.source;
            this.threadId = model.threadId;
            this.traceInfo = model.traceInfo;
            this.traceMarkLine = model.traceMarkLine;
        } 

        /**
         * <p>The column number restored by the JS SourceMap.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder column(Long column) {
            this.column = column;
            return this;
        }

        /**
         * <p>The line number restored by the JS SourceMap.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder line(Long line) {
            this.line = line;
            return this;
        }

        /**
         * <p>The list of symbolicated stack lines.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;\tat com.example.UserService.getUser(UserService.java:25)&quot;]</p>
         */
        public Builder lines(java.util.List<String> lines) {
            this.lines = lines;
            return this;
        }

        /**
         * <p>The symbol name restored by the JS SourceMap.</p>
         * 
         * <strong>example:</strong>
         * <p>handleClick</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source file path restored by the JS SourceMap.</p>
         * 
         * <strong>example:</strong>
         * <p>src/app.js</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The ID of the exception thread.</p>
         * 
         * <strong>example:</strong>
         * <p>main-thread</p>
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * <p>The list of source code context lines.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;line1&quot;]</p>
         */
        public Builder traceInfo(java.util.List<String> traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }

        /**
         * <p>The highlighted line number of the error line in traceInfo.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder traceMarkLine(Long traceMarkLine) {
            this.traceMarkLine = traceMarkLine;
            return this;
        }

        public GetRumSymbolicStackResponseBody build() {
            return new GetRumSymbolicStackResponseBody(this);
        } 

    } 

}
