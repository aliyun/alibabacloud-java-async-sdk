// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CodeConfiguration} extends {@link TeaModel}
 *
 * <p>CodeConfiguration</p>
 */
public class CodeConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List<String> command;

    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("zipFile")
    private String zipFile;

    private CodeConfiguration(Builder builder) {
        this.checksum = builder.checksum;
        this.command = builder.command;
        this.language = builder.language;
        this.zipFile = builder.zipFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * @return command
     */
    public java.util.List<String> getCommand() {
        return this.command;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return zipFile
     */
    public String getZipFile() {
        return this.zipFile;
    }

    public static final class Builder {
        private String checksum; 
        private java.util.List<String> command; 
        private String language; 
        private String zipFile; 

        private Builder() {
        } 

        private Builder(CodeConfiguration model) {
            this.checksum = model.checksum;
            this.command = model.command;
            this.language = model.language;
            this.zipFile = model.zipFile;
        } 

        /**
         * <p>代码包的CRC-64校验值。如果提供了checksum，则函数计算会校验代码包的checksum是否和提供的一致</p>
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * <p>在运行时中运行的命令（例如：[&quot;python&quot;]）</p>
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            return this;
        }

        /**
         * <p>代码运行时的编程语言，如 python3、nodejs 等</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>智能体代码ZIP包的Base64编码</p>
         * 
         * <strong>example:</strong>
         * <p>UEsDBAoAAAAAANF</p>
         */
        public Builder zipFile(String zipFile) {
            this.zipFile = zipFile;
            return this;
        }

        public CodeConfiguration build() {
            return new CodeConfiguration(this);
        } 

    } 

}
