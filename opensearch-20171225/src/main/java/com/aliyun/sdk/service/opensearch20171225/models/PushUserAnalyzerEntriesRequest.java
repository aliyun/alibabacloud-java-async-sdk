// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushUserAnalyzerEntriesRequest} extends {@link RequestModel}
 *
 * <p>PushUserAnalyzerEntriesRequest</p>
 */
public class PushUserAnalyzerEntriesRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("entries")
    private java.util.List < Entries> entries;

    @Query
    @NameInMap("dryRun")
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
    public java.util.List < Entries> getEntries() {
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
        private java.util.List < Entries> entries; 
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
         * "kevin_test"
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * entries.
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.putBodyParameter("entries", entries);
            this.entries = entries;
            return this;
        }

        /**
         * dryRun.
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

    public static class Entries extends TeaModel {
        @NameInMap("cmd")
        private String cmd;

        @NameInMap("key")
        private String key;

        @NameInMap("splitEnabled")
        private Boolean splitEnabled;

        @NameInMap("value")
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

            /**
             * cmd.
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * splitEnabled.
             */
            public Builder splitEnabled(Boolean splitEnabled) {
                this.splitEnabled = splitEnabled;
                return this;
            }

            /**
             * value.
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
