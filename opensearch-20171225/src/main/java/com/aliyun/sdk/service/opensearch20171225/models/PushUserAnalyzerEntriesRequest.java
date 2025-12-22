// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link PushUserAnalyzerEntriesRequest} extends {@link RequestModel}
 *
 * <p>PushUserAnalyzerEntriesRequest</p>
 */
public class PushUserAnalyzerEntriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entries")
    private java.util.List<Entries> entries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private PushUserAnalyzerEntriesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.entries = builder.entries;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushUserAnalyzerEntriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return entries
     */
    public java.util.List<Entries> getEntries() {
        return this.entries;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<PushUserAnalyzerEntriesRequest, Builder> {
        private String name; 
        private java.util.List<Entries> entries; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(PushUserAnalyzerEntriesRequest request) {
            super(request);
            this.name = request.name;
            this.entries = request.entries;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The name of the analyzer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>“kevin_test”</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The entries of the custom analyzer.</p>
         */
        public Builder entries(java.util.List<Entries> entries) {
            this.putBodyParameter("entries", entries);
            this.entries = entries;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. This parameter is only used to check whether the data source is valid. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public PushUserAnalyzerEntriesRequest build() {
            return new PushUserAnalyzerEntriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushUserAnalyzerEntriesRequest} extends {@link TeaModel}
     *
     * <p>PushUserAnalyzerEntriesRequest</p>
     */
    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cmd")
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("splitEnabled")
        private Boolean splitEnabled;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Entries(Builder builder) {
            this.cmd = builder.cmd;
            this.key = builder.key;
            this.splitEnabled = builder.splitEnabled;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return splitEnabled
         */
        public Boolean getSplitEnabled() {
            return this.splitEnabled;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String cmd; 
            private String key; 
            private Boolean splitEnabled; 
            private String value; 

            private Builder() {
            } 

            private Builder(Entries model) {
                this.cmd = model.cmd;
                this.key = model.key;
                this.splitEnabled = model.splitEnabled;
                this.value = model.value;
            } 

            /**
             * <p>The operation to be performed on the entries.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>add</li>
             * <li>delete</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;add&quot;</p>
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * <p>The key to be used to query entries.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;testvalue&quot;</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Specifies whether to further analyze the terms that are generated after the search query is analyzed.</p>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder splitEnabled(Boolean splitEnabled) {
                this.splitEnabled = splitEnabled;
                return this;
            }

            /**
             * <p>The analysis result.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;test value&quot;</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
